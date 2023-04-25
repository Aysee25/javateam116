package day07_SwitchStatement_StringManipulations;

public class C10_Substring {
    public static void main(String[] args) {

        String str= "Java Candir";

        // sadece "Candir" kısmını yazdirin

        System.out.println(str.substring(5)); // Candir

        System.out.println(str.substring(2)); // va Candir

        System.out.println(str.substring(10)); // r

        System.out.println(str.substring(11)); // bos satır

        // System.out.println(str.substring(12)); // hata verir

        // sadece java kısmını yazdırın

        System.out.println(str.substring(0)); // Java Candir

        System.out.println(str.substring(0,3)); // Jav
        System.out.println(str.substring(0, 4)); // Java

        // Java'da

        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.substring(1, 2)); // a

        // eger sadece 1 harf almak ısterseniz substring(harfinIndexi, harfinIndex, + 1)

        System.out.println(str.substring(5, 5)); // bos satır
       // System.out.println(str.substring(8, 5)); // hata verir --- geri geri gidemez

        String str2= "eSRa";

        // ilk harfini buyuk kalanlarini kucuk harf olacak sekilde duzenleyin

        str2=str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2); // Esra


    }
}
