package day06_nestedIfElseStatement_ternaryOperator;

public class C06_Ternary {
    public static void main(String[] args) {

        // verilen sayı pozıtıf ise degerini iki katına cıkarın
        // pozitif degilse ise degerini 10 arttırın

        int sayi= 10;

        sayi=sayi>0 ? 2*sayi : sayi+10 ;

        // Ternary bize sonuc verir, bu sonucu ya direk yazdırmalıyız veya veriable'a atamalıyız

        // sayi cift ise 2 katını yazdırın, tek ise "sayi tek" yazdırın
        sayi++;

        System.out.println((sayi%2)==0 ? 2*sayi : "tek sayi");

        /*
        eger sartın saglanması veya saglanmamsı durumunda calısacak kodlar
        farklı data turlerınde ıse
        o zmaan atama yapamyız cunku sonuc tek bır data turunden degıl
        bu durumda ternary sadece yazdırabılırız
         */


    }
}
