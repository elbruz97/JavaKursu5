package Gun29._03_Protected.bir;

public class Doctor {
    protected String adi; // default ile ayni
    String bolumu; // default
    private String sicilNo; // private
    public String hastaneAd; // public

    Doctor() {

    }

    public Doctor(String adi) {
        this.adi = adi;
    }
}
