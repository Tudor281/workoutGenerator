package tudor;

import tudor.environments.Environment;
import tudor.environments.HomeCurrent;
import tudor.exercises.Exercise;
import tudor.exercises.FitBodDeduplicator;
import tudor.exercises.MuscleAndStrength;
import tudor.exercises.Tudors;
import tudor.schedules.All;
import tudor.schedules.Schedule;

public class App {
    public static void main(String[] args) {
        Exercise.buildStructure();
        MuscleAndStrength.init();
        Tudors.init();

        FitBodDeduplicator.tagInsertedExercises();
        FitBodDeduplicator.deduplicate();

        Environment environment = new HomeCurrent();

        Schedule schedule = new All(environment);

        schedule.printExercises();
    }
}
