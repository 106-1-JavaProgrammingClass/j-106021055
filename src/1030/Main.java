import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int score = scn.nextInt();
        if (score <= 100 && score >= 0) {
            if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("錯誤");
        }
    }
}