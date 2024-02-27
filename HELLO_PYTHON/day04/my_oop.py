class Biden :
    
    def __init__(self):
        self.memory = 100
    def alz(self):
        self.memory /= 2
        
class Trump :
    def __init__(self):
        self.money = 1000
    def you_fire(self):
        self.money += 1
t = Trump()
print(t.money)

b = Biden()
print(b.memory)
b.alz()
print(b.memory)
