package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // string icindeki verilen karakterlerin sadece ilkini degistirir.

        String text = "Merhaba Dunya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a", "e")); // Merheba Dunya
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba", "de")); // Merhade Dunya
        System.out.println("text.replaceFirst(Dunya,Java) = " + text.replaceFirst("Dunya", "Java")); // Merhaba Java
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a", " ")); // ilk a silindi
    }
}
