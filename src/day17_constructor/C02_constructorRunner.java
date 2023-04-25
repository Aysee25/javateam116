package day17_constructor;

public class C02_constructorRunner {
    public static void main(String[] args) {
        // Bu class'dan C01 class'indaki
        // variable ve method'lara ulasmak istiyorum
        // Baska class'daki static class uyelerine
        // ulasmak icin
        System.out.println(C01_constructors.isHappy);
        C01_constructors.staticMethod();
        // static olmayan class uyelerine ulasmak icin
        // o class'dan obje olusturmamiz lazim
        C01_constructors obje = new C01_constructors();
        // bastaki C01_Constructors ==> class adi ve objenin data turudur
        // obje ==> objenin adi
        // new ==> yeni obje olusturmak icin keyword
        /* C01_Constructors() ==> Constructor
           Bir objenin olusturulmasi ve ilk deger atamasinin (initialize)
           yapilmasi icin mutlaka constructor calismalidir
           Java bir class olustruldugunda
           o class'dan obje olusturulabilmesi icin
           her class'a otomatik olarak
           default bir constructor yerlestirir
           bu default constructor'lar gorunmez
         */
        System.out.println(obje.str);
        obje.sayi=20;
        obje.staticOlmayanMethod();
    }
}
