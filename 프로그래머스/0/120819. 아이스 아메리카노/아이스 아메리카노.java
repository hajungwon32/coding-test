class Solution {
    public int[] solution(int money) {
        
        int count = 0;
        while(money>=5500){
            if(5500<=money){
                money -= 5500;
                count++;
            }
        }
        int[] answer = {count, money};
        return answer;
    }
}