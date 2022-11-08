package entity;

public class SinhVien extends PerSon {
    private static int tang = 0;
    private String maSinhVien;
    private String Lop;

    private MonHoc[] monHoc;

    public SinhVien() {
        if (tang == 0) {
            tang = 9999;
        }
        tang++;
        this.maSinhVien = String.valueOf(tang);
    }

    public SinhVien(String maSinhVien, String lop, MonHoc[] monHoc) {
        this.maSinhVien = maSinhVien;
        Lop = lop;
        this.monHoc = monHoc;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public MonHoc[] getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc[] monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
