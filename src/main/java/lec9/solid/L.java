package lec9.solid;

public class L {

    class Vehicle{
        int speed;

        void start(int speed){
            this.speed = speed;
        }
        void stop(){
            this.speed = 0;
        }

        void turnRight(){
            this.speed = this.speed / 2;
        }
        void turnLeft(){
            this.speed = this.speed / 2;
        }
    }

    class Car extends Vehicle{}
    class Bus extends Vehicle{}
    class Train extends Vehicle{
        void turnRight(){
            throw new RuntimeException("Train can't turn left");
        }
        void turnLeft(){
            throw new RuntimeException("Train can't turn left");
        }
    }

}
