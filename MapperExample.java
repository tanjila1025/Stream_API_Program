
import java.util.Arrays;
import java.util.List;

public class MapperExample {
    public static void main(String[] args) {
        List <Integer>num=Arrays.asList(20,67,45,34,26,78);
        num.stream().map(x->x%2==0).forEach(System.out::println);
        num.stream().map(s->s*2).forEach(System.out::println);
        
    }
}
