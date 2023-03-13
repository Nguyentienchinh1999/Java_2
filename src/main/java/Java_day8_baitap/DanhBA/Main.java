package Java_day8_baitap.DanhBA;

import java.util.*;

public class Main {
    public static Map<String, String> danhBaList = new HashMap<>();
    private static void mainMenu(){
        System.out.println("--- QUẢN LÝ DANH BẠ ---");
        System.out.println("1. Thêm danh bạ");
        System.out.println("2. Cập nhật tên danh bạ");
        System.out.println("3. Xoá danh bạ theo sdt");
        System.out.println("4. Xem toàn bộ danh bạ");
        System.out.println("5. Thoát");
    }

    private static void option1(Scanner in){
        System.out.println("nhap so dien thoai");
        String sdt = in.nextLine();
        if(danhBaList.containsKey(sdt)){
            System.out.println("đã tồn tại liên hệ");
            return;
        }
        System.out.println("nhập ten liên he");
        String hoTen = in.nextLine();
        danhBaList.put(sdt,hoTen);
        System.out.println("lưu thành công");
    }
    private static void option2(Scanner in){
        System.out.println("nhap so dien thoai");
        String sdt = in.nextLine();
        if(!danhBaList.containsKey(sdt)){
            System.out.println("không tồn tại liên hệ");
            return;
        }
        String hoTenCu = danhBaList.get(sdt);
        System.out.println("ten lien he cu la: " + hoTenCu);
        System.out.println("nhập ten liên he moi");
        String hoTenMoi = in.nextLine();

       danhBaList.replace(sdt,hoTenMoi);
        System.out.println("sua thanh cong");
    }
    private static void option3(Scanner in){
        System.out.println("nhap so dien thoai");
        String sdt = in.nextLine();
        if(!danhBaList.containsKey(sdt)){
            System.out.println("không tồn tại liên hệ");
            return;
        }
        danhBaList.remove(sdt);
        System.out.println("xoa thanh cong");
    }

    public static void main(String[] args) {
        danhBaList.put("0376264416","NTC");
        Scanner in = new Scanner(System.in);
        int option = -1;
        do{
            mainMenu();
            System.out.println("nhập lựa chọn");
            try{
                option = Integer.parseInt(in.nextLine());
            }catch (Exception e){
                System.out.println("nhap sai dinh dang");
                continue;
            }
            if(option < 1 || option > 5){
                System.out.println("lua chon khong hop le");
                continue;
            }
            switch (option){
                case 1:
                    option1(in);
                    break;
                case 2:
                    option2(in);
                    break;
                case 3:
                    option3(in);
                    break;
                case 4:
                   for(String phone: danhBaList.keySet()){
                       System.out.printf("%s - %s \n", danhBaList.get(phone),phone);
                   }
                    break;
            }
        }while (option != 5);
        in.close();
    }
}
