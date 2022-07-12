import Util.Staff;
import Util.StaffFullTime;
import Util.StaffPartTime;

public class Sevirce {
//Hàm trả về mảng có Salary < trung binh
    public static Staff[] outSalaryUnderAvg(Staff[] arr, int avg) {
        int count = 0;
        int j = 0;
        for (Staff x : arr
        ) {
            if (x instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) x;
                if (y.getSalary() < avg) {
                    count++;
                }
            }
        }
        Staff[] arrSalaryUnderAvg = new Staff[count];
        for (Staff staff : arr) {
            if (staff instanceof StaffFullTime) {
                StaffFullTime y = (StaffFullTime) staff;
                if (y.getSalary() < avg) {

                    arrSalaryUnderAvg[j] = staff;
                    j++;
                }
            }
        }
        return arrSalaryUnderAvg;
    }
//Tinh trung binh salary
    public static int avgSalary(Staff[] arr) {
        int avgSalary;
        avgSalary = sumTotalCompany(arr) / arr.length;
        return avgSalary;
    }
//in ra salary < trung binh
    public static void listSalaryUnderAvg() {
        System.out.println("\nStaff có Salary < trung bình cty: " + avgSalary(Data.dataArr()) + "\n");
        for (Staff x : outSalaryUnderAvg(Data.dataArr(), avgSalary(Data.dataArr()))
        ) {
            StaffFullTime y = (StaffFullTime) x;
            System.out.println(y.toString());
        }
    }
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
//Trả về mảng đã sắp xếp tăng dần
    public static Staff[] sort(Staff[] arr) {
        Staff[] newStaff=arrStaffFullTime(arr);
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
