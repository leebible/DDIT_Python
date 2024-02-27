# 첫 수를 입력하시오 : 1
# 끝 수를 입력하시오 : 4
# 1에서 4까지의 합은 10이입니다.

fir = int(input("첫 수를 입력하시오 : "))
end = int(input("끝 수를 입력하시오 : "))


res = fir
for i in range(fir,(end+1)) :
    res += i
print("{}에서 {}까지의 합은 {}입니다.".format(fir, end, res))



