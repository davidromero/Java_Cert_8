public class InstanceInit {

    // Second to exec
    { System.out.println("Instance Initializer"); }

    public InstanceInit(){
        // Forth to exec
        System.out.println("Constructor");
    }

    // First to exec
    static {System.out.println("Static Instance Initializer");}

    // Third to exec
    { System.out.println("Second Instance Initializer"); }

    public static void main(String... args){
        Temporal myTemporal = new Temporal();
    }
}
