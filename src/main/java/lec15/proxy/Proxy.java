package lec15.proxy;

public class Proxy extends Heavy{
    private String saved;

    @Override
    public String getString() {
        if(saved == null){
            saved = super.getString();
            return saved;
        } else {
            return saved;
        }
    }

    public void apply(){

    }
}
