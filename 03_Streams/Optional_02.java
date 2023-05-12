import java.util.Optional;

// O código a seguir imprime o valor em um opcional se ele contiver um valor não nulo:
public class Optional_02 {
    public static void main(String[] args) {
    Optional<String> str = Optional.of("java2s.com");

    if (str.isPresent()) {
      String value = str.get();
      System.out.println("Optional contains " + value);
    } else {
      System.out.println("Optional is  empty.");
    }
  }

}
