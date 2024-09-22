package lec3.java_2024;

public class InterfaceEx {
    public static void main(String[] args) {
        Vehicle kia = new Car();
    }

    static interface Vehicle{
        void start();
        void stop();
    }

    static class Car implements Vehicle,Example{
        void own(){}

        @Override
        public int getX() {
            return 0;
        }


        @Override
        public void start() {

        }

        @Override
        public void stop() {

        }
    }



    interface Example{
        int X = 4; // так робити не варто (final class + private constructor)

        int getX();

        default void defaultMethod(){

        }


        //не рекомендується
        private void method1(){

        }

        //не рекомендується
        static void method2(){}

    }
}
