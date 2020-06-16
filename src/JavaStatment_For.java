import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
    }
}