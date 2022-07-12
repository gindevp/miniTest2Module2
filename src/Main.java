import Util.Staff;
import Util.StaffFullTime;
import Util.StaffPartTime;

public class Main {
    public static void main(String[] args) {
        Sevirce.listSalaryUnderAvg();
        System.out.println("Tong luong nhan vien partime trong cty:" + Sevirce.sumNetWage(Data.dataArr()));


    }




}
