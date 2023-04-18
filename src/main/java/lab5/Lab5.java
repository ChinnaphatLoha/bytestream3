package lab5;

import java.io.*;

public class Lab5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("11111", "Henry");

        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")));
            out.writeObject(student);
            out.close();

        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data.dat")));
            Student studentFromFile = (Student) in.readObject();
            System.out.println(studentFromFile.id);
            System.out.println(studentFromFile.name);
    }
}
