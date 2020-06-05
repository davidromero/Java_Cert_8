public class JavaStatments_If_Ternary {

    public static void main(String[] args){

        // Control Flow Statments
        // block of code
        // {} <- Group of zero or more Statments

        // If Statments Evaluates to a Boolean Expression

        // if-then Statment

        int hourOfDay = 9;

        int morningMeetingCount = 0;

        if(hourOfDay > 5)
            System.out.println("Code Execution when condition is true");
            System.out.println("This code is executed not depending on the If Statment"); // Only the First line after the if is executed

        // Statment with Code Block {}
        if(hourOfDay < 11) {
            System.out.println("Good Morning Dude");
            morningMeetingCount++;
        }

        // Redundant If Staments
        if(hourOfDay > 11){
            System.out.println("Good Morning");
        }
        if(hourOfDay <= 11){
            System.out.println("Good Afternoon");
        }

        // Redoing without redundancy
        if(hourOfDay < 11){
            System.out.println("Good Morning");
        } else{
            System.out.println("Good Afternoon");
        }

        // else-if Staments
        if(hourOfDay < 11){
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else{
            System.out.println("Good Evening");
        }

        System.out.println("Ternary Operator");

        // Extense way of conditions
        int y = 10;
        final int x;
        if(y > 5){
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        // Using the Ternary Operator
        // () Parentheses are not required
        int y2 =10;
        int x2= (y2 > 5) ? (2 * y2) : (3 * y2);


        System.out.println((y > 50) ? 21 : "Zebra");

        // Ternary Expression Evaluation

        int y3 = 1;
        int z3 =1;

        // Only y3 gets incremented because the expression evaluate to True
        final int x3 = y3<10 ? y3++ : z3++;
        System.out.println("y3 = " + y3 + ", z3 = " + z3);

        y3 = 1;
        z3 =1;

        // Only z3 gets incremented beause the expression evaluate to False
        final int x4 = y3>=10 ? y3++ : z3++;
        System.out.println("y3 = " + y3 + ", z3 = " + z3);


    }

}
