public class FullTimeEmployee extends Employee{
    private double bonus;
    private double fineMoney;
    private double baseSalary;

    @Override
    public double getNetSalary() {
        double result = baseSalary+(bonus-fineMoney);
        return result;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonus, double fineMoney, double baseSalary) {
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public FullTimeEmployee(String employeeId, String name, int age, String phoneNumber, String email, double bonus, double fineMoney, double baseSalary) {
        super(employeeId, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(double fineMoney) {
        this.fineMoney = fineMoney;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{ Mã nhân viên:" + getEmployeeId()+
                ", Tên:"+getName()+
                ", Tuổi:"+getPhoneNumber()+
                ", Số điện thoại:"+getPhoneNumber()+
                ", Email:"+getEmail()+
                ", Thưởng=" + bonus +
                ", Phạt=" + fineMoney +
                ", Lương cứng=" + baseSalary +
                '}';
    }
}
