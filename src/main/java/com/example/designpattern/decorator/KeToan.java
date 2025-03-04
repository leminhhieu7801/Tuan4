package com.example.designpattern.decorator;

public class KeToan extends ChucVuDecorator{

    public KeToan(ChucVu nhanVien) {
        super(nhanVien);
    }

    @Override
    public void hienThiNhiemVu() {
        super.hienThiNhiemVu();
        System.out.println("Nhiem vu cua ke toan");

    }

}
