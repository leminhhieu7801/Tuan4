package com.example.designpattern.stategy;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyễn Văn A", new GiamDoc());
        NhanVien nv2 = new NhanVien("Trần Thị B", new PhoGiamDoc());
        NhanVien nv3 = new NhanVien("Lê Văn C", new KeToan());
        NhanVien nv4 = new NhanVien("Phạm Văn D", new NhanVienChung());

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
        nv4.hienThiThongTin();

        // Thay đổi chức vụ của nhân viên
        nv4.setChucVu(new KeToan());
        System.out.println("Phạm Văn D được thăng chức thành kế toán:");
        nv4.hienThiThongTin();
    }
}
