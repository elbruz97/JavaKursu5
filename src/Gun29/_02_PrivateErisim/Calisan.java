package Gun29._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surname;
    private String password;
    // sadece bulundugu classdan erisim izni var

    public void sifreAta(String sifre){
        // sifreyi kontrol ederek atayacagim
        if(sifre.length() < 8)
            System.out.println("zayif sifre");
        else {
            this.password=sifre;
            System.out.println("Sifre atandi");
        }
    }

    public void sifreGoster(){
        System.out.println("****" + password.substring(4));
    }
}
