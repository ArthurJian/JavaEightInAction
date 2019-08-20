package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author: jianyang
 * @date: 2019/8/19
 */
public class StreamOfMap {
    public static void main(String[] args) {
        //For the Map, it accepts the method to be param, and return a new stream, not to modify the origin stream
//        List<String> words = Arrays.asList("Java","In","Action");
//        words.stream().map(String::length)
//                .forEach(System.out::println);

        //sometimes, we can use the Map at many times, like below:
//        List<String> words = Arrays.asList("Java","In","Action");
//        words.stream().map(String::length)
//                .map(i -> i+2)
//                .forEach(System.out::println);

        //  Flattening of Flow (flatMap)
//        List<String> words = new ArrayList<>();
//        words.add("Hello");
//        words.add("World");
//        // if we do not new a list, then to foreach, it will still be "Hello" "World"
//        List<String> uniqueCharacters = words.stream().map(word -> word.split("") )
//                .flatMap(Arrays::stream) //make multi stream to single stream
//                .distinct()
//                .collect(Collectors.toList());
//        for (String s: uniqueCharacters){
//            System.out.println(s);
//        }
    }
}
