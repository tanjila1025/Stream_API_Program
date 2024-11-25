
import java.util.Arrays;
import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List <Integer> num=Arrays.asList(20,78,35,67,90,23,56,68);
        num.stream().filter(s->s%2==0).skip(3).forEach(System.out::println);
    }
}
