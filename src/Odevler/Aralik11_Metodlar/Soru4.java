package Odevler.Aralik11_Metodlar;

public class Soru4 {
    public static void main(String[] args) {
        // Soru 4
        //adı  reverseWord olan bir method oluşturun. Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //
        //Örnek 1 :
        //Dize: Java yazın
        //Print: yazın Java

        String cumle = "Java yazın deneme yapın";
        reverseWord(cumle);
    }

    public static void reverseWord(String cumle) {
        String[] dizi = cumle.split(" ");

        for (int i = dizi.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(dizi[i] + " ");
            else
                System.out.println(dizi[i]);
        }
    }
}
