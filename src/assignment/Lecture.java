package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Lecture {
    private String name;
    private int moduleId;
    private String firstnameProf;
    private String surnameProf;
    private String chairProf;
    private int credits;
    private List<Student> lectureStudents;
    private double lectureAverage; //default "none"

    public Lecture(String name, int moduleId, String firstnameProf, String surnameProf, String chairProf, int credits) {
        this.name = name;
        this.moduleId = moduleId;
        this.firstnameProf = firstnameProf;
        this.surnameProf = surnameProf;
        this.chairProf = chairProf;
        this.credits = credits;
    }

    public Lecture() {
    }
}
