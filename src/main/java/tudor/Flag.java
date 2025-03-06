package tudor;

import java.util.HashMap;
import java.util.Map;

public enum Flag {
    Dangerous,
    FootOnBench,
    Greedy,
    Impossible,
    NoRoom,
    TooDifficult;

    public static final Map<Exercise, Flag> flaggedExercises = new HashMap<>();
    static {
        flaggedExercises.put(Exercise.get("Smith Machine Leg Press"), Dangerous);
        flaggedExercises.put(Exercise.get("Seated Behind the Neck Shoulder Press"), Dangerous);
        flaggedExercises.put(Exercise.get("Chin Up"), TooDifficult);
    }
}
