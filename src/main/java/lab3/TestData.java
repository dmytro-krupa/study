package lab3;

import lec2.OOPExample;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static void main(String[] args) {
        final List<Car> cars = getTestData();

        System.out.println(cars);
    }

    public static List<Car> getTestData(){
        final List<Car> cars = new ArrayList<>(10);

        final Engine engine1 = new Engine("Cheap engine producer", 2015, 885);
        final Engine engine2 = new Engine("Super engine company", 2020, 3000);

        cars.add(new Car(1L,"Mercedes-Benz",220,2020,"Igor T", engine1.clone()));
        cars.add(new Car(2L,"Audi",280,2019, "Oleg M", engine1.clone()));
        cars.add(new Car(3L,"Mercedes-Benz",320,2020,"Ira I", engine1.clone()));
        cars.add(new Car(4L,"Kia",220,2020,"Inna C", engine1.clone()));
        cars.add(new Car(5L,"Audi",320,2010,"Dmytro I", engine1.clone()));
        cars.add(new Car(6L,"Kia",280,2010,"Inna C", engine1.clone()));
        cars.add(new Car(7L,"Audi",220,2015,"Igor T", engine1.clone()));
        cars.add(new Car(8L,"Mercedes-Benz",320,2005,"Bread company", engine1.clone()));
        cars.add(new Car(9L,"Kia",280,2019,"Anna E", engine1.clone()));
        cars.add(new Car(10L,"Kia",220,2015,"Dmytro I", engine1.clone()));

        return cars;
    }

    static class Car{
        private long id;
        private String brand;
        private int maxSpeed;
        private int yearOfProduction;
        private String ownerName;
        private Engine engine;

        public Car() {
        }

        public Car(long id, String brand, int maxSpeed, int yearOfProduction, String ownerName, Engine engine) {
            this.id = id;
            this.brand = brand;
            this.maxSpeed = maxSpeed;
            this.yearOfProduction = yearOfProduction;
            this.ownerName = ownerName;
            this.engine = engine;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public int getYearOfProduction() {
            return yearOfProduction;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", brand='" + brand + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    ", yearOfProduction=" + yearOfProduction +
                    ", ownerName='" + ownerName + '\'' +
                    '}';
        }
    }

    static class Engine {
        private String brand;
        private int yearOfProduction;
        private int power;

        public Engine() {
        }

        public Engine(String brand, int yearOfProduction, int power) {
            this.brand = brand;
            this.yearOfProduction = yearOfProduction;
            this.power = power;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYearOfProduction() {
            return yearOfProduction;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "{" +
                    "brand='" + brand + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", power=" + power +
                    '}';
        }

        @Override
        protected Engine clone() {
            final Engine engine = new Engine();

            engine.setBrand(this.brand);
            engine.setPower(this.power);
            engine.setYearOfProduction(this.yearOfProduction);
            return engine;
        }
    }
}
