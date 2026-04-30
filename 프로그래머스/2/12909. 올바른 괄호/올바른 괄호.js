function solution(s){
    var answer = true;
    let stack = [];
    if(s[0] === ")") {
        return answer=false;
    }
    for(let i of s) {
        if(i === "(") {
            stack.push(i);
        } else {
            stack.pop();
        }
    }
    if(stack.pop()) {
        answer = false;
    }

    return answer;
}