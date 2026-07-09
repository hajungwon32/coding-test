def solution(num_list):
    answer = 0
    sum = 0
    multiply = 1
    for i in num_list:
        sum += i
        multiply *= i
        
    sum = sum ** 2
    
    if sum > multiply:
        answer = 1
    else:
        answer = 0
        
    return answer