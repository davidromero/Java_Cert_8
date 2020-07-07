public class CompoundAssigment {

    public static void main(String[] args) {

        int x = 2, z = 3;

        x = x * z; // Simple Assigment Operator

        x *= z; // Compond Assiment Operator

        x += z;

        x -= z;

        x /= z;

        long x2 = 10;

        int y2 = 5;

        // y2 = y2 * x2;

        y2 *= x;

        long x3 = 5;

        long y3 = (x3 = 3);

        System.out.println(" x= " + x3 + " y= " + y3);


    }
}
