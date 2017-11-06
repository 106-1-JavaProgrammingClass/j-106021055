import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;
        for (int i = a ; a <= b ; a++){
        sum = sum + a;
    }
        System.out.println(sum);
    }
}

