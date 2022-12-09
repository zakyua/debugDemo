package com.bxait.debug;

/**
 * ClassName: Debug05
 * Description: 演示5：异常断点
 *
 * @Version 1.0
 */
public class Debug05 {
    public static void main(String[] args) {

        // 算数异常
//        int m = 10;
//        int n = 0;
//        int result = m / n;
//        System.out.println(result);

        // 空指针
        Person p1 = new Person(1001);
        System.out.println(p1.getName().toUpperCase());


    }
}
