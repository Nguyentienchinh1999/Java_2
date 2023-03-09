package Java_day6_baitap.HinhHoc;

public class Drawable<T extends HinhHoc> {
    private T t;
    public  void draw(T t){
        System.out.println(t);
    }

    public T getDraw(){
        return t;
    }

    @Override
    public String toString() {
        return "Drawable{" +
                "t=" + t +
                ", chuvi = " + t.tinhChuvi() + ",dientich = " + t.tinhDienTich() +
                '}';
    }
}
