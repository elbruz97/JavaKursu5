package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen bir sifrenin kurallara uygunlugunu kontrol ediniz
        // Kurallar: 1) en az 8 karakter olmali
        //           2) icinde pass kelimesi olmamali
        //           3) en fazla 12 karakter olmali

        Scanner oku = new Scanner(System.in);

        System.out.print("sifre giriniz = ");
        String sifre = oku.nextLine();

        int uzunluk = sifre.length();
        boolean passVarMi = sifre.toLowerCase().contains("pass");

        if (uzunluk >= 8 && uzunluk <= 12 && !passVarMi) // passVarMi == false da yazilir
            System.out.println("Gecerli");
        else
            System.out.println("GECERSIZ");
    }
}
