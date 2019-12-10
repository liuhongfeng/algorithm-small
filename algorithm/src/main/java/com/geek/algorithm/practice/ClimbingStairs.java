package com.geek.algorithm.practice;

/**
 * @author lhf
 * @date 2019/12/10
 * @describe 爬楼梯
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 45;
        int result = climbStairs2(n);
        System.out.println(result);
    }

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     * <p>
     * 斐波那契数列
     * <p>
     * 递归暴力解法
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 斐波那契数列
     * for 循环实现
     *
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

}
