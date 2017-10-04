import java.util.Scanner;

public class hw1714 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        int x = (int) ch;
        System.out.println(Integer.toHexString(x));
    }
}