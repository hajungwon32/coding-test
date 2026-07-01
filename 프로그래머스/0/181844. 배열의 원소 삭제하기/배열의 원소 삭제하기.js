function solution(arr, delete_list) {
    var answer = [];
    for(const i of arr) {
        let t = true;
        for(const j of delete_list) {
            if(i === j) {
                t = false
            } else {
                
            }
        }
        if(t) {
                answer.push(i)
            }
    }
    return answer;
}