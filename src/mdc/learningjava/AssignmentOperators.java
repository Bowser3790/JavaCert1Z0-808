package mdc.learningjava;

public class AssignmentOperators
{
    public static void main(String[] args) {
       // int x = 1.0; => this will not compile need float or double
       // short y = 19812345; this does not compile
       // int z = 9L; this does not compile
       // long t = 2.4; this does not compile
       // how do you solve this? Casting = converting
       // long l = 12344678543244;// this does not compile without an L at the end

        int x = (int)1.0; // casting to an int
        short y = (short)19812345; // casting to a short
        int z = (int)9L; // casting to an int
        long t = (long)2.4; // casting to a long
        long l = 12344567892344L;

        System.out.println();
        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
        System.out.println("l = " + l);


        // what numbers do bytes go to? -128 to 127 ( this is the most a byte can store
        // java overflow and underflow... if its out of range it will throw an error.)

        byte myByte = 127;
        byte myByte1 = 25;
        byte mySecondByte = -128;
        byte sum = (byte)(myByte + myByte1);

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);
        System.out.println(sum);

        short a = 10;
        short b = 20;
        short c = (short)(a * 20);
        System.out.println("c = " + c); // if there is an operation you have to cast the whole operation.



    }
}
