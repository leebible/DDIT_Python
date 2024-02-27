from day04.my_oop import Biden, Trump
class Jihun(Biden, Trump) :
    def __init__(self):
        Biden.__init__(self)
        Trump.__init__(self)
    
        
j = Jihun()
# print(j.money)
# print(j.memory)