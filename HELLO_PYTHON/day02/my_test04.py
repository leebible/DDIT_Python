# 가위, 바위, 보를 입력하시오 : 가위
# 나: 가위
# 컴 : 가위
# 결과 : 비김
from random import random

user = input("가위, 바위, 보를 입력하시오 :")
print("나 :",user)

i=0;
rand = random()
arr = ["바위", "가위", "보"]
if rand>0.66 :
    com = arr[0]
elif rand>0.33 :
    com = arr[1]
else :
    com = arr[2]
print("컴 :",com)
if com==user :
    res = "비김"
if com=="바위" and user=="보" or com=="가위" and user=="바위" or com=="보" and user=="가위" :
    res ="이김"
else :
    res ="짐"
print("결과 : ",res) 