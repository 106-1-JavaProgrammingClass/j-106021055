import java.util.Scanner;

public class hw1715 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int x = Integer.valueOf(str,16);
        System.out.println((char)x);
    }
}