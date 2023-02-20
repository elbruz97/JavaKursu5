package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi kucuk harfe cevirir

        String text = "Merhaba Dunya";

        System.out.println("orijinal hali text = " + text); // Merhaba Dunya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dunya

        System.out.println("me ile veya ME ile basliyor mu = " + text.toLowerCase().startsWith("me")); // true

        System.out.println("text = " + text); // atama yapmazsak text degismez
    }
}
