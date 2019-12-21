package com.geek.algorithm.practice;

import java.util.Arrays;

/**
 * @author lhf
 * @date 2019/12/20
 * @describe 有效字母异位词
 */
public class ValidAnagram {

    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 示例 1:
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * <p>
     * 示例 2:
     * 输入: s = "rat", t = "car"
     * 输出: false
     */
    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        boolean b = isAnagram3(s, t);
        System.out.println(b);
    }

    /**
     * 排序解法
     */
    public static boolean isAnagram(String s, String t) {
        // 1. 先判断字符串长度是否相等
        if (s.length() != t.length()) {
            return false;
        }
        // 2. 字符串转字符数组 并进行排序
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    /**
     * 哈希表 解法一
     */
    public static boolean isAnagram2(String s, String t) {
        // 1. 先判断字符串长度是否相等
        if (s.length() != t.length()) {
            return false;
        }

        // ① 字母 'a' - 'z' 的 ASCII 码十进制的值为 97 - 122
        // ② 'a' 的 ASCII 码十进制的值为 97
        // 映射函数为 f(x) = ① - ②

        // 那么映射关系如下
        // a -> 数组下标为 0
        // b -> 数组下标为 1
        // ...
        // 字母 a - z 对应数组下标为 0 - 25

        int[] hashInt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashInt[s.charAt(i) - 'a']++;
            hashInt[t.charAt(i) - 'a']--;
        }
        for (int hash : hashInt) {
            if (hash != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 哈希表 解法二
     */
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hashInt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashInt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            hashInt[t.charAt(i) - 'a']--;
            if (hashInt[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
