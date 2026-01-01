class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kk = (char) (k + '0');
        for(int a=i; a<=j; a++) {
            String s = String.valueOf(a);
            for(int count=0; count<s.length(); count++){
                if(s.charAt(count) == kk){
                    answer++;
                }
            }
            
        }
        return answer;
    }
}