package lec3.java_2024;

import java.util.Objects;

public class Equals {

    public static void main(String[] args) {
        Car car1 = new Car("qwer","qwe", "erwe", 134);
        Car car2 = new Car("qwer","qwe", "erwe", 134);
        Car car3 = null;

        System.out.println(car3.equals(car2));

    }

    static class Car {
        String brand;
        String color;
        String type;
        int power;

        public Car(String brand, String color, String type, int power) {
            this.brand = brand;
            this.color = color;
            this.type = type;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", power=" + power +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Car car = (Car) o;

            return power == car.power &&
                    Objects.equals(brand, car.brand) &&
                    Objects.equals(color, car.color) &&
                    Objects.equals(type, car.type);
        }

        //        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;

//            if (o == null || getClass() != o.getClass()) return false;
//
//            Car car = (Car) o;
//
//            if (power != car.power) return false;
//            if (!Objects.equals(brand, car.brand)) return false;
//            if (!Objects.equals(color, car.color)) return false;
//            return Objects.equals(type, car.type);
//        }

        @Override
        public int hashCode() {
            int result = brand != null ? brand.hashCode() : 0;
            result = 31 * result + (color != null ? color.hashCode() : 0);
            result = 31 * result + (type != null ? type.hashCode() : 0);
            result = 31 * result + power;
            return result;
        }
    }
}
