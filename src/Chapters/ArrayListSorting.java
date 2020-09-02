import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args){
        arrayListSorting();
    }

    protected static void arrayListSorting(){
        System.out.println("---- arrayListSorting()");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(0);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
