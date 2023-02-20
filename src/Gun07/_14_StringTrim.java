package Gun07;

public class _14_StringTrim {
    public static void main(String[] args) {
        // trim: String basindaki ve sonundaki bosluklari alir

        String text = "  Merhaba Dunya   ";

        System.out.println("orijinal hali = ->" + text + "<-");
        System.out.println("trimli hali   = ->" + text.trim() + "<-");
    }
}
