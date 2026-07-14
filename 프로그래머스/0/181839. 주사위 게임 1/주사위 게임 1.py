def solution(a, b):
    answer = 0
    if a%2==1 and b%2==1:
        a **= 2
        b **= 2
        answer = a+b
    elif a%2==1 or b%2==1:
        answer = 2*(a+b)
    else:
        answer = abs(a-b) # abs() 절대값
    return answer