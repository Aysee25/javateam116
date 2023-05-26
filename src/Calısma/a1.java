package Calısma;

import java.util.Map;
import java.util.TreeMap;

public class a1 {
    public static void main(String[] args) {

         /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.

        Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output :a kullanimi : 4 adet
                b kullanimi : 2 adet
                c kullanimi : 2 adet
                d kullanimi : 1 adet
                k kullanimi : 1 adet
                s kullanimi : 3 adet
                z kullanimi : 1 adet

         */

        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","c","s","z","c","k"} ;

        Map<String,Integer> harflerMaps =new TreeMap<>();

        for (String eachHarfler:harfler) {
            if (!harflerMaps.containsKey(eachHarfler)){
                harflerMaps.put(eachHarfler,1);
            }else {
                int kullanimSayisi=harflerMaps.get(eachHarfler);
                harflerMaps.put(eachHarfler,kullanimSayisi+1);
            }
        }
        System.out.println(harflerMaps);

    }


}
