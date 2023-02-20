package Gun32._02_Encapsulation;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

//    void setRenk(String renk){ this.renk = renk; }
//    String getRenk(){
//        return this.renk;
//    }
//
//    void setModel(int model){ this.model = model; }
//    int getModel(){
//        return this.model;
//    }
//
//
//    void setMotorHacmi(double motorHacmi){ this.motorHacmi = motorHacmi; }
//    double getMotorHacmi(){ return this.motorHacmi; }
//
//    void setKapiSayisi(int kapiSayisi){ this.kapiSayisi = kapiSayisi; }
//    int getKapiSayisi(){ return this.kapiSayisi; }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model < 2023)
            this.model = model;
        else
            System.out.println("hatali model");
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi < 7)
            this.kapiSayisi = kapiSayisi;
        else
            System.out.println("hatali kapi sayisi");
    }


    public Araba() {
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {

        setMotorHacmi(motorHacmi);
        setRenk(renk);
        setKapiSayisi(kapiSayisi);
        setModel(model);

        // Boyle olunca acik kapi kaliyor.kontrol etmeden direk atama yapiyor
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
