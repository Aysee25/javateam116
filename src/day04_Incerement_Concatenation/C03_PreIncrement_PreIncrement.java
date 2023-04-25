package day04_Incerement_Concatenation;

public class C03_PreIncrement_PreIncrement {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a++);

        System.out.println(a);

        System.out.println(++a);

        System.out.println(a);


        int b = a++;

        System.out.println("a : " + a + ",b : " + b);

        a = --b;

        System.out.println("a : " + a + ",b : " + b);

        int c = a++  +  ++b;

        System.out.println("a : " + a + ",b : " + b +",c : " + c);

        int x = 20;
        System.out.println(--x);

        System.out.println(x++);

        System.out.println(++x); // 21

        int y= ++x;

        System.out.println("x : " + x + ",y : " + y); // x:22 y:22

        x= --y;

        System.out.println("x : " + x + ",y : " + y); // y:21 X:21

        y= x++;

        System.out.println("x : " + x + ",y : " + y); // y:21 x:22

        System.out.println(x++ + ++y); // 22 + 22:44





















    }
}
