package Gun06;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Girilen bir stringin son harfini yaziniz.

        Scanner okuStr = new Scanner(System.in);

        System.out.print("String = ");
        String cumle = okuStr.nextLine();

        int uzunluk = cumle.length();
        char sonHarf = cumle.charAt(uzunluk - 1);

        System.out.println("son Harf = " + sonHarf);

        // 2. Yontem
        System.out.println("son Harf = " + cumle.charAt(cumle.length() - 1));
    }
}
