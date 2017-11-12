import java.util.Scanner;

public class 課堂練習2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sum = 0;
        for (int i = 0;i<x;i++){
            sum += scn.nextInt();
        }
        System.out.println(sum);
        System.out.println(sum/x);
    }
}