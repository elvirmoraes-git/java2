import java.util.Optional;

public class Opcional_Optional {
    public static void main(String[] args) {
    
        Optional<String> vazio  = Optional.empty();
        System.out.println(vazio);

        Optional<String> str = Optional.of("java2s.com");
        System.out.println(str);

        String nullableString = ""; 
        Optional<String> str2  = Optional.of(nullableString);
        System.out.println(str2);
  }

}
