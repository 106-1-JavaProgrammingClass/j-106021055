import java.util.Scanner;

public class hw02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int C = scn.nextInt();
        System.out.println(Math.round(C*9/5+32));
    }
}