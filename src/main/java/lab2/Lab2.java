package lab2;

import java.io.*;
public class Lab2 {
    public static void main(String[] args) throws IOException {
        String message = "Hello world!";

            FileOutputStream fos = new FileOutputStream("data.dat");
            byte[] messageBytes = message.getBytes();
            fos.write(messageBytes);
            fos.flush();
            fos.close();

            FileInputStream fis = new FileInputStream("data.dat");
            int content;
            StringBuilder sb = new StringBuilder();
            while ((content = fis.read()) != -1) {
                sb.append((char) content);
            }
            fis.close();

            System.out.println(sb);
    }
}
