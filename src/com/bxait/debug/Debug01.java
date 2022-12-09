package com.bxait.debug;

/**
 *  Step Over（F8）：进入下一步，如果当前行断点是调用一个方法，则不进入当前方法体内
 *  Step Into（F7）：进入下一步，如果当前行断点是调用一个自定义方法，则进入该方法体内
 *  Force Step Into（Alt +Shift + F7）：进入下一步，如果当前行断点是调用一个核心类库方法，则进入该方法体内
 *  Step Out（Shift + F8）：跳出当前方法体
 *  Run to Cursor（Alt + F9）：直接跳到光标处继续调试
 *  Resume Program（F9）：恢复程序运行，但如果该断点下面代码还有断点则停在下一个断点上
 *  Stop（Ctrl + F2）：结束调试
 *  View Breakpoints（Ctrl + Shift + F8）：查看所有断点
 *  Mute Breakpoints：使得当前代码后面所有的断点失效， 一下执行到底
 *
 * ClassName: Debug01
 * Package: com.bxait.debug
 * Description: 演示1：行断点  &  测试debug各个常见操作按钮
 */
public class Debug01 {
    public static void main(String[] args) {
        // 1.定义变量
//        int m = 10;
//        int n = 20;
//        System.out.println("m = " + m + ",n = " + n);
//        // 交换两个变量
//        swap(m, n);
//        System.out.println("m = " + m + ",n = " + n);

        // 2.定义数组
        int[] arr = new int[] {1,2,3,4,5};
        // 打印地址值
        System.out.println(arr);

        char[] arr1 = new char[] {'a','b','c'};
        // abc
        System.out.println(arr1);
    }

    /**
     * 方法说明：交换当前的两个变量
     * @MethodName  swap
     * @Description
     * @Author chenCheng
     * @EMAIL <2277411582@qq.com>
     * @Date 2022/12/5 13:24
     * @修改人及日期：
     * @修改说明：
     */
    public static void swap(int m,int n){
        int temp = m;
        n = temp;
        m = n;
    }

}
