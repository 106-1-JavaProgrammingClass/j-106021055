import java.util.Scanner;

public class hw100205 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v0 = scn.nextInt();
        int v1 = v0/1000;
        int v2 = v0%1000;
        int v3 = v2/100;
        int v4 = v2%100;
        int v5 = v4/10;
        int v6 = v4%10;
        if (v0>=1000 && v0<=9999){
            System.out.println(v1+"thousand\t"+v3+"hundred\t"+v5+"ten\t"+v6+"dollar");
        }else if (v0>=100 && v0<=999){
            System.out.println(v3+"hundred\t"+v5+"ten\t"+v6+"dollar");
        }else if (v0>=10 && v0 <=99){
            System.out.println(v5+"ten\t"+v6+"dollar");
        }else if (v0>=0 && v0 <=90){
            System.out.println(v6+"dollar");
        }else {
            System.out.println("error");
        }
    }
}