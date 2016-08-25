package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Exercise extends Studies {
    private String name;
    private int lectureId;
    private int moduleId;
    private String firstnameInstr;
    private String surnameInstr;
    private String chairInstr;
    private int examCompetences;
    private List<Exercise> exercises;
    private List<Student> exerciseStudents;
    private int id;
    private List<Student> examCompetence;

    /**
     * Constructor of the class Exercise.
     *
     * @param name           Name of the exercise
     * @param lectureId      Lecture id of the exercise
     * @param firstnameInstr Firstname of the instructor
     * @param surnameInstr   Surname of the instructor
     * @param chairInstr     Chair of the instructor
     */
    public Exercise(String name, int lectureId, String firstnameInstr, String surnameInstr, String chairInstr) {
        this.name = name;
        this.lectureId = lectureId;
        this.firstnameInstr = firstnameInstr;
        this.surnameInstr = surnameInstr;
        this.chairInstr = chairInstr;
        id = getIdCount();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lectureId + " " + moduleId + " " + firstnameInstr + " " + surnameInstr + " "
                + chairInstr + " " + examCompetences;
    }
}
