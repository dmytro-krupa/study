package lec5.old.lec5_2023.dataStructure_2023;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        for(int i = 0; i < 3_000; i++){
            list.add("number: " + i);
        }

        long start = System.nanoTime();

//        System.out.println(list.get(455));

        long stop = System.nanoTime();

//        System.out.println("list.get(455) in nanos = " + (stop - start));




    }
}

//1653500
//158900