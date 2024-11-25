
import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List <Integer>resultList=Arrays.asList(34,90,5,23,67,89);

        long rs =resultList.stream().count();
        //System.err.println(resultList);
        System.err.println(resultList.size());
        System.err.println(rs);
        

    }
}
