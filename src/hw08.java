import java.util.Scanner;

public class hw08 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float x = scn.nextInt();
        System.out.println(Math.round(x*0.26418f*10)/10f);
    }
}
