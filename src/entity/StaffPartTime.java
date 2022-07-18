package entity;

public class StaffPartTime extends Staff {
    private int workTime;

    public StaffPartTime() {
    }

    public StaffPartTime(int staffId, String name, int age , int phoneNumber, String email, int workTime) {
        super(staffId, name, age, phoneNumber, email);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public int netWage() {
        int sum;
        sum= this.workTime* 1;
        return sum;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                "staffId=" + this.getStaffId() +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", phoneNumber=" + this.getPhoneNumber() +
                ", email='" + this.getEmail() + '\'' +
                "workTime=" + workTime +
                '}';
    }
}
