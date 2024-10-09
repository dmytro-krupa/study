package lec7.java_2024.inner.local;

public class LocalMain {
    public static void main(String[] args) {
        int x = 5;

        if(x == 8){
            System.out.println(x);
        } else {


            class A{
                //private final int x = 5;
                private String name = "54gwf";

                public String getName() {
                    return name + x;
                }
            }

            A a = new A();
            //багатопотокова магія

            System.out.println(a.getName());
        }

    }
}
