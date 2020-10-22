package lec4.dataStructure;

public interface Queue {
    void add(int value);
    void delete(int index);

    int size();
    int get();

    void clear();
}
