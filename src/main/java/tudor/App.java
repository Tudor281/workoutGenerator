package tudor;

import tudor.environments.Environment;
import tudor.environments.HomeCurrent;
import tudor.exercises.*;
import tudor.schedules.All;
import tudor.schedules.Schedule;

public class App {
    public static void main(String[] args) {
        Exercise.buildStructure();
        MuscleAndStrength.init();
        FitBod.init();
        Tudors.init();

        Flag.flagExercises();
        FitBodDeduplicator.merge();

        Environment environment = new HomeCurrent();

        Schedule schedule = new All(environment);

        schedule.printExercises();
    }
}
