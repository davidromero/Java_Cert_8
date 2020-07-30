public class Temporal {

    // First to exec
    public String first = "instace";

    // Thrid to exec
    public Temporal() {
        first = "constructor";
    }

    // Second to exec
    { first = "block"; }

    public void print() {
        System.out.println(first);
    }

    public static void main(String[] args) {
        new Temporal().print();
    }
}
