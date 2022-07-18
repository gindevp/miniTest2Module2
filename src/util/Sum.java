package util;

import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    //tinh tong lương toàn cong ty
    public static int sumTotalCompany(List<Staff> arr) {
        int sum;
        sum = sumSalary(arr) + sumNetWage(arr);
        return sum;
    }
    //tinh tong lương partime
    public static int sumNetWage(List<Staff> arr) {
        int sum = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffPartTime) {
                sum += x.netWage();
            }
        }
        return sum;
    }
    //tinh tong lương fulltime
    public static int sumSalary(List<Staff> arr) {
        int sum = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffFullTime) {
                sum += x.netWage();
            }
        }
        return sum;
    }
}
