import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.println(Math.round(x*1.6f*10)/10f);
    }
}
