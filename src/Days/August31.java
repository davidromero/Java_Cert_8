import java.util.Arrays;

public class August31 {

    //static int x = 4;

    public static void main(String[] args){
        //for(int x =5; x < 10;x++)
            //x++;
        //System.out.println(x--);
        sneakyfor();
        // arraysDeclaration();
        multipleDimensionsArrayLenght();
        //finalVariableSwitch();
    }

    protected static void sneakyfor(){
        //for(int x = 3; x>-1;x--); // for loop is ended, using ;
        //    System.out.println(x);
    }

    protected static void arraysDeclaration(){
        int array[][] = new int[2][];

        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;

        array[1][0] = 0;
        array[1][1] = 10;
        array[1][2] = 20;

        System.out.println(array[1][1]);

    }

    protected static void multipleDimensionsArrayLenght(){
        System.out.println("---------- multipleDimensionsArrayLenght");
        int array[][] = new int[10][];

        array[0] = new int[3];
        array[1] = new int[2];

        System.out.println(array.length);
    }

    protected static void sortMultiDimensionArray(){
        //Arrays.sort(); sort() takes single dimension array
    }

    protected static void finalVariableSwitch(){
        System.out.println("---------- finalVariableSwitch");
        final int x;
        x = 10;

        final int y = 2;
        switch(x){
            //case x: {System.out.println("1");} // not final at compile time
            case 1: System.out.println("B");
            default:
                System.out.println("default");break;
            case y: System.out.println("C");
        }
    }
}
