package Gun33._03_Inheritance;

public class Calisan {
    private String isim;
    private int maas;
    private int maasKatSayisi;

    public int maasHesapla(){
        return (maas * maasKatSayisi);
    }

    public Calisan(String isim, int maas, int maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim=" + isim +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                ", Odenecek Maas=" + maasHesapla() +
                '}';
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return this.maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaasKatSayisi() {
        return this.maasKatSayisi;
    }

    public void setMaasKatSayisi(int maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }
}
