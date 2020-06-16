import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaStatment_For {
    public static void main(String[] args){

        for(int i=0; i < 10; i++){

            System.out.print(i + "");
        }

        // Infinity For Loop
        //for(;;){
        //    System.out.println("Hello World");
        //}

        int x =0;

        // Can have multiple initializations and update Statments
        for(long y = 0, z= 4; x < 5 && y < 10; x++, y++){
            System.out.println(y + " ");
        }
        System.out.println("x " + x);

        // DOES NOT COMPILE because x2 is already declared
        // int x2 = 0;
        // for (long y2 = 0, x2 = 4; x < 5 && y < 10; x++, y++){
        //     System.out.println(x +" ");
        // }

        int x2 = 0;
        long y2 = 10;

        for (y2 = 0, x2 = 4; x2 < 5 && y2 < 10; x2++, y2++){
            System.out.println(x2 +" ");
        }

        // Variables on the initialization block MUST be the same
        // for(long y3 = 0, int x3 = 4; x3 < 5 && y3 <10; x3++, y3++) {
        //     System.out.print(x3 + " ");
        // }

        // for-each Statment
        // for(datatype instance: collection) {
        //      // use instance
        // }

        // The collection must be an array or an object that implements java.lang.Iterable;
        // On each iteration of the loop the named variable is assigned

        System.out.println("for-each Statment");
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Seth");
        myArrayList.add("Troxler");

        List<String> myArray = Arrays.asList("Jamie", "Jones");

        for (String name: myArray) {
            System.out.println(name + " ");
        }

        for (String name : myArrayList){
            System.out.println(name + " ");
        }

        System.out.println("for in String Array");
        final String[] names = new String[3];

        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for(String name: names){
            System.out.print(name + ", ");
        }

        java.util.List<Integer> values = new java.util.ArrayList<Integer>();
        values.add(0);
        values.add(1);
        values.add(2);
        for(Integer value: values){
            System.out.println(value + ", ");
        }

        Iterator myIterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}