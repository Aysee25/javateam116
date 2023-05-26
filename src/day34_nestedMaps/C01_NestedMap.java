package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMap {
    public static void main(String[] args) {
        /*
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        ogrebcileri map'e eklerken
        key olarak numara, value olarak tum bilgiyi girdigimizde
        ogrenciyi eklemek tek bir satir surerken
        ogrencinin bilgisine ulasmak veya update etmek cok uun suruyor

        Eger bilgilere erisim ve update'in daha hizli yapılabilmesini istersek Nested Map kullanabiliriz

        Ogrencileri ve bilgilerini Nested Map olarak girmek uzun olacaktır
        Ancak erisim ve update'in kisa olmasi icin bunu tercih edebiliriz

        ogrenciMap = { 101={ogrenciBilgiMap1},102={ogrenciBilgiMap2}....
         */
        Map<Integer,Map<String,String>> ogrenciMap =new HashMap<>();

        Map<String,String> ogrenciBilgiMap101 =new HashMap<>();
        ogrenciBilgiMap101.put("isim","Ali");
        ogrenciBilgiMap101.put("soyisim","Can");
        ogrenciBilgiMap101.put("sinif","11");
        ogrenciBilgiMap101.put("sube","H");
        ogrenciBilgiMap101.put("brans","MF");

        ogrenciMap.put(101,ogrenciBilgiMap101);

        // ogrenciMap.put(102,"Veli-Cem-10-K-TM"); ogrenci ekleme

        Map<String,String> ogrenciBilgiMap102 =new HashMap<>();
        ogrenciBilgiMap102.put("isim","Veli");
        ogrenciBilgiMap102.put("soyisim","Cem");
        ogrenciBilgiMap102.put("sinif","10");
        ogrenciBilgiMap102.put("sube","K");
        ogrenciBilgiMap102.put("brans","TM");

        ogrenciMap.put(102,ogrenciBilgiMap102);

        //ogrenciMap.put(103,"Ali-Cem-11-K-TM");

        Map<String,String> ogrenciBilgiMap103 =new HashMap<>();
        ogrenciBilgiMap103.put("isim","Ali");
        ogrenciBilgiMap103.put("soyisim","Cem");
        ogrenciBilgiMap103.put("sinif","11");
        ogrenciBilgiMap103.put("sube","K");
        ogrenciBilgiMap103.put("brans","TM");

        ogrenciMap.put(103,ogrenciBilgiMap103);

        System.out.println(ogrenciMap);

        /*
        {
        101={sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali},
        102={sinif=10, sube=K, soyisim=Cem, brans=TM, isim=Veli},
        103={sinif=11, sube=K, soyisim=Cem, brans=TM, isim=Ali}}
         */

        // 101 numrali ogrencinin bilgilerini getiren map'i yazdirin
        System.out.println(ogrenciMap.get(101));

        // 102 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenciMap.get(102).get("soyisim"));

        // 103 numarali ogrencinin bransini yazdirin
        System.out.println(ogrenciMap.get(103).get("brans"));
    }
}
