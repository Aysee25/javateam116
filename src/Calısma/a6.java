package Calısma;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class a6 {
    public static void main(String[] args) {
        /*
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
         */

        Map<Integer,String> ogrenciMap=new TreeMap<>();
        ogrenciMap.put(120,"Abdurrahman-Mollaoglu-10-A-F");
        ogrenciMap.put(123,"Ruveyda-Han-11-B-TM");
        ogrenciMap.put(125,"Taha-Can-11-F-TM");
        ogrenciMap.put(127,"Yusuf-Yasir-9-C-TS");

        System.out.println(ogrenciMap); // {120=Abdurrahman-Mollaoglu-10-A-F, 123=Ruveyda-Han-11-B-TM, 125=Taha-Can-11-F-TM, 127=Yusuf-Yasir-9-C-TS}

        ogrenciMap.replace(120,"Abdurrahman-Mollaoglu-10-A-F","Abdurrahman-Mola-11-A-F");
        System.out.println(ogrenciMap);
        ogrenciMap.replace(120,"Melih-Inceoglu-12-F-TM");
        System.out.println(ogrenciMap);




    }
}
