import java.util.Scanner;

public class 課堂練習1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sum = 0;
        if (a <= c && c <= b){
            for (int i = a ; i <= b ; i++){
                if (i % 3 == 0){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}