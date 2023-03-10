package Java_day7_baitap.HinhHoc;

public class HinhTru implements HinhHoc3D {
    public HinhTru(double banKinh, double chieuCao) {
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "banKinh=" + banKinh +
                ", chieuCao=" + chieuCao +
                '}';
    }

    private double banKinh = 1.0;
    private double chieuCao = 1.0;

    @Override
    public double tinhTheTich() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }

}


