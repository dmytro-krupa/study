package practice.flat_company.flat.elements;

public abstract class Element {
    protected int width;
    protected int length;

    public int getMeter2(){
        return width * length;
    }

    public abstract int getPrice();

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
