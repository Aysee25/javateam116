package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

import static day32_Maps.MapMethodlar.numaraliTumOgrenciListesiYazdir;

public class C01_Tekrar {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap =MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        numaraliTumOgrenciListesiYazdir(ogrenciMap);
    }
}
