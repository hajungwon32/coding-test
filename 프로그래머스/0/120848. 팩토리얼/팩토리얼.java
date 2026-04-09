class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=i; j++) {
                answer *= j;
            }
            if(answer > n) {
                answer = i - 1;
                return answer;
            }
            answer = 1;
        }
        answer = 10;
        return answer;
    }
}