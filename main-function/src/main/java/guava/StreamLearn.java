package guava;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * guava JAVA stream 学习
 */
public class StreamLearn {
    public static void main(String[] args) {
//        testFlatMap();
//        testReduce();
        testReduce();
    }

    public static void testFlatMap() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Lists.newArrayList(1,2,3));
        lists.add(Lists.newArrayList(2,3,4));
        lists.stream().flatMap(List::stream).forEach(System.out::println);
    }

    public static void testOptional() {
        String str = "";
        String optional = Optional.of(str).orElseGet(() -> "尼玛");
        System.out.println(optional);
    }

    public static void testReduce() {
        Stream<String> stream = Stream.of("AA");
        String s = stream.reduce((a, b) -> a + b).orElse(null);
        System.out.println(s);
        Stream<List<Integer>> listStream = Stream.of(Lists.newArrayList(1,2,3), Lists.newArrayList(1,2,3));
        Long reduce = listStream.flatMap(Collection::stream).reduce(0L, Long::sum, (a, b) -> null);
        System.out.println(reduce);
    }

}
