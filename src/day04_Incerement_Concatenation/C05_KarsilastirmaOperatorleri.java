package day04_Incerement_Concatenation;

import java.security.KeyStore;

public class C05_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        /*
        Karsılastırma operatorlerı
        2 variable'i karsılastırıp
        istenen sart saglanıyorsa TRUE
        sart saglanmıyorsa FALSE degerı veren operatorlerdır

         */

        // a b'ye esit mi

        System.out.println(a == b); // false
        System.out.println(2*a == b); // true

        System.out.println(a == b/2); // true

        // a ile b'nin esit olmadıgını kontrol edın

        System.out.println(a != b); // true

        System.out.println(a != b/2 ); // false

        // a b'den kucuk mu

        System.out.println(a < b ); // true

        System.out.println(a<b/2); // false

        // a b'den kucuk degıl sartını kontrol edelım

        System.out.println(!(a<b)); //

        // a b'de kucuk veya esıt mı

        System.out.println(a <= b );
        System.out.println(2*a <= b);

        // a b'den buyuk mu

        System.out.println(a>b); // false
        System.out.println(5*a>2*b); // true

        boolean c = 2 * a >= b ;// true

        // a nın 3 katının b den buyuk olmadıgı sartını kontrol edın

        System.out.println(   !(a*3 >b)  ); // false






















    }

}
