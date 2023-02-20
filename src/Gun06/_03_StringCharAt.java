package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir

        String cumle = "Merhaba Dunya"; // length 13 ama karakterler 0-12 dahil

        char ilkHarf = cumle.charAt(0);

        System.out.println("ilkHarf = " + ilkHarf);
    }
}
