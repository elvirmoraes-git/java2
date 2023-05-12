import java.util.OptionalInt;
import java.util.stream.IntStream;


/*
 * Algumas operações de fluxo retornam opcional. 
 * Por exemplo, o método max() em todas as classes de fluxo retorna um objeto opcional. 
 * Ao usar o método max() em um fluxo vazio, o valor de retorno é um objeto opcional sem nada dentro.
 * Usando a classe Optional, podemos manipular o valor de retorno desses métodos normalmente.
 */
public class Optional_05_Metodo_max {
    public static void main(String[] args) {

    OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
    if (maxOdd.isPresent()) {
      int value = maxOdd.getAsInt();
      System.out.println("Maximum odd  integer is " + value);
    } else {
      System.out.println("Stream is  empty.");
    }
  }

}
