package Odevler.Aralik11_Metodlar;

public class Soru3 {
    public static void main(String[] args) {
        // Soru3
        // reverseString isminde bir method oluşturun. Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Tersten yazılmış halini yazdırınız.
        //
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        String strCumle="Java'yı seviyorum";
        reverseString(strCumle);

    }

    public static void reverseString(String cumle) {
        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }
    }

}
