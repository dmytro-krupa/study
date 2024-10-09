package lec7.java_2024;

import java.util.Arrays;

public enum Day {
    MONDAY(1), TUESDAY(2), FRIDAY(5);

    private final int order;

    Day(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public static Day valueFrom(final String name){
        return Arrays.asList(Day.values()).stream()
                .filter(e -> name.toUpperCase().equals(e.name()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Day not found with name: " + name));
    }
}
