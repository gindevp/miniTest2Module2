package util;

import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;

import java.util.ArrayList;
import java.util.List;

public class ShowStaffPT {


    //Trả về mảng part time
    public static List<Staff> arrStaffPartTime(List<Staff> arr){
        List<Staff> newStaff = new ArrayList<>();

        for (Staff x : arr) {
            if (x instanceof StaffPartTime) {
                newStaff.add(x);
            }
        }
        return newStaff;
    }
    //In ra part time
    public static void listStaffPartTime(List<Staff> arr){
        for (Staff x: arr
        ) {
            if(x instanceof StaffPartTime){
                System.out.println(x);
            }

        }
    }

}
