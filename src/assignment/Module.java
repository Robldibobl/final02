package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Module {
    private static int idCount = 0;
    private String name;
    private List<Lecture> moduleLectures;
    private double moduleAverage;
    private int id;

    public Module(String name) {
        this.name = name;
        id = ++idCount;
    }

    public Module() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        int sum = 0;
        for (Lecture val : moduleLectures) {
            sum += val.getCredits();
        }
        return id + " " + name + " " + sum + " " + moduleAverage;
    }
}
