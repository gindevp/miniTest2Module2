package util;

import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;

import java.util.List;
import java.util.Scanner;

public class Add {
    static Scanner scanner= new Scanner(System.in);
    static Scanner scanner1= new Scanner(System.in);
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
