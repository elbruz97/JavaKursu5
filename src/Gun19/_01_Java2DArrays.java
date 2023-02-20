package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = {
                {3, 4, 55},
                {234, 22, 33}
        };

        System.out.println("satir sayisi = " + tablo.length); // 2
        System.out.println("0.satirin oda sayisi = " + tablo[0].length); // 3
        System.out.println("1.satirin oda sayisi = " + tablo[1].length); // 3

        for (int i = 0; i < tablo.length; i++) {  // satir sayisi

            // ilgili satirdaki oda sayisi
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
