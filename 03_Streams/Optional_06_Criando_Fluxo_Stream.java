import java.util.function.BooleanSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Optional_06_Criando_Fluxo_Stream{
    public static void main(String[] args) {
        // O código a seguir cria um fluxo que contém um único valor.
        Stream<String> stream  = Stream.of("java2s.com");
        stream.forEach(System.out::println);

        System.out.println();
        // O código a seguir cria um fluxo com quatro cadeias de caracteres.
        Stream<String> stream2  = Stream.of("XML", "Java",  "CSS", "SQL");
        stream2.forEach(System.out::println);

        System.out.println();
        // O código a seguir cria um fluxo a partir de uma matriz de objetos.
        String[] names = { "XML", "Java", "SQL", "CSS" };
        Stream<String> stream3 = Stream.of(names);
        stream3.forEach(System.out::println);

        System.out.println();
        // 
        Stream<String> stream4  = Stream.<String>builder()
        .add("XML")
        .add("Java")
        .add("CSS")
        .add("SQL")
        .build();
        stream4.forEach(System.out::println);

        System.out.println();
        IntStream oneToFive  = IntStream.range(1, 6);
        //IntStream oneToFive  = IntStream.rangeClosed(1, 5);
        oneToFive.forEach(System.out::println);

        // Podemos criar um stream vazio
        Stream<String> stream6  = Stream.empty();
        stream6.forEach(System.out::println);

        // O código a seguir cria um fluxo dos primeiros 10 números naturais:
        Stream<Long> tenNaturalNumbers = 
        Stream.iterate(1L, n  ->  n  + 1).limit(10);

        tenNaturalNumbers.forEach(System.out::println);

        System.out.println("------------------");

        // O código a seguir filtra os valores gerados a partir de uma função de iteração.
        Stream.iterate(2L, n  ->  n  + 1)
            .filter(Optional_06_Criando_Fluxo_Stream::isOdd)
            .limit(5)
            .forEach(System.out::println);
        
           System.out.println(); 
            
            Stream.iterate(2L, n  ->  n  + 1)
            .filter(Optional_06_Criando_Fluxo_Stream::isOdd)
            .skip(100)
            .limit(5)
            .forEach(System.out::println);


            System.out.println();
            MyIntegerCalculator myIntegerCalculator = s1 -> s1 * 2;
            //MyIntegerCalculator myIntegerCalculator = (s1) -> s1 * 2;
            //MyIntegerCalculator myIntegerCalculator = (Integer s1) -> s1 * 2;

            System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

            System.out.println("-----Tamanho----------");

            Processor stringProcessor = str -> str.length();
            String name = "Java Lambda";
            int length = stringProcessor.getStringLength(name);
            System.out.println(length);//from   ww w.ja  v a 2  s .  c  om

            // Uso de BooleanSupplier
            BooleanSupplier bs = () -> true;
            System.out.println(bs.getAsBoolean());

            int x = 0, y = 1;

            bs = () -> x > y;
            System.out.println(bs.getAsBoolean());

            System.out.println("-------------------------");

 
           SecondProcessor secondProcessor = (String str) -> str.length();
            //from w  w  w. ja  va 2s . c  o  m
            //stringProcessor = secondProcessor; //compile error
        
            length = secondProcessor.noName(name);
            System.out.println(length);



        }
    
    @FunctionalInterface
    interface Processor {
        int getStringLength(String str);
    }
    
    @FunctionalInterface
    interface SecondProcessor {
        int noName(String str);
    }


    public static boolean isOdd(long number) {
        if (number % 2 == 0) {
        return false;
    }
        return true;
    }

    interface MyIntegerCalculator {

        public Integer calcIt(Integer s1);

    }

}