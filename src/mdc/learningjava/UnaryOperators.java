package mdc.learningjava;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = + 3;
        int x1 = 3;
        System.out.println("x= " + x + ", x1 + x1");

        double y = -x;
        System.out.println("x = " + x + ", y = " + y); // this returns x = 3, y = -3.0

        int myNumber = 12;
        double myOtherNumber = myNumber;

        System.out.println(myOtherNumber); // this returns 12.0

        y = -y;
        System.out.println("x = " + x + ", y = " + y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a = " + a + ", b = " + b);
        // value => the opposite of value => !true => false, and !false => true
        System.out.println(!false); // true
        System.out.println(!!false); // false
        System.out.println(!!!false); // true

        // int myInt = 15; this does not compile
        // boolean my Boolean = - true; this does not compile
        // boolean z = !0; this does not compile

        // increment and decrement - be careful, have higher precendnce order than  +. -, /, ...
        int myInt = 5;
        myInt = myInt +1;
        int otherInt = myInt;
        System.out.println(myInt);
        System.out.println(otherInt);

        int anotherInt = myInt++;
        System.out.println("myInt = " + myInt + ", otherInt = " + otherInt); // This returns myInt - 7, otherInt = 6

        int count = 0;
        System.out.println(count); // 0
        System.out.println((++count));// 1, count was 0 and becomes 1
        System.out.println(count); // 1
        System.out.println(count--); // 1 byt count becomes 0
        System.out.println(count); // 0

        // exam question
        int e = 3;
        int f = ++e * 5 / e-- + --e;

        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // h = 3 g = 6
        // 3 + --g * 3 + 2 * g++ - h-- % --g
        // h = 3, g = 5
        // 3 + 5 * 3 + 2 * g++ - h -- % --g
        // 3 + 5 * 3 + 2 * 5 - h-- % --g
        // h = 2 g = 6
        // 3 + 5 * 3 + 3 * 5 - 3 % 5
        // g = 5
        // 3 + 15 - 10 - 3
        // 28 - 5
        // i = 25



        System.out.println("g = " + g + ", h = " + h + ", i = " + 1);




    }

}
