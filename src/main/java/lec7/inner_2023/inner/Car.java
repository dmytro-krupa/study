package lec7.inner_2023.inner;

public class Car {
    private String brand = "34";
    private Engine engine;
    private int speed; // = 0

    public Car(String brand) {
        this.brand = brand;
        engine = this.new Engine();
    }

    public void start(){
        engine.on();
        speed = 10;
    }
    public void stop(){
        speed = 0;
        engine.off();
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public class Engine {
        private int power;

        public void on(){
            System.out.println(brand);
        }
        public void off(){}

        public int getPower() {
            return power;
        }

        public Car getCar(){
            return Car.this;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }

}
