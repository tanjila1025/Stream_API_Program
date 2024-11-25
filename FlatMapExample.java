
import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> result=Arrays.asList(
            Arrays.asList("riya","sima"),
            Arrays.asList("irfan","salaman","sharuk"),
            Arrays.asList("karina","katrina","shamita")
            
        );

        //normal streams of stream
        result.stream().flatMap(list->list.stream());
        System.err.println(result);
        // using flatmap
        result.stream().flatMap(list->list.stream()).forEach(System.out::println);
    }
}
