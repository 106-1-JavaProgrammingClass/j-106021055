import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        char ch = scn.next().charAt(0);
        for (int i = 0 ; i < x ; i++){
            for (int j = 0 ; j < y ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}