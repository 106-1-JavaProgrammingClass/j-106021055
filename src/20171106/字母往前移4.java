import java.util.Scanner;

public class 字母往前移4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        int a = scn.nextInt();
        for (int i = 0; i < st.length();i++){
            char ch = (char) (st.charAt(i) + a);
            System.out.print(ch);
        }
        System.out.println();
    }
}