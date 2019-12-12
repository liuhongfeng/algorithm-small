package com.geek.algorithm.learn.test02;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 类描述
 */
public class Test {

    public static void main(String[] args) {
        // 以 Cat 对象调用 show 方法
        show(new Cat());
        // 以 Dog 对象调用 show 方法
        show(new Dog());

        // 向上转型
        Animal a = new Cat();
        // 调用的是 Cat 的 eat
        a.eat();
        // 向下转型
        Cat c = (Cat) a;
        // 调用的是 Cat 的 work
        c.work();
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        // 猫做的事情
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        }
        // 狗做的事情
        else if (a instanceof Dog) {
            Dog c = (Dog) a;
            c.work();
        }
    }

}

/**
 * 动物
 * 父类
 */
abstract class Animal {
    /**
     * eat 吃
     */
    abstract void eat();
}

/**
 * 内部类 cat
 * 子类
 */
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

/**
 * 内部类 dog
 * 子类
 */
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}