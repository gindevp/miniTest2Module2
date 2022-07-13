import util.ShowStaffFT;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Thêm mới nhân viên:");
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("1: Staff part time\n2: Staff full time");
//        System.out.println("Mời nhập loại nhân viên muốn thêm: ");
//        int choice= scanner.nextInt();
//        switch (choice){
//            case 1:
//                addStaffPastTime(Data.dataArr());
//                break;
//            case 2:
//                addStaffFullTime(Data.dataArr());
//                break;
//        }

        //thực thi chương trình
        util.SalaryUderAvg.listSalaryUnderAvg();
        System.out.println("\nTong luong nhan vien partime trong cty:" + util.Sum.sumNetWage(data.Data.dataArr()));
        System.out.println("\nMang staff ban đầu :");
        ShowStaffFT.listStaffFullTime(data.Data.dataArr());
        System.out.println("\nsắp xep tang dan :");
        util.Sort.listSort(data.Data.dataArr());
    }
//    public static void addStaffPastTime(Staff[] arr){
//        Scanner scanner= new Scanner(System.in);
//        Staff[] staff= new Staff[arr.length+1];
//        for (int i = 0; i < arr.length; i++) {
//            staff[i]=arr[i];
//        }
//        System.out.println("Nhap id:");
//        int staffId= scanner.nextInt();
//        staff[arr.length].setStaffId(staffId);
//        System.out.println("Nhap name:");
//        String name= scanner.nextLine();
//        staff[arr.length].setName(name);
//        System.out.println("Nhap age:");
//        int age = scanner.nextInt();
//        staff[arr.length].setAge(age);
//        System.out.println("Nhap phone number:");
//        int phoneNumber= scanner.nextInt();
//        staff[arr.length]=
//
//
//
//    }
//    public static void addStaffFullTime(){
//
//    }




}
