package lec3;

public class ObjectInMethodExample2022 {
    public static void main(String[] args) {
        A x = new A(5);
        A y = new A(8);


        System.out.println(calc(x,y));

        System.out.println(x.number);

    }

    public static int calc(final A x, A y){

////        x.setNumber(99);

//        x = new A(99);

        return x.number + y.number;
    }

    static class A{
        int number;

        public A(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
