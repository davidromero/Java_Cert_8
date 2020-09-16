package Chapters;

import java.io.File;
import java.util.Random;
import java.io.FileReader;

public class RelationalOperator {

    public static void main(String[] args) {

        String myString = new String("A");

        int x = 10, y = 20, z = 10;

        System.out.println(x < y);

        System.out.println(x <= y);

        System.out.println(x > z);

        System.out.println(x >= z);

        // instaceof Operator, determines when a instance is from a determined "Type"

        System.out.println("Operador instaceof " + (myString instanceof Object));


        //Logical Opeartors

        boolean b1 = true;

        boolean b2 = false;

        boolean bAnd = b1 & b2;

        boolean bOr = b1 | b2;

        boolean bXor = b1 ^ b2;

        int myInt1 = 0b0000;

        int myInt2 = 0b0001;

        // bitwise operation XOR, true when different
        int myInt3 = myInt1 ^ myInt2;

        // bitwise operation AND, true when both true
        int myInt4 = myInt1 & myInt2;

        // bitwise operator OR, true when one is true
        int myInt5 = myInt1 | myInt2;

        System.out.println("myInt3 = " + myInt3);

        //Short-Circuit Operators, depending on the operator the right hand may never be evaluated
        // in this case (y < 4) isnt evaluated because with one true the operation is true
        boolean myX = true || (y < 4);

        TestShortCircuit();

    }

    //The main use of the Short-Cirtuit opeartor is for checking null objects before performing any operation
    public static void TestShortCircuit() {
        Random myRandom = new Random();

        int upperBond = 10;
        int rand = myRandom.nextInt(upperBond);

        Integer myInt = null;
        if (rand > 4) {
            myInt = myRandom.nextInt(upperBond);
        }

        //If we dont use Short-Circuit to check the absence of null, may throw a NullPointerException :)

        // Without the &&
        // if(myInt != null & myInt < 8) ... It throws the NullPointerException Too
        // Hence Short-Circuit is needed
        if (myInt != null && myInt < 8) {
            System.out.println("Si evalua derecha rand = " + rand + " myInt = " + myInt);
        } else {
            System.out.println("No evalua derecha rand = " + rand + " myInt = " + myInt);
        }

        int x3 = 6;


        //In this case the boolean expression return a value
        //The expression uses Short-Circuit and doesnt evaluate the right
        boolean y3 = (x3 >= 6) || (x3++ <= 7);

        System.out.println("Resultado de x: " + x3);

        // Entity Operator, you can only compare
        // Two numeric primitive types
        // Two boolean values
        // Two objects, including null and Stirng


        if (5 == 5.00) {

            System.out.println("The int is promoted to Double in order to compare");
        }

        boolean y4 = false;
        //the assigment return the value of the assigemnt itself
        boolean x4 = (y4 = true);

        System.out.println("El valor de x en asignacion es: " + x4);

        //Not clear why output false...
        boolean z4 = (y4 == true);

        System.out.println("El valor de y en comparacion es: " + z4);

        //Comparing Objects


        File yFile = new File("/home/david/java_proyects/HelloWorld/src/myFile.txt");

        File xFile = new File("/home/david/java_proyects/HelloWorld/src/myFile.txt");

        //Try-Catch needed
        try {
            FileReader myFileReader = new FileReader(xFile);

            System.out.println("Esta es la lectura del archivo de texto");

            char[] mycharArray = new char[50];

            //It reads char by char
            myFileReader.read(mycharArray);
            myFileReader.read(mycharArray);
            myFileReader.read(mycharArray);

            System.out.println("Esto es lo que tiene el archivo" + mycharArray[0] + " " + mycharArray[1] + " " + mycharArray[2]);
        }
        //You can Catch any Expeption with "Expeption" due to
        catch (Exception e) {

            System.out.println(e.getMessage());
        }

        File zFile = xFile;

        System.out.println("The two references have the same Object constructor " + (xFile == yFile));

        System.out.println("The two references in this case do point to the same objetc" + (xFile == zFile));
    }
}
