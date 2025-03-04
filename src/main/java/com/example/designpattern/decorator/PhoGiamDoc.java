package com.example.designpattern.decorator;

public class PhoGiamDoc extends ChucVuDecorator{

    public PhoGiamDoc(ChucVu nhanVien) {
        super(nhanVien);
    }

    @Override
    public void hienThiNhiemVu() {
        super.hienThiNhiemVu();
        System.out.println("Nhiem vu cua pho giam doc");
    }
}
