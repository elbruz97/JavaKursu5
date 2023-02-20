package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanicidan agirligini ve boyunu double olarak aliniz ve bir satirda yazdiriniz.
        // vucut kitle indexini de bularak yaziniz.   kg / (boy*boy)

        Scanner oku = new Scanner(System.in);

        System.out.println("kilonuzu giriniz = ");
        double kilo = oku.nextDouble();

        System.out.println("boyunuzu giriniz = ");
        double boy = oku.nextDouble();

        double vucutIndex = kilo / (boy * boy);

        System.out.println("boyunuz " + boy + ", kilonuz " + kilo);
        System.out.println("vucutIndex = " + vucutIndex);
    }
}
