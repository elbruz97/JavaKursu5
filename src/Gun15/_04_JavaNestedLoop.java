package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Asagidaki goruntuyu veren programi sadece 1 yildiz kullanarak yapiniz.
        // *****
        // ****
        // ***
        // **
        // *

        for (int j = 5; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
