package Gun29._03_Protected.iki;

import Gun29._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        // Doktor class i baska pakette oldugu icin
        // sadece public olanlara ulasabilir
        Doctor dok3 = new Doctor("Hasan");
        dok3.hastaneAd = "Istanbul Hastanesi";


    }
}
