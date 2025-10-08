package lec4.java_2025.project.containers;

import lec4.java_2025.project.Book;

import static lec4.java_2025.project.Constants.DEFAULT_ARRAY_INCREASE_SIZE;

public class DynamicArray<T> implements List<T> {
    private Container<T>[] array;

    private int index = 0;

    public DynamicArray(int size) {
        this.array = new Container[size];
    }

    public DynamicArray(){
        this.array = new Container[1];
    }

    @Override
    public void add(Container<T> book) {

        if(array.length - 1 == index){
            increaseArray();
        }

        array[index] = book;
        index++;
    }



    @Override
    public Container<T>[] getAll() {
        Container<T>[] output = new Container[index];

        for(int i = 0; i<index; i++){
            output[i] = this.array[i];
        }

        return output;
    }

    private void increaseArray(){
        Container<T>[] newArray = new Container[this.array.length + DEFAULT_ARRAY_INCREASE_SIZE];

        for (int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }
}
