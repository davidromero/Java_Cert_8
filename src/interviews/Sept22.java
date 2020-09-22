package interviews;

public class Sept22 {

    public static void main(String[] args){
        System.out.println(addWithoutOperators(2, 3));
    }

    private static int addWithoutOperators(int a, int b){
        while(b != 0) {
            int carry = (a & b);
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
