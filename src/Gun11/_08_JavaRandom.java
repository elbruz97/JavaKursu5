package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.random() : double sayi uretir, 0 - 0.9999 arasi uretir

        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);

        // 0 ile 6 arasi uretmesi icin 6 ile carparim, 0 -5.9999
        // int e cevirirsem 0 -5 arasi olur

        int randTamSayi = (int) (Math.random() * 6);
        System.out.println("randTamSayi = " + randTamSayi);
    }
}
