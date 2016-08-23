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
    private List<Lecture> lectures;

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

    public String addLecture(String[] param) throws InputException {
        Check.checkString(param[1]);
        Check.checkInteger(param[2]);
        Check.checkString(param[3]);
        Check.checkString(param[4]);
        Check.checkString(param[5]);
        Check.checkInteger(param[6]);

        lectures.add(new Lecture(param[1], Integer.parseInt(param[2]), param[3], param[4], param[5], Integer.parseInt(param[6])));

        return "OK";
    }

    public String listLecture() {
        String output = "";





        output = output.trim();
        return output;
    }

    public String summLecture(String[] param) {
        String output = "";


        return output;
    }
}
