package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Exercise {
    private static int idCount = 0;
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

    public Exercise(String name, int lectureId, String firstnameInstr, String surnameInstr, String chairInstr) {
        this.name = name;
        this.lectureId = lectureId;
        this.firstnameInstr = firstnameInstr;
        this.surnameInstr = surnameInstr;
        this.chairInstr = chairInstr;
        id = ++idCount;
    }

    public Exercise() {
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lectureId + " " + moduleId + " " + firstnameInstr + " " + surnameInstr + " "
                + chairInstr + " " + examCompetences;
    }
}
