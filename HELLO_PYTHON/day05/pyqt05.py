import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random

form_class = uic.loadUiType("./pyqt05.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.button_clicked)
    
    def button_clicked(self):
        self.ln1.display("2")
        arr = [1,2,3,4,5,6,7,8,9,10,
                 11,12,13,14,15,16,17,18,19,20,
                 21,22,23,24,25,26,27,28,29,30,
                 31,32,33,34,35,36,37,38,39,40,
                 41,42,43,44,45]
        
        for i in range(1000) :
            rnd = int(random()*45)
            a = arr[0]
            arr[0] = arr[rnd]
            arr[rnd] = a
        self.ln1.display(arr[0])
        self.ln2.display(arr[1])
        self.ln3.display(arr[2])
        self.ln4.display(arr[3])
        self.ln5.display(arr[4])
        self.ln6.display(arr[5])

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()