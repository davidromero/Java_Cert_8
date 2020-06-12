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

        String name  = "Flufyy"; // Uses the String Pool

        String nameNoPool = new String("Fluffy"); //It tell the JVM to not to use the Pool

    }
}
