package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihan Yilmaz");
        hm.put(2002, "Talip Yildiz");
        hm.put(5001, "Hatice Bayrak");
        hm.put(1002, "Elbruz Dogan"); // 1002 de bunu tuttu

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2002) = " + hm.get(2002));
        System.out.println("hm.get(1002) = " + hm.get(1002));

        System.out.println("hm.containsKey(2002) = " + hm.containsKey(2002));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(5001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
