package lec1;

public class SwitchExample {
    public static void main(String[] args) {

        int a = 2;

//        switch (a){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("default");
//        }

        switch (a){
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            default -> System.out.println("default");
        }

    }
}

