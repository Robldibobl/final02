package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Lecture {
    private static int idCount = 0;

    private String name;
    private int moduleId;
    private String firstnameProf;
    private String surnameProf;
    private String chairProf;
    private int credits;

    private List<Student> lectureStudents;
    private Exercise exercise;
    private double lectureAverage; //default "none"
    private int id;

    public Lecture(String name, int moduleId, String firstnameProf, String surnameProf, String chairProf, int credits) {
        this.name = name;
        this.moduleId = moduleId;
        this.firstnameProf = firstnameProf;
        this.surnameProf = surnameProf;
        this.chairProf = chairProf;
        this.credits = credits;
        id = ++idCount;
        lectureAverage = 0;
    }

    public Lecture() {
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        String hasExercise;
        String outputAverage = "none";

        if (exercise == null) {
            hasExercise = "No";
        } else {
            hasExercise = "Yes";
        }

        if (lectureAverage != 0) {
            outputAverage = "" + lectureAverage;
        }

        return id + " " + name + " " + hasExercise + " " + credits + " " + outputAverage;
    }
}
