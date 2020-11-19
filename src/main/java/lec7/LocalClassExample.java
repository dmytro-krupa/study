package lec7;

public class LocalClassExample {
    private int y = 4;

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();

        localClassExample.q();
    }

    public void q(){
        int x = 5;

        x = 4;
        class PrintIt{
            void print(int a){
//                System.out.println(a);
                System.out.println(y);
            }
        }


        PrintIt printIt = new PrintIt();

        printIt.print(3);
    }
}
