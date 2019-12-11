package com.geek.algorithm.learn.test01;

import lombok.Data;

/**
 * @author lhf
 * @date 2019/12/11
 * @describe 测试类
 */
@Data
public class Test {

    Test() {
        System.out.println("test");
    }

    Test(String a) {
        aa = a;
    }

    private String aa;

    private String bb;

    public void aa() {
        System.out.println("父类-aa");
    }

    private void bb() {
        System.out.println("父类-bb");
    }

    /**
     * bb
     * 私有方法可以被重载
     *
     * @param bb
     * @return
     */
    private String bb(String bb) {
        String string = bb;
        System.out.println(string);
        return string;
    }

}
