public class ParttimeEmployee extends Employee{
    private double workHour;

    @Override
    public double getNetSalary() {
        double result = workHour*100000;
        return result;
    }


    public ParttimeEmployee() {
    }

    public ParttimeEmployee(double workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee(String employeeId, String name, int age, String phoneNumber, String email, double workHour) {
        super(employeeId, name, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{ Mã nhân viên:" +getEmployeeId()+", Tên:"+getName()+
                ", Tuổi:"+getAge()+
                ", Số điện thoại:"+getPhoneNumber()+
                ", Email:"+getEmail()+
                ", Số giờ làm việc = " + workHour +
                '}';
    }
}
