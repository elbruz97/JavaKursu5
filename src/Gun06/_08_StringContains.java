package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // olup olmadigini boolean cinsinden soyler.

        String cumle = "Merhaba Dunya";

        System.out.println("cumle = " + cumle);
        boolean varMi = cumle.contains("a");
        System.out.println("a varMi = " + varMi);

        System.out.println("cumlede a var mi = " + cumle.contains("a"));

        System.out.println("cumle.contains(ya) = " + cumle.contains("ya"));
        System.out.println("cumle.contains(k) = " + cumle.contains("k"));

    }
}
