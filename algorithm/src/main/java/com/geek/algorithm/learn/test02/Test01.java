package com.geek.algorithm.learn.test02;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 类描述
 */
public class Test01 {

    public static void main(String[] args) {

        // 第一种方式：
        //Outter outter = new Outter();
        // 必须通过 Outter 对象来创建
        //Outter.Inner inner = outter.new Inner();

        // 第二种方式：
        //Outter.Inner inner1 = outter.getInnerInstance();

        /**
         * 访问静态内部类
         */
        Outter.Inner2 inner2 = new Outter.Inner2();


        /**
         * 访问内部类
         */
        Circle circle = new Circle(1);
        Circle.Draw draw = circle.new Draw();
        draw.drawShape();

        //circle.getDrawInstance().drawShape();

    }

}
