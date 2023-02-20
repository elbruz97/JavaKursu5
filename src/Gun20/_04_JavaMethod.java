package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayiyi giriniz = ");
        int bir = oku.nextInt();

        System.out.print("2.sayiyi giriniz = ");
        int iki = oku.nextInt();

        int toplam = toplamBul(bir, iki);
        System.out.println("toplam = " + toplam);

    }

    public static int toplamBul(int a, int b){

        return a + b;

    }
}
