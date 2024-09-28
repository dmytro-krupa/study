package lec5.interfaces2;

public class Ex {
    public static Marker getMarker(boolean someCondition) {
        return someCondition ? new A() : new B();
    }




    static class A implements Marker {
        String x;
        int y;
    }

    static class B implements Marker{
        String y;
        double i;
        String a;
    }
}
