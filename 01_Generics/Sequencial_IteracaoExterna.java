
import java.util.List;
import java.util.Arrays;


public class Sequencial_IteracaoExterna {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum = numbers.parallelStream()
        .filter(n -> n % 2  == 1)
        .map(n  -> n * n)
        .reduce(0, Integer::sum);

    System.out.println(sum);
  }

}
