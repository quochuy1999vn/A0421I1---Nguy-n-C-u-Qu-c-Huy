package com.connectbackend.quanLyBenhAn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String maBenhNhan;
    private String tenBenhNhan;

    @OneToMany(mappedBy = "benhNhan")
    private List<BenhAn> benhAn;

    public BenhNhan() {
    }

    public BenhNhan(int id, String maBenhNhan, String tenBenhNhan) {
        this.id = id;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }
}
