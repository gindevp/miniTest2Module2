import Util.Staff;
import Util.StaffFullTime;
import Util.StaffPartTime;

public class Data {
    public static Staff[] dataArr() {
        Staff staff1 = new StaffPartTime(1, "quyet", 21, 929922929, "quyet@ham", 9);
        Staff staff2 = new StaffPartTime(2, "hieu", 21, 929922929, "quyet@ham", 10);
        Staff staff3 = new StaffPartTime(3, "hang", 21, 929922929, "quyet@ham", 20);

        Staff staff4 = new StaffFullTime(4, "phuong", 21, 9292929, "queyeyw@", 12, 2, 0);
        Staff staff5 = new StaffFullTime(5, "ducanh", 21, 9292929, "queyeyw@", 15, 2, 5);
        Staff staff6 = new StaffFullTime(6, "hiep", 21, 9292929, "queyeyw@", 17, 3, 20);
        Staff staff8 = new StaffFullTime(6, "hiep", 21, 9292929, "queyeyw@", 17, 3, 0);
        Staff staff9 = new StaffFullTime(6, "hiep", 21, 9292929, "queyeyw@", 17, 3, 10);
        return new Staff[]{staff1, staff2, staff3, staff4, staff5, staff6, staff8, staff9};
    }
}
