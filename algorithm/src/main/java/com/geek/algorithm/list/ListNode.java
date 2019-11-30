package com.geek.algorithm.list;

/**
 * @author lhf
 * @date 2019/11/30
 * @describe 结点类
 */
public class ListNode {

    /**
     * 数据
     */
    public int val;

    /**
     * 下一个节点
     */
    public ListNode next;

    /**
     * 创建一个无参数构造方法，用于初始化
     */
    public ListNode() {

    }

    /**
     * 创建一个有参数构造方法，便于给结点传数据
     *
     * @param x
     */
    public ListNode(int x) {
        this.val = x;
    }

}
