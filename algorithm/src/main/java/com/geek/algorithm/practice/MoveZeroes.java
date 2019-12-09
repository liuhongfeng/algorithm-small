package com.geek.algorithm.practice;

/**
 * @author lhf
 * @date 2019/11/30
 * @describe 移动零
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1};
        moveZeroes(nums);
    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 示例:
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * <p>
     * 对于 {0, 0, 1} 情况，不通过
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
     * 时间复杂度 O(n^2)
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
     * 时间复杂度 O(n)
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

    /**
     * 覃超
     * 算法训练营视频中解法
     * 时间复杂度 O(n)
     *
     * @param nums
     */
    public static void moveZeroes4(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                if (i != j) {
                    // 优化处理
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 国际站
     * 滚雪球解法
     * [0,1,0,3,12]
     * [1,0,0,3,12]
     * <p>
     * 时间复杂度 O(n)
     * snowBallSize 雪球大小
     *
     * @param nums
     */
    public static void moveZeroes5(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = t;
            }
        }
    }

}
