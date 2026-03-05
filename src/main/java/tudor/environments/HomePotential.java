package tudor.environments;

import tudor.exercises.Exercise;

import static tudor.Flag.NoRoom;
import static tudor.enums.Equipment.*;

public class HomePotential extends Environment {
    public HomePotential() {
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
