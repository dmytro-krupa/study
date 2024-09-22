package lec3.java_2024;

public class ObjectInMethodEx {
    /*
        Примітиви передаються за значенням
        Об'єкти теж передаються за значенням
     */
    public static void main(String[] args) {
        C a = new C(4);
        change(a);

        System.out.println("after method = " + a.x); //4 or 5 ?
    }


    static void change(C b) { //b = a
        //
        b = new C(10);
        ++b.x;

        System.out.println("in method = " + b.x); //5
    }

    static class C {
        int x;

        public C(int x) {
            this.x = x;
        }
    }






    /*
        public static void main(String[] args) {
        int x = 4;

        change(x);

        System.out.println("after method = " + x); //4 or 5 ?
    }

    static void change(int a){


        ++a;

        System.out.println("in method = " + a); //5
    }
     */

}
