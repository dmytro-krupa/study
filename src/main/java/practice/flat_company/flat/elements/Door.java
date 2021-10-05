package practice.flat_company.flat.elements;

import practice.flat_company.flat.enumeration.DoorMaterial;

public class Door extends Element{

    private DoorMaterial doorMaterial;


    @Override
    public int getPrice(){
        return getMeter2() * doorMaterial.getPricePerMeter2();
    }

    public Door(int width, int length, DoorMaterial doorMaterial) {
        this.width = width;
        this.length = length;
        this.doorMaterial = doorMaterial;
    }


}
