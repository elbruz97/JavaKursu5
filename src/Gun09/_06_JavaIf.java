package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cumlede a harfi gecip gecmedigini bulunuz
        // Var ise EVET, yok ise HAYIR yazdiriniz

        Scanner oku = new Scanner(System.in);

        System.out.print("cumle giriniz = ");
        String cumle = oku.nextLine();

        if (cumle.contains("a")) {
            System.out.println("EVET");
        }

        if (!cumle.contains("a")) {
            System.out.println("HAYIR");
        }

        //2.Yol
        if (cumle.indexOf("a") != -1) {
            System.out.println("EVET");
        }

        if (cumle.indexOf("a") == -1) {
            System.out.println("HAYIR");
        }
    }
}
