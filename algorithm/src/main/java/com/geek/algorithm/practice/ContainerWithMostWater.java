package com.geek.algorithm.practice;

/**
 * @author lhf
 * @date 2019/12/09
 * @describe 盛最多水的容器
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea2(height);
        System.out.println(result);
    }

    /**
     * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
     * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * <p>
     * 示例:
     * 输入: [1,8,6,2,5,4,8,3,7]
     * 输出: 49
     * <p>
     * 暴力解法
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max = 0;
        int minHeight;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                minHeight = Math.min(height[j], height[i]);
                max = Math.max(max, (j - i) * minHeight);
            }
        }
        return max;
    }

    /**
     * 两边靠拢的解法
     * <p>
     * 输入: [1,8,6,2,5,4,8,3,7]
     * 输出: 49
     * <p>
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int max = 0;
        int minHeight;
        for (int i = 0, j = height.length - 1; i < j; ) {
            minHeight = height[i] < height[j] ? height[i++] : height[j--];
            // 因为已经执行了 i++ 或者 j-- 所以需要再加上 1
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }

    /**
     * 两边靠拢的解法2
     *
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int max = 0;
        int minHeight;
        for (int i = 0, j = height.length - 1; i < j; ) {
            minHeight = height[i] < height[j] ? height[i] : height[j];
            max = Math.max(max, (j - i) * minHeight);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

}
