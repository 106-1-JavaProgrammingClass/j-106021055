import java.util.Scanner;

public class 判斷座標是否在圓形範圍內9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(sc.nextInt());
        int y = Math.abs(sc.nextInt());
        double a = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if (a <= 100){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}