package lec5;

import java.util.*;

public class BadHash {
    public static void main(String[] args) {
        Map<A, Integer> set = new HashMap<>();

        set.put(new A(4), 5);

        set.put(new A(1), 6);

        set.put(new A(2), 7);


        set.put(new A(3), 8);


        System.out.println(set);

    }

    static class A{
        private int x;

        public A(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return x == a.x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x);
        }

        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    '}';
        }
    }
}
