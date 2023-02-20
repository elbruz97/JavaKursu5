package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen bir sayinin, 2 ayni sayinin carpimina esit olup olmadigini bulunuz.
        // 4 -> 2*2 bu tam karedir
        // 5 -> tam kare degildir
        // 9 -> 3*3 tam kare

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();
        int sayac = 0;
        boolean bulundu = false;

        while(sayac < sayi) {

            System.out.println("sayac = " + sayac);

            if(sayac * sayac == sayi) {
                System.out.println("tam karedir");
                bulundu = true;
                break;
            }

            sayac++;
        }

        if (bulundu == false)
            System.out.println("tam kara degildir");


    }
}
