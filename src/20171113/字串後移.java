package com.company;

import java.util.Scanner;

public class 字串後移 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int x = scn.nextInt();
        for (int i = 0 ; str.length()>i ; i++){
            int y = str.charAt(i)+x;
            System.out.print((char)y);
        }
        System.out.println();

    }
}
