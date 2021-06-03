package mdc.learningjava;

// Integer => int
// Double => double
// Float => float


// import java.util.Scanner;

public class WrapperTypes {
    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = 10;
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt( "3");
        Integer myInteger5 = null;
        Integer myInteger6 = null;
        Integer myInteger7 = null;
        Integer myInteger8 = null;

        // int myInt2 = null: this will not compile.

        // int num = Integer.parseInt("3"); this is correct but commented out.
        // System.out.println(num); this is correct but commented out.

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger);
        System.out.println("myInteger3 = " + myInteger);
        System.out.println("myInteger4 = " + myInteger);
        System.out.println("myInteger5 = " + myInteger);

        System.out.println("****** Three different ways , still same result ***** ");
        System.out.println("myInteger6 = " + myInteger6);
        System.out.println("myInteger7 = " + myInteger7);
        System.out.println("myInteger8 = " + myInteger8);

//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your age? >> ");
//        int age = input.nextInt();
//        if (age < 30) System.out.println("Wow, so young");
//        else System.out.println("Still young");
//        // System.out.println(num);

        // Converting wrapper to a primitive = unboxing
        int int3 = myInteger3;  //unboxing
        int int4 = myInteger5; // will throw a null pointer exception, integers can not contain null.

        // boxing = converting a primitive to a wrapper.
        Integer myInteger9 = new Integer(10);
        Integer myInteger10 = myInt;

        int num1 = 1;
        int num2 = 5;
        printSum(1, 5); // autoboxing
        printSum(myInteger, myInteger2);
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }
}
