package lec4.dataStructure_2023;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList(51_000);


        for(int i = 0; i < 50_000; i++){
            list.add(i);
        }

        long start = System.nanoTime();

        System.out.println(list.get(48_995));

        long stop = System.nanoTime();

        System.out.println("list.get(9_995) in nanos = " + (stop - start));

    }

}

//1653500
//158900