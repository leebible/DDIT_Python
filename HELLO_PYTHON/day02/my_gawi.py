from random import random


rnd = random()


if rnd < 0.33 :
    print("가위")
elif rnd <0.66 : 
    print("바위")
else :
    print("보")
    