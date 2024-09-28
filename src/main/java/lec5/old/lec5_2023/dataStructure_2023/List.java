package lec5.old.lec5_2023.dataStructure_2023;

public interface List<T> extends Iterable<T>{
    void add(T value);
    T get(int index);
    int size();


    void print();
}
