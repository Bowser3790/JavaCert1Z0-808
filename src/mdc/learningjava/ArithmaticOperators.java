package mdc.learningjava;

import java.util.Scanner;

public class ArithmaticOperators {

    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3;  // order: multiplication, division, addition, subtraction
        System.out.println("result = " + result);

        result = 4 / 2 +1 - 4 * 2 + 10;

        System.out.println("result = " + result);

        int a = 4;
        int b = 3 - 2 * --a; // decrement then use, a * a -1
        // 3 - 2 * 3
        // 3 - 6
        // b = -3, a = 3
        System.out.println("a = " + a + " b = " + b);

        a = 4;
        b = 3 - 2 * a--; // use and then increment a = a -1
        // 3 - 2 * 4
        // 3 - 8
        // b = -5, a = 3

        System.out.println("a = " + a + " b = " + b);

        long c = 2;
        long d = 4 + 3 * c++; // use and then increment, c = c + 1
        // 4 + 3 * 2
        // 4 + 6
        // d = 10, c = 3
        System.out.println("c = " + c + " d = " + d);
        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - 3 * 3 - 4/4
        // 10 - 9 - 1
        // 10 - 10
        // result = 0

        System.out.println("result = " + result);

        int i = 10;
        int j = 3;

        // 10 % 3 == 10 / 3 = 3, 3 * 3 == 9 => 10 - 9 = 1
        int k = i % j; // the remainder every odd # has remainder 1 and all even #'s have remainder 0.
        System.out.println("remainder of division between " + 1 + " and " + j + " is " + k);

        int e = 10 % 2;
        int l = 12 % 5;
        // int n = 13 % 2;
        System.out.println("e = " + e);
        System.out.println("l = " + l);
        //System.out.println("n = " + n);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >> ");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

        int f = 12;
        int g = 5;
        int h = 2;

        int n = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        System.out.println(" n = " + n);



    }

}
