package com.geek.algorithm.small;

import com.geek.algorithm.list.LinkListImpl;
import com.geek.algorithm.list.ListNode;

/**
 * @author lhf
 * @date 2019/11/29
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        // 创建链表1
        LinkListImpl linkList1 = new LinkListImpl();
        linkList1.add(1);
        linkList1.add(2);
        linkList1.add(4);
        ListNode listNode1 = linkList1.head;

        // 创建链表2
        LinkListImpl linkList2 = new LinkListImpl();
        linkList2.add(1);
        linkList2.add(3);
        linkList2.add(4);
        ListNode listNode2 = linkList2.head;

        ListNode listNode = mergeTwoLists(listNode1.next, listNode2.next);
        ListNode node = listNode;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
