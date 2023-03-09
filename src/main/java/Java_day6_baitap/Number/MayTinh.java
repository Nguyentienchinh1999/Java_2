package Java_day6_baitap.Number;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public abstract class MayTinh <T>{
    private T t;

    public MayTinh() {
    }

    public MayTinh(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public  abstract T tong(T... t);

    public abstract T hieu(T t1, T t2);

    public abstract T tich(T ... t);

    public abstract T thuong(T t1, T t2);

}
