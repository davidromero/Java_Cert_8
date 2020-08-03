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
        remove_ArrayList();
        set_ArrayList();
        isEmpty_ArrayList();
        size_ArrayList();
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

    protected static void remove_ArrayList() {
        // boolean remove(Object object)
        // E remove (int index)
        System.out.println("------ remove_ArrayList()");
        List<String> birds = new ArrayList<String>();

        birds.add("Hawk");
        birds.add("Hawk");
        birds.add("Robin");
        birds.add("Bat");
        birds.add("BlueBird");

        System.out.println(birds.remove("Bat"));
        System.out.println(birds.remove("Quetzal"));
        System.out.println(birds);
        System.out.println(birds.remove(2));
        //System.out.println(birds.remove(100)); IndexOutofBoundsException
        System.out.println(birds);
    }

    protected static void set_ArrayList() {
        // E set(int index, E newElement)
        System.out.println("------ set_ArrayList()");

        List<String> podcast = new ArrayList<String>();
        podcast.add("Joe Rogan");
        podcast.add("David Choe");
        podcast.add("El Libro Rojo");
        podcast.add("The Church of Whats Happening");

        System.out.println(podcast.size());
        System.out.println(podcast.set(0, "The Joe Rogan Experience"));
        System.out.println(podcast);
        System.out.println(podcast.set(3, "Joey Diaz"));
        System.out.println(podcast);
        //System.out.println(podcast.set(5, "AWS podcast")); IndexOutOfBoundException;
    }

    private static void isEmpty_ArrayList() {
        //boolean isEmpty()
        System.out.println("------ isEmpty_ArrayList()");
        List<Integer> naturalNumbers = new ArrayList<Integer>();
        List<Integer> ultimatePrime = new ArrayList<Integer>();

        naturalNumbers.add(10);
        naturalNumbers.add(100);
        naturalNumbers.add(new Integer("100"));

        System.out.println(naturalNumbers);
        System.out.println(naturalNumbers.isEmpty());
        System.out.println(ultimatePrime.isEmpty());
    }

    private static void size_ArrayList() {
        //int size()
        System.out.println("------ size_ArrayList()");

        List<Boolean> historyOrderStatus =  new ArrayList<Boolean>();

        System.out.println(historyOrderStatus.size());
        historyOrderStatus.add(true);
        historyOrderStatus.add(Boolean.FALSE);
        historyOrderStatus.add(Boolean.TRUE);
        System.out.println(historyOrderStatus.size());
    }


}
