package tudor.exercises;

public class FitBodDeduplicator {
    public static void tagInsertedExercises() {
        //chest
        mark("(T) Modified Handstand Push Up (Off Box)");

        // upper back
        mark("Palms In Bent-Over Dumbbell Row");
        mark("One Arm Dumbbell Row");
        mark("Tripod Dumbbell Row");
        mark("(T) Tripod Dumbbell Row");

        // biceps
        mark("Seated Hammer Curl");
        mark("Alternating Seated Hammer Curl");

        // lower back
        mark("Dumbbell Deadlift");

        // glutes
        mark("Single Leg Hip Thrust with Dumbbell");
        mark("(T) Bodyweight Good Mornings");
    }

    private static void mark(String exerciseName) {
        Folder.rename(exerciseName, "<!> "+exerciseName);
    }

    public static void deduplicate() {
        // glutes
        Folder.delete("Banded Good Morning");

        // calves
        Folder.delete("Bodyweight Floor Calf Raise");
    }
}
