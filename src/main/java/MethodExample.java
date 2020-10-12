public class MethodExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};

        System.out.println("simpleMethod(int a, int b) = " + simpleMethod(10,200));
        System.out.println("sumOfArray(int[] array) = " + sumOfArray(intArray));

    }

    static int simpleMethod(int a, int b){
        int c = a + b;
        return c;
    }

    static int sumOfArray(int[] array){
        int c = 0;

        for(int a : array){
            c += a;
        }

        return c;
    }
}
