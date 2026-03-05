package tudor.exercises;

public class FitBodDeduplicator {
    public static void tagInsertedExercises() {
        Folder.rename("Palms In Bent-Over Dumbbell Row", "<!> Palms In Bent-Over Dumbbell Row");
        Folder.rename("One Arm Dumbbell Row", "<!> One Arm Dumbbell Row");
        Folder.rename("Seated Hammer Curl", "<!> Seated Hammer Curl");
        Folder.rename("(T) Modified Handstand Push Up (Off Box)", "<!> (T) Modified Handstand Push Up (Off Box)");
    }

    public static void deduplicate() {

    }
}
