package com.geek.algorithm.learn;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 子类
 */
public class Dog extends Animal {

    /*Dog() {
        System.out.println("test01");
    }*/

    @Override
    public void move() {
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠叫");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Dog dog = new Dog();
        dog.move();
        dog.bark();
    }

    @Override
    public String test1() {
        return null;
    }

}
