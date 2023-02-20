package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanali ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini secip ekrana yazdiriniz.

        String [] kanallar = {"trt", "kanald", "atv", "fox", "TV8"};

        int randomSayi = (int) (Math.random() * kanallar.length);
        System.out.println("randomSayi = " + randomSayi);

        System.out.println("random kanal = " + kanallar[randomSayi]);
        
    }
}
