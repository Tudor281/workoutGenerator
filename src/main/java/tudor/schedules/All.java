package tudor.schedules;

import tudor.exercises.Exercise;
import tudor.environments.Environment;

import java.util.List;

public class All extends Schedule{

    public All(Environment environment) {
        super(environment);
    }

    @Override
    public void printExercises() {
        System.out.println("Shoulders");
        List<Exercise> exercises = findExercises(List.of("Shoulders"), List.of());
        pick("Shoulders", exercises, 2);

        System.out.println("Chest");
        exercises = findExercises(List.of("Chest"), List.of());
        pick("Chest", exercises, 2);

        System.out.println("Back");
        exercises = findExercises(List.of("Back"), List.of());
        pick("Back", exercises, 2);

        System.out.println("Triceps");
        exercises = findExercises(List.of("Triceps"), List.of());
        pick("Triceps", exercises, 2);

        System.out.println("Biceps");
        exercises = findExercises(List.of("Biceps"), List.of());
        pick("Biceps", exercises, 2);

        System.out.println("Abs");
        exercises = findExercises(List.of("Abs"), List.of());
        pick("Abs", exercises, 2);

        System.out.println("Glutes");
        exercises = findExercises(List.of("Glutes"), List.of());
        pick("Glutes", exercises, 2);

        System.out.println("Quads");
        exercises = findExercises(List.of("Quads"), List.of());
        pick("Quads", exercises, 2);

        System.out.println("Hamstrings");
        exercises = findExercises(List.of("Hamstrings"), List.of());
        pick("Hamstrings", exercises, 2);

        System.out.println("Abductors");
        exercises = findExercises(List.of("Abductors"), List.of());
        pick("Abductors", exercises, 1);

        System.out.println("Calves");
        exercises = findExercises(List.of("Calves"), List.of());
        pick("Calves", exercises, 2);

    }
}
