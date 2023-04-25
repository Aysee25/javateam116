package day12_doWhileLoop_scope;

public class C07_Hastane {

    static String hastaneIsmi= "Yildiz hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;


    /*
        Class level'da olusturulan variable'lar
        - eger tum nesneler icin ortak ise static olarak
        - her bir nesne icin farkli olacaksa instance olarak
        olusturulur.

        bu hastanede 500 personel varsa
        500 personel icin 500 isim, 500 adres, 500 telefon variable'i olmak zorundadir
        java bunu su sekilde cozmus :

        bu class'dan bir obje olusturuldugunda
        java tum instance variable'larin bir kopyasini olusturup
        o obje ile ilintilendirir

        Tum class level variable'lar icin
        deger atama mecburiyeti yoktur
        eger deger atanirsa o deger gecerlidir
        ancak deger atanmazsa java class level variable'lar icin
        default olarak belirledigi degerleri atama yapar

        sayisal variable : 0
        boolean : false
        char : hiclik
        non-primitive : null
     */

    public static void main(String[] args) {




    }

}
