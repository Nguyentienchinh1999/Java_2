package Java_day7_baitap.SinhVien;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> svList = new ArrayList<>();
        SinhVien sv1 = new SinhVien("1", "Chinh", "19/6/1999", "BN");
        SinhVien sv2 = new SinhVien("2", "Thuy", "2/3/1999", "TN");
        svList.add(sv1);
        svList.add(sv2);
//        1
        System.out.println(svList.toString());
//        2
        Scanner in = new Scanner(System.in);
//        System.out.println("nhập thông tin sv mới:");
//        System.out.println("nhap mã sv: ");
//        String msv = in.nextLine();
//        System.out.println("nhập tên sv:");
//        String tenSV = in.nextLine();
//        System.out.println("nhập ngày sinh: ");
//        String ns = in.nextLine();
//        System.out.println("nhập quê quán: ");
//        String que = in.nextLine();
//
//        SinhVien svNew = new SinhVien(msv, tenSV, ns, que);
//        svList.add(svNew);
//        System.out.println(svList);

//        3
        System.out.println("tìm sinh viên theo ID: mời vào nhập số Id sinh viên:");
//        String id = in.nextLine();
//        Boolean isCheck = false;
//        for(int i = 0; i < svList.size(); i++){
//            if(id.equals(svList.get(i).getMaSinhVien())){
//                isCheck = true;
//                System.out.println(svList.get(i));
//                break;
//            }
//        }
//        if (!isCheck){
//            System.out.println("d co");
//        }

// 4
        List<MonHoc> mhList = new ArrayList<>();
        MonHoc mh1 = new MonHoc("A1", "JAVA");
        MonHoc mh2 = new MonHoc("A2", "NODEJS");

        mhList.add(mh1);
        mhList.add(mh2);
        System.out.println(mhList.toString());

        System.out.println("nhập môn học mới: ");

        System.out.println("nhập mã môn: ");
        String maMon = in.nextLine();
        System.out.println("nhập tên môn:");
        String tenMon = in.nextLine();

        MonHoc newMh = new MonHoc(maMon, tenMon);
        mhList.add(newMh);
        System.out.println(mhList.toString());
//        6
        System.out.println("nhập điểm cho sinh viên: ");
        System.out.println("nhập mã Sv: ");
        String maSvNhap;
        maSvNhap = in.nextLine();
       boolean flag1 = false;
       for(SinhVien sinhVien: svList){
           if(sinhVien.getNgaySinh().equals(maSvNhap)){
               flag1 = true;
               break;
           }
       }
       if(!flag1){
           System.out.println("khong co sinh vien do");
       }
        System.out.println("nhập mã môn học: ");
       String maHocNhap;
        maHocNhap = in.nextLine();
        boolean flag2 = false;
        for(MonHoc monHoc: mhList){
            if(monHoc.getMaMonHoc().equals(maHocNhap)){
                flag2 = true;
                break;
            }
        }
        if(!flag2){
            System.out.println("khong co mon hoc do");
        }
        System.out.println("nhap diem: ");
        int diem = Integer.parseInt((in.nextLine()));
        Diem d = new Diem();
        d.setMaSinhVien(maSvNhap);
        d.setMaMonHoc(maSvNhap);
        d.setDiemSo(diem);
        List<Diem> diemList = new ArrayList<>();
        diemList.add(d);
        System.out.println(diemList.toString());

//        7
        System.out.println("nhập mã sv cần update:");
        String mvsUpdate = in.nextLine();
        for(int i =0; i < diemList.size(); i++){
            if(diemList.get(i).getMaSinhVien().equals(mvsUpdate)){
                System.out.println("nhập điểm số update");
                String diemUpdate = in.nextLine();
                Diem update = diemList.get(i);
                update.setDiemSo(Integer.parseInt(diemUpdate));
                System.out.println(diemList.toString());
            }
        }

//        8

    }
}
