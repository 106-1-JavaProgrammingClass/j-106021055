import java.util.Scanner;

public class hw1712 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double p = scn.nextDouble();
        int n = scn.nextInt();
        System.out.println((float) Math . round ( p * Math . pow ( 10, n) ) / Math . pow ( 10 , n ) );
    }
}
