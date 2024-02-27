class Animal :
    def __init__(self):
        self.x=0
        self.y=0
        
    def moveX(self,x) :
        self.x += x
    def moveY(self,y):
        self.y += y
        
if __name__ == '__main__':
    ani = Animal()
    print("1",ani.x)
    print("1",ani.y)
    ani.moveX(2)
    ani.moveY(4)
    print("1",ani.x)
    print("1",ani.y)


        