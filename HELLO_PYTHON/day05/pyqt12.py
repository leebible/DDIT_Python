import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from pip._vendor.typing_extensions import Self
from PyQt5.Qt import QMessageBox

form_class = uic.loadUiType("./pyqt12.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.com = 123
        self.pb.clicked.connect(self.myclick)
        self.setComByRandom()
        
        
       
    def setComByRandom(self) :
        arr = [1,2,3,4,5,6,7,8,9]
        for i in range(1000) :
            rnd = int(random()*9)
            a = arr[0]
            arr[0] = arr[rnd]
            arr[rnd] = a
        self.com = str(arr[0]) + "" + str(arr[1]) + "" + str(arr[2])
        print("com:",self.com)   
       
    def myclick(self):
        
        mine = self.le.text()
        s = self.getStrike(mine,self.com)
        txt=""
        
        self.pte.setText(txt)
    
        
        
    def getStrike(self,mine):
        ret = 0
        m1 = mine.substringData(0,1)
        m2 = mine.substringData(1,2)
        m3 = mine.substringData(2,3)
        c1 = self.com.substringData(0,1)
        c2 = self.com.substringData(1,2)
        c3 = self.com.substringData(2,3)
        
        if m1==c1 :
            ret+=1
        elif m2==c2 :
            ret+=1
        elif m3==c3 :
            ret+=1
            
        return ret
        
    def getBall(self,mine):
        ret = 0
        m1 = mine.substringData(0,1)
        m2 = mine.substringData(1,2)
        m3 = mine.substringData(2,3)
        
        c1 = self.com.substringData(0,1)
        c2 = self.com.substringData(1,2)
        c3 = self.com.substringData(2,3)
        
        if c1==m2 or c1==m3:
            ret+=1
        elif c2==m1 or c2==m3 :
            ret+=1
        elif c3==m1 or c3==m2 :
            ret+=1
            
        return ret
    
    
        
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()