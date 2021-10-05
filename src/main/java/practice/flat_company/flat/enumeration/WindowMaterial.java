package practice.flat_company.flat.enumeration;

public enum WindowMaterial {
    WOODEN(10), PLASTIC(15);

    private int pricePerMeter2;

    WindowMaterial(int pricePerMeter2) {
        this.pricePerMeter2 = pricePerMeter2;
    }

    public int getPricePerMeter2() {
        return pricePerMeter2;
    }
}
