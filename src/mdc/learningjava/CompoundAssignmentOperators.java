package mdc.learningjava;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        x = x * z; // simple assignment
        x += z; // same as x = x + z;
        x -= z; // same as x = x - z;
        x /= z; // same as x = x / z;
        x %= z; // same as x = x % z;

        System.out.println();
        System.out.println();
        System.out.println("x = " + x);

        // without any explicit cast
        // shorts are promoted to ints. promoted (ex short to int... changing smaller to bigger)
        // vs casting changing bigger to smaller

        long a = 10;
        int b = 4;
        // b = b * a; this does not compile
        b = (int)(a * b); // this compiles
        b *= a;
        System.out.println();
        System.out.println("b = " + b);

        long c = 4;
        long d = ( c = 2); // shorter form of c * 2; long d = c

        System.out.println("c = " + c + ", d = " +d);

        long e = 3;
        long f = 2;
        long g = 1;

        long i = e + 3 * (f = 3) - (g -= 2);
        // f = 3
        // e + 3 * 3 - (-1) => g -= 2  => also sets g = -1
        // e + 3 * 3 + 1
        // 3 + 3 * 3 + 1
        // 13

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        // System.out.println("h = " + h);
    }
}
