package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanicidan x girilene kadar ekrana "Program calisiyor" yazan
        // ve x girildiginde ise "Program bitti" yazan program yapin.

        Scanner oku = new Scanner(System.in);
        String harf = "";

        do {
            System.out.println("Harf giriniz = ");
            harf = oku.nextLine();

            if (!harf.equalsIgnoreCase("x"))
                System.out.println("Program calisiyor");

        } while(!harf.equalsIgnoreCase("x"));

        System.out.println("Program bitti");
    }
}
