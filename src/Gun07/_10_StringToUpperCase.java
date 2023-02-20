package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {

        String text = "Merhaba Dunya";

        System.out.println("orijinal hali text = " + text); // Merhaba Dunya
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me ile veya ME ile basliyor mu = " + text.toUpperCase().startsWith("ME")); // true

        System.out.println("text = " + text); // atama yapmazsak text degismez
    }
}
