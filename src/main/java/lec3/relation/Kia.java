package lec3.relation;

//is-a
public class Kia extends Car{

    //has-a
    //асоціація
    private Driver driver;
    //has-a
    //асоціація
    private Engine engine;

    //композиція
    public Kia() {
        this.engine = new Engine();
    }

    //агрегаціяого автомобіля
    //логічно не підходить, адже такий підхід ознаяає що один двигун може бути частиною інш
    public Kia(Engine engine) {
        this.engine = engine;
    }
}
