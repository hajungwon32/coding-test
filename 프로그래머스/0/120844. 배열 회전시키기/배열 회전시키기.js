function solution(numbers, direction) {
    var answer = new Array(numbers.length);
    if(direction === "right") {
        for(let i=1; i<numbers.length; i++) {
            answer[i] = numbers[i-1];
        }
        answer[0] = numbers[numbers.length-1];
    } else if(direction === "left") {
        for(let i=numbers.length-2; i>=0; i--) {
            answer[i] = numbers[i+1];
        }
        answer[numbers.length-1] = numbers[0];
    }
    
    return answer;
}