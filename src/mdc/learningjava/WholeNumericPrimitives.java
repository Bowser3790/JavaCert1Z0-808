package mdc.learningjava;

// Primitives: boolean, byte, short, int, long, float, double, char
// Octal Number = 0 to 7 (starting from 0)

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 32_123_456_789l;
        long n = 2_3000;
        double x = 200;
        int oct = 07; // This returns 7
        int firstOct = 010; // This returns 8 decimal
        int secondOct = 021; // This returns 17 decimal
        int thirdOct = 032;

        int sumOct = firstOct + secondOct;
        System.out.println("first = " + firstOct + " second = " + secondOct);
        System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));
        System.out.println(thirdOct);

//        System.out.println(oct);
//        System.out.println(firstOct);
//        System.out.println(secondOct);
        // Hexadecimal; (0-9) (A-F)

        int firstHex = 0xF; //returns 15 decimal
        int secondHex = 0x1E;

        int sumHex = firstHex + secondHex;

        System.out.println("first = " + firstHex + " second = " + secondHex);
        System.out.println("decimal sum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));
    }

}
