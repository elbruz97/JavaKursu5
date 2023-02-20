package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        /*  \n -> yeni satira geciyor
            \t -> tab tusuna basilmis gibi bosluk veriyor
            \b -> back-space bir karakter geri siler
            \" -> " tirnak yazmak icin kullaniyor
            \\ -> \ yazilacak ekrana
            \r -> satiri silip tekrar bastan yaziyormus gibi yapar
         */

        System.out.println("Merhaba\tDunya"); // Merhaba Dunya
        System.out.println("Merhaba\bDunya"); // MerhabDunya
        System.out.println("Merhaba\"Dunya"); // Merhaba"Dunya
        System.out.println("Merhaba\\Dunya"); // Merhaba\Dunya
        System.out.println("Merhaba\rDunya"); // Dunya


    }
}
