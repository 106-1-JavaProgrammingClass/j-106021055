import java.util.Scanner;

public class hw100204 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a<=b && b<=c && a+b>=c){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}