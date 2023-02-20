package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // Soru: Iki kenari tanimli olarak verilen bir dikdortgenin cevresini ve alanini bulunuz.
        // bir kenari a ise, diger kenari b ise, cevre=a+a+b+b, alan a*b

        int kisaKenar = 5;
        int uzunKenar = 8;

        int cevre = (kisaKenar + uzunKenar) * 2;
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
