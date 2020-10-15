package lec3;

public class ObjectInMethodExample {


    public static void main(String[] args) {
        A a = new A("some name", 15);


        System.out.println("Before method: " + a.getName());
        rename(a);
        System.out.println("After method: " + a.getName());


        System.out.println();
        System.out.println();

        int i = 4;
        System.out.println("Before increment: " + i);
        increment(i);
        System.out.println("After increment: " + i);
    }


    static void increment(int i){
        i = i + 1;
    }


    static void rename(A a){
        a.setName("Renamed");
    }


    static class A{
        private String name;
        private int age;

        public A() {
        }
        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
