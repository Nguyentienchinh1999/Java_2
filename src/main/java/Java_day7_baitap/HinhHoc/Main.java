package Java_day7_baitap.HinhHoc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HinhHoc3D> arrHinh = new ArrayList<>();
        HinhCau hinhCau1 = new HinhCau(3);
        HinhLapPhuong hinhLapPhuong1 = new HinhLapPhuong(4);
        HinhLapPhuong hinhLapPhuong2 = new HinhLapPhuong(5);
        HinhCau hinhCau2 = new HinhCau(7);

        arrHinh.add(hinhCau1);
        arrHinh.add(hinhLapPhuong1);
        arrHinh.add(hinhLapPhuong2);
        arrHinh.add(hinhCau2);
        arrHinh.add(new HinhTru(3,5));
        double min = arrHinh.get(0).tinhTheTich();
        HinhHoc3D h = arrHinh.get(0);
        for(int i  = 0; i < arrHinh.size(); i++){
            if(arrHinh.get(i).tinhTheTich() < h.tinhTheTich()){
                h = arrHinh.get(i);
            }
        }
        System.out.println("hình có thể tích nho nhất là " + h);
        double sum = 0;
        for(int i  = 0; i < arrHinh.size(); i++){
            sum += arrHinh.get(i).tinhTheTich();
        }
        double tb = sum/arrHinh.size();
        System.out.println("trung bình cộng the tích là; "  + tb);

        Collections.sort(arrHinh);
        System.out.println(arrHinh.toString());

        Collections.sort(arrHinh, new Comparator<HinhHoc3D>() {
            @Override
            public int compare(HinhHoc3D o1, HinhHoc3D o2) {
                if(o1.tinhTheTich() < o2.tinhTheTich()){
                    return 1;
                }else if(o1.tinhTheTich() > o2.tinhTheTich()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(arrHinh.toString());
    }
}
