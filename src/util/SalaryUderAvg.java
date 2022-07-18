package util;

import entity.Staff;
import entity.StaffFullTime;
import java.util.ArrayList;
import java.util.List;


public class SalaryUderAvg {
    static List<Staff> dataStaff= data.Data.dataArr();
    //Hàm trả về mảng có Salary < trung binh
    public static List<Staff> outSalaryUnderAvg(List<Staff> arr, int avg) {
        List<Staff> arrSalaryUnderAvg = new ArrayList<>();

        for (Staff staff : arr) {
            if ((staff instanceof StaffFullTime) && (staff.netWage() < avg)) {
                    arrSalaryUnderAvg.add(staff);
            }
        }
        return arrSalaryUnderAvg;
    }
    //Tinh trung binh salary
    public static int avgSalary(List<Staff> arr) {
        int avgSalary;
        avgSalary = Sum.sumTotalCompany(arr) / arr.size();
        return avgSalary;
    }
    //in ra salary < trung binh
    public static void listSalaryUnderAvg() {

        System.out.println("\nStaff có Salary < trung bình cty: " + avgSalary(dataStaff) + "\n");
        for (Staff staff : outSalaryUnderAvg(dataStaff, avgSalary(dataStaff))
        ) {
            if(staff instanceof StaffFullTime){
                System.out.println(staff);
            }
        }
    }
}
