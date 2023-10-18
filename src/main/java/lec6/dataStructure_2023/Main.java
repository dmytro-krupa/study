package lec6.dataStructure_2023;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        for(int i = 0; i < 50; i++){
            list.add("number: " + i);
        }

//        for(int i = 0; i < list.size(); i++){
//            String temp = list.get(i);
//            System.out.println(temp + " Some string");
//        }

        for(String s : list){
            System.out.println(s + " with iterator");
        }

    }
}

//1653500
//158900