package com.geek.algorithm.learn.test02;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 类描述
 */
public class Circle {

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
        //getDrawInstance().drawShape();   // 必须先创建成员内部类的对象，再进行访问
    }

    private Draw getDrawInstance() {
        return new Draw();
    }

    class Draw {     // 内部类

        private double radius = 2;

        public void drawShape() {
            double radius = 1;
            System.out.println(radius);  // 内部类中方法的 radius 值
            System.out.println(this.radius);  // 内部类的 private 成员
            System.out.println(Circle.this.radius); // 外部类的 private 成员
        }
    }

}
