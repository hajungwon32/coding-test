class Solution {
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        out:for(int i=0; i<nums.length; i++) {
            for(int j=1+i; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break out;
                }
            }
        }
        return answer;
    }
}