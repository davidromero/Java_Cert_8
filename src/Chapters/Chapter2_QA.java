public class Chapter2_QA {

    public static void main(String[] args) {

        promoting();
        promoting2();
        break_on_while();
        ternary_test();
        xor_operator();
        infinite_for();
        promoting_parenthensis();
        assigment_inside_if();
        pre_post_unary();
        do_while_statment();
        label_continue();
        weird_while();
        final_switch();
    }

    protected static void promoting() {
        byte x = 5;
        byte y = 10;

        // the value x + y is promoted to INT
        // Possible values are INT, LONG, DOUBLE
        long z = x + y;
    }

    protected static void promoting2() {

        long x = 10;
        int x2 = 10;

        //int y = 2 * x;
        int y = 2 * (int) x;
        int y2 = (int) (2 * x);

        System.out.println("y " + y);
        System.out.println("y2 " + y2);
    }

    protected static void break_on_while() {

        java.util.List<Integer> list = new java.util.ArrayList<Integer>();

        list.add(10);
        list.add(14);
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }

    protected static void ternary_test() {

        System.out.println("ternary_test");
        int x = 5;
        System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7);
    }

    protected static void xor_operator() {

        // XOR Truth Table
        // -----------------
        // A | B | A XOR B
        // 0 | 0 |    0
        // 0 | 1 |    1
        // 1 | 0 |    1
        // 1 | 1 |    0

        System.out.println("xor_operator");
        boolean x = true, z = true;
        int y = 20;

        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);
    }

    protected static void infinite_for() {

        for (int i = 0; i < 10; System.out.println(i++ + "yes")) {

            i = i++;
            System.out.println("Hello World");
        }
    }

    protected static void promoting_parenthensis() {

        System.out.println("promoting_parenthensis");
        byte a = 40, b = 50;
        //byte sum = (byte) a + b; // first a is promoted to byte, then the addition promotes both to int
        // the result returns a int type
        // Lesson, be carefull with () and promotion on operations
        byte sum = (byte) (a + b);
        System.out.println(sum);
    }

    protected static void assigment_inside_if() {

        System.out.println("assigment_inside_if");
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;

        // the assignment operation returns the value that is assign
        if (b = true) System.out.println("Sucess");
        else System.out.println("Failure");
    }

    protected static void pre_post_unary() {

        System.out.println("pre_post_unary");
        int c = 7;
        int result = 4;

        result += ++c;
        System.out.println("result pre " + result);

        c = 7;
        result = 4;

        result += c++;
        System.out.println("result post " + result);
    }

    protected static void do_while_statment() {

        System.out.println("do_while_statment");
        boolean keepGoing = true;
        int result = 15, i = 10;

        do {
            i--;
            if (i == 8) keepGoing = false;
            result -= 2;
        }
        while (keepGoing);
        System.out.println(result);
    }

    protected static void label_continue() {

        System.out.println("label_continue");
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++) {
            System.out.println("Outer, row: " + row);
            for (int col = 1; col <= 2; col++) {
                System.out.println("Insider, col: " + col);
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        }
        System.out.println(count);
    }

    protected static void weird_while() {

        System.out.println("weird_while");
        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);
    }

    protected static void final_switch() {

        System.out.println("final_switch");
        final char a = 'A', d = 'D'; // is final so can be use on the switch
        char grade = 'B';

        switch (grade) {
            case a:
            case 'B':
                System.out.print("great"); // do not have break so it evaluates the other statment
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }
}