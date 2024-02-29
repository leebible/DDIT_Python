import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("./pyqt04.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.button_clicked)
    
    def button_clicked(self):
        dan = self.le.text()
        idan = int(dan)
        txt = ""
        # txt += "{}*{}={}\n".format(dan,1,1*idan)
        # txt += "{}*{}={}\n".format(dan,2,2*idan)
        for i in range(1,9+1) :
            res = idan*i
            txt +="{}*{}={}\n".format(dan,i,res)
            
        self.te.setText(txt)
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()