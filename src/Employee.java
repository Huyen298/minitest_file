import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String employeeId;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public abstract double getNetSalary();

    public Employee() {
    }

    public Employee(String employeeId, String name, int age, String phoneNumber, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
