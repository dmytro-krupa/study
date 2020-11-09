package lec7.anonymous;

public class AnonymousClassExample {
    public static void main(String[] args) {

        Button button = new Button();

        button.setClickAction(new CustomAction());
        button.setClickAction(new Action() {
            @Override
            public void invoke() {
                System.out.println("from anonymous class");
            }
        });

        button.setClickAction(() -> System.out.println("from lambda"));
    }


    static class CustomAction implements Action{
        @Override
        public void invoke() {
            System.out.println("from CustomAction class");
        }
    }

    class A{
        Action action(String printIt){
//            printIt = "4";
            return new Action() {
                @Override
                public void invoke() {
                    System.out.println(printIt);
                    System.out.println(this.method());
                }
//                 public static void q(){
//                     System.out.println("fff");
//                 }
//
                private int method(){
                    return 45;
                }
            };
        }
    }


}
