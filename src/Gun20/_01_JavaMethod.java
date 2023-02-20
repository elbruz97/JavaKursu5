package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        toplamYaz(4, 5); // giden var, donen veri yok

        int enb = Math.max(4, 5); // giden var, donen veri var (fonksiyonu birseye esitleyebiliyor musun?)
        double sayi = Math.random(); // giden yok, donen veri var

        enbYaz(5, 8);
        enb = enbBul(6, 9);
        System.out.println("enb = " + enb);


    }

    public static void toplamYaz(int a, int b) {
        System.out.println(a + b);
    }

    public static void enbYaz(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int enbBul(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}


