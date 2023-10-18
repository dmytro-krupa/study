package lec7.inner_2023.local;

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
            System.out.println(a.getName());
        }

    }
}
