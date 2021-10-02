package thi;

import java.io.Serializable;

public class SanPhamNhapKhau extends SanPham implements Serializable {
    private int giaNhapKhau;
    private String tinhThanhNhap;
    private int thueNhapKhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(String idSanPham, String maSanPham, String tenSanPham, int gia, int soLuong,
                           String nhaSanXuat, int giaNhapKhau, String tinhThanhNhap, int thueNhapKhau) {
        super(idSanPham, maSanPham, tenSanPham, gia, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(int giaNhapKhau, String tinhThanhNhap, int thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public int getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" + super.toString() +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
