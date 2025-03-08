package tudor;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public enum Flag {
    Dangerous,
    FootOnBench,
    Greedy,
    Impossible,
    NoRoom,
    Jumping,
    TooDifficult;

    public static final Map<Exercise, Flag> flaggedExercises = new HashMap<>();
    static {
        flaggedExercises.put(Exercise.get("Smith Machine Leg Press"), Dangerous);
        flaggedExercises.put(Exercise.get("Seated Behind the Neck Shoulder Press"), Dangerous);
        flaggedExercises.put(Exercise.get("Seated Bradford Press (AKA Seated Rocky Press)"), Dangerous);
        flaggedExercises.put(Exercise.get("Behind The Neck Push Press"), Dangerous);
        flaggedExercises.put(Exercise.get("Kettlebell Swing"), Dangerous);
        flaggedExercises.put(Exercise.get("Ipsilateral Load Split Squat"), Dangerous); // unbalanced
        flaggedExercises.put(Exercise.get("Barbell Front Box Squat"), Dangerous); // daca atingi scaunul, faci inpact in coloana
        flaggedExercises.put(Exercise.get("Barbell Quarter Squat"), Dangerous); // you put even more weight on your knees
        flaggedExercises.put(Exercise.get("Good Mornings Off Pins"), Dangerous);
        flaggedExercises.put(Exercise.get("Single Leg Good Morning"), Dangerous);
        flaggedExercises.put(Exercise.get("Snatch Grip Deficit Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Barbell Sumo Romanian Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Smith Machine Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("American Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Jefferson Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Single Leg Barbell Romanian Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Straight Leg Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("Snatch Grip Romanian Deadlift"), Dangerous);
        flaggedExercises.put(Exercise.get("1 Kettlebell Single Leg Deadlift"), Dangerous);


        flaggedExercises.put(Exercise.get("Barbell Jumping Squats"), Jumping);
        flaggedExercises.put(Exercise.get("Dumbbell Split Squat With Jump"), Jumping);


        // Chest
        flaggedExercises.put(Exercise.get("Chest Dip"), TooDifficult);
        flaggedExercises.put(Exercise.get("Decline Push Up (Feet on Bench)"), TooDifficult);

        // Back
        flaggedExercises.put(Exercise.get("Chin Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("Close Grip Chin Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("Eccentric Only Pull Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("Eccentric Only Chin Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("One Arm Chin Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("Pull Up with Leg Raise"), TooDifficult);
        flaggedExercises.put(Exercise.get("Chin Up With Leg Raise"), TooDifficult);
        flaggedExercises.put(Exercise.get("Double Pause Chin Up"), TooDifficult);
        flaggedExercises.put(Exercise.get("Archer Pull Up"), Dangerous);

        // Legs
        flaggedExercises.put(Exercise.get("Bodyweight Pistol Squat"), TooDifficult);
        flaggedExercises.put(Exercise.get("Front Foot Elevated Smith Machine Split Squat"), TooDifficult);
    }
}
