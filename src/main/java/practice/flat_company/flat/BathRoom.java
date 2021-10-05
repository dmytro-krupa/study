package practice.flat_company.flat;

import practice.flat_company.flat.elements.*;

import java.util.List;

public class BathRoom extends Room{

    public BathRoom(List<Door> doors, List<Window> windows, Wall wall, int floorLength, int floorWidth, Ceil ceil) {
        super(doors, windows, wall, Floor.getTileFloor(), ceil);
    }
}
