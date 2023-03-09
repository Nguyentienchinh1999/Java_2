package Java_day6_baitap.Number;

public class Calculate extends MayTinh<Double>{
    public Calculate() {
    }

    @Override
    public Double tong(Double... t) {
        double sum = 0;
        for(Double i : t){
            sum += i;
        }
        return sum;
    }

    @Override
    public Double hieu(Double t1, Double t2) {
        return t1 -t2;
    }

    @Override
    public Double tich(Double... t) {
        double sum = 1;
        for(Double i : t){
            sum *= i;
        }
        return sum;
    }

    @Override
    public Double thuong(Double t1, Double t2) {
        return t1 - t2;
    }

}
