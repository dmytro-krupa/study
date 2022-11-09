package lec7.anonymous;

public class Button{
    private Action action;
    public void setClickAction(Action action){
       this.action = action;
    }

    public void apply(int i, int o){
        action.invoke(i, o);
    }
}
