package day08_StringManipulation;

public class C11_replaceAll {
    public static void main(String[] args) {

        // str icindeki butun sayıları method ile temizleyin
        String str= "J23a3345v4353a234C354345a3456n345dir+     ";
        System.out.println(str);


        str=str.trim();
        System.out.println(str.trim());

        str=str.replaceAll("\\w","");
        System.out.println(str);

        str=str.replaceAll("\\d", "");
        System.out.println(str);




    }
}
