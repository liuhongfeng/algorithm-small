package com.geek.algorithm.learn.test01;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 类描述
 */
public class Hying extends Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.setAa("a");
        test.setBb("b");
        System.out.println(test.getAa() + "--" + test.getBb());
        test.aa();
    }

    @Override
    public void aa() {
        System.out.println("子类-aa");
    }

    private String bb() {
        String string = "bb";
        System.out.println(string);
        return string;
    }

}
