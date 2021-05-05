package mdc.learningjava;

import static java.lang.Math.*;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        float myNumber = 25.4F;

        // double before = 10_.25; this does not compile
        // double after = 10._25; this does not compile
        // double first = _10.25; this does not compile
        // double last - 10.25_; this does not compile


        double myDouble = 2.54;
        // double myDouble = 2.54D; this does compile but the letter D is optional
        double myDouble2 =2.54F;
        double myDouble3 = 3; // this compiles

        System.out.println(myDouble3);

        double scientific = 5.00125E03; // this compiles
        double scientific2 = 5000125E3; // This compiles
        double scientific3 = 5000.125; // this compiles

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("scientific3 = " + scientific3);

        double hexPi = 0x1.91eb851eb851fp1; // indicates hexadecimal floating point decimal
        System.out.println("hexPi = " + hexPi);
        System.out.println(Math.PI);
    }

}
