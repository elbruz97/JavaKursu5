package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 6 elemanli bir dizinin sadece tek olan elemanlarini ayri diziye(ArrayList) atayiniz

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        ArrayList<Integer> tekler = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".sayiyi giriniz = ");
            dizi[i] = oku.nextInt();

            if (dizi[i] % 2 != 0)
                tekler.add(dizi[i]);
        }

        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekler = " + tekler);


    }
}
