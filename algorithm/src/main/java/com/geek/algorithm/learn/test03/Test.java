package com.geek.algorithm.learn.test03;

/**
 * @author lhf
 * @date 2019/12/12
 * @describe 类描述
 */
public class Test extends Test02 implements Test03, Test04 {

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer();
        a.append("a");
        a.append("b");
        a.append("cd");
        //System.out.println(a);

        byte b = (byte) 129;
        System.out.println(b);

        byte c = (byte) 128;
        System.out.println(c);

        // [01111111] 2^8 = 256 2^9 = 512 2^10 = 1024
        byte d = (byte) 127;
        System.out.println(d);

    }

    /**
     * 接口的实现
     */
    @Override
    public void test() {

    }

    /**
     * 子类重写父类方法
     *
     * @return
     */
    @Override
    public String test01() {
        return null;
    }

    /**
     * 子类重写抽象类方法
     *
     * @return
     */
    @Override
    String test02() {
        return null;
    }

}
