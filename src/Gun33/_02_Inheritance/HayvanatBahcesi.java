package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args){
        //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için (renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.(ses cikardi)


        Kopek kopek1 = new Kopek("beyaz", 50, "kangal");
        kopek1.konustu();

        Kedi kedi1 = new Kedi("beyaz", 10, "ankara");
        kedi1.konustu();

        Ordek ordek1 = new Ordek("mavi", 5, "govel", 50);
        ordek1.konustu();

        Yilan yilan1 = new Yilan("kahve", 15, "kobra", 20);
        yilan1.konustu();
    }
}
