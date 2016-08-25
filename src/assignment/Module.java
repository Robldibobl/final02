package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Module extends Studies {
    private String name;
    private List<Lecture> moduleLectures = null;
    private double moduleAverage;
    private int id;
    private String outputAverage;

    /**
     * Constructor for the class Module.
     *
     * @param name Name of a module
     */
    public Module(String name) {
        this.name = name;
        id = getIdCount();
        average();
    }

    private void calcModuleAverage() {

    }

    private void average() {
        outputAverage = "none";

        if (moduleAverage != 0) {
            outputAverage = "" + moduleAverage;
        }
    }

    /**
     * Getter for name.
     *
     * @return Returns name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        int sum = 0;
        if (moduleLectures != null) {
            for (Lecture val : moduleLectures) {
                sum += val.getCredits();
            }
        }

        return id + " " + name + " " + sum + " " + outputAverage;
    }
}
