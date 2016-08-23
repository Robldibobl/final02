package final02;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Module {
    private String name;
    private List<Module> moduleNames;
    private List<Module> modules;

    public Module(String name) {
        this.name = name;
    }

    public Module() {
    }

    public String addModule(String[] param) throws InputException {
        Check.checkString(param[1]);

        moduleNames.add(new Module(param[1]));

        return "OK";
    }

    public String listModule() {
        String output = "";

        /////////// Reihenfolge!

        for (int i = 0; i < modules.size(); i++) {
            output += modules.get(i).getId() + " " + modules.get(i).getName() + " "
                    + modules.get(i).getCreditSum() + " " + modules.get(i).getAverage() + "\n";
        }

        output = output.trim();
        return output;
    }

    public List<Module> getModuleNames() {
        return moduleNames;
    }

    public String getName() {
        return name;
    }
}
