import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from pip._vendor.typing_extensions import Self
from PyQt5.Qt import QMessageBox

form_class = uic.loadUiType("./pyqt11.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        
    def getStar(self,cnt):
        ret = ""
        for i in range(cnt) :
            ret+= "*"
        ret += "\n"
        return ret
    
    def myclick(self):
        a = self.le_first.text()
        b = self.le_last.text()
        
        aa =int(a)
        bb =int(b)
        
        txt=""
        for i in range (aa,bb+1) :
            txt += self.getStar(i)
        
        self.pte.setText(txt)
        
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()