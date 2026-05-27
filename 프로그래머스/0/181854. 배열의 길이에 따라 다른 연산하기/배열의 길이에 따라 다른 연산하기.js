function solution(arr, n) {
    var answer = [];
    let arrLength;
    for(let i=0; i<arr.length; i++) {
        answer[i] = arr[i];
    }
    if(arr.length % 2 !== 0) {
        arrLength = 0;
    } else {
        arrLength = 1;
    }
    for(let i=arrLength; i<arr.length; i+=2) {
        answer[i] += n;
    }
    return answer;
}