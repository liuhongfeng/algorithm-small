package com.geek.algorithm.learn.test02;

/**
 * @author lhf
 * @date 2019/12/12
 * @describe 匿名内部类应用
 */
public class AnonymousClassTest {

    public void test(ProductInformationList pil) {
        System.out.println("产品数量是： " + pil.getNumber() + " 产品名称是 " + pil.getName());
    }

    public static void main(String[] args) {
        AnonymousClassTest ac = new AnonymousClassTest();
        // 调用 test() 方法，需要传入一个 ProductInformationList 参数
        // 此处传入其匿名实现类的实例
        ac.test(new ProductInformationList() {
            @Override
            public int getNumber() {
                return 4;
            }

            @Override
            public String getName() {
                return "电脑";
            }
        });
    }

}
