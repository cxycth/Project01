package com.atguigu;

import java.util.ArrayList;

public class TemplatesTest {
    //模板6：prsf 生成私有静态常量
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int Num = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String MATTO = "china";

    //模板1：psvm,main
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        //变形:soutp/soutm/soutv/xxx.sout

        //模板3：fori
        String[] arr = new String[]{"tom","Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(45);
        list.add(67);

        for (Object o : list) {

        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板5：ifn
        ArrayList list1 = new ArrayList();
        list1.add(123);
        list1.add(45);
        list1.add(67);

        //ifn
        if (list1 == null) {

        }
        //变形：inn
        if (list1 != null) {

        }
        //变形:xxx.nn/xxx.null
        if (list1 != null) {

        }
        if (list1 == null) {

        }

    }
}
