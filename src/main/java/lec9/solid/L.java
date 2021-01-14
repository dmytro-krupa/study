package lec9.solid;

public class L {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.start(40);
//        vehicle.turnLeft();
//        vehicle.turnRight();
        vehicle.stop();
    }

    interface Vehicle {
        void start(int speed);
        void stop();
    }

    interface AnyDirectionVehicle extends Vehicle{
        void turnRight();
        void turnLeft();
    }

    interface BiDirectionVehicle extends  Vehicle{}

//    static class Vehicle{
//        int speed;
//
//        void start(int speed){
//            this.speed = speed;
//        }
//        void stop(){
//            this.speed = 0;
//        }
//
//        void turnRight(){
//            this.speed = this.speed / 2;
//        }
//        void turnLeft(){
//            this.speed = this.speed / 2;
//        }
//    }

    static class Car implements AnyDirectionVehicle{
        int speed;
        public void start(int speed){
            this.speed = speed;
        }
        public void stop(){
            this.speed = 0;
        }

        public void turnRight(){
            this.speed = this.speed / 2;
        }
        public void turnLeft(){
            this.speed = this.speed / 2;
        }
    }
    static class Bus implements AnyDirectionVehicle{
        int speed;
        public void start(int speed){
            this.speed = speed;
        }
        public void stop(){
            this.speed = 0;
        }

        public void turnRight(){
            this.speed = this.speed / 2;
        }
        public void turnLeft(){
            this.speed = this.speed / 2;
        }
    }
    static class Train implements BiDirectionVehicle{
        int speed;
        public void start(int speed){
            this.speed = speed;
        }
        public void stop(){
            this.speed = 0;
        }
    }

}
