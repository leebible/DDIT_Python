from random import random
def randomHoll() :
    rand=random()
    if rand > 0.5 :
        return "홀"
    else : 
        return "짝"

com = randomHoll()
print("com", com)