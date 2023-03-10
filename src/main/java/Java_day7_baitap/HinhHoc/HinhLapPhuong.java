package Java_day7_baitap.HinhHoc;

public class HinhLapPhuong implements HinhHoc3D {
    private double canh = 1.0;

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh + ",thetich = " + tinhTheTich() +
                '}';
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("phai la so duong");
        }else
        this.canh = canh;
    }

    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
        if(canh <= 0){
            throw new RuntimeException("phai la so duong");
        }else
        this.canh = canh;
    }


    @Override
    public double tinhTheTich() {
        return canh * canh * canh;
    }


}
