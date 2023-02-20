package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array: boyut sabit, sonradan degismez
        int[] dizi = new int[5]; //Array 5 elemanli boyutu sonradan degismiyor

        // Boyutu dinamik, eleman verildikce uzayan, sildikce kisalan
        // ArrayList: boyutu basta 0, eleman verildikce artar, sildikce kisalir.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Eren"); // uzunluk 1
        isimler.add("Metin"); // uzunluk 2
        isimler.add("Burcu"); // uzunluk 3
        isimler.add("Elbruz"); // uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1, "Arda"); // verilen index e ekliyor, digerleri son dogru kayar
        System.out.println("isimler = " + isimler);

        isimler.set(1, "Zafer"); // verilen indexdeki elemani degistirir
        System.out.println("isimler = " + isimler);

        boolean varMi = isimler.contains("Metin");
        System.out.println("varMi = " + varMi); // true

        isimler.remove("Metin");
        System.out.println("isimler = " + isimler);

        isimler.remove(1);
        System.out.println("isimler = " + isimler);

        int indexOfElbruz = isimler.indexOf("Elbruz");
        System.out.println("indexOfElbruz = " + indexOfElbruz);

        String ilkElaman = isimler.get(0); // verilen indexdeki degeri verir
        System.out.println("ilkElaman = " + ilkElaman);

        isimler.clear(); // her seyi temizler
        System.out.println("isimler = " + isimler);


    }
}
