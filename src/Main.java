import entity.MonHoc;
import entity.SinhVien;

import java.util.Scanner;

public class Main {
 public static SinhVien[] sinhvien = new SinhVien[100];
 public static MonHoc[] monhoc = new MonHoc[200];

 public static void main(String[] args) {
  while (true) {
   showMenu();
   int functionChoice = chooseFunction();
   logicHandle(functionChoice);
  }
 }

 private static void logicHandle(int functionChoice) {
  switch (functionChoice) {
   case 1:
    addSinhVien();
    break;
   case 2:
    showAllSinhVien();
    break;
   case 3:
    addMonHocMoi();
    break;
   case 4:
    showAllMonhoc();
    break;
   case 5:
    nhapDiem();
    break;
   case 6:
    inRaDanhSachD();
    break;
   case 7:
    break;
   case 8:
//                    return;
    System.exit(0);

  }
 }

 private static void showAllSinhVien() {
  for (int i = 0; i < sinhvien.length; i++) {
   if (sinhvien[i] != null) {
    System.out.println(sinhvien[i]);
   }
  }
 }

 private static void showAllMonhoc() {
  for (int i = 0; i < monhoc.length; i++) {
   if (monhoc[i] != null) {
    System.out.println(monhoc[i]);
   }
  }
 }

 private static void addSinhVien() {
  System.out.println("Nhập số lượng bạn đọc muốn thêm mới: ");
  int svNum = new Scanner(System.in).nextInt();
  for (int i = 0; i < svNum; i++) {
   SinhVien sv = new SinhVien();
   sv.nhapThongTin_02();
   saveSinhVien(sv);
  }
 }

 private static void addMonHocMoi() {
  System.out.println("Nhập số lượng môn học muốn thêm mới: ");
  int mhNull = new Scanner(System.in).nextInt();
  for (int i = 0; i < mhNull; i++) {
   MonHoc mh = new MonHoc();
   mh.nhapThongTin();
   saveMonHoc(mh);
  }
 }


 private static void saveSinhVien(SinhVien sv) {
  for (int i = 0; i < sinhvien.length; i++) {
   if (sinhvien[i] == null) {
    sinhvien[i] = sv;
    break;
   }
  }
 }

 private static void saveMonHoc(MonHoc mh) {
  for (int i = 0; i < monhoc.length; i++) {
   if (monhoc[i] == null) {
    monhoc[i] = mh;
    break;
   }
  }
 }

 private static void nhapDiem() {
  Scanner sc = new Scanner(System.in);

  for (int i = 0; i < sinhvien.length; i++) {
   if (sinhvien[i] != null) {
    sinhvien[i].setMonHoc(monhoc);
    System.out.println("Sinh vien" + sinhvien[i].getName());
    for (int j = 0; j < monhoc.length; j++) {
     System.out.println("Nhap diem cho mon: " + sinhvien[i].getMonHoc());
     double diem = sc.nextDouble();
     if (diem >= 0 && diem <= 10) {
      sinhvien[i].getMonHoc()[j].setDiem(diem);
     } else {
      j = j - 1;
      System.out.println("vui long nhap lai");
     }
    }
   }
  }

 }

 public static void inRaDanhSachD() {
  for (int i = 0; i < sinhvien.length; i++) {
   if (sinhvien[i] != null) {
    System.out.println("Sinh vien thu" + sinhvien[i].getName());
    for (int j = 0; j < monhoc.length; j++) {
     System.out.println("Mon hoc:  " + sinhvien[i].getMonHoc() + " : ");
     System.out.print(sinhvien[i].getMonHoc()[j].getDiem());
    }
   }
  }
 }

 private static int chooseFunction() {
  System.out.print("Xin mời chọn chức năng: ");
  int functionChoice;
  do {
   functionChoice = new Scanner(System.in).nextInt();
   if (functionChoice >= 1 && functionChoice <= 8) {
    break;
   }
   System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
  } while (true);
  return functionChoice;
 }

 private static void showMenu() {
  System.out.println("-------PHẦN MỀM QUẢN LÝ SINH VIÊN------");
  System.out.println("1. Thêm bạn sinh viên mới");
  System.out.println("2. In ra danh sách sinh viên có trong hồ sơ.");
  System.out.println("3. Thêm môn mới.");
  System.out.println("4. In ra danh sách môn có trong kỳ học .");
  System.out.println("5. nhập điểm cho sinh viên");
  System.out.println("6. in điểm của  sinh viên.");
  System.out.println("7. Tìm kiếm danh sách sinh viên.");
  System.out.println("8. Thoát chương trình.");
 }


}

