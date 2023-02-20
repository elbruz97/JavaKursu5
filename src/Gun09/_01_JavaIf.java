package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 10) {
            System.out.println("10 dan buyuk");
        }
    }
}
