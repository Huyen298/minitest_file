import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {
    public static void writeFile(ArrayList<Employee> employeeList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("list.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            oos.close();
            fos.close();
        }
    }
    public static ArrayList<Employee> readFile(){
        File file = new File("list.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            ArrayList<Employee> employeeList = (ArrayList<Employee>) result;
            ois.close();
            fis.close();
            return employeeList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
