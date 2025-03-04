package com.example.designpattern.decorator;

public abstract class ChucVuDecorator implements ChucVu{

    protected ChucVu nhanVien;

    public ChucVuDecorator(ChucVu nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public void hienThiNhiemVu() {
        nhanVien.hienThiNhiemVu();
    }


}
