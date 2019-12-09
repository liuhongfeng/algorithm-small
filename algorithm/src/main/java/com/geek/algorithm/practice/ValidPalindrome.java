package com.geek.algorithm.practice;

/**
 * @author lhf
 * @date 2019/12/08
 * @describe 验证回文串
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
        isPalindrome(str);
    }

    public static boolean isPalindrome(String s) {
        // 1. 过滤数字、字母
        s = s.replaceAll("[^A-Za-z0-9]", "");
        // 2. 反转字符串
        String s1 = new StringBuffer(s).reverse().toString();
        // 3. 进行比较
        return s.equalsIgnoreCase(s1);
    }

}
