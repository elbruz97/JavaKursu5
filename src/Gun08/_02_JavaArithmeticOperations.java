package Gun08;

public class _02_JavaArithmeticOperations {
    public static void main(String[] args) {
        int sayac = 0;

        sayac = sayac + 1; //sayacin degerini 1 arttirir : 1
        sayac++;           //sayacin degerini 1 arttirir : 2
        ++sayac;           //sayacin degerini 1 arttirir : 3

        sayac = sayac - 1; //sayacin degerini 1 arttirir : 2
        sayac--;           //sayacin degerini 1 arttirir : 1
        --sayac;           //sayacin degerini 1 arttirir : 0

        System.out.println("sayac = " + sayac);

        /******************************************/
        //sayac=0
        int toplam = 5 + sayac; // toplam=5

        toplam = 5 + sayac++; // toplam=5
        // sayac=1 oldu

        toplam = 5 +  ++sayac; // toplam=7 , sayac=2 , sayac toplama girmeden artti

    }
}
