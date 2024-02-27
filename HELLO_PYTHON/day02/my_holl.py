from random import random

a = input("홀짝을 선택해 주세요.")
rand = random()
if rand<0.5 :
    com = "홀"
else :
    com ="짝"


print("컴퓨터:",com)
if a==com :
    print("이겼습니다.")
else :
    print("졌습니다.")
    
