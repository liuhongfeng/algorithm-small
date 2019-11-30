package com.geek.algorithm.list;

/**
 * @author lhf
 * @date 2019/11/30
 * @describe 接口类
 */
public interface LinkList {

    /**
     * 存储
     *
     * @param e
     */
    void add(int e);

    /**
     * 插入
     *
     * @param e
     * @param index
     */
    void insert(int e, int index);

    /**
     * 删除
     *
     * @param index
     */
    void delete(int index);

    /**
     * 获取
     *
     * @param index
     * @return
     */
    int get(int index);

    /**
     * 修改
     *
     * @param index
     * @param newValue
     */
    void update(int index, int newValue);

    /**
     * 获取元素个数
     *
     * @return
     */
    int getSize();

}
