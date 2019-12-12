package com.geek.algorithm.learn.test02;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 内部类的访问方式
 */
public class Outter {

    private Inner inner = null;

    public Outter() {

    }

    public Inner getInnerInstance() {
        if (inner == null) {
            inner = new Inner();
        }
        return inner;
    }

    class Inner {
        public Inner() {

        }
    }

    static class Inner2 {
        public Inner2() {

        }
    }

}
