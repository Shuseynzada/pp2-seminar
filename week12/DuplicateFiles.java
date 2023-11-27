package week12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) throws IOException {

        long start, end;

        File source = new File("week12/Resources/forCopy/dump.txt");
        File dest = new File("week12/Resources/forCopy/copy-dump.txt");

        start = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                System.out.println("File duplicated successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));

        System.out.println(areFilesIdentical(source, dest));
    }

    public static boolean areFilesIdentical(File file1, File file2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(file1);FileInputStream fis2 = new FileInputStream(file2)) {
            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false;
                }
            }
            return fis1.read() == -1 && fis2.read() == -1; // Check if both files have reached EOF
        }
    }
}
