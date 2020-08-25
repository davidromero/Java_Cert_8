import java.util.ArrayList;
import java.util.List;

public class  ConvertingArrayandList {

    public static void main(String[] args){

        convertArrayListToArray();
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
}
