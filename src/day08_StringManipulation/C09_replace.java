package day08_StringManipulation;

public class C09_replace {
    public static void main(String[] args) {

        String str= "Javasiz olmaz";

        System.out.println(str.replace('J', 'H')); // Havasiz olmaz
        System.out.println(str.replace("a", "")); // Jvsiz olmz
        System.out.println(str.replace("Javasiz", "x")); // x olmaz
        System.out.println(str.replace("v", "yayayayaya")); // Jayayayayayaasiz olmaz
        System.out.println(str.replace("va", "lalala")); // Jalalalasiz olmaz

        System.out.println(str); // Javasiz olmaz ==== atama yapılmadıgı ıcın degısıklıkler gecerlı degıl

        /*
        atama yapılmadıgı surece yapılan degisiklikler sadece o satır icin gecerlidir.
        atama yapılana kadar kalıcı olmaz
         */

        // str=str.replace("va","lalala"); //atama yapıldıgı ıcın str degıstı
        // System.out.println(str);  // Jalalalasiz olmaz

        // str ıcındekı boslukları yok edin

        String str1= "Java ile jayat cok daha guzel";
        System.out.println(str1.replace("", ""));



    }
}
