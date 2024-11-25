
import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List <Integer> list=Arrays.asList(67,45,90,34,23,45,78);
        list.stream().limit(3).forEach(System.out::println);
        System.err.println("***************************************");
        //skip method
        List <Integer> lit=Arrays.asList(12,45,67,89,24,56,78);
        lit.stream().skip(3).forEach(System.out::println);

    }
}
