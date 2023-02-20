package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = new int[2][3]; // bos default deger 2x3 tablo
        int[][] tablo2 = {
                {2, 3, 4},
                {34, 45, 55},
        };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(tablo2[i][j] + " ");
            }

            System.out.println();
        }


    }
}
