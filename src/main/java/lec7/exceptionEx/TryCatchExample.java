package lec7.exceptionEx;

import java.io.IOException;

public  class TryCatchExample {
    public static void main(String[] args){
        try {
            int x1 = get();
            System.out.println("x1 = " + x1);

        } catch (NullPointerException | ArithmeticException e){
            System.out.println("catch block");
        } catch (RuntimeException e){
            System.out.println("catch block2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable e){
            System.out.println("catch block3");
        }

//        try {
//            int x1 = get();
//            System.out.println("x1 = " + x1);
//        } catch (IOException e){
//            System.out.println("catch block");
//        }

    }

//    static int get(){
//
////        ExceptionExample.A a = null;
//
////        a.hashCode();
//
//        if(true){
////            throw new ArithmeticException();
//        }
//
//        return 5;
//    }


    static int get() throws IOException{


        if(true){
            IOException exception = new IOException("MORE DETAILS");
            throw exception;
        }
        return 52;
    }

}
