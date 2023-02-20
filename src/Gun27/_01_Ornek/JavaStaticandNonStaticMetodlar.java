package Gun27._01_Ornek;

public class JavaStaticandNonStaticMetodlar {
    public static void main(String[] args) {

        int sayi = 345;
        String strSayi = String.valueOf(sayi);
        int intSayi = Integer.parseInt(strSayi);

        // Static olmadigi icin initilize etmeden kullanamiyorum
        Utility ut = new Utility();
        String strySayi2 = ut.getString(sayi);

        // Static oldugu icin direk kullandim, Java gibi
        String strSayi3 = Utility.getString2(sayi);
    }
}

