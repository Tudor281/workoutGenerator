package tudor.exercises;

public class FitBodDeduplicator {
    public static void merge() {

        //chest
        inserted("(T) Modified Handstand Push Up (Off Box)");

        // upper back
        inserted("One Arm Dumbbell Row");
        inserted("Palms In Bent-Over Dumbbell Row");
        inserted("Tripod Dumbbell Row");
        inserted("(T) Tripod Dumbbell Row");

        // biceps
        inserted("Alternating Seated Hammer Curl");
        inserted("Seated Hammer Curl");

        // lower back
        inserted("Dumbbell Deadlift");

        // quads
        fitBodHadItAlready("Box Jump"); // 1-Step Box Jump

        // glutes
        fitBodHadItAlready("Banded Good Morning");
        inserted("(T) Bodyweight Good Mornings");
        inserted("Single Leg Hip Thrust with Dumbbell");

        // calves
        fitBodHadItAlready("Bodyweight Floor Calf Raise");
        fitBodHadItAlready("One-Leg Floor Calf Raise"); // Single Leg Standing Calf Raise
    }

    private static void inserted(String exerciseName) {
        Folder.rename(exerciseName, "<!> "+exerciseName);
    }

    private static void fitBodHadItAlready(String exerciseName) {
        Folder.delete(exerciseName);
    }
}
