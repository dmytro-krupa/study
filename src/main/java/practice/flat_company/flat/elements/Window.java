package practice.flat_company.flat.elements;

import practice.flat_company.flat.enumeration.WindowMaterial;

import java.util.Objects;

public class Window {
    private long id;
    private int width;
    private int length;

    private WindowMaterial windowMaterial;

    public Window(int width, int length, WindowMaterial windowMaterial) {
        this.width = width;
        this.length = length;
        this.windowMaterial = windowMaterial;
    }

    public int getMeter2(){
        return width * length;
    }

    public int getPrice(){
        return getMeter2() * windowMaterial.getPricePerMeter2();
    }

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

    public WindowMaterial getWindowMaterial() {
        return windowMaterial;
    }

    public void setWindowMaterial(WindowMaterial windowMaterial) {
        this.windowMaterial = windowMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return width == window.width &&
                length == window.length &&
                windowMaterial == window.windowMaterial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, windowMaterial);
    }

    @Override
    public String toString() {
        return "Window{" +
                "width=" + width +
                ", length=" + length +
                ", windowMaterial=" + windowMaterial +
                '}';
    }
}
