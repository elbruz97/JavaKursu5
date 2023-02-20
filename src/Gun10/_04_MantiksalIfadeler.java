package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // && ve isaret
        // || veya isereti

        // Girilen sayi pozitif veya tek ise uygun sayi girildi, degilse girilmedi yaziniz
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 0 && sayi % 2 == 1)
            System.out.println("Uygun sayi girildi");
        else
            System.out.println("Uygun sayi GIRILMEDI");
    }
}
