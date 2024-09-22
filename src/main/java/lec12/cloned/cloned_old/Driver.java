package lec12.cloned.cloned_old;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public Driver clone(){

        return new Driver(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
