package week12;

import java.io.File;

public class FileSystemTraverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path!");
            return;
        }

        String filePath = args[0]; // first argument from command line

        File rootFile = new File(filePath);

        if (!rootFile.exists()) {
            System.out.println("Specified file/directory does not exist!");
            return;
        }

        recPrint(rootFile);

    }

    static void recPrint(File rootPath) {
        if (rootPath.isFile()) {
            printInfo(rootPath);
        } else if (rootPath.isDirectory()) {
            System.out.println("Directory: " + rootPath.getAbsolutePath());
            File[] files = rootPath.listFiles();
            if (files != null) {
                for (File file : files) {
                    recPrint(file);
                }
            }
        }
    }

    static void printInfo(File path) {
        System.out.println("File: " + path.getAbsolutePath());
        System.out.println("Size: " + path.length() + " bytes");
        System.out.println("Last Modified: " + path.lastModified());
        System.out.println("Is Directory: " + path.isDirectory());
        System.out.println("Is Hidden: " + path.isHidden());
        System.out.println("--------");
    }
}
