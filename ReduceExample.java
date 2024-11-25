
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args){
        List <Integer> rs=Arrays.asList(23,89,67,34,20);
        int sum = rs.stream().reduce(0,(a,b)->a+b);
        System.err.println(sum);


        String[] array = { "Geeks", "for", "Geeks" };

        // Using reduce to concatenate strings with a hyphen
        Optional<String> combinedString = Arrays.stream(array)
            .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        combinedString.ifPresent(System.out::println);
        
    }
}
