package lec3.ex2;

public abstract class Auto implements Vehicle{
    protected Engine engine;

    @Override
    public void start() {
        if(engine == null){
            System.out.println("You should install an engine");
        }
    }
}
