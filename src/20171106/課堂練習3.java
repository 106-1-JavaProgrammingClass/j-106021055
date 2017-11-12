import java.util.Scanner;

public class 課堂練習3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 1;
        for (int i = n;i > 1;i--){
            sum *= i;
        }
        System.out.println(sum);
    }
}