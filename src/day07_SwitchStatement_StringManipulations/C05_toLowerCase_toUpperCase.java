package day07_SwitchStatement_StringManipulations;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str); // java Candir

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str'i buyuk harfle yazilmis haline donusturun

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // Java Candir

        // str'i turkce karakterleri dikkate alarak kucuk harfe cevirin

        str =str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // Java Candır

        String str2="Kimse beni aramiyor.";
        System.out.println(str2.toUpperCase()); // KİMSE BENİ ARAMİYOR.








    }
}
