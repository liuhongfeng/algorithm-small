package com.geek.algorithm.practice;

import java.util.*;

/**
 * @author lhf
 * @date 2019/12/20
 * @describe 字母异位词分组
 */
public class GroupAnagrams {

    /**
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     * 示例:
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     * ["ate", "eat", "tea"],
     * ["nat", "tan"],
     * ["bat"]
     * ]
     */
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams2(strs);
    }

    /**
     * 排序数组分类
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> map = new HashMap<>(16);
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

    /**
     * 按计数分类
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> map = new HashMap<>(16);
        int[] ints = new int[26];
        for (String str : strs) {
            Arrays.fill(ints, 0);
            for (char i = 0; i < str.length(); i++) {
                ints[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ints.length; i++) {
                sb.append("#");
                sb.append(ints[i]);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

}
