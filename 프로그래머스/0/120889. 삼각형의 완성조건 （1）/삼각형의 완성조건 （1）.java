class Solution {
    public int solution(int[] sides) {
        int a = 0;
        int answer = 0;
        for(int i=0; i<sides.length; i++){
            if(sides[i] > a){
                a = sides[i];
            }
        }
        int b = 0;
        for(int i=0; i<sides.length; i++){
            b += sides[i];
        }
        b -= a;
        if(a < b){
            answer = 1;
        }else{
            answer = 2;
        }
        
        
        return answer;
    }
}