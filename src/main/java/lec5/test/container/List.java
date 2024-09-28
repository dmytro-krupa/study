package lec5.test.container;

public class List<T> {
    private T[] array;

    private int lastElementIndex = -1;

    public List() {
        array = (T[]) new Object[2];
    }

    public List(int size) {
        array = (T[]) new Object[size];
    }

    public T getByIndex(int index) {
        return array[index];
    }

    public void add(T value) {
        if (lastElementIndex + 1 < array.length) {
            ++lastElementIndex;
            array[lastElementIndex] = value;
        } else {
            T[] oldArray = array;
            array = (T[]) new Object[oldArray.length * 2];

            for (int i = 0; i <= lastElementIndex; i++) {
                array[i] = oldArray[i];
            }

            ++lastElementIndex;
            array[lastElementIndex] = value;
        }
    }

    public void print() {
        for (int i = 0; i <= lastElementIndex; i++) {
            System.out.println(array[i]);
        }
    }
}
