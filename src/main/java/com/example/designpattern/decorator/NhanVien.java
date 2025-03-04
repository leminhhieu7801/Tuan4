package com.example.designpattern.decorator;

public class NhanVien extends ChucVuDecorator{

    public NhanVien(ChucVu nhanVien) {
        super(nhanVien);
    }

    @Override
    public void hienThiNhiemVu() {
        super.hienThiNhiemVu();
        System.out.println("Nhiem vu cua nhan vien");

    }
}
