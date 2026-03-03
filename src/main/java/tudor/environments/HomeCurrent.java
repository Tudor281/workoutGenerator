package tudor.environments;

import tudor.Exercise;

import java.util.*;

import static tudor.Flag.*;
import static tudor.enums.Equipment.*;

public class HomeCurrent extends Environment {
    public HomeCurrent() {
        availableEquipment.add(Bands);
        availableEquipment.add(Bodyweight);
        availableEquipment.add(Couch);
        availableEquipment.add(Dumbbell);
        availableEquipment.add(ExerciseBall);
        availableEquipment.add(GymMats);
        availableEquipment.add(Bed);


        flaggedExercises.put(Exercise.get("Muscle Up"), NoRoom);
        flaggedExercises.put(Exercise.get("Straight Bar Dip"), NoRoom);
    }
}
