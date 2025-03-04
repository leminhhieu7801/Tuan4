package com.example.designpattern.decorator;

public class Main {

    public static void main(String[] args) {
        ChucVu nv1 = new GiamDoc(new NhanVienCoBan());
        ChucVu nv2 = new PhoGiamDoc(new NhanVienCoBan());
        ChucVu nv3 = new KeToan(new NhanVienCoBan());
        ChucVu nv4 = new NhanVien(new NhanVienCoBan());

        System.out.println("Nguyễn Văn A:");
        nv1.hienThiNhiemVu();
        System.out.println();

        System.out.println("Trần Thị B:");
        nv2.hienThiNhiemVu();
        System.out.println();

        System.out.println("Lê Văn C:");
        nv3.hienThiNhiemVu();
        System.out.println();

        System.out.println("Phạm Văn D:");
        nv4.hienThiNhiemVu();
    }
}
