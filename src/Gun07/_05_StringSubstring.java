package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // string in belli bir bolumunu alma islemi yapar

        String s1 = "Merhaba arkadaslar";

        String parca1 = s1.substring(3, 9); // 3 den 9 a kadar. 9 dahil degil
        System.out.println("parca1 = " + parca1);

        String parca2 = s1.substring(8, 15);
        System.out.println("parca2 = " + parca2);

        String parca3 = s1.substring(8); // verilenden baslayip sona kadar alir
        System.out.println("parca3 = " + parca3);
    }
}
