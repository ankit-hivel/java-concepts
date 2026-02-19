import java.util.ArrayList;
import java.util.List;

public class IteratingLists {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        list.stream().map(num -> num * 2).forEach(num -> System.out.println(num));
    }
}
