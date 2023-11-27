package week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "week12/Resources/ex1/data1.dat";
        String data = "Salam";
        writeData(fileName, data);
        System.out.println(readData(fileName));
    }

    static void writeData(String path, String data) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readData(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    sb.append((char) buffer[i]);
                }
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String(sb);
    }
}
