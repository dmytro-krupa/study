package lec5.generic;

public class BigTuple<K, V, A> extends Pair<K, V> {
    private final A someValue;

    public BigTuple(K key, V value, A someValue) {
        super(key, value);
        this.someValue = someValue;
    }

    public A getSomeValue() {
        return someValue;
    }
}
