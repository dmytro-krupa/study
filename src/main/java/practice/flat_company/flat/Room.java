package practice.flat_company.flat;

import practice.flat_company.flat.elements.*;

import java.util.List;

public class Room {
    private List<Door> doors;
    private List<Window> windows;

    private Wall wall;
    private Floor floor;
    private Ceil ceil;

    public int getTotalPrice(){
        int result = 0;

        result += doors.stream().mapToInt(Door::getPrice).sum();

        result += wall.getPrice();

        return result;
    }

    public Room(List<Door> doors, List<Window> windows, Wall wall, Floor floor, Ceil ceil) {
        this.doors = doors;
        this.windows = windows;
        this.wall = wall;
        this.floor = floor;
        this.ceil = ceil;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Ceil getCeil() {
        return ceil;
    }

    public void setCeil(Ceil ceil) {
        this.ceil = ceil;
    }
}
