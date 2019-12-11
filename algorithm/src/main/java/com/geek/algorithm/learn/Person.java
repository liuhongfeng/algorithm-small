package com.geek.algorithm.learn;

import lombok.Data;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 构造方法 Constructor
 * 作用：给对象进行初始化
 * Constructor 不能被 override（重写）
 * 但是可以 overload（重载）
 */
@Data
public class Person {

    String name;

    int age;

    // 构造代码块
    // 构造代码块是给所有对象进行统一初始化
    {
        System.out.println("初始化----都会调用----");
    }

    /**
     * 无参构造方法
     */
    Person() {
        //run();
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void run() {
        System.out.println("run----");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        //System.out.println("姓名：" + p1.name + " 年龄：" + p1.age);

        //Person p2 = new Person("红影", 25);
        //System.out.println("姓名：" + p2.name + " 年龄：" + p2.age);

        // get 取值
        //System.out.println("姓名：" + p2.getName() + " 年龄：" + p2.getAge());

        p1.test(1, 2);
        p1.test(3, 4, 5);

        //String str = "test";
        // 字符串中字符个数
        //System.out.println(str.chars().count());
        // 字符串中第 n 个字符值
        //System.out.println(str.charAt(0));

        // 遍历字符串中每个字符
        /*char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }*/

    }

    private void test(int a, int b) {
        System.out.println(a + "--" + b);
    }

    /**
     * test 方法重载
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    private String test(int a, int b, int c) {
        String str = a + "--" + b + "--" + c;
        System.out.println(str);
        //test(a, b);
        return str;
    }

}
