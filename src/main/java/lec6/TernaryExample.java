package lec6;

public class TernaryExample {
    //it - 21/22
    //it - 13

    public static void main(String[] args) {
        int age = 15;

        String result;

        //=============================================

        if(age >= 18) {
            result = "You can do that";
        } else {
            result = "You can't do that";
        }


        //=============================================

        result = age >= 18 ?
                "You can do that" :
                "You can't do that";



        //=============================================

        System.out.println(result);


    }
}
