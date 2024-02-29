import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("./pyqt03.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.button_clicked)
    
    def button_clicked(self):
        first = self.pte01.toPlainText()
        last = self.pte02.toPlainText()
        res = int(first)*int(last)
        self.pte03.setPlainText(str(res))
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()