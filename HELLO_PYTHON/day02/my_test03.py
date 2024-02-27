# 첫 수를 입력하시오 1
# 끝 수를 입력하시오 10
# 배수를 입력하시오 5
# 1에서 10까지 5의 배수의 합은 15 입니다.


fir = int(input("첫 수를 입력하시오"))
end = int(input("끝 수를 입력하시오"))
bae = int(input("배수를 입력하시오"))


res = 0
for i in range(fir, end+1) :
    if i%bae==0 :                                                                                                                                                                                                                                                                                                                                                                                                  
        res += i
print(fir,"에서",end,"까지 ",bae,"의 배수의 합은",res," 입니다.")