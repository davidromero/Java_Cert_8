package Days.September2;


public class September2 {


    public static void main(String[] args){

        MyDay day = new MyDay();
        System.out.println(day.name);
        String myState = "David";
        alternateSate(myState);
        alternateMyDay(day);
        System.out.println(myState);
        System.out.println(day.name);
    }

    protected static void alternateSate(String state){
        state = "Romero";
    }

    protected static void alternateMyDay(MyDay day){
        day.name = "Friday";
    }
}

class MyDay{
    String name;
}
