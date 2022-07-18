package util;

import entity.Staff;
import entity.StaffFullTime;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    //Trả về mảng đã sắp xếp tăng dần
    public static List<Staff> sort(List<Staff> arr) {
        List<Staff> newStaff = ShowStaffFT.arrStaffFullTime(arr);
        for (int i = 0; i < newStaff.size() - 1; i++) {
            for (int j = i + 1; j < newStaff.size(); j++){
                    Staff y = newStaff.get(i);
                    Staff z = newStaff.get(j);
                    if (y.netWage() > z.netWage()) {
                        Staff temp = y;
                        newStaff.set(i, newStaff.get(j));
                        newStaff.set(j, temp);
                    };
            }
        }
        return newStaff;
    }

    //In ra mảng đã sắp xếp
    public static void listSort(List<Staff> arr) {
        for (Staff x : sort(arr)
        ) {
            if (x instanceof StaffFullTime) {
                System.out.println(x);
            }

        }

    }
}
