import java.util.Scanner;

public class 平年閏年判斷13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a%400==0||(a%4==0&&a%100!=0)){
            System.out.println("Bissextile Year");
        }else if (a%100==0||a%4!=0){
            System.out.println("Common Year");
        }
    }
}