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
    private String outputAverage;

    /**
     * Constructor of the class Lecture.
     *
     * @param name          Name of a lecture
     * @param moduleId      Module id of the lecture
     * @param firstnameProf Firstname of the professor
     * @param surnameProf   Surname of the professor
     * @param chairProf     Chair of the professor
     * @param credits       Credits of the lecture
     */
    public Lecture(String name, int moduleId, String firstnameProf, String surnameProf, String chairProf, int credits) {
        this.name = name;
        this.moduleId = moduleId;
        this.firstnameProf = firstnameProf;
        this.surnameProf = surnameProf;
        this.chairProf = chairProf;
        this.credits = credits;
        id = ++idCount;
        lectureAverage = 0;
        outputAverage();
    }

    private void calcLectureAverage() {

    }

    private void outputAverage() {
        if (lectureAverage != 0) {
            outputAverage = "" + lectureAverage;
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

    /**
     * Getter for credits.
     *
     * @return Returns credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Getter for lectureAverage.
     *
     * @return Returns lectureAverage
     */
    public double getLectureAverage() {
        return lectureAverage;
    }

    /**
     * Getter for outputAverage.
     *
     * @return Returns outputAverage
     */
    public String getOutputAverage() {
        return outputAverage;
    }

    /**
     * Getter for id.
     *
     * @return Returns id
     */
    public int getId() {
        return id;
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
