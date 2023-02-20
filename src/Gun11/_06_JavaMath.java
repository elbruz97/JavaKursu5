package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri = " + Math.abs(a));
        System.out.println("a ve b den buyuk olani = " + Math.max(a,b));
        System.out.println("a ve b den buyuk olani = " + Math.min(a,b));
        System.out.println("2 nin 3. kuvveti = " + Math.pow(2,3));
        System.out.println("b nin karekoku = " + Math.sqrt(b));
        System.out.println("round (yuvarla) 3.1 = " + Math.round(3.1));
        System.out.println("round (yuvarla) 3.5 = " + Math.round(3.5));

        System.out.println("ceil (yukari) 3.1 = " + Math.ceil(3.1)); // bu rakamdan buyuk en yakin tam sayi
        System.out.println("ceil 3.5      = " + Math.ceil(3.5));
        System.out.println("floor (asagi) 3.1 = " + Math.floor(3.1)); // bu rakamdan kucuk en yakin tam sayi
        System.out.println("floor 3.5      = " + Math.floor(3.5));

        int enb = Gun20._01_JavaMethod.enbBul(a,b); // baska paketten fonksiyon cagirabilirsin
        System.out.println("enb = " + enb);
    }
}
