import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; 

    int Eno;
    String Ename;
    transient String email;

    public Employee(int Eno, String Ename, String email) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.email = email;
    }
}

public class EmployeeSerialization {

    public static void serializeEmployee(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            System.out.println("Serialization Success! Object Stored.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }
    public static void deserializeEmployee() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
            Employee emp = (Employee) in.readObject();
            in.close();
            System.out.println("Deserialization Success!");
            System.out.println("Employee Details:");
            System.out.println("Eno: " + emp.Eno);
            System.out.println("Ename: " + emp.Ename);
            System.out.println("Email: " + emp.email); // Will print null since email was transient
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    
        Employee emp1 = new Employee(021, "Harshitha", "abc@example.com");

        serializeEmployee(emp1);

    
        deserializeEmployee();
    }
}

