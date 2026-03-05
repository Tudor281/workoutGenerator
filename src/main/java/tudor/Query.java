package tudor;

import tudor.environments.Environment;
import tudor.environments.HomePotential;
import tudor.exercises.Exercise;
import tudor.exercises.Folder;

public class Query {
    public static void main(String[] args) {
        Environment environment = new HomePotential();

        listFolder(Folder.all.get("Other Chest"), environment);
    }

    private static void listFolder(Folder folder, Environment environment) {
        for (Exercise exercise : folder.exercises) {
            if (environment.hasEquipment(exercise)) {
                System.out.println(exercise.name);
            }
        }
    }
}
