package practice.flat_company.flat.enumeration;

public enum  DoorMaterial {
    WOODEN(40), METAL(100);

    private int pricePerMeter2;

    DoorMaterial(int pricePerMeter2) {
        this.pricePerMeter2 = pricePerMeter2;
    }

    public int getPricePerMeter2() {
        return pricePerMeter2;
    }
}
