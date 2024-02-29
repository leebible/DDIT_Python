import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from pip._vendor.typing_extensions import Self
from PyQt5.Qt import QMessageBox

form_class = uic.loadUiType("./pyqt10.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.com = 123
        self.setupUi(self)
        self.setComByRandom()
        
        self.pb.clicked.connect(self.myclick)
    
    def setComByRandom(self):
        self.com = int(random()*100)+1
        print("com",self.com)
    
    def myclick(self):
        str_old= self.te.toPlainText()
        str_mine = self.le.text()
        mine = int(str_mine)
        
        txt = ""
        
        if mine>self.com :
            txt = str(mine) + "\t" + "DOWN" + "\n"
        elif mine<self.com :
            txt = str(mine) + "\t" + "UP" + "\n"
        elif mine==self.com :
            txt = str(mine) + "\t" + "정답" + "\n"
            QMessageBox.about(self,'정답입니다.',str_mine)
        self.te.setText(str_old+txt)
        self.le.setText("")
        
        
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()