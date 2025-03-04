package com.example.designpattern.state;

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


    }
}
