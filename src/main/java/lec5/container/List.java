package lec5.container;

public class List<T> {
    private Container<T>[] array = new Container[2];

    private int lastElementIndex = -1;


    public void add(Container<T> value){
        if(lastElementIndex + 1 <  array.length) {
            ++lastElementIndex;
            array[lastElementIndex] = value;
        } else {
            Container<T>[]oldArray = array;
            array = new Container[oldArray.length * 2];

            for(int i = 0; i <= lastElementIndex; i++){
                array[i] = oldArray[i];
            }

            ++lastElementIndex;
            array[lastElementIndex] = value;
        }
    }

    public void print(){
        for( int i = 0; i <= lastElementIndex; i++){
            System.out.println(array[i].getValue());
        }
    }
}
