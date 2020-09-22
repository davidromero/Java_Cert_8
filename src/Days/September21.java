package Days;

public class September21 {

    public static void main(String[] args){

        Integer i1 = Integer.decode("10");
        Integer i2 = new Integer("20");
        Integer i3 = Integer.valueOf("30");

        System.out.println(i1 + i2 + i3);

        // short s = 10;
        // s += 10;
        // s++;
        // s = s+1;

        boolean myBoolean  = true;

        double [] dbls;
        dbls = new double[]{1.0, 2.1, 3.5};

        StringBuilder sb = new StringBuilder("DAvid");

        sb.append(" Romero");
        sb.setLength(2);
        System.out.println(sb);

        StringBuilder s = new StringBuilder("Java");

        s.insert(0, "The latest").append("version is").append( " 1.7").delete(27,28).append("8").substring(4);

        System.out.println(s);

        int ints[][] = {{1,2}, {3,5}, {6,7}};

        int arr[] = {1,2,3};

        System.out.println(arr[0]);

        short ss = 9;

        double d = 10;

        String str = ss==d ? "s=d":(ss==10)?"s=10":"nothing";
        System.out.println(str);

        System.out.println("Negative Modulus");
        int y = -10;
        int x = -3;

        System.out.println(y%x);

        System.out.println("Integer.SIZE and Integer.BYTES");
        Integer xx = 8;
        System.out.println(xx.SIZE + xx.BYTES);

        Boolean myBoolean2 = Boolean.valueOf(true);

        // DateFormatter
        // ChronoField.DAY_OF_MONTH.
    }
}
