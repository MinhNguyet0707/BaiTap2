package entity;

import java.util.Scanner;

public abstract class PerSon {
    protected String name;
    protected String address;
    protected String phone;

    public PerSon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void nhapThongTin_02() {
        System.out.println("Nhập họ và Sinh Viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên SĐT: ");
        this.phone = new Scanner(System.in).nextLine();

    }

}