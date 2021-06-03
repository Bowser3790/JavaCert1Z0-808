package mdc.learningjava;

import java.util.function.LongBinaryOperator;

public class DefaultInitilization {

    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;
    // string is not a primitive it is a class... It starts with a capital letter which is a charecteristic of a class.
    // static String myString; this is not a primitive.


    public static void main(String[] args) {
        int localInt = 5;

        System.out.println("LocalInt = " + localInt);
        System.out.println("myBoolean = " + myBoolean); //Default values is false
        System.out.println("myLong = " + myLong); // default value is 0
        System.out.println("myChar = " + myChar); // default value is 0
        System.out.println("myFloat = " + myFloat); // default value is 0.0
        System.out.println("myDouble = " + myDouble); // default value is 0.0
        System.out.println("myInt = " + myInt); // default value is 0
        System.out.println("myShort = " + myShort);// default value is 0
        System.out.println("myByte = " + myByte); // default value is 0


    }





}
