public class Autoboxing {

    public static void main(String[] args){

        // Integer.parseInt returns an int
        Integer first = Integer.parseInt("5");
        // Integer.valueOf returns an Integer
        Integer second = Integer.valueOf("5");

        Object myObj = Integer.valueOf("5");

        System.out.println(myObj instanceof Integer ? "Integer" : "Not Integer");
    }

}
