package com.geek.algorithm.list;

/**
 * @author lhf
 * @date 2019/11/30
 * @describe 链表类
 */
public class LinkListImpl implements LinkList {

    /**
     * 头节点
     */
    public ListNode head;

    /**
     * 尾节点
     */
    public ListNode tail;

    /**
     * 元素个数
     */
    public int size;

    /**
     * 初始化 头结点和尾节点
     */
    public LinkListImpl() {
        head = new ListNode();
        tail = head;
        size = 0;
    }

    /**
     * 参数检查
     *
     * @param index
     */
    public void check(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("参数异常");
        }
    }

    @Override
    public void add(int e) {
        ListNode node = new ListNode(e);
        // 尾节点的下一个节点，设为新节点
        tail.next = node;
        // 修改尾节点变为新节点
        tail = node;
        // 修改元素个数
        size++;
    }

    @Override
    public void insert(int e, int index) {
        check(index);
        ListNode node1 = head.next;
        for (int i = 0; i < index; i++) {
            // 找到 index 节点
            node1 = node1.next;
        }
        ListNode node2 = new ListNode(e);
        // 如果插在最前面
        if (index == 0) {
            // 头结点指向第一个节点
            head.next = node2;
        } else {
            ListNode node3 = head.next;
            for (int i = 0; i < index - 1; i++) {
                node3 = node3.next;
            }
            node3.next = node2;
        }
        // 新节点指向原来的节点
        node2.next = node1;
        size++;
    }

    @Override
    public void delete(int index) {
        check(index);
        // 记录下标为 index 的节点
        ListNode node1 = head.next;
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                node1 = node1.next;
            }
            // 记录下标为 index-1 的节点
            ListNode node2 = head.next;
            for (int i = 0; i < index - 1; i++) {
                node2 = node2.next;
            }
            // 将前一个节点指向后一个节点
            node2.next = node1.next;
        } else {
            head.next = node1.next;
        }
        // 断开 index 节点与后面的结点
        node1.next = null;
        size--;
    }

    @Override
    public int get(int index) {
        ListNode node = head.next;
        // 从头节点开始，依次向后查找
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    @Override
    public void update(int index, int e) {
        ListNode node1 = head.next;
        for (int i = 0; i < index; i++) {
            node1 = node1.next;
        }
        node1.val = e;
    }

    @Override
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        // 创建链表
        LinkListImpl nodeLink = new LinkListImpl();

        // 添加元素
        nodeLink.add(10);
        nodeLink.add(20);
        nodeLink.add(30);
        nodeLink.add(40);
        nodeLink.add(50);

        // 删除元素
        nodeLink.delete(2);

        // 插入元素
        nodeLink.insert(31, 2);

        // 更新元素
        nodeLink.update(2, 32);

        for (int i = 0; i < nodeLink.getSize(); i++) {
            int e = nodeLink.get(i);
            System.out.println("第" + i + "个元素是：" + e);
        }

    }

}
