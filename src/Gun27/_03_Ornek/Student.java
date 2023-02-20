package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders){

        int suAnToplam = 0;
        for (Lesson d : dersleri)
            suAnToplam += d.saat;

        if (suAnToplam + ders.saat <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println("Kredi siniri asildi " + ders.name + " dersi eklenememektedir.");

    }

    public void dersleriYazdir(){
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin " + name);
        System.out.println("Aldiginiz dersler asagidadir.");

        for (Lesson d : dersleri)
            System.out.println(d.name + " " + d.saat);
    }

    public static void universiteKurallari()
    {
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın ");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }

}
