import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from _ast import Or

form_class = uic.loadUiType("./pyqt09.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.button_clicked)
    
        self.le_mine.returnPressed.connect(self.button_clicked)
    def button_clicked(self):
        mine = self.le_mine.text()
        rand = random()
        if rand>0.3 :
            com = "가위"
        elif rand>0.6 :
            com = "바위"
        else :
            com ="보"
            
        if mine==com :
            res = "비김"
        elif mine=="가위" and com=="보" or mine=="바위" and com=="가위" or mine=="보" and com=="바위" :
            res = "이김"
        else :
            res = "짐"
    
        self.le_com.setText(com)
        self.le_result.setText(res)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()