import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    public static List<Employee> employeeList = EmployeeFile.readFile();
    public static void showEmployee(ArrayList<Employee> employeeList){
        for (Employee employee :employeeList) {
            System.out.println(employee);
        }
    }
    public static Employee creatNewParttimeEmployee(){
        System.out.println("Nhập thông tin nhân viên:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập mã nhân viên:");
        String employeeId= scanner.nextLine();
        System.out.println("Nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age= scanner.nextInt();
        String c= scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Nhập gmail:");
        String mail= scanner.nextLine();
        System.out.println("Nhập số giờ làm việc:");
        int workHour= scanner.nextInt();
        Employee employee= new ParttimeEmployee(employeeId,name,age,phone,mail,workHour);
        return employee;
    }
    public static Employee creatNewFulltimeEmployee(){
        System.out.println("Nhập thông tin nhân viên:");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập mã nhân viên:");
        String employeeId= scanner.nextLine();
        System.out.println("Nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age= scanner.nextInt();
        String c= scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        Scanner phoneNumber = new Scanner(System.in);
        String phone = scanner.nextLine();
        System.out.println("Nhập gmail:");
        String mail= scanner.nextLine();
        System.out.println("Nhập tiền thưởng:");
        double bonus = scanner.nextDouble();
        System.out.println("Nhập tiền phạt");
        double fineMoney = scanner.nextDouble();
        System.out.println("Nhập lương cơ bản");
        double baseSalary = scanner.nextDouble();
        Employee employee= new FullTimeEmployee(employeeId,name,age,phone,mail,bonus,fineMoney,baseSalary);
        return employee;
    }

    public static void addNewFulltimeEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }
    public static void addNewFulltimeEmployee(List<Employee> employeeListMain){
        Employee ft = creatNewFulltimeEmployee();
        try {
            EmployeeFile.writeFile((ArrayList<Employee>) employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
