class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width = 0;
        int heght = 0;
        int high = 0;
        for(int i=1; i<=box[0]; i++) {
            if(n*i<=box[0]){
                width++;
            } 
        }
        
        for(int i=1; i<=box[1]; i++) {
            if(n*i<=box[1]){
                heght++;
            } 
        }
        
        for(int i=1; i<=box[2]; i++) {
            if(n*i<=box[2]){
                high++;
            } 
        }
        answer = width*heght*high;
        return answer;
        
        //gpt 코드 미쳤네
        //return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}