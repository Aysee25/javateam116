package day08_StringManipulation;

public class C08_nullPointer {
    public static void main(String[] args) {

        /*
        null bir deger degildir
        null bir pointer'dir
        non-primitive datalara deger atanamadigini isaret eder
         */
        String str; // deger atanmadıgı ıcın yazdırma vs ıslemlerı yapılamıyor
        // System.out.println(str); //CTE // deger atama yapılmadan normalde yazdırma yapılmaz

        /*
        yine de deger ataması yapmadan, bos olarak kalmasını, lakin en azından yeri geldigi zaman
        yazdırılabilecegini istiyorsak null pointer kullnılır
         */

        str=null;
        // str'a bir deger atanmadı, sadece bos oldugunu bildigimizi java'ya bildirdik

        System.out.println(str); // null


        String test= ""; // burda testin icinde "" kayıt
        System.out.println(test.length());

        System.out.println(str+"Ali");

        Integer sayi=null;

        // str=null  ,,, test = "";

        System.out.println(test.isEmpty());
        //System.out.println(str.isEmpty()); // null pointer exeption, bir seyin bos olup olmadıgını kontrol edemeyiz

        /*
        null ataması yapılan bir variable, hic bir method ile KULLANILMAZ!!!

        yazdırılabilir veya + ile kullanılabilir
         */





    }
}
