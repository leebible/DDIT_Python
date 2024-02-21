# 출력할 단수를 입력하세요 4
# 4*1=4
# 4*2=8
# ..(생략)

a = int(input("출력할 단수를 입력하세요"))
for i in range(1,10) :
    c= a*i
    print(a,"*",i,"=",c)