package tudor.environments;

import tudor.Exercise;
import tudor.Flag;
import tudor.Folder;
import tudor.enums.Equipment;
import tudor.environments.substitutes.DirectSubstitute;
import tudor.environments.substitutes.Substitute;

import java.util.*;

import static tudor.Flag.*;
import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
import static tudor.enums.Level.Beginner;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Mechanics.Isolation;
import static tudor.enums.Muscle.*;

public class HomeCurrent extends Environment {
    public HomeCurrent() {
//        availableEquipment.add(Bands);
        availableEquipment.add(Bodyweight);
        availableEquipment.add(Couch);
//        availableEquipment.add(Dumbbell);
        availableEquipment.add(ExerciseBall);
        availableEquipment.add(GymMats);
        availableEquipment.add(Bed);


        flaggedExercises.put(Exercise.get("Muscle Up"), NoRoom);
        flaggedExercises.put(Exercise.get("Straight Bar Dip"), NoRoom);
    }
}
