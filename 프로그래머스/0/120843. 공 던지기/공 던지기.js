function solution(numbers, k) {
    var answer = 0;
    let index = 0;
    for(let i=0; i<k; i++) {
        if(index+2 >= numbers.length) {
            answer = numbers[index];
            index += 2;
            index -= numbers.length;
        } else {
            answer = numbers[index];
            index += 2;
        }
    }
    return answer;
}