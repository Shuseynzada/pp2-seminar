package week10.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File chTask = new File("week10/tasks.csv");
        ArrayList<Task> ts = new ArrayList<>();

        try (Scanner myReader = new Scanner(chTask)) {

            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String tempS = myReader.nextLine();
                Task t = Task.stringToTask(tempS);
                ts.add(t);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        Collections.sort(ts.reversed());

        ArrayList<Task> completableList = getCompletableTasks(700, ts);
        for (Task task : completableList) {
            System.out.println(task);
        }

        System.out.println("Total time: "+ getTotalTime(completableList));
    }

    public static ArrayList<Task> getCompletableTasks(int time, ArrayList<Task> ts) {
        ArrayList<Task> res = new ArrayList<>();

        for (Task task : ts) {
            if (time - task.getDuration() > 0) {
                time -= task.getDuration();
                res.add(task);
            } else if (time <= 0)
                break;
        }

        return res;
    }

    public static int getTotalTime(ArrayList<Task> ts) {
        int res = 0;
        for (Task task : ts) {
            res += task.getDuration();
        }
        return res;
    }
}
