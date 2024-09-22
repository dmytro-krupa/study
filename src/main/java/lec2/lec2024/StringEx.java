package lec2.lec2024;

public class StringEx {
    public static void main(String[] args) {
        String s = "Krupa Dmytro ";

        String[] arr = s.split(" ");

        for (var a : arr){
            System.out.println(a);
        }




        //todo: how to replace all spaces
//        System.out.println(s.trim().replaceAll("  ", " "));
    }
}
