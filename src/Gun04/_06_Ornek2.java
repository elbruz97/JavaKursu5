package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kisinin agirligini double, boyunu int olarak degerler veriniz ve bir satirda yazdiriniz.
        // Vucut kitle indexini de bularak yaziniz. kg / (boy*boy)

        double agirlik = 70.0;
        int boy = 175;

        System.out.println("Boyunuz " + boy + " ve kilonuz " + agirlik);

        double kitleIndex = agirlik / (boy * boy);
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
