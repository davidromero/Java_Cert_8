package book.java8inaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    static String[] arrayOfWords = {"Goodbye", "World"};
    static Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

    static List<String> test =  new ArrayList<>();


    public static void main(String[] args){

        Stream<String> myStream = test.stream();

        List<String> uniqueCharacters = streamOfWords
                                        .map(w -> w.split(""))
                                        .flatMap(Arrays::stream)
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(uniqueCharacters.toString());
    }
}
