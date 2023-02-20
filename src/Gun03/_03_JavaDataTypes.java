package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;

        // tam sayilar
        //default int dir
        byte byteDeger = 7; // -128...127
        short shortDeger = 1645; // -32000...32000
        int intDeger = 250000;
        long longDeger = 23232323232323L;

        // ondalikli sayilar
        // default double dir
        double doubleDeger = 3.1415698573; // 16 sigfigs
        float floatDeger = 3.1415754f; // 7 sigfigs

        // karakter ve karakterler
        char basHarf = 'A'; // bir tane karakter saklar
        String isim = "elbruz"; // kelime veya cumle saklar

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);
    }
}
