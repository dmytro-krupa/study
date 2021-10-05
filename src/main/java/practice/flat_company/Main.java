package practice.flat_company;

import practice.flat_company.flat.BathRoom;
import practice.flat_company.flat.Flat;
import practice.flat_company.flat.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Room kitchen = new Room(null,null,null,null, null);
        final BathRoom bath = new BathRoom(null,null,null,0,0, null);

        final List<Room> kitchenList = new ArrayList<>();

        final List<Room> kitchenList1 = new ArrayList<>();

        kitchenList.add(kitchen);

        final Flat flat = new Flat(null, null, Collections.singletonList(bath), kitchenList);



        flat.getKitchenList().add(new Room(null,null,null,null, null));


//        for(final Room room : kitchenList){
//            kitchenList1.add(room);
//        }

        kitchenList1.addAll(kitchenList);

        System.out.println(kitchenList);
        System.out.println(kitchenList1);


    }
}
