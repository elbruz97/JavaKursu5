package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // kullanici 0 degeri girene kadar girdigi sayilarin toplamini bulunuz

        Scanner oku = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do { // dongu en az 1 kez calisir
            System.out.println("Sayi giriniz = ");
            sayi = oku.nextInt();

            toplam = toplam + sayi;
        } while(sayi != 0);

        System.out.println("toplam = " + toplam);
    }
}
