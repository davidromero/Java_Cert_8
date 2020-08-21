public class WrapperClasses {

    public static void main(String[] args){

        // Each primitive has a Wrapper Class to put on ie List<>

        Boolean wBoolean = new Boolean(false);

        boolean pBoolean = wBoolean.booleanValue();

        Byte wByte = new Byte((byte) 10);

        byte pByte = wByte.byteValue();

        Short wShort = new Short((short) 10);
        Integer wInteger = new Integer(10);
        Long wLong = new Long(10);
        Float wFloat = new Float(1.0);
        Double wDouble = new Double(1.0);
        Character wCharacter = new Character('Z');

        // Integer.parseInt() to primitive
        // Integer.valueOf() to wrapper
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        // int bad1 = Integer.parseInt("a");

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

        // Autoboxing



    }
}
