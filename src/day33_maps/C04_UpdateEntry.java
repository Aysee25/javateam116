package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C04_UpdateEntry {
    public static void main(String[] args) {
        // ogrenci map'indeki tum soyisimleri buyuk harfe cevir

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        MapMethodlar.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
