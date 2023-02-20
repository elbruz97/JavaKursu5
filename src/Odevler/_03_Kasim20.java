package Odevler;

import java.util.Scanner;

public class _03_Kasim20 {
    public static void main(String[] args) {
        // 1. Soru
        String bir = "I love Java";
        System.out.println("bir = " + bir);
        System.out.println("1 - karakter sayisi = " + bir.length());

        // 2. Soru
        String iki = "String planning";
        System.out.println("iki = " + iki);
        System.out.println("2 - karakter sayisi = " + iki.length());

        // 3. Soru
        String uc = "Apple";
        System.out.println("uc = " + uc);
        uc = uc.toLowerCase();
        System.out.println("3 - app var mi = " + uc.contains("app"));

        // 4. Soru
        String dort = "orange";
        System.out.println("dort = " + dort);
        System.out.println("4 - Apple a esit mi? = " + dort.equals(uc));

        // 5. Soru
        String bes = "apple";
        System.out.println("bes = " + bes);
        System.out.println("5 - apple a esit mi? = " + bes.equals("apple"));

        // 6. Soru
        String alti = "Florida";
        System.out.println("alti = " + alti);
        System.out.println("6 - o nun indexi = " + alti.indexOf('o'));

        // 7. Soru
        String yedi = "Thank you";
        System.out.println("yedi = " + yedi);
        System.out.println("7 - y nin indexi = " + yedi.indexOf('y'));

        // 8. Soru
        String sekiz = "Mouse";
        System.out.println("sekiz = " + sekiz);
        System.out.println("8 - 3.siradaki harf = " + sekiz.charAt(2));

        // 9. Soru
        String dokuz = "paper";
        System.out.println("dokuz = " + dokuz);
        System.out.println("9 - Buyuk harfle = " + dokuz.toUpperCase());

        // 10. Soru
        String on = "OraNge";
        System.out.println("on = " + on);
        System.out.println("10 - Kucuk harfle = " + on.toLowerCase());

        // 11. Soru
        String onbir = "New Jersey";
        System.out.println("onbir = " + onbir);
        System.out.println("11 - Buyuk harfle = " + onbir.toUpperCase());

        // 12. Soru
        String oniki = "New York";
        System.out.println("oniki = " + oniki);
        System.out.println("12 - Kucuk harfle = " + oniki.toLowerCase());

        // 13. Soru
        String onuc = "PADDLE";
        System.out.println("onuc = " + onuc);
        System.out.println("13 - Kucuk harfle = " + onuc.toLowerCase());

        /********************************************************************/
        // OZEL SORULAR
        // 1. Soru
        Scanner okuStr = new Scanner(System.in);

        System.out.print("Ad = ");
        String ad = okuStr.nextLine();

        System.out.print("Soyad = ");
        String soyad = okuStr.nextLine();

        System.out.println("Ad soyad = " + ad + " " + soyad);

        // 2. Soru
        System.out.print("Kelime giriniz = ");
        String kelime = okuStr.nextLine();
        System.out.println("Bos mu ? = " + kelime.isEmpty());

        // 3. Soru
        System.out.print("cumle giriniz = ");
        String cumle3 = okuStr.nextLine();
        cumle3 = cumle3.toLowerCase();

        int count = 0;

        for (int i = 0; i < cumle3.length(); i++) {
            if (cumle3.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("a sayisi = " + count);

          // 2.yol
        //int butunCumleUzunlugu = cumle3.length();
        //String cumle3Modified = cumle3.replace('a', ' ');
        //int aOlmadanCumleUzunlugu = cumle3Modified.length();

        // 4. Soru
        System.out.print("kelime giriniz = ");
        String cumle4 = okuStr.next();

        int son = cumle4.length();
        char ilkHarf = cumle4.charAt(0);
        char sonHarf = cumle4.charAt(son - 1);

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("sonHarf = " + sonHarf);

        // 5. Soru
        Scanner oku = new Scanner(System.in);

        System.out.print("cumle giriniz = ");
        String kelime5 = oku.next();

        System.out.println("ilk kelime = " + kelime5);

        // 6. Soru

        System.out.print("cumle tekrar giriniz = ");
        String cumle = okuStr.nextLine();

        int boslukIndex = cumle.indexOf(" ");
        String IlkKelime = cumle.substring(0, boslukIndex);
        System.out.println("IlkKelime = " + IlkKelime);

        // 7. Soru
        System.out.print("cumle giriniz = ");
        String cumle7 = okuStr.nextLine();

        int ecount = 0;

        for (int i = 0; i < cumle7.length(); i++) {
            if (cumle7.charAt(i) == ' ') {
                ecount++;
            }
        }

        System.out.println("kelime sayisi = " + ++count);

        // 9. Soru
        System.out.print("isminizi giriniz = ");
        String isim = okuStr.nextLine();

        char ilkInit = isim.charAt(0);

        int ilkBoslukIndex = isim.indexOf(" ");

        char ikinciInit = isim.charAt(ilkBoslukIndex + 1);

        int ikinciBoslukIndex = isim.indexOf(" ", ilkBoslukIndex + 1);

        char ucuncuInit = isim.charAt(ikinciBoslukIndex + 1);

        System.out.println("Bas harfler = " + ilkInit + "." + ikinciInit + "." + ucuncuInit + ".");

    }
}
