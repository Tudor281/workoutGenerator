package tudor.schedules;

import tudor.Exercise;
import tudor.environments.Environment;

import java.util.List;

import static tudor.enums.ExerciseType.Strength;

public class Primary4 extends Schedule {

    public Primary4(Environment environment) {
        super(environment);
    }

    public void printExercises() {
        System.out.println("Chest");
        List<Exercise> exercises = findExercises(List.of("Push Ups"), List.of(), Strength);
        pick("Push Ups", exercises, 1);

        exercises = findExercises(List.of("Bench Presses"), List.of(), Strength);
        pick("Bench Presses", exercises, 2);

        exercises = findExercises(List.of("Flys"), List.of(), Strength);
        pick("Flys", exercises, 2);

        exercises = findExercises(List.of("Chest"), List.of("Bench Presses", "Flys", "Push Ups"), Strength);
        pick("Other chests", exercises, 1);

        System.out.println("Legs");
        exercises = findExercises(List.of("Squats", "Lunges"), List.of(), Strength);
        pick("Primary legs", exercises, 3);

        exercises = findExercises(List.of("Quads"), List.of("Squats", "Lunges"), Strength);
        exercises.addAll(findExercises(List.of("Hamstrings"), List.of(), Strength));
        exercises.addAll(findExercises(List.of("Glutes"), List.of(), Strength));
        exercises.addAll(findExercises(List.of("Abductors"), List.of(), Strength));
        exercises.addAll(findExercises(List.of("Adductors"), List.of(), Strength));
        pick("Other legs", exercises, 3);

        System.out.println("Shoulders");
        exercises = findExercises(List.of("Mixed Shoulders"), List.of(), Strength);
        pick("Primary Shoulders", exercises, 2);
        exercises = findExercises(List.of("Rear Delts"), List.of(), Strength);
        pick("Rear Delts", exercises, 2);
        exercises = findExercises(List.of("Shoulders"), List.of("Mixed Shoulders", "Rear Delts"), Strength);
        pick("Other Shoulders", exercises, 2);

        System.out.println("Back");
        exercises = findExercises(List.of("Lat Pull Down"), List.of(), Strength);
        pick("Lat Pull Down", exercises, 1);
        exercises = findExercises(List.of("Lats"), List.of("Lat Pull Down"), Strength);
        pick("Other lats", exercises, 2);
        exercises = findExercises(List.of("Upper Back"), List.of(), Strength);
        pick("Upper Back", exercises, 2);
        exercises = findExercises(List.of("Lower Back"), List.of(), Strength);
        pick("Lower Back", exercises, 1);

        System.out.println("Abs");
        exercises = findExercises(List.of("Abs"), List.of(), Strength);
        pick("Abs", exercises, 4);
    }
}
