package lec4;

public class ScopeExample {
    public static void main(String[] args) {

        // тут змінна x недоступна
//        System.out.println(x);

//        int x = 10;

        {
            int x = 10;
            // тут змінна x доступна

            System.out.println(x);

        }


        // тут змінна x недоступна
        // змінна x "живе" лише у області відокремленій дужками


//        System.out.println(x);
    }
}
