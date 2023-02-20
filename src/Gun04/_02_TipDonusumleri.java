package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1 = 98;
        byte ogrNot2 = 98;
        byte ogrNot3 = 100;
        byte ogrNot4 = 98;

        int toplam = ogrNot1; // byte -> int atinca problem cikarmadi  (GENISLETME)
        // cunku byte icin ayrilan yer int e sigar, kabul eder. veri kaybi olma ihtimali yok

        ogrNot1 = (byte) toplam; // int -> byte atiyinca dur dedi  (DARALTMA)
        // buyuk hafiza ayrilmis yere, kucuk hafiza ayrilmis alana atama islemi var. veri kaybi ihtimali var


    }
}
