package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;

        sayi = (int) oran; // tehlikeli islem, challanger bu yuzden patladi.
                           // eger olusan veri kaybi kabulunse bana bunu goster.
        System.out.println("sayi = " + sayi);

        byte kisaKenar = 5;
        byte uzunKenar = 7;

        byte cevre = (byte) (kisaKenar+kisaKenar+uzunKenar+uzunKenar);
        int cevre2 = kisaKenar+kisaKenar+uzunKenar+uzunKenar;

        System.out.println("cevre = " + cevre);
    }
}
