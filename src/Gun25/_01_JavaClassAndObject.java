package Gun25;

//class larin tanimlandigi yer

public class _01_JavaClassAndObject {
    
    //metodlarin yazildigi yer
    
    public static void main(String[] args) {
        // ana program
        int sayi = 5; 
        
        Araba benimArabam = new Araba(); 
        benimArabam.marka = "BMW"; 
        benimArabam.renk = "beyaz"; 
        benimArabam.yili = 2022; 
        benimArabam.motorHacmi = 2000;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
    }

    //metodlarin yazildigi yer
}

//class larin tanimlandigi yer

class Araba {
    String renk; 
    int yili; 
    String marka; 
    int motorHacmi; 
    
}
