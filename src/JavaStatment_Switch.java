public class JavaStatment_Switch {

    public static void main(String[] args){

        // Switch Statment Supports
        // Primitive Numeric (char - Character, short - Short, byte - Byte, int - Integer)
        // Wrapper Classes
        // ENUM Values
        // String

        // (Long and Boolean and their wrapper Classes area not supported)

        // Compile Time Constants
        // Literals, ENUMS, constants or final contant variables

        int dayOfWeek = 0;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
            case 99:
                System.out.println("Fuck it im also executed");
                break;  // It executed all the proceeding case until it finds a break statment
        }

        char testingSwitch = 'A';
//      char testingSwitch = 'X';

        switch (testingSwitch){

            case 'A':
                System.out.println("Pasa A");
            case 'B':
                System.out.println("Pasa B");
            case 'C':
                System.out.println("Pasa C");
                break;
            default:
                System.out.println("Pasa Default");
                break;

        }


    }
}
