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

        System.out.println(string.length());

        System.out.println(".charAt()" + string.charAt(0)); // a indexes start at 0

        System.out.println(".charAt()" + string.charAt(6)); // s


        // System.out.println(".charAt()" + string.charAt(7)); //throws exception

        try {
            System.out.println(".charAt()" + string.charAt(7));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }




    }
}
