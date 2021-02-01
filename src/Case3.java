import java.util.Arrays;
import java.util.List;

public class Case3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);
        multipleOfTwo(numbers);
        System.out.println(numbers);
    }

    public static void multipleOfTwo(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
    }
}
