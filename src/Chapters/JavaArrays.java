package Chapters;

import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {

        int[] numbers = {100, 2, -9, 'a'}; // 'a' -> 97

        System.out.println(numbers[3]);
        // Different forms of declaring arrays
        int[] numAnimals;
        int[] munAnimals2;
        int numAnimals3[];
        int numAnimals4[];

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
        arraySort();
        arraySearch();

        // Diferent Varargs
        // public static void main(String[] args)
        // public static void main(String args[])
        // public static void main(String... args) // varargs

        //MultiDimensional Arrays
        multidimensionalArray();
        differentSizeArray();
        arraysOfArrays();
        usingMultidimensionalArra();
        usingMultidimensionalArra2();
        usingStirngArray();
    }

    protected static void arrayObjects() {
        System.out.println("------ arrayObjects()");
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.toString());
        System.out.println(java.util.Arrays.toString(bugs));
    }

    protected static void castingOnArrays() {
        System.out.println("------ castingOnArrays()");
        String[] strings = {"StringValue"};
        Object[] objects = strings;
        String[] otherStrings = (String[]) objects;
        // objects[0] is a String type so cant point to a StringBuilder Type
        objects = new Object[10]; //objects points to Object so then it run without exception
        objects[0] = new java.lang.StringBuilder(); //Code Throws Exception
    }

    protected static void arrayLoop() {
        System.out.println("------ arrayLoop()");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
    }

    protected static void arraySort() {
        System.out.println("------ arraySort()");
        int numbers[] = {10, 56, 0, -656};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.printf(numbers[i] + ", ");

        //
    }

    protected static void arraySearch() {
        System.out.println("------ arraySearch()");
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

        // Cases for the Binary Search

        // 1. Target element found and the Array is Sorted
        int[] sortedArray = {1, 5, 20, 100};
        System.out.println("Element found, for a Sorted Array: " + Arrays.binarySearch(sortedArray, 20));

        // 2. Target element is not found on a Sorted Array
        // In case for a search for 2, -1 because it returns -(index 0)-1 to preserve the te sorted array
        //                          4  -2 becuase it returns -(index 1)-1
        //                          14 -4 because it returns -(index 3)-1
        //                          32 -5 because it returns -(index 4)-1
        int[] sortedArray2 = {3, 9, 13, 30};
        System.out.println("Element not found, for a sorted Array: " + Arrays.binarySearch(sortedArray2, 14));

        // 3. Unsorted Array, the result is unpredictible
        int[] unsortedArray = {-200, 4, 1, 0, 936};

        System.out.println("Unsorted Array, the result is unpredcitible " + Arrays.binarySearch(unsortedArray, 3));
    }

    protected static void multidimensionalArray() {
        System.out.println("------ multidimensionalArray()");
        int[][] vars1;            // 2D array
        int vars2[][];           // 2D array
        int[] vars3[];            // 2D array
        int[] vars4[], space[][]; // 2D and 3D array

        String[][] rectangle = new String[3][2];

        rectangle[0][0] = "x.0-y.0";
        rectangle[0][1] = "x.0-y.1";

        // rectangle[0][2] = "x.0-y.2"; -- ArrayIndexOutOfBoundsException

        rectangle[1][0] = "x.1-y.0";
        rectangle[1][1] = "x.1-y.0";

        rectangle[2][0] = "x.2-y.1";
        rectangle[2][1] = "x.2-y.1";
    }

    protected static void differentSizeArray() {
        System.out.println("------ differentSizeArray()");
        int[][] differentSizeAr = {{1, 4}, {3}, {9, 8, 7}};

        System.out.println("Asymetric Array: " + Arrays.toString(differentSizeAr[0]) +
                " " + Arrays.toString(differentSizeAr[1]) + " " + Arrays.toString(differentSizeAr[2]));
        System.out.println("Asymetric Array inner loop: " + differentSizeAr[0][1]);
    }

    protected static void arraysOfArrays() {
        System.out.println("------ arraysOfArrays");
        int[][] args = new int[4][];
        args[0] = new int[5];
        args[1] = new int[3];
    }


    protected static void usingMultidimensionalArra() {
        System.out.println("------ usingMultidimensionalArra()");

        int[][] twoD = new int[3][2];

        System.out.println("------ using loops to go through array");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.println(twoD[i][j] + " ");
        }
        System.out.println("------ using the enhance for loop");

    }

    protected static void usingMultidimensionalArra2() {
        System.out.println("------ usingMultidimensionalArra2()");

        int[][] twoD = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.println("num: " + num);
        }
    }

    protected static void usingStirngArray() {
        System.out.println("------ usingStirngArray()");
        String[][][] threeDString = {{{"AA", "First1"}, {"BB", "Second1"}, {"AA", "Third1"}, {"BB", "Forth1"}},
                {{"AA", "First2"}, {"BB", "Second2"}, {"AA", "Third2"}, {"BB", "Forth2"}}, {
                {"AA", "First3"}, {"BB", "Second3"}, {"AA", "Third3"}, {"BB", "Forth2"}}};

        for (String[][] firstD : threeDString) {
            for (String[] SecondD : firstD) {
                for (String thirdD : SecondD)
                    System.out.println("num: " + thirdD);
            }
        }
    }
}