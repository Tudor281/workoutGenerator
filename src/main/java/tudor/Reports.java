package tudor;

import tudor.environments.Environment;
import tudor.environments.HomeCurrent;
import tudor.environments.HomePotential;
import tudor.environments.UnisportsDristor;

public class Reports {
    public static void main(String[] args) {
        Environment environment = new HomeCurrent();

        int abs = reportFolder(Folder.all.get("Abs"), environment);

        int primary = 0;
        primary += reportFolder(Folder.all.get("Chest"), environment);
        primary += reportFolder(Folder.all.get("Legs"), environment);
        primary += reportFolder(Folder.all.get("Back"), environment);
        primary += reportFolder(Folder.all.get("Shoulders"), environment);
        System.out.println("Primary\t" + primary);

        int secondary = 0;
        secondary += reportFolder(Folder.all.get("Biceps"), environment);
        secondary += reportFolder(Folder.all.get("Calves"), environment);
        secondary += reportFolder(Folder.all.get("Triceps"), environment);
        System.out.println("Secondary\t" + secondary);

        int auxiliary = 0;
        auxiliary += reportFolder(Folder.all.get("Forearms"), environment);
        auxiliary += reportFolder(Folder.all.get("Traps"), environment);
        System.out.println("Auxiliary\t" + auxiliary);

        int smr = 0;
        smr += reportFolder(Folder.all.get("IT Band"), environment);
        smr += reportFolder(Folder.all.get("Neck"), environment);
        smr += reportFolder(Folder.all.get("Palmar Fascia"), environment);
        smr += reportFolder(Folder.all.get("Plantar Fascia"), environment);
        System.out.println("SMR\t" + smr);

        System.out.println("Total\t" + (abs+primary+secondary+auxiliary+smr));
    }

    private static int reportFolder(Folder folder, Environment environment) {
        int count = 0;

        for (Folder subFolder : folder.folders) {
            count += reportFolder(subFolder, environment);
        }

        for (Exercise exercise : folder.exercises) {
            if (environment.hasEquipment(exercise)) {
                count ++;
            }
        }

        System.out.println(folder.name + "\t" + count);
        return count;
    }
}
