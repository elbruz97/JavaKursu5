package Gun08;

public class _03_Ozet {
    public static void main(String[] args) {
        int sayac = 0;
        int toplam = 0;

        toplam = toplam + sayac++;

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        sayac++;
        sayac--;
    }
}
