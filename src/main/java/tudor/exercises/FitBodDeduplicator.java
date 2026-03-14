package tudor.exercises;

public class FitBodDeduplicator {
    public static void tagInsertedExercises() {
        //chest
        Folder.rename("(T) Modified Handstand Push Up (Off Box)", "<!> (T) Modified Handstand Push Up (Off Box)");

        // upper back
        Folder.rename("Palms In Bent-Over Dumbbell Row", "<!> Palms In Bent-Over Dumbbell Row");
        Folder.rename("One Arm Dumbbell Row", "<!> One Arm Dumbbell Row");

        // biceps
        Folder.rename("Seated Hammer Curl", "<!> Seated Hammer Curl");

        // glutes
        Folder.rename("Single Leg Hip Thrust with Dumbbell", "<!> Single Leg Hip Thrust with Dumbbell From Bench");

    }

    public static void deduplicate() {
        // glutes
        Folder.delete("Banded Good Morning");
    }
}
