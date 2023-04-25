package day16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S4 {
    public static void main(String[] args) {
        List<String > isimlistesi = new ArrayList<>();

        String istenmeyen = "e";
        isimlistesi .add("mete");
        isimlistesi .add("ayse");
        isimlistesi .add("melih");

        String [] arrhali = isimlistesi.toArray(new String[0]);

        String strhali = Arrays.toString(arrhali);

        String [] parcala = strhali.split(istenmeyen);


        System.out.println(Arrays.toString(parcala));
    }
}
