package lec4;

public class ManyArgs {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;

        System.out.println(sum(a1, a2));
    }

    static int sum(int first, int... q){
        int sum = first;

        for(var a : q){
            sum += a;
        }

        return sum;
    }

//    static int sum(int q1, int q2){
//        return q1 + q2;
//    }
//    static int sum(int q1, int q2, int q3){
//        return q1 + q2 + q3;
//    }
//    static int sum(int q1, int q2, int q3, int q4){
//        return q1 + q2 + q3 + q4;
//    }
}
