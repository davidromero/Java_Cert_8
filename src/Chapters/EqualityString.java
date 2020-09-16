package Chapters;

import java.util.Objects;

public class EqualityString {

    public static void main(String[] args) {

        System.out.println("Equality");

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a"); // .append returns the modified reference of one SB

        System.out.println(one == two); // false two different objects
        System.out.println(one == three); // the same object

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // strings are inmutable, literals get pooled, JVM only creates one literal

        String x2 = "En el amor soy un";
        String z2 = " En el amor soy un".trim(); // a new String is created
        System.out.println(x2 == z2);

        // equals()
        String x3 = "Hello World";
        String z3 = " Hello World".trim();
        System.out.println(x3.equals(z3)); // true

        //Implementing equals
        System.out.println("------ Implementing equals()");
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t3));
    }

    public static class Tiger {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) // the same object
                return true;
            if (o == null) // check null
                return false;
            if (getClass() != o.getClass()) // different class, type check and cast
                return false;
            Tiger tiger = (Tiger) o;
            return Objects.equals(name, tiger.name); //check all fields
        }
    }
}
