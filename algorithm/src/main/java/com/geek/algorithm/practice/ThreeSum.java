package com.geek.algorithm.practice;

import java.util.*;

/**
 * @author lhf
 * @date 2019/12/10
 * @describe 三数之和
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {1, -1, -1, 0};
        threeSum5(nums);
    }

    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     * 满足要求的三元组集合为：
     * [
     * [-1, 0, 1],
     * [-1, -1, 2]
     * ]
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        List<List<Integer>> lists = new LinkedList<>();
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                int target = -(nums[a] + nums[b]);
                for (Integer c : map.keySet()) {
                    if (c > b && map.get(c).equals(target)) {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(map.get(c));
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();
        for (int a = 0; a < nums.length - 2; a++) {
            for (int b = a + 1; b < nums.length - 1; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    if (nums[a] + nums[b] + nums[c] == 0) {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }

    /**
     * 排序 + 双指针解法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum3(int[] nums) {
        // 先进行排序
        Arrays.sort(nums);
        // 结果集
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            // 创建 i 和 j 两个指针
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) {
                    }
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) {
                    }
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) {
                    }
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
            }
        }
        return res;
    }

    /**
     * 国际站解法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum4(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                // 指针 1
                int lo = i + 1;
                // 指针 2
                int hi = nums.length - 1;
                // 求和结果
                int sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[++lo]) {
                        }
                        while (lo < hi && nums[hi] == nums[--hi]) {
                        }
                    } else if (nums[lo] + nums[hi] < sum) {
                        while (lo < hi && nums[lo] == nums[++lo]) {
                        }
                    } else {
                        while (lo < hi && nums[hi] == nums[--hi]) {
                        }
                    }
                }
            }
        }
        return res;
    }

    /**
     * 自己默写一遍
     */
    public static List<List<Integer>> threeSum5(int[] nums) {
        // 先进行排序
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    lists.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]) {
                    }
                    while (i < j && nums[j] == nums[--j]) {
                    }
                } else if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) {
                    }
                } else {
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
            }
        }
        return lists;
    }

}
