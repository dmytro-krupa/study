package lec2;

public class ForExample {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7};

        for (int i = 0; i < a.length; i++){
            if(a[i] == 3){
//                break;
            }

            if(a[i] == 3){
//                continue;
            }

            System.out.println(a[i]);
        }

        //=========================================

        int[] b = {1,2,3,4,5,6,7};

        int indexB = 0;
//
//        while (indexB < b.length){
//            System.out.println(b[indexB]);
//            if(b[indexB] == 3){
//                break;
////                continue;
//            }
//            ++indexB;
//        }


        //=========================================

        int[] c = {10, 20, 30};

        do {
//            System.out.println(c[0]);
        } while (false);
//        } while (true);

        //=========================================


        int[] d = {100,200,300};


        //read only
        for(int number : d){
            System.out.println("Foreach: " + number);
        }

        //=========================================
    }
}
