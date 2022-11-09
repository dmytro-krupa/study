package lec7;

import java.util.List;
import java.util.Map;

public class LocalClassExample {
    private int y = 4;

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();

        localClassExample.q();
    }

    public void q(){
        final int x = 5;
        String name = "Name";


        class ProductPair{
            private int price;
            private String name;

            public ProductPair(int price, String name) {
                this.price = price;
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public String getName() {
                return name;
            }
        }

        Map<String, Integer> priceMap; //Map< Name , Price >


        class PrintIt{
                void print(int a){
                //наступне не можна виклнати щоб не було проблем із багато потоковістю

                System.out.println(x);
                System.out.println(y);
            }
        }


        PrintIt printIt = new PrintIt();

        printIt.print(3);
    }
}
