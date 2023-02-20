package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        // Doktor class i ayni pakette oldugu icin
        // private haric hepsine ulasabilir
        Doctor dok1 = new Doctor();
        dok1.adi="ismet";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Ankara Hastanesi";
        //dok1.sicilNo private

        Doctor dok2 = new Doctor("Mehmet");
    }
}
