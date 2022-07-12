import Util.Staff;
import Util.StaffFullTime;
import Util.StaffPartTime;

public class Main {
    public static void main(String[] args) {
        Sevirce.listSalaryUnderAvg();
        System.out.println("\nTong luong nhan vien partime trong cty:" + Sevirce.sumNetWage(Data.dataArr()));
        System.out.println("\nMang staff ban đầu :");
        Sevirce.listStaffFullTime(Data.dataArr());
        System.out.println("\nsắp xep tang dan :");
        Sevirce.listSort(Data.dataArr());
    }




}
