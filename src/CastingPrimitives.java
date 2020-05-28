public class CastingPrimitives {

    public static void main(String[] args){
        int x = (int)1.0;

        short y = (short)1921222;

        int z = (int)9L;

        long t = 192301398193810323L;

        System.out.println("X es " + x + " Y es " + y + " Z es " + z + " t es " + t);

        System.out.print(2147483647+1);

        short x2 = 10;

        short y2 = 3;

        //Explicit Cast on the operation
        short z2 = (short)(x2 *y2); // EL resultado de una operacion entre shorts, estos son promovidos a int



    }
}
