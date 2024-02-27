from day03.my_oop01 import Animal
class Human(Animal) :
    def __init__(self):
        super().__init__()
        self.skill_cook=0
    def element(self):
        self.skill_cook += 1

if __name__ == '__main__':
    hum = Human()
    print(hum.skill_cook)
    hum.element()
    print(hum.skill_cook)
    hum.moveX(4)
    hum.moveY(-4)
    print(hum.x)
    print(hum.y)