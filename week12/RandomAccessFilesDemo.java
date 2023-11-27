package week12;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFilesDemo {
    public static void main(String[] args) {
        String filename = "week12/Resources/random/numbers.dat";

        try {
            generateFileWithRandomIntegers(filename, 10, 10);

            readFromFile(filename);
            System.out.println();

            readFromFile(filename, 7, 5);
            System.out.println();

            readKIntegersReversed(filename, 10);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void generateFileWithRandomIntegers(String filename, int length, int upperBound) throws IOException {
        Random rand = new Random(42);
        try (FileOutputStream fos = new FileOutputStream(filename); DataOutputStream dos = new DataOutputStream(fos)) {

            for (int i = 0; i < length; i++) {
                int r = rand.nextInt(upperBound + 1);
                System.out.println(r);
                dos.writeInt(r);
            }
        }
    }

    static void readFromFile(String filename) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            int length = (int) raf.length();
            byte[] data = new byte[length];
            raf.readFully(data);
            for (int i = 0; i < length; i += 4) {
                int value = (data[i] << 24) | ((data[i + 1] & 0xFF) << 16) | ((data[i + 2] & 0xFF) << 8)
                        | (data[i + 3] & 0xFF);
                System.out.println(value);
            }
        }
    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            raf.seek(offset * 4);
            for (int i = 0; i < count; i++) {
                int value = raf.readInt();
                System.out.println(value);
            }
        }catch (EOFException e){
            e.printStackTrace();
        }
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            long length = raf.length() / 4; // Each integer is 4 bytes
            long startOffset = Math.max(0, length - k);

            raf.seek(startOffset * 4);
            for (long i = startOffset; i < length; i++) {
                int value = raf.readInt();
                System.out.println(value);
            }
        }
    }
}
