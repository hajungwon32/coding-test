function solution(emergency) {
    var answer = new Array(emergency.length);
    for(let i=0; i<answer.length; i++) {
        answer[i] = 1;
        for(let j=0; j<answer.length; j++) {
            if(emergency[i] < emergency[j]) {
                answer[i]++;
            }
        }
    }
    return answer;
}