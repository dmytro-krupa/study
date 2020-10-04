package lec2;

public class MethodExample {
    public static void main(String[] args) {

    }

    int simpleMethod(int a, int b){
        int c = a + b;
        return c;
    }

    int sumOfArray(int[] array){
        int c = 0;

        for(int a : array){
            c += a;
        }

        return c;
    }
}
