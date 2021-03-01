# Programmers 03/02 2021
# 124 나라의 숫자

def solution(n):
    answer = ''

    while n > 0:
        if n % 3 == 0:
            answer = '4' + answer
            n = n/3 - 1
        elif n % 3 == 1:
            answer = '1' + answer
            n = int(n/3)
        elif n % 3 == 2:
            answer = '2' + answer
            n = int(n/3)

    return answer

print(solution(10))