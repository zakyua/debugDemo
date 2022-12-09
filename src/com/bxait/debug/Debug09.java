package com.bxait.debug;

import java.util.Arrays;

/**
 * 类说明：
 *      流式
 * @author ChenCheng
 * @ClassName Debug09
 * @create 2022-12-09 13:16
 * @Version 1.0
 */
public class Debug09 {
    public static void main(String[] args) {
        streamDebug();
    }
    public static void streamDebug(){
        Arrays.asList(1,2,3,4,5).stream()
                // 过滤
                .filter(i -> i % 2 == 0 || i % 3 == 0)
                // 收集
                .map(i -> i * i)
                // 遍历
                .forEach(System.out::println);
    }
}
