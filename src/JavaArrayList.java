import java.util.ArrayList;
import java.util.List;


public class JavaArrayList {

    public static void main(String[] args) {

        //List<E>
        List<String> firstArray = new ArrayList<String>();
        ArrayList<String> secondArray = new ArrayList<String>();

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        // Ommit the type on the left side, <> diamond operator
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        List<String> list6 = new ArrayList<>();

        //ArrayList Methods

        //add
        add_ArrayList();
    }

    protected static void add_ArrayList() {
        // boolean add(E element)
        // void add(int index, E element)
        System.out.println("------ add_ArrayList()");
        ArrayList objectList = new ArrayList();
        objectList.add("Burial");
        objectList.add(new Integer(10));
        objectList.add(Boolean.FALSE);
        System.out.println(objectList);

        ArrayList<String> safer = new ArrayList<>();
        safer.add("Untrue");
        //safer.add(10); Not Stirng Type

        List<String> birds = new ArrayList<>();

        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        birds.add(4, "not a bird");
        System.out.println(birds);
    }
}
