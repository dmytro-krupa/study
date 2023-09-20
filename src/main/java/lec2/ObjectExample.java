package lec2;

import java.sql.SQLOutput;
import java.util.Objects;

public class ObjectExample {
    public static void main(String[] args) {
        Test t = new Test();

        String a = "a";
        String b = "a";
        String c = "a";


        System.out.println(a.equals(a));

        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));

    }

    public static class Test{
        public int x;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;



            if (o == null || getClass() != o.getClass()) return false;



            Test test = (Test) o;
            return x == test.x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x);
        }
    }
}
