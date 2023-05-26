package Calısma;

import java.util.Map;
import java.util.TreeMap;

public class a4 {
    public static void main(String[] args) {
        /*
         Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
                Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
                output :
                1 kullanimi : 3 adet
                2 kullanimi : 3 adet
                3 kullanimi : 3 adet
                4 kullanimi : 3 adet
                5 kullanimi : 2 adet
         */

        int []arr = {1,2,3,4,5,3,4,2,5,1,3,2,4,1};
        Map<Integer,Integer> sayilarMaps = new TreeMap<>();
        for (Integer eachSayilar:arr) {
            sayilarMaps.computeIfPresent(eachSayilar,(k,v) -> v+1);
            sayilarMaps.putIfAbsent(eachSayilar,1);

        }
        System.out.println(sayilarMaps);

    }
}
