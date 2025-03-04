package com.example.designpattern.stategy;

public class NhanVien {

    private String ten;
    private ChucVu chucVu;

    public NhanVien(String ten, ChucVu chucVu) {
        this.ten = ten;
        this.chucVu = chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public void hienThiThongTin() {
        System.out.println("Nhân viên: " + ten);
        chucVu.hienThiNhiemVu();
        System.out.println();
    }
}
