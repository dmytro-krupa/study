package lec3.relation;

public class RelationExample {
    public static void main(String[] args) {
        Car kia = new Bus();

        if(kia instanceof Kia){
            System.out.println("kia instanceof Kia");
        }

        if(kia instanceof Car){
            System.out.println("kia instanceof Car");
        }
        if(kia instanceof Bus){
            System.out.println("kia instanceof Bus");
        }
    }
}
