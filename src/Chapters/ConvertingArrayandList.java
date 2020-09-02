import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  ConvertingArrayandList {

    public static void main(String[] args){
        convertArrayListToArray();
        convertArrayToArrayList();
    }

    protected static void convertArrayListToArray(){
        List<String> list =new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
    }

    protected static void convertArrayToArrayList(){
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        for (String b : array) System.out.println(b + " ");
        // list.remove(1); the array is fixed size we cant remove from the list
    }
}
