package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Professor extends Person {
    private String chair;
    private List<Lecture> professorLectures;
    private double average; // default "none"

    public Professor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public String getChair() {
        return chair;
    }

    public double getAverage() {
        return average;
    }
}