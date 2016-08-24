package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Module {
    private String name;
    private List<Lecture> moduleLectures;
    private double moduleAverage;

    public Module(String name) {
        this.name = name;
    }

    public Module() {
    }

    public String getName() {
        return name;
    }
}
