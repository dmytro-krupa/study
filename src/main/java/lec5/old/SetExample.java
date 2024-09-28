package lec5.old;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(5);
        integerSet.add(4);

//        System.out.println(integerSet);


        Set<A> aSet = new HashSet<>();

        aSet.add(new A("3", 3));
        aSet.add(new A("2", 2));
        aSet.add(new A("2", 4));
        aSet.add(new A("d", 100));

        System.out.println(aSet);

//
//        Map<A, String> map = new HashMap<>();
//        map.put(new A("3"), "r");
//        map.put(new A("2"), "e");
//        map.put(new A("2"), "w");
//        map.put(new A("d"), "q");
//
//        System.out.println(map);
    }

    static class A{
        String x;
        int i;

        public A(String x, int i) {
            this.x = x;
            this.i = i;
        }

        @Override
        public int hashCode() {
            return x.hashCode();
//            return 1;
        }
//
        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof A)){
                return false;
            }

            A that = (A) obj;

            return this.x.equals(that.x) && this.i == that.i;
        }

        @Override
        public String toString() {
            return "A{" +
                    "x='" + x + '\'' +
                    '}';
        }
    }
}
