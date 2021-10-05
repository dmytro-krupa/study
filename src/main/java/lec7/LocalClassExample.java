package lec7;

public class LocalClassExample {
    private int y = 4;

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();

        localClassExample.q();
    }

    public void q(){
        final int x = 5;

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
