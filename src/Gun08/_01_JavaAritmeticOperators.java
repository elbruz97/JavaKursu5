package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a = 9;
        int b = 5;

        System.out.println("Toplama islemi");
        System.out.println("a+b sonucu " + (a + b)); // 14

        System.out.println("Cikartma islemi");
        System.out.println("a-b sonucu " + (a - b)); // 4

        System.out.println("Carpma islemi");
        System.out.println("axb sonucu " + (a * b)); // 45

        System.out.println("Bolme islemi");
        System.out.println("a/b sonucu " + (a / b));
        // normal sonuc 1.8 ama tam sayinin tam sayiya bolumunde kusurat atilir. Sonuc 1 olur.  cunku int/int
        // normal sonuc isterseniz bir tanesini double cevirmen yeterli
        System.out.println("(double)a/b sonucu " + ((double) a / b));

        System.out.println("Modul Islemi");
        System.out.println("a%b sonucu " + (a % b)); // 4
        System.out.println("b%a sonucu " + (b % a)); // 5
    }
}
