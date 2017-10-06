import java.util.Scanner;

public class hw100203 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt()%2;
        if (a==1){
            System.out.println("奇數");
        }else {
            System.out.println("偶數");
        }

    }
}