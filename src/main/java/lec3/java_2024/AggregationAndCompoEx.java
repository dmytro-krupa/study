package lec3.java_2024;

public class AggregationAndCompoEx {
    //композиція
    public static void main(String[] args) {

        Car car = process();

        //sout (4)
        //удже багато коду після виклику попереднього методу




        //===============================

        /*
        main
        |   process() (3)
        |             -> car (1) -> engine (2)
        |
        |   sout (4)
        |
        |






        main
        |
        |      ...       -> car (1) -> engine (2)
        |
        |   sout (4)
        |
        |

         */
    }

    static Car process(){ //3
        Car car = new Car("audi", 200); // 1
        return car;
    }


    static class Car{
        String brand;
        Engine engine;  // 2

        public Car(String brand, int power) {
            this.brand = brand;
            this.engine = new Engine(power);
        }

    }

    static class Engine{
        int power;

        public Engine(int power) {
            this.power = power;
        }
    }


    /*
    static class A{
        A a;
    }

    a -> b -> c -> a
     */


    /*
    Агрегація


      public static void main(String[] args) {


        Engine engine = new Engine();
        engine.power = 200;

        Car car = new Car("audi", engine);
    }

    static class Car{
        String brand;
        Engine engine;

        public Car(String brand, Engine engine) {
            this.brand = brand;
            this.engine = engine;
        }
    }

    static class Engine{
        int power;
    }
     */




    //АСОЦІАЦІЯ
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "A";
//
//        House house = new House();
//        house.address = "street";
//
//        person.sayAddress(house);
//    }
//
//
//    static class Person{
//        String name;
//
//        void sayAddress(House house){
//            System.out.println(house.address);
//        }
//    }
//
//    static class House{
//        String address;
//    }
}
