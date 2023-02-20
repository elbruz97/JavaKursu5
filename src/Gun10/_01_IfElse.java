package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir nota gore 50 den buyuk ise gectiniz kucuk ise kaldiniz yaziniz

        Scanner oku = new Scanner(System.in);

        System.out.print("Notu giriniz = ");
        int not = oku.nextInt();

        if (not >= 50)
            System.out.println("Gectiniz");
        else
            System.out.println("Kaldiniz");
    }
}
