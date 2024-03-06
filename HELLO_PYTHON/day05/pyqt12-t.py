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
        self.pb.clicked.connect(self.myclick)
        self.setComByRandom()
        
        
       
    def setComByRandom(self) :
        arr = [1,2,3,4,5,6,7,8,9]
        for i in range(1000) :
            rnd = int(random()*9)
            a = arr[0]
            arr[0] = arr[rnd]
            arr[rnd] = a
        self.com = "{}{}{}".format(arr[0],arr[1],arr[2])
        print("com:",self.com)   
       
    def myclick(self) :
        mine = self.le.text()
        s = self.getStrike(mine,self.com)
        b = self.getBall(mine,self.com)
        print("여기까진 문제없음")
        print("s",s,"b",b)
        
        line = mine + "\t" + str(s) + "S" +  str(b) + "B\n"
        str_old = self.te.toPlainText()
        
        self.te.setText(str_old+line)
        self.le.setText("")
        
        if s == 3 :
            QMessageBox.about(self, '정다빕니다.',mine)
            
        
    def getStrike(self,mine):
        ret = 0
        m1 = mine[0:1]
        m2 = mine[1:2]
        m3 = mine[2:3]
        
        c1 = com[0:1]
        c1 = com[1:2]
        c1 = com[2:3]
        
        if c1 == m1 : ret +=1
        if c2 == m2 : ret +=1
        if c3 == m3 : ret +=1
            
        return ret
        
    def getBall(self,mine,com):
        ret = 0
        m1 = mine[0:1]
        m2 = mine[1:2]
        m3 = mine[2:3]
        
        c1 = self.com[0:1]
        c1 = self.com[1:2]
        c1 = self.com[2:3]
        
        if c1 == m2 or c1 == m3 : ret +=1
        if c2 == m1 or c2 == m3 : ret +=1
        if c3 == m1 or c3 == m2 : ret +=1
            
        return ret
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()