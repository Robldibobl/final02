package final02;

import edu.kit.informatik.Terminal;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Main {
    private static boolean run = true;

    public static void main(String[] args) {
        StudentPortal studentPortal = new StudentPortal();

        while (run) {
            try {

                String input = Terminal.readLine();
                if (("" + input.charAt(input.length() - 1)).equals("\\W")) {
                    throw new InputException("wrong input format!");
                }

                String[] param = input.split(";");

                if (param[0].substring(0, 2).equals("add")) {
                    Terminal.printLine(studentPortal.add(param));
                } else if (param[0].substring(0, 3).equals("list")) {
                    Terminal.printLine(studentPortal.list(param));
                } else if (param[0].substring(0, 6).equals("summary")) {
                    Terminal.printLine(studentPortal.summary(param));
                } else if (param[0].substring(0, 10).equals("examination")) {
                    Terminal.printLine(studentPortal.examination(param));
                } else if (param[0].equals("reset")) {
                    studentPortal = new StudentPortal();
                } else if (param[0].equals("quit")) {
                    run = false;
                } else {
                    throw new InputException("wrong input format");
                }

            } catch (InputException e) {
                Terminal.printError(e.getMessage());
            }
        }
    }
}
