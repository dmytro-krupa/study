package time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception{



        final List<Integer> integers = new ArrayList<>();

        integers.add(5);
        integers.add(8);
        integers.add(6);
        integers.add(12);











        final String salutation1 = "f";
        final String body1 = "t";

        Function<String, Function<String, Letter>> SIMPLE_CURRIED_LETTER_CREATOR =
                salutation
                        -> body
                        -> new Letter(salutation, body);


        Letter letter = SIMPLE_CURRIED_LETTER_CREATOR
                .apply(salutation1)
                .apply(body1);

        System.out.println(letter);

    }

    static class Letter {
        private String salutation;
        private String body;

        Letter(String salutation, String body){
            this.salutation = salutation;
            this.body = body;
        }

        @Override
        public String toString() {
            return salutation + " " + body;
        }
    }

}
