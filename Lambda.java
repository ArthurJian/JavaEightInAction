import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author: jianyang
 * @date: 2019/8/15
 */
public class Lambda {

    public static String processFile(BufferedReaderProcessor p) throws IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }
    public static void main(String[] args) throws IOException{
        /*Runnable r1 = () -> System.out.println("Hello World!");
        r1.run();*/

        //processFile((BufferedReader b) -> b.readLine());

        BiFunction<Integer,String,Apple > c1= (weight,color) -> new Apple(weight,color);
        Apple a = c1.apply(11,"green");
        System.out.println(a.toString());

        Predicate<Apple> notRedApple = a1 -> a.getWeight()> 150;
        Predicate<Apple> edApple = notRedApple.negate();
    }
}
