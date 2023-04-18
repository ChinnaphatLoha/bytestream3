package lab3;

import java.io.*;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        String name = "Jim Henry";
        int age = 30;
        double weight = 65.5;
        char grade = 'A';

        DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"));
            out.writeUTF(name);
            out.writeInt(age);
            out.writeDouble(weight);
            out.writeChar(grade);
            out.flush();

        DataInputStream in = new DataInputStream(new FileInputStream("data.dat"));
            String readName = in.readUTF();
            int readAge = in.readInt();
            double readWeight = in.readDouble();
            char readGrade = in.readChar();

            System.out.println(readName);
            System.out.println(readAge);
            System.out.println(readWeight);
            System.out.println(readGrade);
    }
}
