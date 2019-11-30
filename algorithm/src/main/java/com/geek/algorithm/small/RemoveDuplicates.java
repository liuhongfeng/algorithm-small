package com.geek.algorithm.small;

/**
 * @author lhf
 * @date 2019/11/29
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //System.out.println(nums.length);

        // 移除数组中某一位置元素
        /*int[] newArray = delete(1, nums);
        System.out.println(newArray.length);*/

        //removeDuplicates(nums);
        removeDuplicates2(nums);
        removeDuplicates3(nums);

    }

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // 删除数组中的元素，得到新的数组
                    nums = delete(j, nums);
                    j = j - 1;
                }
            }
        }
        return nums.length;
    }

    /**
     * 删除数组中指定位置的元素
     * 数组的删除其实就是覆盖前一位
     *
     * @param index
     * @param array
     * @return
     */
    public static int[] delete(int index, int[] array) {
        // 先 new 一个新的数组（数量要少一个）
        int[] newArray = new int[array.length - 1];
        // 数组中元素往前挪动一位
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        // 复制数组
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        return newArray;
    }

    /**
     * 官方题解-中国站
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * 官方题解-国际站
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates3(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

}
