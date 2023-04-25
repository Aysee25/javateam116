package day08_StringManipulation;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {

        /*
        bir yazının (str), bir yazi parcacigi ile baslayip baslamadigini test ederek,
        true veya false cevabını verir(dondurur)
         */

        String str = "Java cok eglenceli";

        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.startsWith(str)); //true // her yazı kendisiyle baslar

        System.out.println(str.startsWith("")); //true // her seyin basında hicbir sey vardır

        /*
        endsWith
        istenilen
         */


        System.out.println(str.endsWith("a")); // false
        System.out.println(str.endsWith("eglenceli")); // true
        System.out.println(str.endsWith("celi")); // true
        System.out.println(str.endsWith("Java cok eglenceli")); // true

        System.out.println(str.length()); // 18

        System.out.println(str.substring(str.length() - 3)); // eli

        System.out.println(str.endsWith(str.substring(str.length() - 3))); // true




    }
}
