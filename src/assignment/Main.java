package assignment;

import edu.kit.informatik.Terminal;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Main {
    private static boolean run = true;

    /**
     * Main method; splits input into commands and parameters.
     *
     * @param args Commandline parameters
     */
    public static void main(String[] args) {
        StudentPortal studentPortal = new StudentPortal();

        while (run) {
            try {

                String input = Terminal.readLine();
                if (("" + input.charAt(input.length() - 1)).equals("\\W")) {
                    throw new InputException("wrong input format!");
                }

                String[] inputArr = input.split(" ");
                String[] param = null;
                if (inputArr.length > 1) {
                    param = inputArr[1].split(";");
                }
                if (inputArr[0].contains("add")) {
                    Terminal.printLine(studentPortal.add(inputArr, param));
                } else if (inputArr[0].contains("list")) {
                    Terminal.printLine(studentPortal.list(inputArr));
                } else if (inputArr[0].contains("summary")) {
                    Terminal.printLine(studentPortal.summary(inputArr, param));
                } else if (inputArr[0].contains("examination")) {
                    Terminal.printLine(studentPortal.examination(inputArr, param));
                } else if (inputArr[0].equals("reset")) {
                    studentPortal = new StudentPortal();
                } else if (inputArr[0].equals("quit")) {
                    run = false;
                } else {
                    throw new InputException("wrong input format1");
                }

            } catch (InputException e) {
                Terminal.printError(e.getMessage());
            }
        }
    }
}
