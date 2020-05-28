
public class HelloWorld {
    public static void main(String[] args){

        //Increment, Decrement Operators
        // ++x, operator is applied and the value of return is the new value
        // x++, original value of expression is returned and operator is applied after

        int x=3;
        int y= ++x * 5 / x-- + --x;

        // Evaluar la operacion de izquierda a derecha

        // int y= 4 * 5 / x-- + --x; // valor de x = 4
        // int y= 4 * 5 / 4 + --x // valor de x = 3
        // int y= 4 * 5 / 4 + 2 // valor de x = 2
        // int y= 20 / 6
        //int  y= 7

        System.out.println("Valor de x es " + x);
        System.out.println("Valor de y es " + y);
    }

}
