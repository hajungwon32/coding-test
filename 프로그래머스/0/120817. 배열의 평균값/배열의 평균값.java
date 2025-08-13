class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double b = 0;
        for(int i=0; i<numbers.length; i++){
            b += numbers[i];
        }
        answer = b/numbers.length;
        return answer;
    }
}