package week12;

import java.io.*;

public class ReadWrite {
    public static void writeToTextFile(String filePath, String text) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromTextFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            StringBuilder sb = new StringBuilder();

            while ((data = reader.read()) != -1) {
                sb.append((char) data);
            }

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String readFromTextFileWithCharArray(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            char[] buffer = new char[1024];
            int charsRead;
            StringBuilder sb = new StringBuilder();

            while ((charsRead = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, charsRead);
            }

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String textToWrite = "Hello, this is some text to write to a file.";
        String filePath = "week12/Resources/example.txt";

        writeToTextFile(filePath, textToWrite);

        String content = readFromTextFile(filePath);
        System.out.println("Content read from the file using read():\n" + content);

        String contentWithCharArray = readFromTextFileWithCharArray(filePath);
        System.out.println("Content read from the file using read(char[]):\n" + contentWithCharArray);
    }
}
