package com.connectbackend.quanLyBenhAn.entity;

import javax.persistence.*;

@Entity
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String maBenhAn;

    @ManyToOne(targetEntity = BenhNhan.class)
    private BenhNhan benhNhan;

    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;
    private String phuongPhapDieuTri;
    private String baSiDieuTri;

    public BenhAn() {
    }

    public BenhAn(int id, String maBenhAn, BenhNhan benhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String baSiDieuTri) {
        this.id = id;
        this.maBenhAn = maBenhAn;
        this.benhNhan = benhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.baSiDieuTri = baSiDieuTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getPhuongPhapDieuTri() {
        return phuongPhapDieuTri;
    }

    public void setPhuongPhapDieuTri(String phuongPhapDieuTri) {
        this.phuongPhapDieuTri = phuongPhapDieuTri;
    }

    public String getBaSiDieuTri() {
        return baSiDieuTri;
    }

    public void setBaSiDieuTri(String baSiDieuTri) {
        this.baSiDieuTri = baSiDieuTri;
    }
}
