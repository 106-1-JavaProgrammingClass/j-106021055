import java.util.Scanner;

public class hw1709 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float x = scn.nextInt();
        System.out.println(Math.round(x/600f*10)/10f);
    }
}