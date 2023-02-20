package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanicidan Cadde, sokak, postakodu(int), ve ulke seklinde adres bilgisini alip yazdiriniz.

        Scanner okuStr = new Scanner(System.in); // String okumak icin
        Scanner okuInt = new Scanner(System.in);  // Int okumak icin

        System.out.print("Cadde = ");
        String cadde = okuStr.nextLine();

        System.out.print("Sokak = ");
        String sokak = okuStr.nextLine();

        System.out.print("Posta Kodu = ");
        int postaKodu = okuInt.nextInt();

        System.out.print("Ulke = ");
        String ulke = okuStr.nextLine();

        System.out.println("Adres = " + cadde + " " + sokak + " " + postaKodu + " " + ulke);
    }
}
