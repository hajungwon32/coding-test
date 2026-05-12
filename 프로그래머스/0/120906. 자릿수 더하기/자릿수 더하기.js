function solution(n) {
    var answer = 0;
    n = String(n);
    for(let i of n) {
        answer += +i;
    }
    return answer;
}