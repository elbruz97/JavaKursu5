package Odevler;

import java.util.Scanner;

public class _05_Aralik5 {
    public static void main(String[] args) {

        // Soru 1:
        //  0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız

        for (int i = 0; i < 101; i += 2) {
            System.out.println("i = " + i);
        }


        // Soru 2:
        // 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.

        for (int i = 1; i < 101; i += 2) {
            System.out.println("i = " + i);
        }


        // Soru 3:
        // 100'den 0'a kadar bütün tek sayıları yazdırınız.

        for (int i = 99; i > 0; i -= 2) {
            System.out.println("i = " + i);
        }


        // Soru 4:
        // İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

        int toplam = 0;

        for (int i = 0; i <= 10; i++) {
            toplam += i;
        }

        System.out.println("ilk 10 sayi toplam = " + toplam);
        
        
        // Soru 5:
        // **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0)
                System.out.println("This number is even and number is " + i);
            else
                System.out.println("This number is odd and number is " + i);
        }


        // Soru 6:
        // 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

        for (int i = 0; i <= 100; i++) {
            if(i % 4 == 0 && i % 5 == 0)
                System.out.println(i);
        }


        // Soru 7:
        // Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Uzunluk giriniz = ");
        int uzunluk = oku.nextInt();

        System.out.print("Genislik giriniz = ");
        int genislik = oku.nextInt();

        for (int j = 0; j < uzunluk; j++) {
            for (int i = 0; i < genislik; i++) {
                System.out.print("#");
            }
            System.out.println();
        }


        // Soru 8:
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *
        int bosluk = 4;
        int yildiz = 1;

        for (int j = 1; j < 6; j++) {
            for (int i = 0; i < bosluk; i++) {
                System.out.print(" ");
            }
            bosluk--;
            for (int i = 0; i < yildiz; i++) {
                System.out.print("*");
            }
            yildiz++;
            System.out.println();
        }


        // Soru 9:
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *
        int bosluk9 = 4;
        int yildiz9 = 1;

        for (int j = 1; j < 6; j++) {
            for (int i = 0; i < bosluk9; i++) {
                System.out.print(" ");
            }
            bosluk9--;
            for (int i = 0; i < yildiz9; i++) {
                System.out.print("* ");
            }
            yildiz9++;
            System.out.println();
        }


        // Soru 10:
        // 0 ile 30 arasındaki bütün çift sayıları yazdırınız. do while loop kullanınız

        int sayi = 0;

        do {
            System.out.println(sayi);
            sayi += 2;
        } while(sayi <= 30);
    }
}
