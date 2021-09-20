public class First {
    public static void main(final String[] args) {
        final int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100};


        //================================

        final double result = average(intArray);

        //================================


        System.out.println(result);
    }

    public static double average(final int[] intArray){
        int sum = 0;

        for (final int j : intArray) {
            sum += j;
        }

        return  (double) sum / intArray.length;
    }
}


