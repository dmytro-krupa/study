package lec4.exampe;

public class House {
    private String address;
    private Room[] rooms = new Room[3];

    public House(String address, Room[] rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
