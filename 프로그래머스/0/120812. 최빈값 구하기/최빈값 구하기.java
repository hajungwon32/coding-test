import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[0];
        int maxCount = 0;
        int count = 0;
        int prevNum = array[0];
        for(int i=1; i<array.length; i++) {
            int currNum = array[i];
            count = (prevNum == currNum) ? count + 1 : 0;
            if(maxCount < count) {
                maxCount = count;
                answer = currNum;
            } else if(maxCount == count) {
                answer = -1;
            } 
            prevNum = currNum;
        }
        return answer;
    }
}