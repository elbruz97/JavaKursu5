package Gun17;

import java.util.Scanner;

public class _04_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir Stringi parcalara ayirma

        // Kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        String[] kelimeler = cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
