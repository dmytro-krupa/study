package lec3.constructor;

public class Lec3User extends SuperUser{
    private String name;
    private int age;

    //якщо є хоча б один конструктор з параметрами, тоді без параметрів потрібно оголошувати явно
    public Lec3User() {
        //завжди неявно викликається
//        super();
        this("default name", 18);
    }

    public Lec3User(String name, int age) {
        //завжди неявно викликається
        //super();
        super(age);

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
