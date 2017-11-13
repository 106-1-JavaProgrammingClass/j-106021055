import java.util.Scanner;

public class 左上星星 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        for (int i = 1;i<=a;i++){
            for (int j = a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}