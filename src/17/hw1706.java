import java.util.Scanner;

public class hw1706 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char x = scn.next().charAt(0);
        System.out.println(str.replace(x,'\n'));
    }
}