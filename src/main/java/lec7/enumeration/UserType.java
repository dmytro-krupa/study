package lec7.enumeration;

public enum UserType {
    MANAGER (1L),
    REGULAR_USER(2L);

    private final Long id;

    UserType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name() +
                ", id=" + id +
                '}';
    }
}
