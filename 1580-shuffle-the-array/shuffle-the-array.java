class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] answer = new int[nums.length];
        int j = 0;
        for(int i = 0; i < n;i++){
            answer[j] = nums[i];
            j++;
            answer[j] = nums[i + n];
            j++;
        }
        return answer;
    }
}