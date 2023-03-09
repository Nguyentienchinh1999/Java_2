package Java_day6_baitap.HinhHoc;

public class HinhTron implements HinhHoc{
    private double radius = 1.0;

    public HinhTron() {
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("phai la so duong:");
        }else
        this.radius = radius;
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhChuvi() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius + ",chuvi =" + tinhChuvi() +
                '}';
    }

    @Override
    public double tinhDienTich() {
        return radius * radius * Math.PI;
    }
}
