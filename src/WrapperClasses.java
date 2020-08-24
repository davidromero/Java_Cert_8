import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args){

        // Each primitive has a Wrapper Class to put on ie List<>
        Boolean wBoolean = new Boolean(false);
        boolean pBoolean = wBoolean.booleanValue();

        Byte wByte = new Byte((byte) 10);
        byte pByte = wByte.byteValue();

        Short wShort = new Short((short) 10);
        short pShort = wShort.shortValue();

        Integer wInteger = new Integer(10);
        int pInteger = wInteger.intValue();

        Long wLong = new Long(10);
        long pLong = wLong.longValue();

        Float wFloat = new Float(1.0);
        float pFloat = wFloat.floatValue();

        Double wDouble = new Double(1.0);
        double pDouble = wDouble.doubleValue();

        Character wCharacter = new Character('Z');
        char pCharacter = wCharacter.charValue();


        // Integer.parseInt() to primitive
        // Integer.valueOf() to wrapper
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        // int bad1 = Integer.parseInt("a");

        stringToPrimitiveOrWrapper();

        autoboxing();

    }

    protected static void stringToPrimitiveOrWrapper(){
        // String to primitive or Wrapper
        // Boolean
        boolean primBoolean = Boolean.parseBoolean("true");
        Boolean wraBoolean = Boolean.valueOf("true");
        // Byte
        byte primByte = Byte.parseByte("1");
        Byte wraByte = Byte.valueOf("2");
        // Short
        short primShort = Short.parseShort("1");
        Short wraShort = Short.valueOf("2");
        // Integer
        int primInt = Integer.parseInt("1");
        Integer wraInt = Integer.valueOf("2");
        // Long
        long primLong = Long.parseLong("1");
        Long wraLong = Long.valueOf("2");
        // Float
        float primFloat = Float.parseFloat("1.1");
        Float wraFloat = Float.valueOf("2.2");
        // Double
        double primDouble = Double.parseDouble("1.1");
        Double wraDouble = Double.valueOf("2.2");
    }

    protected static void autoboxing(){
        System.out.println("---- autoboxing() ----");
        // Autoboxing
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // AutoBox the primitive
        weights.add(new Double(60.5));
        weights.remove(50.5); // AutoBox the primitive
        double first = weights.get(0); // unboxing the Wrapper

        System.out.println(weights.toString());

        // Cant unbox a Null
        List<Integer> heights = new ArrayList<>();
        heights.add(null); // boxing an null ?
        // int h = heights.get(0);qqqq
        System.out.println(heights.toString());

        // AutoBoxing Integers
        List<Integer> numbers  = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(new Integer(1));
        //numbers.remove(1);
        System.out.println(numbers);
    }
}
