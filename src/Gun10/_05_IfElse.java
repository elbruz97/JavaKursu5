package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen stringin uzunlugu 10 dan buyukse ve icinde "study" geciyorsa evet yoksa hayir yaziniz

        Scanner oku = new Scanner(System.in);

        System.out.print("cumle giriniz = ");
        String cumle = oku.nextLine();

        int uzunluk = cumle.length();

        if (uzunluk > 10 && cumle.toLowerCase().contains("study"))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");
    }
}
