package day07_SwitchStatement_StringManipulations;

public class C08_equals {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Java";
        String str3= "java";
        String str4= "JAVA";
        String str5= "JaVa";
        String str6= new String("Java");
        // Normalde no-primitive data turundeki objeler, new keyword'u ile olusturulur
        // String


        System.out.println(str1.equals(str2)); // true // st1 st2 ye esit mi diye soruyor
        System.out.println(str1.equals(str3)); // false
        System.out.println(str4.equals(str5)); // false
        System.out.println(str2.equals(str6)); // true

        /*
        equals metodu verilen iki String'in metin olarak aynı olup olmadigina bakar
        case sensetive'dir dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir
         */

        // String icin == kullanilamaz mi?
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str4 == str6); // false

        /*
        equals metodu sadece degerlere bakar
        metin ayni ise sonuc TRUE, metin farkli ise sonuc FALSE olur

        == ise hem metin degerine hem de referansa bakar
        ilerde anlatacagimiz uzere java bazen ayni referanslari
        farkli objelere yer verir
        bu konuyu ilerde detaylandiracagiz

        SIMDILIK
        iki String'in metin olarak aynı oldugunu kontrol etmek isterseniz
        equals metod'u kullanmalisiniz == kullanmamalisiniz
         */




    }
}
