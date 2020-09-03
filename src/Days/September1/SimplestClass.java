package Days.September1;

public class SimplestClass{

  { System.out.println("Hello from a code block"); }

  public static void main(String[] args){
    SimplestClass simple = new SimplestClass();
    System.out.println("Hello from main method");
  }


  static { 
    System.out.println("Hello from static code block");  
  }
}
