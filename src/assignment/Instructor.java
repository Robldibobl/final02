package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Instructor extends Person {
    private String chair;
    private List<Instructor> instructors;
    private int exercises;

    public Instructor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public Instructor() {
    }

    public String getChair() {
        return chair;
    }

    public int getExercises() {
        return exercises;
    }
}
