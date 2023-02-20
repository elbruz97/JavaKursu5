package Gun04;

public class _08_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bagis parasinin toplamini yazdirinz.

        String bagis1 = "10000";
        String bagis2 = "15000";

        int sayiBagis1 = Integer.parseInt(bagis1);
        int sayiBagis2 = Integer.parseInt(bagis2);

        int toplamBagis = sayiBagis1 + sayiBagis2;

        System.out.println("toplamBagis = " + toplamBagis);
    }
}
