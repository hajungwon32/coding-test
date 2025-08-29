class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int a = 0;
        int b = 0;
        for(int i=0; i<numbers.length; i++){
            if(num1 == i){
                a = i;
            }
            if(num2 == i){
                b = i;
            }
        }
        int c = 0;
        for(int i=a; i<=b; i++){
           c++;
        }
        int[] answer = new int[c];
        for(int i=0; i<c; i++){
            answer[i] = numbers[a+i];
        }
        return answer;
    }
}