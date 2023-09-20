package lec3.practice_2023;

public class Vendor {
    private String name;
    private String officeAddress;

    public Vendor() {
    }

    public Vendor(String name, String officeAddress) {
        this.name = name;
        this.officeAddress = officeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                '}';
    }
}
