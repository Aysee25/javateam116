package day34_nestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {
    public static void main(String[] args) {
        /*
            TreeMap elementleri dogal sirali olarak tuttugu,
            ve yeni eklenen elementleri de bu siralamaya uygun bir konuma yerlestirdigi icin
            diger map'lerde olmayan bazi ekstra ozelliklere sahiptir
         */

        TreeMap<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(103,"Ali Can");
        ogrenciMap.put(120,"Veli Cem");
        ogrenciMap.put(101,"Akif Han");
        ogrenciMap.put(140,"Yusuf San");

        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.subMap(103, 110)); //{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 120));//{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, false, 120, true)); // {120=Veli Cem}

        // sadece sinirlar yazilirsa baslangic

        System.out.println(ogrenciMap.descendingKeySet()); // [140, 120, 103, 101] ters sirali getirir
        System.out.println(ogrenciMap.descendingMap()); // {140=Yusuf San, 120=Veli Cem, 103=Ali Can, 101=Akif Han} ters sirali getirir

        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.lowerKey(120)); // 103 --> 120 den bir kucuk olanı verir
        System.out.println(ogrenciMap.lowerEntry(120)); // 103=Ali Can
        System.out.println(ogrenciMap.floorKey(103)); // 103 --> yuvarlamak demek 103,4 u 103 e yuvarlamak gibi
        System.out.println(ogrenciMap.floorKey(105)); // 103
        System.out.println(ogrenciMap.floorKey(119)); // 103
        System.out.println(ogrenciMap.floorKey(120)); // 120
        System.out.println(ogrenciMap.floorEntry(135)); // 120=Veli Cem ---> kendinden onceki en buyuk olani verir

        System.out.println(ogrenciMap.higherKey(120)); // 140 -->kendinden buyuk olan
        System.out.println(ogrenciMap.higherEntry(100)); // 101=Akif Han

        System.out.println(ogrenciMap.ceilingKey(120)); // 120 ---> yukarı yuvarla
        System.out.println(ogrenciMap.ceilingKey(100)); // 101
        System.out.println(ogrenciMap.ceilingEntry(100)); //101=Akif Han

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.headMap(120)); // {101=Akif Han, 103=Ali Can} ---> basa dogru mab -- bitisler dahil olmaz
        System.out.println(ogrenciMap.headMap(130)); // {101=Akif Han, 103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.headMap(120, true)); // {101=Akif Han, 103=Ali Can, 120=Veli Cem} --> bitisi dahil eder
        System.out.println(ogrenciMap.headMap(130, true));

        System.out.println(ogrenciMap.tailMap(120)); // {120=Veli Cem, 140=Yusuf San} --> sona dogru mab -- 120 baslangıc degeri oldugu ıcın dadil eder
        System.out.println(ogrenciMap.tailMap(120, false)); // { 140= Yusuf San} --> 120 dahil degil

        System.out.println(ogrenciMap.firstKey());
        System.out.println(ogrenciMap.firstEntry());

        System.out.println(ogrenciMap.lastKey());
        System.out.println(ogrenciMap.lastEntry());

        System.out.println(ogrenciMap.pollLastEntry()); // 140=Yusuf San
        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem}

        System.out.println(ogrenciMap.pollFirstEntry()); // 101=Akif Han
        System.out.println(ogrenciMap); // {103=Ali Can, 120=Veli Cem}

        ogrenciMap.clear();
        System.out.println(ogrenciMap); // {}

    }

}

