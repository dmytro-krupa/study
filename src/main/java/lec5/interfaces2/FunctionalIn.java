package lec5.interfaces2;

@FunctionalInterface
public interface FunctionalIn {
    int getNumber();

    default int getNumber1(){
        return 0;
    }
}
