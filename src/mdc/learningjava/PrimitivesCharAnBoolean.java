package mdc.learningjava;

public class PrimitivesCharAnBoolean {

    public static void main(String[] args) {
        char ch = 'a';

        // char ch1 = 'ab' this does not compile.

        char ch1 = '1';
        char uniChar = '\u03A9';
        char romanNumber = '\u216c';
        char alpha = '\u0381';
        char anotherSymbol = '\u263A';
        char delta = '\u0394';
        char lambda = '\u039B';


        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);
        System.out.println("alpha = " + alpha);
        System.out.println("I am the " + alpha + " and the " + uniChar);
        System.out.println("AnotherSymbol = " + anotherSymbol);
        System.out.println("I like the airline " + delta);
        System.out.println("Let's go serverless and use " + lambda);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);


    }

}
