import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static ArrayList<Employee> employeeListMain= EmployeeFile.readFile();

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee nv1 = new ParttimeEmployee("001", "nv1", 18, "012015487", "nv1@gmail.com", 20);
        Employee nv2 = new ParttimeEmployee("002", "nv2", 20, "014582058", "nv2@gmail.com", 25);
        Employee nv3 = new FullTimeEmployee("003", "nv3", 24, "0214852154", "nv3@gmail.com", 100000, 20000, 300000);
        Employee nv4 = new FullTimeEmployee("004", "nv4", 22, "021485863", "nv4@gmail.com", 30000, 10000, 500000);
        employees.add(nv1);
        employees.add(nv2);
        employees.add(nv3);
        employees.add(nv4);

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách nhân viên: ");
            System.out.println("2. Thêm nhân viên fulltime mới");
            System.out.println("3. Thêm nhân viên parttime mới");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách nhân viên: ");
                    Method.showEmployee(employees);
                    break;
                case 2:
                    employees.add(Method.creatNewFulltimeEmployee());
//                    Method.addNewFulltimeEmployee(employeeListMain);
                    Method.showEmployee(employeeListMain);
                    break;
                case 3:
                    employees.add(Method.creatNewParttimeEmployee());
                    Method.showEmployee(employees);
                    break;

            }
        }
    }
}
