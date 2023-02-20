package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        merhabaYazIsim("Elbruz");
        cokMerhabaYaz(5);

    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dunya");
    }

    public static void merhabaYazIsim(String isim) {
        System.out.println("Merhaba " + isim);
    }

    public static void cokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba Dunya");
        }
    }
}
