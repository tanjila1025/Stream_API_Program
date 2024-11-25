
import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List <Integer>rs=Arrays.asList(34,89,45,79,45,78,90);
        rs.stream().sorted().forEach(System.out::println);
        
    }
}
