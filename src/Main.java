import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;
import util.Add;
import util.ShowStaffFT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ArrayList<Staff> dataStaff= data.Data.dataArr();
    public static void main(String[] args) {
        //thực thi chương trình
        //show in ra lương nhỏ hơn lương tb
        util.SalaryUderAvg.listSalaryUnderAvg();
        //show tổng lương nhân viên
        System.out.println("\nTong luong nhan vien partime trong cty:" + util.Sum.sumNetWage(dataStaff));
        //show mảng staff full time ban đầu
        System.out.println("\nMang staff full time ban đầu :");
        ShowStaffFT.listStaffFullTime(dataStaff);
        //show mảng đã sx tăng dần
        System.out.println("\nsắp xep tang dan :");
        util.Sort.listSort(dataStaff);
        //show menu
        System.out.println("Thêm mới nhân viên:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("1: Staff part time\n2: Staff full time");
        //lựa chọn
        System.out.println("Mời nhập loại nhân viên muốn thêm: ");
        int choice= scanner.nextInt();
        switch (choice) {
            case 1 :
                Add.addStaffPastTime(dataStaff);
                System.out.println("list mới đã add :");
                util.ShowStaffPT.listStaffPartTime(dataStaff);
            break;
            case 2 :
                Add.addStaffFullTime(dataStaff);
                System.out.println("list mới đã add :");
                util.ShowStaffFT.listStaffFullTime(dataStaff);
            break;
            default:
                System.out.println("nhap sai r");
        }



    }





}
