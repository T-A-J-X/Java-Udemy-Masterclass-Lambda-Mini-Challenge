import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Mini challenge 1: Write the anonymous class below as a Lambda expression
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println();
                }
            }
        };

        //Mini Challenge 1: Solution
        Consumer<String> printThePartsSolution = s -> {
            String[] parts = s.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        Consumer<String> printThePartsForEachSolution = s -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(s2 -> System.out.println(s2));
        };

        Consumer<String> printThePartsConcise = s -> Arrays.asList(s.split(" ")).forEach(s2 -> System.out.println(s));


        printTheParts.accept("Let's split this up into an array");
        printThePartsSolution.accept("Let's split this up into an array");
        printThePartsForEachSolution.accept("Let's split this up into an array");
        printThePartsConcise.accept("Let's split this up into an array");

        //Mini Challenge 2: Solution - UnaryOperator
        UnaryOperator<String> everySecondCharSolution = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        //Mini Challenge 2: Solution - Function
        Function<String, String> everySecondCharSolution2 = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        //Mini Challenge 3: Write the code to execute the Mini Challenge 2's lambda expression's functional method,
        //using 1234567890 as the argument to that method and print the result out
        System.out.println(everySecondChar("Extract every second character from this sentence"));
        System.out.println(everySecondCharSolution.apply("Extract every second character from this sentence"));
        System.out.println(everySecondCharSolution2.apply("Extract every second character from this sentence"));

        //Mini Challenge 4: Solution 2/2
        String result = everySecondCharacter(Main::everySecondChar, "1234567890");
        System.out.println(result);

        //Mini Challenge 6: Write a lambda expression that is declared with the Supplier Interface
        //it should return "I love Java", and assign it to a variable iLoveJava
        Supplier<String> iLoveJava = () -> "I love Java";
        System.out.println(iLoveJava.get());

        //Mini Challenge 7: Use the Supplier to assign a String "I love Lambda to a variable called supplierResult
        Supplier<String> iLoveJava2 = () -> "I love Java";
        String supplerResult = iLoveJava.get();
        System.out.println(supplerResult);
        //below also works
        System.out.println(iLoveJava2.get());
    }

    //Mini Challenge 2: Write the following method as a lambda expression
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++){
            if(i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    //Mini Challenge 4: write another method called everySecondCharacter which should accept a Function or
    //Unary Operator as a parameter as well as a second parameter that lets us pass "1234567890"
    Supplier<String> iLoveJava = () -> "I love Java";

    //Mini Challenge Solution 1&2
    public static <T>  String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}