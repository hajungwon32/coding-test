class Solution {
    public int[] solution(int n) {
        int a = (n+1)/2;
        int b = 0;
        int[] answer = new int[a];
        for(int i=1; i<=n; i+=2){
            answer[b++] = i;
        }
        return answer;
    }
}