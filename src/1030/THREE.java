import java.util.Scanner;

public class THREE {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        if (X < 8 && X > 0) {
            if (X == 1) {
                System.out.println("Monday");
            } else if (X == 2) {
                System.out.println("Tuesday");
            } else if (X == 3) {
                System.out.println("Wednesday");
            } else if (X == 4) {
                System.out.println("Thursday");
            } else if (X == 5) {
                System.out.println("Friday");
            } else if (X == 6) {
                System.out.println("Saturday");
            } else if (X == 7) {
                System.out.println("Sunday");
            }
        }else {
            System.out.println("錯誤");
        }
    }
}