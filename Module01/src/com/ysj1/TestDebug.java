package com.ysj1;

import java.util.Arrays;

/**
 * @Auther: ysj
 * @Date: 2021/7/20 - 8:43
 * @Description: com.ysj1
 * @version: 1.0
 */
public class TestDebug {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        int a=10;
        int b=20;
        int c=30;
        int [] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        Arrays.toString(arr);
        int r = paly();
        System.out.println(r);

    }

    public static int paly(){
        System.out.println("paly----------1");
        System.out.println("paly----------2");
        System.out.println("paly----------3");
        System.out.println("paly----------4");
        return 66;
    }
}
