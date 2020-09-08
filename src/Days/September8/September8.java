package Days.September8;
import java.util.regex.Pattern;

public class September8 {

    //state machine
    // 0. initial state
    // 1. openParenthesis
    // 2. innerNumber
    // 3. closeParenthesis
    // 4. space
    // 5. firstNumber
    // 6. "-"
    // 7. lastNumber

    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(098) 123-4567"));
        System.out.println(validPhoneNumberOneLiner("(098) 123-4567"));

    }

    private static boolean validPhoneNumberOneLiner(String phoneNumber){
        return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
    }

    private static boolean validPhoneNumber(String phoneNumber) {
        //state machine
        // 0. initial state
        // 1. numbers or ')'
        // 2. space
        // 3. numbers or '-'
        // 4. number (acceptance)
        int state = 0;
        int index = 0;

        while (index < phoneNumber.length())
            switch (state) {
                case 0:
                    if (phoneNumber.charAt(index) == '(') {
                        state += 1;
                        index += 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (phoneNumber.charAt(index) >= 48 && phoneNumber.charAt(index) <= 57) {
                        index += 1;
                    } else if (phoneNumber.charAt(index) == ')') {
                        state += 1;
                        index += 1;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (phoneNumber.charAt(index) == ' ') {
                        state += 1;
                        index += 1;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (phoneNumber.charAt(index) >= 48 && phoneNumber.charAt(index) <= 57) {
                        index += 1;
                    } else if (phoneNumber.charAt(index) == '-') {
                        state += 1;
                        index += 1;
                    } else {
                        return false;
                    }
                    break;
                case 4:
                    if (phoneNumber.charAt(index) >= 48 && phoneNumber.charAt(index) <= 57) {
                        index += 1;
                    }
                    else{
                        return false;
                    }
                    break;
            }
        return (state == 4);
    }
}
