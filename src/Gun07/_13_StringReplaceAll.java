package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll :

        String text = "Merhaba Dunya123";

        System.out.println("text = " + text);
        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap  -> Merh___ Du_y_123

        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar buyuk harfleri _ yap  -> _erhaba _unya123

        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]",""));
        // rakamlari sil  -> Merhaba Dunya

        System.out.println("0-9 disindakiler -> _ = " + text.replaceAll("[^0-9]",""));
        // rakam disindakileri sil  -> 123
    }
}
