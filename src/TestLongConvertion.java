import java.math.BigInteger;

public class TestLongConvertion {

    public static void main(String[] args){
        System.out.println(validateTransactionEvenNumber("5954639929616444404274"));
    }

    private static boolean validateTransactionEvenNumber(String transNumber){
        return  new BigInteger(transNumber).mod(new BigInteger("2")).intValue() == 0;
    }

}
