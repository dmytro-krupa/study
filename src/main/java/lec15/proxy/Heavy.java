package lec15.proxy;

public class Heavy {
    public String getString(){
        try {
            Thread.sleep(3000);
        } catch (Exception e){
        }
        return "Some Test String";
    }
}
