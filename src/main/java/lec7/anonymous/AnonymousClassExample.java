package lec7.anonymous;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AnonymousClassExample {
    public static void main(String[] args) {

        Button button = new Button();

//        button.setClickAction(new CustomAction());
//
//
//        button.setClickAction(new Action() {
//            @Override
//            public void invoke() {
//                System.out.println("from anonymous class");
//            }
//
////            private void q(){}
//        });


        int a = 4;

        button.setClickAction(    (b, o) -> System.out.println(b)    );

//        A a = new A();
//        a.action("SOME TEXT 2").invoke();
    }

//
//    static class CustomAction implements Action{
//        @Override
//        public void invoke() {
//            System.out.println("from CustomAction class");
//        }
//    }

//    static class A{
//        public Action action(final String printIt){
////            printIt = "4";
//            return new Action() {
//                @Override
//                public void invoke() {
//                    System.out.println(printIt);
//                    System.out.println(this.method());
//                }
////                 public  void q(){
////                     System.out.println("fff");
////                 }
////
//                private int method(){
//                    return 45;
//                }
//            };
//        }
//    }


}
