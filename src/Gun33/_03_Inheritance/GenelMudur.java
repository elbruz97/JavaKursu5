package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{

    private int tazminat;

    public GenelMudur(String isim, int maas, int maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public int maasHesapla() {
        return super.maasHesapla() + tazminat;
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim=" + getIsim() +
                ", maas=" + getMaas() +
                ", maasKatsayisi=" + getMaasKatSayisi() +
                ", tazminat=" + getTazminat() +
                ", Odenecek Maas=" + maasHesapla() +
                '}';
    }
}
