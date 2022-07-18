package data;

import entity.Staff;
import entity.StaffFullTime;
import entity.StaffPartTime;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Staff> dataArr() {

        StaffPartTime staff1 = new StaffPartTime(1, "quyet", 21, 929922929, "quyet@ham", 9);
        StaffPartTime staff2 = new StaffPartTime(2, "hieu", 21, 929922929, "quyet@ham", 10);
        StaffPartTime staff3 = new StaffPartTime(3, "hang", 21, 929922929, "quyet@ham", 20);

        StaffFullTime staff4 = new StaffFullTime(4, "phuong", 21, 9292929, "queyeyw@", 12, 2, 6);
        StaffFullTime staff5 = new StaffFullTime(5, "ducanh", 21, 9292929, "queyeyw@", 15, 2, 5);
        StaffFullTime staff6 = new StaffFullTime(6, "hiep", 21, 9292929, "queyeyw@", 17, 3, 20);
        StaffFullTime staff8 = new StaffFullTime(7, "quyet", 21, 9292929, "queyeyw@", 17, 3, 3);
        StaffFullTime staff9 = new StaffFullTime(8, "hieu", 21, 9292929, "queyeyw@", 17, 3, 10);
        ArrayList<Staff> staff = new ArrayList<>();
        staff.add(staff1);
        staff.add(staff2);
        staff.add(staff3);
        staff.add(staff4);
        staff.add(staff5);
        staff.add(staff6);
        staff.add(staff8);
        staff.add(staff9);

        return staff;
    }
}
