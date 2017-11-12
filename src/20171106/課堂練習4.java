import java.util.Scanner;

public class 課堂練習4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(fun(n)/(fun(m)*fun(n-m)));
    }
    public static int fun(int a){
        int sum = 1;
        for (int i = a;i>1;i--){
            sum *= i;
        }
        return sum;
    }
}