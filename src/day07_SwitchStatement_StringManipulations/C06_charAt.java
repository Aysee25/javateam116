package day07_SwitchStatement_StringManipulations;

public class C06_charAt {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";

        System.out.println(str.charAt(5)); // g

        System.out.println(str.charAt(29)); // r

        // System.out.println(str.charAt(35)); // StringIndexOutOfBoundsException
       // System.out.println(str.charAt(30)); // StringIndexOutOfBoundsException

        // str'da toplam kac karakter var?

        System.out.println(str.length()); // 55

        // son harfi yazdirin

        int uzunluk=str.length();
        System.out.println(str.charAt(uzunluk-1));

        // son harften bir onceki harfi yazdırın

        System.out.println(str.charAt(uzunluk-2));

        // sondan ucuncu harf

        System.out.println(str.charAt(str.length()-3));








    }
}
