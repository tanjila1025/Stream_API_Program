
import java.util.Arrays;
import java.util.List;

public class MaxExample {
    public static void main(String[] args) {
        List <Integer>number=Arrays.asList(67,90,80,45,67,34);
        Integer rs=number.stream().max(Integer::compare).get();
        System.err.println(rs);

        List <Integer>num=Arrays.asList(34,78,9,89,13,67,25);
        Integer ds=num.stream().min(Integer::compare).get();
        System.err.println(ds);
    
    }
}
