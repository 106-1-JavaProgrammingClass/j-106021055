import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class 最大值與最小值3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a[] = new float[10];
        DecimalFormat f = new DecimalFormat("0.00");
        for (int i = 0;i<10;i++){
            a[i] = scn.nextFloat();
        }
        Arrays.sort(a);
        System.out.println("max="+f.format(a[9])+"\nmin="+f.format(a[0]));
    }
}