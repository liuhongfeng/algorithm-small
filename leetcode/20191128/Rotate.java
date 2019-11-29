/**
 * 旋转数组
 */
class Solution {
    // 1. 暴力解法
    public void rotate(int[] nums, int k) {
        if (k > 0 && nums.length > 1) {
            for (int i = 1; i <= k; i++) {
                int num = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = num;
            }
        }
    }
}