package lec7.anonymous;

public class Button{
    public void setClickAction(Action action){
        action.invoke(6, 9);
    }
}
