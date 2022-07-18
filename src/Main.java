import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;
import util.ShowStaffFT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    static Scanner scanner1= new Scanner(System.in);
    static ArrayList<Staff> dataStaff= data.Data.dataArr();
    public static void main(String[] args) {

        System.out.println("Thêm mới nhân viên:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("1: Staff part time\n2: Staff full time");
        System.out.println("Mời nhập loại nhân viên muốn thêm: ");
        int choice= scanner.nextInt();
        switch (choice) {
            case 1 :
                addStaffPastTime(dataStaff);
                System.out.println("list mới đã add :");
                util.ShowStaffPT.listStaffPartTime(dataStaff);
            break;
            case 2 :
                addStaffFullTime(dataStaff);
                System.out.println("list mới đã add :");
                util.ShowStaffFT.listStaffFullTime(dataStaff);
            break;
            default:
                System.out.println("nhap sai r");
        }


//        //thực thi chương trình
//        util.SalaryUderAvg.listSalaryUnderAvg();
//        System.out.println("\nTong luong nhan vien partime trong cty:" + util.Sum.sumNetWage(dataStaff));
//        System.out.println("\nMang staff ban đầu :");
//        ShowStaffFT.listStaffFullTime(dataStaff);
//        System.out.println("\nsắp xep tang dan :");
//        util.Sort.listSort(dataStaff);
    }
    public static void addStaffPastTime(List<Staff> arr){
        StaffPartTime staff= new StaffPartTime();
        System.out.println("Nhap id:");
        staff.setStaffId(scanner.nextInt());
        System.out.println("Nhap name:");
        staff.setName(scanner1.nextLine());
        System.out.println("Nhap age:");
        staff.setAge(scanner.nextInt());
        System.out.println("Nhap phone number:");
        staff.setPhoneNumber(scanner.nextInt());
        System.out.println("Nhap email:");
        staff.setEmail(scanner1.nextLine());
        System.out.println("Thoi gian parttime");
        staff.setWorkTime(scanner.nextInt());
        arr.add(staff);
    }
    public static void addStaffFullTime(List<Staff> arr){
        StaffFullTime staff= new StaffFullTime();
        System.out.println("Nhap id:");
        staff.setStaffId(scanner.nextInt());
        System.out.println("Nhap name:");
        staff.setName(scanner1.nextLine());
        System.out.println("Nhap age:");
        staff.setAge(scanner.nextInt());
        System.out.println("Nhap phone number:");
        staff.setPhoneNumber(scanner.nextInt());
        System.out.println("Nhap email:");
        staff.setEmail(scanner1.nextLine());
        System.out.println("Nhap bonus:");
        staff.setBonus(scanner.nextInt());
        System.out.println("Nhap fines:");
        staff.setFines(scanner.nextInt());
        System.out.println("Nhap salary:");
        staff.setSalary(scanner.nextInt());
        arr.add(staff);
    }




}
