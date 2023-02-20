package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru: Kullanicidan Fizik:90 seklinde not bilgisini aliniz.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner okuStr = new Scanner(System.in);

        System.out.print("Ders ve notu giriniz = ");
        String dersNotu = okuStr.nextLine();

        int noktaIndex = dersNotu.indexOf(":");
        String not = dersNotu.substring(noktaIndex + 1);
        // int notInt = Integer.parseInt(not);

        int notInt = Integer.parseInt(dersNotu.replaceAll("[^0-9]", "")); // 0-9 disindakileri sil

        if (notInt >= 90)
            System.out.println("A");
        else if (notInt >= 80)
            System.out.println("B");
        else if (notInt >= 70)
            System.out.println("C");
        else if (notInt >= 60)
            System.out.println("D");
        else if (notInt >= 40)
            System.out.println("E");
        else
            System.out.println("F");
    }
}
