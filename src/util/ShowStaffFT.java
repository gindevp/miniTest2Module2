package util;

import entity.Staff;
import entity.StaffFullTime;

public class ShowStaffFT {


    //Trả về mảng full time
    public static Staff[] arrStaffFullTime(Staff[] arr){
        int count = 0;
        int countJ = 0;

        for (Staff x : arr
        ) {
            if (x instanceof StaffFullTime) {
                count++;
            }
        }
        Staff[] newStaff = new Staff[count];

        for (Staff x : arr) {
            if (x instanceof StaffFullTime) {
                newStaff[countJ] = x;
                countJ++;
            }
        }
        return newStaff;
    }
    //In ra full time
    public static void listStaffFullTime(Staff[] arr){
        for (Staff x: arr
             ) {
            if(x instanceof StaffFullTime){
                StaffFullTime y= (StaffFullTime) x;
                System.out.println(y.toString());
            }

        }
    }

}
