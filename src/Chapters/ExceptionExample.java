package Chapters;

public class ExceptionExample {

    public static void main(String[] args){
        

        try{
            fall();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void fall() throws Exception{
        throw new Exception("Ow! I fell.");
    }
}
