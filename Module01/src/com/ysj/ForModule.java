package com.ysj;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: ysj
 * @Date: 2021/7/19 - 17:49
 * @Description: com.ysj
 * @version: 1.0
 */
public class ForModule {

    private static final int AGE=19;

    public static void main(String[] args) {
        System.out.println("this is new world!");
        int age=19;
        System.out.println(age);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("ForModule.main");
        System.out.println("age = " + age);
        int a=100;
        int c=90;
        System.out.println("c = " + c);

    }

    //处理循环:
    public void cycle(){

        for (int i = 0; i <9; i++) {

        }
        int a[]=new int[]{1,2,2,3};
        for (int i = a.length - 1; i >= 0; i--) {

        }
        int[] b={1,23};
        for (int i = 0; i < b.length; i++) {

        }

        for (int i : b) {

        }

        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("4");
        list.add("8");
        for (String s : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }

    }

    //条件判断：
    public void condition(){
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("4");
        list.add("8");

        if (list == null) {

        }
        if (list == null) {

        }

        if (list != null) {

        }
        if (list != null) {

        }

    }
}
