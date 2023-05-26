package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrencimap= MapMethodlar.ogrenciMapOlustur();

        System.out.println(ogrencimap);

        ogrencimap.put(110,"Sevda-Fan-12-H-MF");
        ogrencimap.put(101,"Ayse-Yan-12-H-MF");
        System.out.println(ogrencimap);

        ogrencimap.replace(102,"Aysegul-Nan-11-H-MF");
        System.out.println(ogrencimap);

        ogrencimap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-11-K-TM");
        ogrencimap.replace(104,"104=Ayse-Cem-10-H-MF","104=Hasan-Cem-11-H-MF");
        System.out.println(ogrencimap);

        System.out.println(ogrencimap.getOrDefault(105, "BU ogrenci mab'de yok"));
        System.out.println(ogrencimap.getOrDefault(120, "Bu ogrenci mab'de yok"));

        System.out.println(ogrencimap.containsValue("Ayse-Yan-12-H-MF"));
        System.out.println(ogrencimap.containsValue("Ayse"));
        System.out.println(ogrencimap.containsKey(105));



    }
}
