import java.util.Scanner;

public class 星座查詢12 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();
        switch (m){
            case 1:
                if (d>=1 && d<=20){
                    System.out.println("Capricorn");
                }else if (d>20 && d<=31){
                    System.out.println("Aquarius");
                }break;
            case 2:
                if (d>=1 && d<=18){
                    System.out.println("Aquarius");
                }else if (d>18 && d<=29){
                    System.out.println("Pisces");
                }break;
            case 3:
                if (d>=1 && d<=20){
                    System.out.println("Pisces");
                }else if (d>20 && d<=31){
                    System.out.println("Aries");
                }break;
            case 4:
                if (d>=1 && d<=20){
                    System.out.println("Aries");
                }else if (d>20 && d<=30){
                    System.out.println("Taurus");
                }break;
            case 5:
                if (d>=1 && d<=21){
                    System.out.println("Taurus");
                }else if (d>21 && d<=31){
                    System.out.println("Gemini");
                }break;
            case 6:
                if (d>=1 && d<=21){
                    System.out.println("Gemini");
                }else if (d>21 && d<=30){
                    System.out.println("Cancer");
                }break;
            case 7:
                if (d>=1 && d<=22){
                    System.out.println("Cancer");
                }else if (d>22 && d<=31){
                    System.out.println("Leo");
                }break;
            case 8:
                if (d>=1 && d<=23){
                    System.out.println("Leo");
                }else if (d>23 && d<=31){
                    System.out.println("Virgo");
                }break;
            case 9:
                if (d>=1 && d<=23){
                    System.out.println("Virgo");
                }else if (d>23 && d<=30){
                    System.out.println("Libra");
                }break;
            case 10:
                if (d>=1 && d<=23){
                    System.out.println("Libra");
                }else if (d>23 && d<=31){
                    System.out.println("Scorpio");
                }break;
            case 11:
                if (d>=1 && d<=22){
                    System.out.println("Scorpio");
                }else if (d>22 && d<=30){
                    System.out.println("Sagittarius");
                }break;
            case 12:
                if (d>=1 && d<=21){
                    System.out.println("Sagittarius");
                }else if (d>21 && d<=31){
                    System.out.println("Capricorn");
                }break;
        }
    }
}