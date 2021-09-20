package lec3.eq_and_hash;

import java.util.Objects;

public class EqualsAndHashcode {

    static class A{
        private int a = 5;
        private String b = "fgt5";

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a1 = (A) o;
            return a == a1.a &&
                    b.equals(a1.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return "EqualsAndHashcode{" +
                    "a=" + a +
                    ", b='" + b + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a);
    }
}
