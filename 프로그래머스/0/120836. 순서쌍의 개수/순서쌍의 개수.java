class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                answer++; // i가 약수라면 (i, n/i)라는 순서쌍 존재
            }
        }
        return answer;
    }
}
