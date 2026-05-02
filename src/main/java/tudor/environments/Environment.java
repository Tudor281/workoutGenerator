package tudor.environments;

import tudor.exercises.Exercise;
import tudor.Flag;
import tudor.enums.Equipment;
import tudor.environments.substitutes.Substitute;

import java.util.*;

public abstract class Environment {
    protected Map<Exercise, Flag> flaggedExercises = new HashMap<>();
    protected Set<Equipment> availableEquipment = new HashSet<>();
    protected List<Substitute> generalSubstitutes = new ArrayList<>();
    Map<Exercise, List<Substitute>> substitutes = new HashMap<>();

    public boolean hasEquipment(Exercise exercise) {
        if (flaggedExercises.containsKey(exercise)) {
            System.out.println(exercise.name+ " is flagged ("+flaggedExercises.get(exercise).name()+")");
            return false;
        }
        for (Equipment equipment : exercise.equipment) {
            if (!(availableEquipment.contains(equipment) || hasSubstitutes(exercise, equipment))) {
                System.out.println(exercise.name + " does not have "+equipment.name());
                return false;
            }
        }
        return true;
    }

    private boolean hasSubstitutes( Exercise exercise, Equipment equipment) {
        // do we have general substitute
        for (Substitute substitute : generalSubstitutes) {
            if (substitute.canSubstitute(equipment)) return true;
        }

        // do we have substitute equipment
        List<Substitute> mySubstitutes = substitutes.get(exercise);
        if (mySubstitutes == null) return false;

        for (Substitute substitute : mySubstitutes) {
            if (substitute.canSubstitute(equipment)) return true;
        }

        return false;
    }
}
