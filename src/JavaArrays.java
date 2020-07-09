public class JavaArrays {

    public static void main(String[] args){

        int[] numbers = {100, 2, -9, 'a'}; // 'a' -> 97

        System.out.println(numbers[3]);

        // Different forms of declaring arrays
        int[] numAnimals;
        int [] munAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        int[] ids, types;
        int ids2[], types2;

        arrayObjects();

        String names[]; // names point to null
        String names2[] = new String[2];

        // int names_l = names.length; names is null
        int names2_l = names2.length;

        // System.out.println("names: " + names_l);
        System.out.println("names2 lenght: " + names2_l);

        castingOnArrays();
        arrayLoop();
    }

    protected static void arrayObjects(){
        System.out.println("------ arrayObjects");
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.toString());
        System.out.println(java.util.Arrays.toString(bugs));
    }

    protected static void castingOnArrays() {
        System.out.println("------ castingOnArrays");
        String[] strings = {"StringValue"};
        Object[] objects = strings;
        String[] otherStrings = (String[]) objects;
        // objects[0] is a String type so cant point to a StringBuilder Type
        objects = new Object[10]; //objects points to Object so then it run without exception
        objects[0] = new java.lang.StringBuilder(); //Code Throws Exception
    }

    protected static void arrayLoop(){
        System.out.println("------ arrayLoop");
        int[] numbers = new int[10];
        for(int i=0; i< numbers.length; i++)
            numbers[i] = i+5;
    }

    protected static void arraySort(){

    }
}
