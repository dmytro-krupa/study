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

    //агрегація автомобіля
    //логічно не підходить, адже такий підхід ознаяає що один двигун може бути частиною інш
    public Kia(Engine engine) {
        this.engine = engine;
    }

    public void createEngine(boolean isGoodEngine){
        this.engine = new Engine();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
