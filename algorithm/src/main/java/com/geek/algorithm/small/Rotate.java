package com.geek.algorithm.small;

/**
 * @author lhf
 * @date 2019/11/29
 */
public class Rotate {

    public static void main(String[] args) {
        // 旋转数组
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        rotate2(nums, k);
    }

    /**
     * 向左移动 k 个位置
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (k > 0 && nums.length > 1) {
            for (int i = 1; i <= k; i++) {
                int num = nums[0];
                for (int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = num;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 向右移动 k 个位置
     *
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        if (k > 0 && nums.length > 1) {
            for (int i = 1; i <= k; i++) {
                int num = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = num;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
