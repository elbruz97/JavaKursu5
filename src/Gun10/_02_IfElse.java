package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunun ortalamasini bulunuz
        // Ortalama 60 dan buyuk ve esit ise gectiniz, degilse kaldiniz yaziniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Vize notu giriniz = ");
        int vizeNot = oku.nextInt();

        System.out.print("Final notu giriniz = ");
        int finalNot = oku.nextInt();

        int ortalama = (vizeNot + finalNot) / 2;

        if (ortalama >= 60)
            System.out.println("Gectiniz");
        else
            System.out.println("Kaldiniz");
    }
}
