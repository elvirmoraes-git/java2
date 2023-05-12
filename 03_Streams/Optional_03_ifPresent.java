import java.util.Optional;

// O código acima gera o seguinte resultado.
// Se o opcional estivesse vazio, o código não imprimiria nada.

public class Optional_03_ifPresent {
    public static void main(String[] args) {
    Optional<String> str = Optional.of("java2s.com");

    str.ifPresent(value -> System.out.println("Optional contains " + value));
  }

}
