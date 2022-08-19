package practice.flat_company.flat.elements;

import practice.flat_company.flat.enumeration.WallMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class Wall extends Element{

    private List<Window> windows = new ArrayList<>();
    private List<Door> doors = new ArrayList<>();

    private WallMaterial wallMaterial;

    @Override
    public int getMeter2(){

        int doorsMeter2 = doors.stream().mapToInt(Door::getMeter2).sum();
        int windowsMeter2 = windows.stream().mapToInt(window -> window.getMeter2()).sum();

        return width * length - doorsMeter2 - windowsMeter2;
    }

    @Override
    public int getPrice(){
        return getMeter2() * wallMaterial.getPricePerMeter2();
    }

}
