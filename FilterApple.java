import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: jianyang
 * @date: 2019/8/13
 */
public class FilterApple {


    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String []args) {
        Apple apple = new Apple();
        apple.setColor("green");
        apple.setWeight(1);
        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple);
        apple = new Apple();
        apple.setWeight(151);
        apple.setColor("red");
        inventory.add(apple);
        apple = new Apple();
        apple.setWeight(55);
        apple.setColor("green");
        inventory.add(apple);
        apple = new Apple();
        apple.setWeight(10);
        apple.setColor("green");
        inventory.add(apple);
        List<Apple> greenApples = null;

        //传递方法
        //greenApples = filterApples(inventory, Apple::isGreenApple);

        //lambda表达式
        //greenApples = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));

        //使用匿名内排序，compareTo是Integer的方法
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        //lambda

        inventory.sort((Apple a,Apple b) -> a.getWeight().compareTo(b.getWeight()));

        JInterFaceFunction a =(String s) -> {
            return s.length();
        };
        System.out.println(a.process("1515151565"));
    }
}
