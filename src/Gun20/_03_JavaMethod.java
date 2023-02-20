package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        long sonuc = faktoriyelBul(sayi);

        if (sonuc % 2 == 0)
            System.out.println("cift");
        else
            System.out.println("tek");

    }

    public static long faktoriyelBul(int a){

        long carpim = 1;

        for (int i = 1; i <= a; i++) {
            carpim *= i;
        }

        return carpim;

    }
}
