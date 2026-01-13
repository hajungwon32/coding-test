import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
         int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') { // 숫자인지 확인
                count++;
            }
        }

        // 2️⃣ 숫자 저장용 배열 생성
        int[] numbers = new int[count];
        int index = 0;

        // 3️⃣ 숫자만 배열에 저장
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                numbers[index] = c - '0'; // 문자 → 숫자
                index++;
            }
        }

        // 4️⃣ 배열 오름차순 정렬
        Arrays.sort(numbers);

        return numbers;
    }
}