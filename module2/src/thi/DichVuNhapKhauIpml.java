package thi;

import thi.utils.ReadAndWrite;
import thi.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DichVuNhapKhauIpml implements DichVuNhapKhau{
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_MASANPHAM = "(SP)[\\d]{5}";
    private static final String REGEX_GIA = "[\\d]";
    private static final String REGEX_SOLUONG = "^[1-9]|([1][0-9])$";
    private static final String REGEX_NHASANXUAT = "[A-Z][a-z]+";
    private static final String REGEX_GIANHAPKHAU = "[\\d]";
    private static final String REGEX_TINHTHANH = "[A-Z][a-z]+";
    private static final String REGEX_THUE = "[\\d]";


    private static List<SanPhamNhapKhau> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.println("Nhập id sản phẩm: ");
        String id = scanner.nextLine();

        String maSanPham =  nhapMa();

        String ten = nhapTen();

        int gia = Integer.parseInt(nhapGia());

        int soLuong = Integer.parseInt(nhapSoLuong());

        String nsx = nhapNSX();

        int giaNhapKhau = Integer.parseInt(nhapGiaNhapKhau());

        String tinhThanh = nhapTinhThanh();

        int thue = Integer.parseInt(nhapThue());
        SanPhamNhapKhau nhapKhau = new SanPhamNhapKhau(id, maSanPham, ten, gia, soLuong, nsx, giaNhapKhau, tinhThanh, thue);
        list.add(nhapKhau);
        ReadAndWrite.write(list, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\thi\\data\\products.csv");
    }

    private String nhapMa() {
        System.out.println("Nhập mã sản phẩm: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MASANPHAM, "Bạn đã nhập sai định dạng");
    }
    private String nhapTen() {
        System.out.println("Nhập tên sản phẩm: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng");
    }
    private String nhapGia() {
        System.out.println("Nhập giá: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_GIA, "Bạn đã nhập sai định dạng");
    }
    private String nhapSoLuong() {
        System.out.println("Nhập số lượng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_SOLUONG, "Bạn đã nhập sai định dạng");
    }
    private String nhapNSX() {
        System.out.println("Nhập nhà sản xuất: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_NHASANXUAT, "Bạn đã nhập sai định dạng");
    }
    private String nhapGiaNhapKhau() {
        System.out.println("Nhập giá nhập khẩu: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_GIANHAPKHAU, "Bạn đã nhập sai định dạng");
    }
    private String nhapTinhThanh() {
        System.out.println("Nhập tỉnh thành nhập: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TINHTHANH, "Bạn đã nhập sai định dạng");
    }
    private String nhapThue() {
        System.out.println("Nhập thuế nhập khẩu: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_THUE, "Bạn đã nhập sai định dạng");
    }


    @Override
    public void xoa() {
        System.out.println("Nhập id cần xoá");
        String id = "";
        try {
            id = scanner.nextLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        boolean getId = getId(id);
        for (int i = 0; i < list.size(); i++) {
            if (getId) {

                SanPhamNhapKhau nhapKhau = new SanPhamNhapKhau();
                list.remove(nhapKhau);
            }
        }
    }

    @Override
    public void hienThi() {
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\thi\\data\\products.csv");
        for (SanPhamNhapKhau nhapKhau : list) {
            System.out.println(nhapKhau.toString());
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập id cần tìm:");
        String id = "";
        try {
            id = scanner.nextLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        boolean getId = getId(id);
        for (int i = 0; i < list.size(); i++) {
            if (getId) {

                SanPhamNhapKhau nhapKhau = new SanPhamNhapKhau();
                list.remove(nhapKhau);
            }
        }
    }

    public boolean getId(String id) {
        for (SanPhamNhapKhau nhapKhau : list) {
            if (nhapKhau.getIdSanPham().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
