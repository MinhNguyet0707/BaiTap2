package entity;

import constant.loaiMonHoc;

import java.util.Scanner;

public class MonHoc  {
    private static int tang_02 = 0;
    private String maMon;
    private String tenMon;
    private String soDonViHocTrinh;
    private String loaiMon;

    private double diem;
    public MonHoc() {
        if (tang_02 == 0) {
            tang_02 = 99;
        }
        tang_02++;
        this.maMon = String.valueOf(tang_02);
    }



    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getSoDonViHocTrinh() {
        return soDonViHocTrinh;
    }

    public void setSoDonViHocTrinh(String soDonViHocTrinh) {
        this.soDonViHocTrinh = soDonViHocTrinh;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhapThongTin() {
        System.out.println("vui lòng nhập tên môn");
        this.tenMon=new Scanner(System.in).nextLine();
        System.out.println("vui lòng nhập số đơn vị học trình");
        this.soDonViHocTrinh=new Scanner(System.in).nextLine();
        System.out.println("Nhập loại môn học: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Đại cương");
        System.out.println("2. Cơ Sở Ngành");
        System.out.println("3. Chuyên Ngành");
        int loaiMonH;
        do {
            loaiMonH = new Scanner(System.in).nextInt();
            if (loaiMonH>= 1 && loaiMonH <= 8) {
                break;
            }
            System.out.print("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (loaiMonH) {
            case 1:
                this.loaiMon = loaiMonHoc.DaiCuong;
                break;
            case 2:
                this.loaiMon = loaiMonHoc.CoSoNganh;
                break;
            case 3:
                this.loaiMon= loaiMonHoc.ChuyenNganh;
                break;
        }
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMon='" + maMon + '\'' +
                ", tenMon='" + tenMon + '\'' +
                ", soDonViHocTrinh='" + soDonViHocTrinh + '\'' +
                ", loaiMon='" + loaiMon + '\'' +
                '}';
    }
}
