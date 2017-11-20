package com.company;

import java.util.Scanner;

public class 十進制轉二進制 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int x;
        String str = "";
        while (v1 > 1) {
            x = v1 % 2;
            v1 = v1 / 2;
            str = Integer.toString(x) + str;
        }
        str = Integer.toString(v1) + str;
        for (int i = 0; i < 8 - str.length(); i++) {
            str = Integer.toString(0) + str;
        }
        System.out.println(str);

    }
}
