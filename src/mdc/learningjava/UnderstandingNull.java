package mdc.learningjava;

public class UnderstandingNull {

    static Object myObject = new Object();
    static Object myOtherObject;
    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject = " + myObject);
        System.out.println("myOtherObject = " + myOtherObject);

        System.out.println("myLocalObject = " + myLocalObject);
       // System.out.println("anotherLocalObject = " + anotherLocalObject); // This does not compile because the variable
       // my LocalObject is not initialized

        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName);

        myString = "Java";

        System.out.println("myString = " + myString);
        String newString = myString.toLowerCase();
        String upperString = myString.toUpperCase();

        int len = upperString.length();

        myString.toLowerCase(); // this does not return anything because Strings are immutable in Java
        // the result of this os ignored - myString.toLowerCase().
        System.out.println("myString = " + myString); // this returns 4
        System.out.println("myString " + upperString); // this returns java
        System.out.println("The length of " + upperString + " is " + len); // this returns The length of JAVA is 4

    }
}
