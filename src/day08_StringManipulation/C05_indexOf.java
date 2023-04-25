package day08_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        /*
        indexOf() methodu
         */

        String str= "Java en iyisi";

        System.out.println(str.indexOf("e")); // 5
        System.out.println(str.indexOf("a")); // 1 === ilk gelen a  harfin index'ini getirir

        System.out.println(str.indexOf("en")); // 5 === ayrı ayrı bakmıyor tamamına bakıp ilk gelen harfin index'ini yazdırır

        /*
        System.out.println(str.indexOf("en")); // 5 ===
         ayrı ayrı bakmıyor String'in tamamına bakıp ilk gelen harfin index'ini yazdırır (e)
         */
        System.out.println(str.indexOf("yi")); // 9
        System.out.println(str.indexOf("iyisi")); // 8
        System.out.println(str.indexOf("is")); // 10
        System.out.println(str.indexOf("iy")); // 8
        System.out.println(str.indexOf("o")); // -1
        System.out.println(str.indexOf("en guzeli")); // -1

        // eger bir noktadan sonrasını aramak ıstıyorsak alttaki metodu uyguluyoruz
        // a ındex borden sonrası ıcın arama yapacak
        //    System.out.println(str.indexOf("a", 1)); //1

        System.out.println(str.indexOf("a", 1)); //1
        System.out.println(str.indexOf("a", 2)); //3

        System.out.println(str.indexOf("i")); // 8
        System.out.println(str.indexOf("i", 5)); //8
        System.out.println(str.indexOf("i", 6)); //8
        System.out.println(str.indexOf("i", 9)); //10
        System.out.println(str.indexOf("i", 11)); //12

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        // "Java en iyisi" ıcersinde "en" kelimesini ıcın
        // str.indexOf("en") kelımesını aratıyoruz
        // "en" cumle ıcerısınde yoksa -1 cıkacaktır

        if (str.indexOf("en")== -1){
            System.out.println("bu cumlede aradıgınız kelıme yok");
        } else {
            int birinciKelimeIndex=str.indexOf("en");
            if (str.indexOf("en",birinciKelimeIndex+1)==-1){
                System.out.println("bu cumlede aradıgınız kelıme bır tane");
            }else {
                System.out.println("Bu cumlede aradıgınız kelımeden bırden cok var");
            }
        }











    }
}
