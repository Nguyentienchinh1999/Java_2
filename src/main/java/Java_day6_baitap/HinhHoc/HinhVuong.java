package Java_day6_baitap.HinhHoc;

public class HinhVuong implements HinhHoc {
    private double canh  = 1.0;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong() {
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("phai la so duong:");
        }else
        this.canh = canh;
    }

    @Override
    public double tinhChuvi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
