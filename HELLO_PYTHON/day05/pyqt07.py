import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from PyQt5.Qt import QMessageBox

form_class = uic.loadUiType("./pyqt07.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb1.clicked.connect(self.button_clicked)
        self.pb2.clicked.connect(self.button_clicked)
        self.pb3.clicked.connect(self.button_clicked)
        self.pb4.clicked.connect(self.button_clicked)
        self.pb5.clicked.connect(self.button_clicked)
        self.pb6.clicked.connect(self.button_clicked)
        self.pb7.clicked.connect(self.button_clicked)
        self.pb8.clicked.connect(self.button_clicked)
        self.pb9.clicked.connect(self.button_clicked)
        self.pb0.clicked.connect(self.button_clicked)
        self.pb_call.clicked.connect(self.call_clicked)
    
    def button_clicked(self):
        old = self.le.text()
        cur = self.sender().text()
        self.le.setText(old+cur)
    def call_clicked(self):
        old = self.le.text()
        QMessageBox.information(self, "calling" , "{} calling".format(old))
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()