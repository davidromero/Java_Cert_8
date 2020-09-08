package Days.September7;

public class September7 {

    public static void main(String[] args) {
        System.out.println(rotateToLeft(revRot("733049910872815764", 5)));
        System.out.println(rotateToLeft(revRot("45655568789", 4)));
        System.out.println(rotateToLeft(revRot("", 4)));
        System.out.println(rotateToLeft(revRot("44568", 0)));
    }

    public static String revRot(String strng, int sz) {
        // your code
        if (sz <= 0 | strng.isEmpty() | sz > strng.length()) {
            return "";
        }
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i + sz <= strng.length(); i += sz) {
            if (checkSumOfCubesOfDigits(strng.substring(i, i + sz))) {
                strBuilder.append(reverseString(strng.substring(i, i + sz)));
            } else {
                strBuilder.append(rotateToLeft(strng.substring(i, i + sz)));
            }
        }
        return strBuilder.toString();
    }

    public static String rotateToLeft(String str) {
        return (str.length() > 1) ? str.substring(1, str.length()) + str.charAt(0) : str;
    }

    public static boolean checkSumOfCubesOfDigits(String str) {
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            total += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
        }
        return (total % 2 == 0);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
