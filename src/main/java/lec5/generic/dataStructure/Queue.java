package lec5.generic.dataStructure;

public interface Queue<T> {
    void add(T value);
    void delete(int index);

    int size();
    T get();

    void clear();

    void read();
}
