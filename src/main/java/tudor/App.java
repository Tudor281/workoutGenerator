package tudor;

import tudor.environments.Environment;
import tudor.environments.HomeCurrent;
import tudor.exercises.FitBodDeduplicator;
import tudor.schedules.All;
import tudor.schedules.Schedule;

public class App {
    public static void main(String[] args) {
        Environment environment = new HomeCurrent();

        Schedule schedule = new All(environment);

        FitBodDeduplicator.tagInsertedExercises();

        schedule.printExercises();
    }
}
