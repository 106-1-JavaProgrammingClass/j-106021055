import java.util.Scanner;

public class 質數判別8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = 0;
        for (int i = 2 ; i <= a ; i++){
            if (a % i == 0){
                b++;
            }
        }
        if (b == 1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}