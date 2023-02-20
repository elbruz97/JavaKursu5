package Odevler.Aralik11_Metodlar;

public class Soru6 {
    public static void main(String[] args) {
        // Soru 6
        // Girilen bir diziyi tersten yazdıran bir metod yazınız.

        String[] dizi={"m","a","l","e","s"};
        reverseArr(dizi);

    }

    public static void reverseArr(String[] dizi) {
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]);
        }
    }
}
