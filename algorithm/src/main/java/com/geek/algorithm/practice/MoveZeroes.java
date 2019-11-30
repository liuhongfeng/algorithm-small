package com.geek.algorithm.practice;

/**
 * @author lhf
 * @date 2019/11/30
 * @describe 移动零
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1};
        moveZeroes3(nums);
    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 示例:
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 不通过
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * [0,1,0,3,12]
     * [0,1,0,3,12]
     * [1,3,12,0,0]
     * 通过
     *
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 国际站解法
     * [0,1,0,3,12]
     * [0,0,1]
     *
     * @param nums
     */
    public static void moveZeroes3(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
