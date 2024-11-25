
import java.util.Arrays;
import java.util.List;

public class StringExampleInStream {
    public static void main(String[] args) {
        List <String> Lt=Arrays.asList("rani","riya","tina","sima");
        Lt.stream().map(String::toUpperCase).forEach(System.out::println);

        Lt.stream().map(String::toCharArray).forEach(System.out::println);
 
        Lt.stream().map(String::toLowerCase).forEach(System.out::println);

        Lt.stream().map(String::length).forEach(System.out::println);

        Lt.stream().map(String::toUpperCase).skip(2).forEach(System.out::println);

    }
}
