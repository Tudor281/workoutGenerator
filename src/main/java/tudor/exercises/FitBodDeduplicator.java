package tudor.exercises;

public class FitBodDeduplicator {
    public static void merge() {

        // shoulders
        fitBodHadItAlready("Seated Arnold Press");
        fitBodHadItAlready("(T:Barbell) Military Press (AKA Overhead Press)"); // (FB) Barbell Shoulder Press
        fitBodHadItAlready("Alternating Big Waves Battling Ropes"); // (FB) Battle Ropes
        fitBodHadItAlready("Power Slam Battling Rope"); // (FB) Battle Ropes Outside Slam
        fitBodHadItAlready("Double Arm Circles Battling Ropes"); // (FB) Battle Ropes Outside Spiral
        fitBodHadItAlready("Behind The Neck Push Press"); // (FB) (FB) Behind the Neck Push Press
        fitBodHadItAlready("Cable Face Pull"); // (FB) Cable Face Pull
        fitBodHadItAlready("Cable Front Raise (Bilateral)"); // (FB) Cable Front Raise
        fitBodHadItAlready("Cable Lateral Raise"); // (FB) Cable Lateral Raise
        fitBodHadItAlready("Standing Cable Reverse Fly"); // (FB) Cable Rear Delt Fly
        fitBodHadItAlready("Cable External Rotation"); // (FB) Cable Shoulder External Rotation

        // traps
        fitBodHadItAlready("Barbell Shrug"); // (FB) Barbell Shrug

        //chest
        fitBodHadItAlready("Alternate Dumbbell Bench Press (high start)");
        fitBodHadItAlready("Barbell Bench Press");
        fitBodHadItAlready("Decline Bench Press");
        inserted("(T:Bed) Modified Handstand Push Up (Off Box)");
        fitBodHadItAlready("Incline Bench Press"); // (FB) Barbell Incline Bench Press
        fitBodHadItAlready("Flat Bench Cable Flys"); // (FB) Cable Crossover Flat Bench Fly
        fitBodHadItAlready("Standing High to Low Cable Fly"); // (FB) Cable Crossover Fly
        fitBodHadItAlready("Incline Cable Flys"); // (FB) Cable Crossover Incline Bench Fly

        // upper back
        inserted("One Arm Dumbbell Row");
        inserted("Palms In Bent-Over Dumbbell Row");
        inserted("Tripod Dumbbell Row");
        inserted("(T:Bed) Tripod Dumbbell Row");
        fitBodHadItAlready("Bent Over Row"); // (FB) Bent Over Barbell Row
        fitBodHadItAlready("Seated Cable Row"); // (FB) Cable Row

        // lats
        fitBodHadItAlready("Archer Pull Up");

        // biceps
        inserted("Alternating Seated Hammer Curl");
        fitBodHadItAlready("Barbell Drag Curl");
        fitBodHadItAlready("Standing Barbell Curl");
        inserted("Seated Hammer Curl");
        fitBodHadItAlready("Cable Curl"); // (FB) Cable Bicep Curl
        fitBodHadItAlready("Standing High Pulley Cable Curl"); // (FB) Cable Double Bicep Curl
        fitBodHadItAlready("Cable Preacher Curl"); // (FB) Cable Preacher Curl
        fitBodHadItAlready("Cable Curl (Rope Extension)"); // (FB) Cable Rope Hammer Curls

        // triceps
        fitBodHadItAlready("Lying Dumbbell Extension");
        fitBodHadItAlready("Single Bench Dip"); // (FB) Bench Dip
        fitBodHadItAlready("High Pulley Overhead Tricep Extension (Rope Extension)"); // (FB) Cable Rope Overhead Triceps Extension
        fitBodHadItAlready("Rope Tricep Extension"); // (FB) Cable Rope Tricep Extension

        // abs
        fitBodHadItAlready("Abs Wheel");
        fitBodHadItAlready("Barbell Abdominal Rollouts");
        fitBodHadItAlready("Abdominal Air Bike (AKA Bicycle)"); // (FB) Bicycle Crunch
        fitBodHadItAlready("Contralateral Bird Dog"); // (FB) Bird Dog
        inserted("Bird Dog with Band RNT");
        fitBodHadItAlready("Bodyweight Bulgarian Split Squat"); // (FB) Bodyweight Bulgarian Split Squat

        // lower back
        inserted("Dumbbell Deadlift");
        fitBodHadItAlready("GHD Back Extension");

        // glutes
        fitBodHadItAlready("Banded Good Morning");
        fitBodHadItAlready("Barbell Glute Bridge");
        inserted("(T:Bodyweight) Bodyweight Good Mornings");
        inserted("Single Leg Hip Thrust with Dumbbell");

        // abductors adductors
        fitBodHadItAlready("Cable Hip Abduction"); // (FB) Cable Hip Abduction
        fitBodHadItAlready("Cable Hip Adduction"); // (FB) Cable Hip Adduction

        // quads
        fitBodHadItAlready("Box Jump"); // 1-Step Box Jump, Box Jump
        fitBodHadItAlready("Barbell Back Squat"); // Back Squat
        fitBodHadItAlready("Barbell Lunge"); // (FB) Barbell Lunge
        fitBodHadItAlready("Barbell Front Box Squat"); // (FB) Box Front Squat
        fitBodHadItAlready("Barbell Box Squat"); // (FB) Box Squat

        // calves
        fitBodHadItAlready("Bodyweight Floor Calf Raise");
        fitBodHadItAlready("One-Leg Floor Calf Raise"); // Single Leg Standing Calf Raise
        fitBodHadItAlready("Seated Barbell Calf Raise"); // (FB) Barbell Seated Calf Raise
    }

    private static void inserted(String exerciseName) {
        Folder.rename(exerciseName, "<!> "+exerciseName);
    }

    private static void fitBodHadItAlready(String exerciseName) {
        Folder.delete(exerciseName);
    }
}
