package com.bxait.debug;

/**
 * ClassName: Debug04
 * Description: 演示4：条件断点
 *
 * @Version 1.0
 */
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            System.out.println(target);
        }
    }
}
