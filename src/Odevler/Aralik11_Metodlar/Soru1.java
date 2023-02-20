package Odevler.Aralik11_Metodlar;

public class Soru1 {
    public static void main(String[] args) {
        // 1.Soru
        // Ismi **randomNum** olan bir method oluşturun. Parametre olarak **int max** almalı.
        //
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //
        //Random numarayı döndürünüz.

        int random = randomNum(40);
        System.out.println("random = " + random);
    }

    public static int randomNum(int max){
        return (int) (Math.random() * max);
    }
}
