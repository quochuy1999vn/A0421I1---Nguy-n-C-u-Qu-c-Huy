package thi;

import java.util.Scanner;

public class QuanLySanPham {
    public void hienThi() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        boolean check = true;
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
        while (check) {
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Sản phẩm nhập khẩu");
            System.out.println("2. Sản phẩm xuất khẩu");
            System.out.println("3. Thoát");
            try {
                choose = scanner.nextInt();
            }catch (Exception e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    hienThiSanPhamNhapKhau();
                    break;
                case 2:
                    hienThiSanPhamXuatKhau();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    public void hienThiSanPhamNhapKhau() {
        DichVuNhapKhauIpml nhapKhau = new DichVuNhapKhauIpml();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        boolean check = true;
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
        while (check) {
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới: ");
            System.out.println("2. Xoá: ");
            System.out.println("3. Xem danh sách các sản phẩm: ");
            System.out.println("4. Tìm kiếm: ");
            System.out.println("5. Thoát: ");
            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    nhapKhau.themMoi();
                    break;
                case 2:
                    nhapKhau.xoa();
                    break;
                case 3:
                    nhapKhau.hienThi();
                    break;
                case 4:
                    nhapKhau.timKiem();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public void hienThiSanPhamXuatKhau() {
        DichVuXuatKhauImpl xuatKhau = new DichVuXuatKhauImpl();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        boolean check = true;
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
        while (check) {
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới: ");
            System.out.println("2. Xoá: ");
            System.out.println("3. Xem danh sách các sản phẩm: ");
            System.out.println("4. Tìm kiếm: ");
            System.out.println("5. Thoát: ");
            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    xuatKhau.themMoi();
                    break;
                case 2:
                    xuatKhau.xoa();
                    break;
                case 3:
                    xuatKhau.hienThi();
                    break;
                case 4:
                    xuatKhau.timKiem();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        QuanLySanPham sanPham = new QuanLySanPham();
        sanPham.hienThi();
    }
}
