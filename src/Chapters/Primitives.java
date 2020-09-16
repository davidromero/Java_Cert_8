package Chapters;

public class Primitives {

    public static boolean myBoolean;
    public static char myChar;
    public static byte myByte;
    public static short myShort;
    public static int myInt;
    public static long myLong;
    public static double myDouble;
    public static float myFloat;

    public static float myFloat1 = 0.1f;
    public static float myFloat2 = 0.7f;
    public static float myFloat3 = myFloat1 + myFloat2;

    public static void main(String[] args) {
        System.out.println("Es el float " + myFloat3);

        System.out.println(0.7 + 0.1);

        // Default value of Primitives
        System.out.println("------- Default Value of Primitives");
        System.out.println("Default value of boolean is: " + myBoolean); // false
        System.out.println("Default value of char is: " + myChar);       // ' '
        System.out.println("Default value of byte is: " + myByte);       // 0
        System.out.println("Default value of short is: " + myShort);     // 0
        System.out.println("Default value of int is: " + myInt);         // 0
        System.out.println("Default value of long is: " + myLong);       // 0
        System.out.println("Default value of double is: " + myDouble);   // 0.0
        System.out.println("Default value of float is: " + myFloat);     // 0.0
    }


}
