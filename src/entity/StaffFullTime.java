package entity;

public class StaffFullTime extends Staff {
    private int bonus;
    private int fines;
    private int salary;

    public StaffFullTime() {
    }

    public StaffFullTime(int staffId, String name, int age, int phoneNumber, String email, int bonus, int fines, int salary) {
        super(staffId, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int netWage() {
        int sum=0;
        sum= this.salary+(this.bonus-this.fines);
        return sum;
    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
                "staffId=" + this.getStaffId() +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", phoneNumber=" + this.getPhoneNumber() +
                ", email='" + this.getEmail() + '\'' +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salary=" + salary +
                '}';
    }
}
