package practice.flat_company.flat.enumeration;

public enum WallMaterial {
    WALLPAPER(5);

    private int pricePerMeter2;

    WallMaterial(int pricePerMeter2) {
        this.pricePerMeter2 = pricePerMeter2;
    }

    public int getPricePerMeter2() {
        return pricePerMeter2;
    }
}
