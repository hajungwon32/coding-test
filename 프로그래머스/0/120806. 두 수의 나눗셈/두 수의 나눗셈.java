public class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1 / num2;   // 나눈 결과를 실수로 계산
        result *= 1000;                         // 1000을 곱함
        return (int) result;                    // 정수 부분만 반환
    }
}
