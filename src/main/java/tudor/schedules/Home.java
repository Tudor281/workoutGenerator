package tudor.schedules;

import tudor.Exercise;
import tudor.environments.Environment;

import java.util.List;

import static tudor.enums.ExerciseType.Strength;

public class Home extends Schedule {

    public Home(Environment environment) {
        super(environment);
    }

    @Override
    public void printExercises() {
        System.out.println("Chest");
        List<Exercise> exercises = findExercises(List.of("Chest"), List.of());
        pick("Chest", exercises, 2);

        System.out.println("Back");
        exercises = findExercises(List.of("Back"), List.of());
        pick("Back", exercises, 2);

        System.out.println("Shoulders");
        exercises = findExercises(List.of("Shoulders"), List.of());
        pick("Shoulders", exercises, 1);

        System.out.println("Triceps");
        exercises = findExercises(List.of("Triceps"), List.of());
        pick("Triceps", exercises, 1);

        System.out.println("Legs");
        exercises = findExercises(List.of("Legs", "Calves"), List.of());
        pick("Legs", exercises, 2);

        System.out.println("Abs");
        exercises = findExercises(List.of("Abs"), List.of());
        pick("Abs", exercises, 2);
    }
}
