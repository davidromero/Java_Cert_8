package Chapters;

public class JavaStatment_While {

    public static void main(String[] args) {

        //eatCheese(5);
        infinity();
    }

    public static void eatCheese(int biteOfCheese) {

        int roomInBelly = 5;

        while (biteOfCheese > 0 && roomInBelly > 0) {
            biteOfCheese--;
            roomInBelly--;
        }
        System.out.println(biteOfCheese + " pieces of cheese left");
    }

    public static void infinity() {

        while (true) {
            System.out.println(Runtime.getRuntime().freeMemory());
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
