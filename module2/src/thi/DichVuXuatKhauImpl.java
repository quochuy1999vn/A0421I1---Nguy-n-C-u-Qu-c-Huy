package thi;

import caseStudy.models.Employee;
import caseStudy.utils.ReadAndWrite;
import thi.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DichVuXuatKhauImpl implements DichVuXuatKhau{
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_MASANPHAM = "(SP)[\\d]{5}";
    private static final String REGEX_GIA = "[\\d]";
    private static final String REGEX_SOLUONG = "^[1-9]|([1][0-9])$";
    private static final String REGEX_NHASANXUAT = "[A-Z][a-z]+";
    private static final String REGEX_GIAXUATKHAU = "[\\d]";
    private static final String REGEX_QUOCGIA = "[A-Z][a-z]+";
    private static List<SanPhamXuatKhau> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void themMoi() {
        String id = scanner.nextLine();

        String maSanPham =  nhapMa();

        String ten = nhapTen();

        int gia = Integer.parseInt(nhapGia());

        int soLuong = Integer.parseInt(nhapSoLuong());

        String nsx = nhapNSX();

        int giaXuatKhau = Integer.parseInt(nhapXuatKhau());

        String quocGia = scanner.nextLine();
        SanPhamXuatKhau xuatKhau = new SanPhamXuatKhau(id, maSanPham, ten, gia, soLuong, nsx, giaXuatKhau, quocGia);
        list.add(xuatKhau);
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
    private String nhapXuatKhau() {
        System.out.println("Nhập giá xuất khẩu: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_GIAXUATKHAU, "Bạn đã nhập sai định dạng");
    }
    private String nhapQuocGia() {
        System.out.println("Nhập quốc gia nhập sản phẩm: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_QUOCGIA, "Bạn đã nhập sai định dạng");
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

                SanPhamXuatKhau xuatKhau = new SanPhamXuatKhau();
                list.remove(xuatKhau);
            }
        }
    }

    @Override
    public void hienThi() {
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\thi\\data\\products.csv");
        for (SanPhamXuatKhau xuatKhau : list) {
            System.out.println(xuatKhau.toString());
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập id tìm");
        String id = "";
        try {
            id = scanner.nextLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        boolean getId = getId(id);
        for (int i = 0; i < list.size(); i++) {
            if (getId) {

                SanPhamXuatKhau xuatKhau = new SanPhamXuatKhau();
                list.contains(xuatKhau);
            }
        }
    }

    public boolean getId(String id) {
        for (SanPhamXuatKhau xuatKhau : list) {
            if (xuatKhau.getIdSanPham().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
