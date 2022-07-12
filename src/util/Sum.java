package util;

import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;

public class Sum {

    //tinh tong lương toàn cong ty
    public static int sumTotalCompany(Staff[] arr) {
        int sum;
        sum = sumSalary(arr) + sumNetWage(arr);
        return sum;
    }
    //tinh tong lương partime
    public static int sumNetWage(Staff[] arr) {
        int sum = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffPartTime) {
                StaffPartTime y = (StaffPartTime) x;
                sum += y.netWage();
            }
        }
        return sum;
    }
    //tinh tong lương fulltime
    public static int sumSalary(Staff[] arr) {
        int sum = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) x;
                sum += y.getSalary();
            }
        }
        return sum;
    }
}
