package com.example.designpattern.decorator;

public class GiamDoc extends ChucVuDecorator{

    public GiamDoc(ChucVu nhanVien) {
        super(nhanVien);
    }

    @Override
    public void hienThiNhiemVu() {
        super.hienThiNhiemVu();
        System.out.println(" Nhiem vu cua giam doc");
    }
}
