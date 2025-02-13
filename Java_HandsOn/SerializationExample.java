import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for serialization

    int rno;
    String name;

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

public class SerializationExample {
    public static void serializeStudent(Student s) {
        try {
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.close(); // Closing the stream
            System.out.println("Serialization Success! Object Saved.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }

    // Deserialization method
    public static void deserializeStudent() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            in.close(); // Closing the stream
            System.out.println("Deserialization Success! Data: " + s.rno + " " + s.name);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(211, "Ravi");

        serializeStudent(s1);

        deserializeStudent();
    }
}
