import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 30, 56, 79, 45);
        List<Integer> evenNumber = new ArrayList<Integer>();

        evenNumber = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}