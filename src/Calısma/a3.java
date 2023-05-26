package Calısma;

import java.util.Map;
import java.util.TreeMap;

public class a3 {
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
        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"} ;
        Map<String ,Integer> harflerMaps=new TreeMap<>();
        for (String eachHarfler:harfler) {
            harflerMaps.computeIfPresent(eachHarfler, (k,v) -> v+1);
            harflerMaps.putIfAbsent(eachHarfler,1);
        }
        System.out.println(harflerMaps);
    }
}
