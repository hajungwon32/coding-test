class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        for(int i=0; i<k; i++) {
            if(index+2<numbers.length) {
                answer = numbers[index];
                index += 2;
            } else if(index+2 == numbers.length){
                answer = numbers[index];
                index -= index;
            } else {
                answer = numbers[index];
                index -= index-1;
            }
        }
        return answer;
    }
}