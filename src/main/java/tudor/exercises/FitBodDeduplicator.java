package tudor.exercises;

public class FitBodDeduplicator {
    public static void merge() {

        // shoulders
        fitBodHadItAlready("Seated Arnold Press");

        //chest
        fitBodHadItAlready("Alternate Dumbbell Bench Press (high start)");
        fitBodHadItAlready("Barbell Bench Press");
        fitBodHadItAlready("Decline Bench Press");
        inserted("(T) Modified Handstand Push Up (Off Box)");

        // upper back
        inserted("One Arm Dumbbell Row");
        inserted("Palms In Bent-Over Dumbbell Row");
        inserted("Tripod Dumbbell Row");
        inserted("(T) Tripod Dumbbell Row");

        // lats
        fitBodHadItAlready("Archer Pull Up");

        // biceps
        inserted("Alternating Seated Hammer Curl");
        fitBodHadItAlready("Barbell Drag Curl");
        fitBodHadItAlready("Standing Barbell Curl");
        inserted("Seated Hammer Curl");

        // triceps
        fitBodHadItAlready("Lying Dumbbell Extension");

        // abs
        fitBodHadItAlready("Abs Wheel");
        fitBodHadItAlready("Barbell Abdominal Rollouts");

        // lower back
        inserted("Dumbbell Deadlift");
        fitBodHadItAlready("GHD Back Extension");

        // quads
        fitBodHadItAlready("Box Jump"); // 1-Step Box Jump
        fitBodHadItAlready("Barbell Back Squat"); // Back Squat

        // glutes
        fitBodHadItAlready("Banded Good Morning");
        fitBodHadItAlready("Barbell Glute Bridge");
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
