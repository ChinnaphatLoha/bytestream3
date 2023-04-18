package lab4;

import java.io.*;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        String message = "Hello World!";

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.dat"));
            byte[] bytes = message.getBytes();
            bos.write(bytes);
            bos.flush();
            bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.dat"));
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.println(data);
            }
    }
}
