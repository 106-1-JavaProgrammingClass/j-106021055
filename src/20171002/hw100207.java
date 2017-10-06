import java.util.Scanner;

public class hw100207 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int x =scn.nextInt();
        int v1 =3*(int)Math.pow(x,2);
        int v2 =(int)Math.pow(x,3)+(3*x)-3;
        int v3 =(2*x)+3;
        if (x<-1){
            System.out.println(v1);
        }if (-1<=x && x<= 1){
            System.out.println(v2);
        }if (x>1){
            System.out.println(v3);
        }
    }
}