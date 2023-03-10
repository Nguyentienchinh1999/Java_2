package Java_day7_baitap.HinhHoc;

public class HinhCau implements HinhHoc3D {
    private double banKinh = 1.0;

    public HinhCau() {
    }

    public HinhCau(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("phai la so duong");
        }else
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("phai la so duong");
        }else
            this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh + ",thetich = " + tinhTheTich() +
                '}';
    }

    @Override
    public double tinhTheTich() {
        return 4/3 * Math.PI * Math.pow(banKinh,3);
    }


}
