class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int ii = 0;
        while(count<array.length) {
            String a = String.valueOf(array[count]);
            for(int i=0; i<a.length(); i++) {
                if(a.charAt(i) == '7')
                    answer++;
            }
            count++;
        }
        return answer;
    }
}