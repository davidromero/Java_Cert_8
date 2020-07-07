import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class Strings {

    public static void main(String[] args) {

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

        String name = "Flufyy"; // Uses the String Pool

        String nameNoPool = new String("Fluffy"); //It tell the JVM to not to use the Pool

        String myString = "Viendo el Horizonte donde el Sol se Esconde";

        String string = "animals";

        //
        // Important String Methods
        //

        // length()
        System.out.println("---- length()");

        System.out.println(string.length());

        System.out.println("".length() + "Length of an empty String");

        // charAt()
        System.out.println("---- charAt()");

        System.out.println(".charAt()" + string.charAt(0)); // a indexes start at 0

        System.out.println(".charAt()" + string.charAt(6)); // s

        // System.out.println(".charAt()" + string.charAt(7)); //throws exception

        try {
            System.out.println(".charAt()" + string.charAt(7));
        } catch (StringIndexOutOfBoundsException e) {
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
        System.out.println(stringI.indexOf('a', 2));
        System.out.println(stringI.indexOf("ni"));
        System.out.println(stringI.indexOf("an", 2)); // 7

        String stringOne = "d";

        System.out.println(stringOne.indexOf("ad", 2)); // return -1 when no match

        // substring()
        System.out.println("---- substring()");

        // int subtring(int beginIndex)
        // int subtring(int beginIndex, int endIndex)

        String stringS = "The Martinez Brothers";

        System.out.println(stringS.substring(4));
        System.out.println(stringS.substring(4, 4)); //empty string
        System.out.println(stringS.substring(stringS.indexOf("ez")));
        System.out.println(stringS.substring(4, 9)); // from index 4 (include-char0 until index 8 (dont include-char8)
        System.out.println(stringS.substring(8, 20));

        // System.out.println(stringS.substring(8,40)); String index out of range, to large index
        // System.out.println(stringS.substring(20,8)); String index out of range, negative index

        // toLowerCase()
        // toUpperCase()
        System.out.println("---- toUpperCase()");
        System.out.println("---- toLowerCase()");


        // String toLowerCase(String str)
        // String toUpperCase(String str)

        String stringL = " Delta Club Mix";
        String stringL2 = " Delta Club Mix_&*12";

        System.out.println(stringL.toLowerCase());
        System.out.println(stringL.toUpperCase());
        System.out.println(stringL2.toLowerCase());
        System.out.println(stringL2.toLowerCase());

        // equals()
        // equalsIgnoreCase()
        System.out.println("---- equals()");
        System.out.println("---- equalsIgnoreCase()");

        // boolean equals(String str)
        // boolean equalsIgnoreCase(String str)

        System.out.println("abc".equals("abc"));
        System.out.println("ABC".equals("abc"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        // startsWith()
        // endsWith()
        System.out.println("---- startsWith()");
        System.out.println("---- endsWith()");

        // boolean startsWith(String prefix)
        // boolean endsWith(String suffix)

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        // contains()
        System.out.println("---- contains()");

        // boolean contains(String str)

        System.out.println("Los de la Nazza".contains("z"));
        System.out.println("Double Chain Compression".contains("d"));

        // replace()
        System.out.println("Guardalo para la proxima vez".replace('a', 'e'));
        System.out.println("Walk around like cars beyond arguments".replace("ar", "ca"));

        // trim()                                // include \t \n \r and ' '
        System.out.println("---- trim()");
        // String trim()

        // Method Chaining
        System.out.println("---- Method Chaining");

        System.out.println("abc".trim());
        System.out.println("\t a b c\n".trim());

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        InefficientStringChaining();
        EfficientStringBuilder();
        MutabilityChainingStringB();
        TestingMutabilityStringB();
        constructingStringBuilder();
        stringBuilderMethods1();

        // append() StringBuilder
        // Stringbuilder append(String str)

        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);
    }

    protected static void InefficientStringChaining() {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;      // String are inmutable, so a new intances of the String object is created and
        System.out.println(alpha); // the old one is eligible for the GC
        System.out.println(Runtime.getRuntime().freeMemory());
    }

    protected static void EfficientStringBuilder() {
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);
        System.out.println(Runtime.getRuntime().freeMemory());
    }

    // StringBuilder is not Mutable, StringBuilder changes its own state and returns a reference to the object

    protected static void MutabilityChainingStringB() {
        System.out.println("---- MutabilityChainingStringB()");
        StringBuilder sb = new StringBuilder("start"); // sb StringBuilder Object
        sb.append("+middle"); // Alter state of the object
        StringBuilder same = sb.append("+end"); // create second Object (same), sb.append() alters the state
        // return a reference to it
        System.out.println("this is sb: " + sb.toString());
        System.out.println("this is same: " + same.toString());
    }

    protected static void TestingMutabilityStringB() {
        System.out.println("---- TestingMutabilityStringB()");
        StringBuilder firstStringB = new StringBuilder("1,");
        firstStringB.append("2,");

        StringBuilder secondStringB = firstStringB.append("n."); // its the same object
        System.out.println("This is the first StringB " + firstStringB.toString() + "hashcode: " + firstStringB.hashCode());
        System.out.println("This is the secondStringB " + secondStringB.toString() + "hashcode: " + secondStringB.hashCode());

        if (firstStringB.equals(secondStringB))
            System.out.println("Objetos StirngBuilder son Iguales");
    }

    protected static void MutabilityonStringB() {
        System.out.println("---- MutabilityonStringBu()");
        StringBuilder a = new StringBuilder("abc");    // Only one StringBuilder Constructor is being called
        StringBuilder b = a.append("de"); // Other reference to the same object

        b = b.append("f").append("g");
        System.out.println("a= " + a.toString());
        System.out.println("b= " + b.toString());
    }

    protected static void constructingStringBuilder() {
        System.out.println("---- constructingStringBuilder()");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("colab");
        StringBuilder sb3 = new StringBuilder(10);

        // Difference between length and capacity of a string builder, length actual chars and
        // capacity is defined and auto-increased
        sb3.append("coll");
        System.out.println("sb3 size; " + sb3.length() + " ,sb3 capacity: " + sb3.capacity());
        sb3.append("aboration");
        System.out.println("sb3 size; " + sb3.length() + " ,sb3 capacity: " + sb3.capacity());
    }

    protected static void stringBuilderMethods1() {
        System.out.println("---- stringBuilderMethods1()");
        StringBuilder strB1 = new StringBuilder("Shadow World Trance");

        String sub = strB1.substring(strB1.indexOf("Wo"), strB1.indexOf("Tr")); //substring
        int len = strB1.length();
        char ch = strB1.charAt(4);
        System.out.println("substring(): " + sub + " " + len + " " + ch);
        System.out.println("StirngBuilder: " + strB1);
    }


}