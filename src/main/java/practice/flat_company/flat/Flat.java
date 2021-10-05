package practice.flat_company.flat;

import practice.flat_company.Validate;
import practice.flat_company.exceptions.FlatConstructorException;

import java.util.ArrayList;
import java.util.List;

public class Flat implements Validate {
    private String address;

    private List<Room> roomList;
    private List<BathRoom> bathList;
    private List<Room> kitchenList;

    public Flat(String address, List<Room> roomList, List<BathRoom> bathList, List<Room> kitchenList) {
        this.address = address;
        this.roomList = roomList;
        this.bathList = bathList;
        this.kitchenList = kitchenList;

        validate();

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<BathRoom> getBathList() {
        return bathList;
    }

    public void setBathList(List<BathRoom> bathList) {
        this.bathList = bathList;
        validate();

    }

    public List<Room> getKitchenList() {
        return kitchenList;
    }

    public void setKitchenList(List<Room> kitchenList) {
        this.kitchenList = kitchenList;
        validate();

    }

    @Override
    public void validate(){
        final List<String> exceptionsMessages = new ArrayList<>();

        if(kitchenList == null || kitchenList.isEmpty()) {
            exceptionsMessages.add("We need at least 1 kitchen");
        }

        if(bathList == null || bathList.isEmpty()) {
            exceptionsMessages.add("We need at least 1 bath");
        }

        if(!exceptionsMessages.isEmpty()){
            throw new FlatConstructorException(exceptionsMessages);
        }
    }
}
