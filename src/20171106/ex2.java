import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 1; i <= a; i++) {
        if (i%3 == 0){
            System.out.print("A");
        }else{
            System.out.print("*");
        }

        }
    }
}