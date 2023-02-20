package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanicinin girecegi 2 sayidan buyuk olanini bulma islemini bir metodda yaptiktan sonra main de yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayiyi giriniz = ");
        int bir = oku.nextInt();

        System.out.print("2.sayiyi giriniz = ");
        int iki = oku.nextInt();

        int enb = buyukOlaniBul(bir, iki);
        System.out.println("enb = " + enb);

    }

    public static int buyukOlaniBul(int a, int b){

//        if (a > b)
//            return a;
//        else
//            return b;

        // 2.yontem
        return a > b ? a : b;
    }
}
