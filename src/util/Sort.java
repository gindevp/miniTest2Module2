package util;

import entity.Staff;
import entity.StaffFullTime;

public class Sort {
    //Trả về mảng đã sắp xếp tăng dần
    public static Staff[] sort(Staff[] arr) {
        Staff[] newStaff=ShowStaffFT.arrStaffFullTime(arr);
        for (int i = 0; i < newStaff.length - 1; i++) {
            for (int j = i + 1; j < newStaff.length; j++) {
                StaffFullTime y = (StaffFullTime) newStaff[i];
                StaffFullTime z = (StaffFullTime) newStaff[j];
                if (y.getSalary() > z.getSalary()) {
                    Staff temp = y;
                    newStaff[i] = newStaff[j];
                    newStaff[j] = temp;
                }
            }
        }
        return newStaff;
    }
    //In ra mảng đã sắp xếp
    public static void listSort(Staff[] arr) {
        for (Staff x : sort(arr)
        ) {
            if (x instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) x;
                System.out.println(y.toString());
            }

        }

    }
}
