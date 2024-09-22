package lec12.immutable.immutable_old;

public class Subject {
    private String title;

    public Subject(String title) {
        this.title = title;
    }

    public Subject() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                '}';
    }
}
