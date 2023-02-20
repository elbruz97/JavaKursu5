package Gun26._02_Ornek;

public class _02 {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person cal1 = new Person();
        cal1.name = "Hatice";
        cal1.surName = "Demir";
        cal1.age = 30;

        Person cal2 = new Person();
        cal2.name = "Muhammed";
        cal2.surName = "Gürdal";
        cal2.age = 35;

        // Eski Yontem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);

        // Ait oldugu class dan cagirarak yazdiriyoruz
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        // toString metod u yazinca duzgun calisti
        System.out.println("cal1 = " + cal1);

        // 4.Adim
        cal1.getBirthYear();
        System.out.println("dogum yili = " + (2022 - cal1.age)); //metodsuz yazma

        // 5.Adim
        cal2.getInitials();
    }
}

