import java.util.Scanner;

public class 字串數字總和5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.next();
        int sum = 0;
        if (st.length()<=15){
            for (int i = 0;i<st.length();i++){
                sum += st.charAt(i)-'0';
            }
            System.out.println(sum);
        }
    }
}
