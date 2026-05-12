function solution(board, moves) {
    /*
    [[0,0,0,0,0],
     [0,0,1,0,3],
     [0,2,5,0,1],
     [4,2,4,4,2],
     [3,5,1,3,1]]
     
     [1,5,3,5,1,2,1,4]
    */
    var answer = 0;
    let stack = [];
    for(let i of moves) { // 열
        for(let j in board) { // 행
            if(board[j][i-1] !== 0) {
                let pick = board[j][i-1];
                if(pick === stack[stack.length-1]) {
                    stack.pop()
                    answer += 2;
                } else {
                    stack.push(pick);
                }
                board[j][i-1] = 0;
                break;
            }
        }
    }
    return answer;
}