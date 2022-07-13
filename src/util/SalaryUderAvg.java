package util;

import entity.Staff;
import entity.StaffFullTime;

import javax.xml.crypto.Data;


public class SalaryUderAvg {
    //Hàm trả về mảng có Salary < trung binh
    public static Staff[] outSalaryUnderAvg(Staff[] arr, int avg) {
        int count = 0;
        int j = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) x;
                if (y.getSalary() < avg) {
                    count++;
                }
            }
        }
        Staff[] arrSalaryUnderAvg = new Staff[count];
        for (Staff staff : arr) {
            if (staff instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) staff;
                if (y.getSalary() < avg) {

                    arrSalaryUnderAvg[j] = staff;
                    j++;
                }
            }
        }
        return arrSalaryUnderAvg;
    }
    //Tinh trung binh salary
    public static int avgSalary(Staff[] arr) {
        int avgSalary;
        avgSalary = Sum.sumTotalCompany(arr) / arr.length;
        return avgSalary;
    }
    //in ra salary < trung binh
    public static void listSalaryUnderAvg() {
        System.out.println("\nStaff có Salary < trung bình cty: " + avgSalary(data.Data.dataArr()) + "\n");
        for (Staff x : outSalaryUnderAvg(data.Data.dataArr(), avgSalary(data.Data.dataArr()))
        ) {
            StaffFullTime y = (StaffFullTime) x;
            System.out.println(y.toString());
        }
    }
}
