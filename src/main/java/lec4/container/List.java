package lec4.container;

import java.util.Arrays;

public class List {
    private Container[] array = new Container[2];

    private int lastElementIndex = -1;

//    public int getByIndex(int index){}

    public void add(Container value){
        if(lastElementIndex + 1 <  array.length) {
            ++lastElementIndex;
            array[lastElementIndex] = value;
        } else {
            Container []oldArray = array;
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
