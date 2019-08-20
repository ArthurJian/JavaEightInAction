package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author: jianyang
 * @date: 2019/8/19
 */
public class StreamOfSelect {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,2,5,6,4);

        //filter by using Predicate
        //........


        //remove duplicate numbers
//        numbers.stream().filter(i -> i%2==0)
//                .distinct()
//                .forEach(System.out::println);

        //limit the stream
//        List<Integer> limitNumber = numbers.stream().filter(a -> !a.equals(2))
//                .limit(3)
//                .collect(toList());
//        for(int i: limitNumber){
//            System.out.println(i);
//        }
         //skipe the number
//        numbers.stream().filter(a -> !a.equals(2))
//                .limit(3)
//                .skip(1) //remove the number from the limit stream
//                .forEach(System.out::println);



    }
}
