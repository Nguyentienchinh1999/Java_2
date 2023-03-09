package Java_day6.Tutorial_Generic;

public class Box <T>{
    private T t;
    public void put(T t){
        this.t = t;
    };
    public T getBox(){
        return t;
    }
}
