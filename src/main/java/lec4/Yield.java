package lec4;

public class Yield {
    public static void main(String[] args) {
        int x = 7;

        String result = switch (x) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            default -> {
                if(x > 10){
                    yield "null";
                } else  {
                    yield "less then 10";
                }
            }
        };

        System.out.println(result);







        //example
//        String s = switch (x){
//            case 1 -> "1";
//            case 2 -> "2";
//            case 3 -> "3";
//            default -> {
//                if(true){
//                    yield  "0" + 3;
//                }
//            }
//        };

//        String s = switch (x){
//            case 1 -> "1";
//            case 2 -> "2";
//            case 3 -> "3";
//            default -> "0" + 3;
//        };
//
//        System.out.println(s);
    }
}
