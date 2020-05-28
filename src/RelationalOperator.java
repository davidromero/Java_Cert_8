import java.util.Random;

public class RelationalOperator {

    public static void main(String[] args){

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
        int myInt4 =  myInt1 & myInt2;

        // bitwise operator OR, true when one is true
        int myInt5 = myInt1 | myInt2;

        System.out.println("myInt3 = " + myInt3);

        //Short-Circuit Operators, depending on the operator the right hand may never be evaluated
        // in this case (y < 4) isnt evaluated because with one true the operation is true
        boolean myX = true || (y < 4);

        TestShortCircuit();

    }

    //The main use of the Short-Cirtuit opeartor is for checking null objects before performing any operation
    public static void TestShortCircuit(){
        Random myRandom = new Random();

        int upperBond = 10;
        int rand = myRandom.nextInt(upperBond);

        Integer myInt = null;
        if(rand > 4){
            myInt = myRandom.nextInt(upperBond);
        }

        //If we dont use Short-Circuit to check the absence of null, may throw a NullPointerException :)

        // Without the &&
        // if(myInt != null & myInt < 8) ... It throws the NullPointerException Too
        // Hence Short-Circuit is needed
        if(myInt != null && myInt < 8) {
            System.out.println("Si evaluea derecha rand = " + rand + " myInt = " + myInt);
        }
        else{
            System.out.println("No evalua derecha rand = " + rand + " myInt = " + myInt);
        }

    }
}
