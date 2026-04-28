function solution(s) {
    var answer = 0;
    let list = s.split(" ");
    for(let i in list) {
        if(list[i] === "Z") {
            answer -= +list[i-1];
        } else {
            answer += +list[i];
        }
        
    }
    return answer;
}