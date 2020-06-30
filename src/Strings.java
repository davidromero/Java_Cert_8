import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class Strings {

    public static void main(String[] args){

        System.out.println(1 + 2);         // 3

        System.out.println("a" + "b");     // ab

        System.out.println("a" + "b" + 3); // ab3

        System.out.println(1 + 2 + "c");   // 3c

        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s);


        //Strings are inmutable

        // Once a String object is created, is not allowed to change

        // Strings are everywhere and can use up to 25-40 of a production aplication

        // String Pool or Intern Pool

        System.out.println("---- String Methods ----");

        String name  = "Flufyy"; // Uses the String Pool

        String nameNoPool = new String("Fluffy"); //It tell the JVM to not to use the Pool

        String myString = "Viendo el Horizonte donde el Sol se Esconde";

        String string = "animals";

        //
        // Important String Methods
        //

        // length()
        System.out.println("---- length()");

        System.out.println(string.length());

        System.out.println("".length() +"Length of an empty String");

        // charAt()
        System.out.println("---- charAt()");

        System.out.println(".charAt()" + string.charAt(0)); // a indexes start at 0

        System.out.println(".charAt()" + string.charAt(6)); // s

        // System.out.println(".charAt()" + string.charAt(7)); //throws exception

        try {
            System.out.println(".charAt()" + string.charAt(7));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // indexOf()
        System.out.println("---- indexOf()");

        // int indexOf(char ch)
        // int indexOf(char ch, int fromIndex)
        // int indexOf(String str)
        // int indexOf(String str, int fromIndex)

        String stringI = "animalsan";

        System.out.println(stringI.indexOf('a'));
        System.out.println(stringI.indexOf('a',2));
        System.out.println(stringI.indexOf("ni"));
        System.out.println(stringI.indexOf("an", 2)); // 7

        String stringOne = "d";

        System.out.println(stringOne.indexOf("ad",2)); // return -1 when no match

        System.out.println("---- substring()");
        // substring()

        // int subtring(int beginIndex)
        // int subtring(int beginIndex, int endIndex)

        String stringS = "The Martinez Brothers";

        System.out.println(stringS.substring(4));
        System.out.println(stringS.substring(4, 4)); //empty string
        System.out.println(stringS.substring(stringS.indexOf("ez")));
        System.out.println(stringS.substring(4,9)); // from index 4 (include-char0 until index 8 (dont include-char)
        System.out.println(stringS.substring(8,20));

        // System.out.println(stringS.substring(8,40)); String index out of range, to large index
        // System.out.println(stringS.substring(20,8)); String index out of range, negative index

        System.out.println("---- toUpperCase()");
        System.out.println("---- toLowerCase()");
        // toLowerCase()
        // toUpperCase()

        // String toLowerCase(String str)
        // String toUpperCase(String str)

        String stringL = " Delta Club Mix";
        String stringL2 = " Delta Club Mix_&*12";

        System.out.println(stringL.toLowerCase());
        System.out.println(stringL.toUpperCase());
        System.out.println(stringL2.toLowerCase());
        System.out.println(stringL2.toLowerCase());

        System.out.println("---- equals()");
        System.out.println("---- equalsIgnoreCase()");


    }
}
