package time;

public class DynamicArray implements ArrayBase{

    static final int COEF = 2;

    int length = 10;
    int[] array = new int[length];
    int index = -1;

    @Override
    public void add(int a) {

        if(index == length - 1){
            int[] newArray = new int[length * COEF];

            //переписуєш array в newArray

            array = newArray;
            length = array.length;
        }



        ++index;
        array[index] = a;

    }

    @Override
    public void remove() {
        --index;
    }

    @Override
    public void clean() {

    }

    @Override
    public void display() {

    }
}
