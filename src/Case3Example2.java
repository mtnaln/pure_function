import java.util.Arrays;
import java.util.List;

public class Case3Example2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);
        multipleOfTwo(numbers);
        System.out.println();
        System.out.println(numbers);
    }

    public static void multipleOfTwo(List<Integer> numbers) {
        numbers.stream().map(number -> number * 2).forEach(number -> System.out.print(number + " "));
    }
}
