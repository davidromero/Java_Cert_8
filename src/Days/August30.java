package Days;

import java.io.IOException;
import java.util.Arrays;

public class August30 {

    // exceptionOnNullStringHandler()
    static Integer i;

    public static void main(String[] args){
        // ---------> Reminder
        // public  from anywhere
        // protected from the same package, subclass and class
        // default from class and package
        // private just from the same class
        arrayComparison();
        anonymousArrays();
        //sortStringArray();
        // throwingWeirdException();
        exceptionOnNullStringHandler(new String []{"10"});


    }

    protected static void arrayComparison(){
        System.out.println("---------- Array Comparison");
        int a[] = {1,2,053,4}; // a[2] is an octal, represents 43 in decimals and b[2][1] = 43
        int b[][] = {{1,2,4}, {2,2,1}, {0,43,2}};
        System.out.println(a[3] == b[0][2]);
        System.out.println("" + (a[2] == b[2][1]));
    }

    protected static void anonymousArrays(){
        System.out.println("---------- Declaring Anonymous Arrays");
        int ints [][] = new int[3][];
        ints[1] = new int[]{1,2,3};
        ints[2] = new int[]{4,5};
        System.out.println(ints[1][1]);
    }

    protected static void sortStringArray(){
        System.out.println("---------- Sorting and Accessing Arrays of Strings");
        String[][] strings = {{"A","Z"}, {"C", "D", "S"}, {"L"}};
        Arrays.sort(strings); // sort has few overloaded methods, the no method that takes String[][]
                              // sort uses Comparable, and tries to cast strings elements to Comparable
        for(String[] str: strings){
            for(String s: str){
                System.out.println(s);
            }
        }
    }

    // Checked Exceptions most be handle, add throws java.io.IOException, ClassNotFoundException
    protected static void throwingWeirdException() throws java.io.IOException, ClassNotFoundException{
        System.out.println("---------- Throwing Exception diferent from the one declare on throws");
        new August30().doIt();
        new August30().didIt();
    }

    static void doIt()throws java.io.IOException{
        throw new java.io.IOException();
    }

    static void didIt()throws ClassNotFoundException{
        throw new SecurityException();
    }

    protected static void exceptionOnNullStringHandler(String args[]){
        System.out.println("---------- Multiple exceptions on catch() finally blocks");
        String s;
        try{
            s = i.toString();
        }finally {
            try{
                int i = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException E){
                System.out.println("NumberFormat");
            }finally{
                System.out.println("Fin2");
            }

            System.out.println("Fin1");
        }
    }
}
