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
        fitBodHadItAlready("Cable Internal Rotation"); // (FB) Cable Shoulder Internal Rotation
        fitBodHadItAlready("Incline Rear Delt Fly"); // (FB) Dumbbell Back Fly
        fitBodHadItAlready("Standing Dumbbell Front Raise"); // (FB) Dumbbell Front Raise
        fitBodHadItAlready("Dumbbell Lateral Raise"); // (FB) Dumbbell Lateral Raise
        fitBodHadItAlready("Bent Over Dumbbell Reverse Fly"); // (FB) Dumbbell Rear Delt Raise
        fitBodHadItAlready("One-Arm Seated Dumbbell Shoulder Press"); // (FB) Dumbbell Seated Single Arm Shoulder Press
        fitBodHadItAlready("Seated Dumbbell Press"); // (FB) Dumbbell Shoulder Press
        fitBodHadItAlready("Standing Neutral Grip Dumbbell Shoulder Press"); // (FB) Dumbbell Standing Front Press
        fitBodHadItAlready("One-Arm Neutral Grip Dumbbell Shoulder Press"); // (FB) Dumbbell Standing Single Arm Front Press

        // traps
        fitBodHadItAlready("Barbell Shrug"); // (FB) Barbell Shrug
        fitBodHadItAlready("Cable Shrug"); // (FB) Cable Shrugs
        fitBodHadItAlready("Dumbbell Shrug"); // (FB) Dumbbell Shrug
        fitBodHadItAlready("Dumbbell Upright Row"); // (FB) Dumbbell Upright Row

        //chest
        fitBodHadItAlready("Alternate Dumbbell Bench Press (high start)");
        fitBodHadItAlready("Barbell Bench Press");
        fitBodHadItAlready("Decline Bench Press");
        inserted("(T:Bed) Modified Handstand Push Up (Off Box)");
        fitBodHadItAlready("Incline Bench Press"); // (FB) Barbell Incline Bench Press
        fitBodHadItAlready("Flat Bench Cable Flys"); // (FB) Cable Crossover Flat Bench Fly
        fitBodHadItAlready("Standing High to Low Cable Fly"); // (FB) Cable Crossover Fly
        fitBodHadItAlready("Incline Cable Flys"); // (FB) Cable Crossover Incline Bench Fly
        fitBodHadItAlready("Chest Dip"); // (FB) Chest Dip
        fitBodHadItAlready("Decline Push Up (Feet on Bench)"); // (FB) Decline Push Up
        fitBodHadItAlready("Dumbbell Bench Press"); // (FB) Dumbbell Bench Press
        fitBodHadItAlready("Decline Dumbbell Bench Press"); // (FB) Dumbbell Decline Bench Press
        fitBodHadItAlready("Decline Dumbbell Flys"); // (FB) Dumbbell Decline Fly
        fitBodHadItAlready("Dumbbell Flys"); // (FB) Dumbbell Fly
        fitBodHadItAlready("Incline Dumbbell Bench Press"); // (FB) Dumbbell Incline Bench Press
        fitBodHadItAlready("Incline Dumbbell Flys"); // (FB) Dumbbell Incline Fly
        fitBodHadItAlready("Dumbbell Pullover"); // (FB) Dumbbell Pull Over
        fitBodHadItAlready("Close Grip Dumbbell Press (AKA Crush Press)"); // (FB) Dumbbell Squeeze Press
        fitBodHadItAlready("Exercise Ball Push Up"); // (FB) Exercise Ball Push Up
        fitBodHadItAlready("Floor Press"); // (FB) Floor Press
        fitBodHadItAlready("Pec Foam Rolling"); // (FB) Foam Roll Chest - Alternative

        // upper back
        inserted("One Arm Dumbbell Row");
        inserted("Palms In Bent-Over Dumbbell Row");
        inserted("Tripod Dumbbell Row");
        inserted("(T:Bed) Tripod Dumbbell Row");
        fitBodHadItAlready("Bent Over Row"); // (FB) Bent Over Barbell Row
        fitBodHadItAlready("Seated Cable Row"); // (FB) Cable Row
        fitBodHadItAlready("Bent Over Dumbbell Reverse Fly"); // (FB) Dumbbell Bent Over Reverse Fly
        fitBodHadItAlready("Bent Over Dumbbell Row"); // (FB) Dumbbell Bent Over Row

        // lats
        fitBodHadItAlready("Archer Pull Up");
        fitBodHadItAlready("Chin Up"); // (FB) Chin Up

        // biceps
        inserted("Alternating Seated Hammer Curl");
        fitBodHadItAlready("Barbell Drag Curl");
        fitBodHadItAlready("Standing Barbell Curl");
        inserted("Seated Hammer Curl");
        fitBodHadItAlready("Cable Curl"); // (FB) Cable Bicep Curl
        fitBodHadItAlready("Standing High Pulley Cable Curl"); // (FB) Cable Double Bicep Curl
        fitBodHadItAlready("Cable Preacher Curl"); // (FB) Cable Preacher Curl
        fitBodHadItAlready("Cable Curl (Rope Extension)"); // (FB) Cable Rope Hammer Curls
        fitBodHadItAlready("Close Grip EZ Bar Curl"); // (FB) Close-Grip EZ-Bar Curl
        fitBodHadItAlready("Concentration Curl"); // (FB) Concentration Curl
        fitBodHadItAlready("Alternating Standing Dumbbell Curl"); // (FB) Dumbbell Bicep Curl
        fitBodHadItAlready("Dumbbell Preacher Curl"); // (FB) Dumbbell Preacher Curls
        fitBodHadItAlready("EZ Bar Curl"); // (FB) EZ-Bar Curl

        // triceps
        fitBodHadItAlready("Lying Dumbbell Extension");
        fitBodHadItAlready("Single Bench Dip"); // (FB) Bench Dip
        fitBodHadItAlready("High Pulley Overhead Tricep Extension (Rope Extension)"); // (FB) Cable Rope Overhead Triceps Extension
        fitBodHadItAlready("Rope Tricep Extension"); // (FB) Cable Rope Tricep Extension
        fitBodHadItAlready("Straight Bar Tricep Extension"); // (FB) Cable Tricep Pushdown
        fitBodHadItAlready("Reverse Grip Cable Tricep Extension"); // (FB) Cable Underhand Tricep Pushdown
        fitBodHadItAlready("Close Grip Bench Press"); // (FB) Close-Grip Bench Press
        fitBodHadItAlready("Tricep Dip"); // (FB) Dip
        fitBodHadItAlready("Lying Dumbbell Extension"); // (FB) Dumbbell Skullcrusher
        fitBodHadItAlready("Seated Dumbbell Tricep Extension"); // (FB) Dumbbell Tricep Extension
        fitBodHadItAlready("Standing Overhead EZ Bar Tricep Extension"); // (FB) EZ-Bar Overhead Tricep Extension

        // forearms
        fitBodHadItAlready("Seated Cable Wrist Curl"); // (FB) Cable Wrist Curl

        // abs
        fitBodHadItAlready("Abs Wheel");
        fitBodHadItAlready("Barbell Abdominal Rollouts");
        fitBodHadItAlready("Abdominal Air Bike (AKA Bicycle)"); // (FB) Bicycle Crunch
        fitBodHadItAlready("Contralateral Bird Dog"); // (FB) Bird Dog
        inserted("Bird Dog with Band RNT");
        fitBodHadItAlready("Bodyweight Bulgarian Split Squat"); // (FB) Bodyweight Bulgarian Split Squat
        fitBodHadItAlready("Rotating Mountain Climber"); // (FB) Cross Body Mountain Climber
        fitBodHadItAlready("Ab Crunch"); // "(FB) Crunches"
        fitBodHadItAlready("Dead Bug"); // (FB) Dead Bug
        fitBodHadItAlready("Decline Leg Raise With Hip Thrust"); // (FB) Decline Reverse Crunch
        fitBodHadItAlready("Decline Weighted Twist"); // "(FB) Decline Russian Twists"
        fitBodHadItAlready("Decline Bench Sit Up"); // (FB) Decline Sit Up
        fitBodHadItAlready("Dumbbell Side Bends"); // (FB) Dumbbell Side Bend
        fitBodHadItAlready("Twisting Floor Crunch"); // (FB) Elbow to Knee Crunch
        fitBodHadItAlready("Exercise Ball Crunch"); // (FB) Exercise Ball Crunch

        // lower back
        inserted("Dumbbell Deadlift");
        fitBodHadItAlready("GHD Back Extension");

        // glutes
        fitBodHadItAlready("Banded Good Morning");
        fitBodHadItAlready("Barbell Glute Bridge");
        inserted("(T:Bodyweight) Bodyweight Good Mornings");
        inserted("Single Leg Hip Thrust with Dumbbell");
        fitBodHadItAlready("Glute Foam Rolling"); // (FB) Foam Roll Glutes

        // abductors adductors
        fitBodHadItAlready("Cable Hip Abduction"); // (FB) Cable Hip Abduction
        fitBodHadItAlready("Cable Hip Adduction"); // (FB) Cable Hip Adduction
        fitBodHadItAlready("Adductor Foam Rolling"); // (FB) Foam Roll Hip Adductors

        // quads
        fitBodHadItAlready("Box Jump"); // 1-Step Box Jump, Box Jump
        fitBodHadItAlready("Barbell Back Squat"); // Back Squat
        fitBodHadItAlready("Barbell Lunge"); // (FB) Barbell Lunge
        fitBodHadItAlready("Barbell Front Box Squat"); // (FB) Box Front Squat
        fitBodHadItAlready("Barbell Box Squat"); // (FB) Box Squat
        fitBodHadItAlready("Clean & Jerk"); // (FB) Clean and Jerk
        fitBodHadItAlready("Power Clean from Blocks"); // (FB) Clean from Blocks
        fitBodHadItAlready("Curtsy Lunge (AKA Drop Lunge)"); // (FB) Curtsy Lunge
        fitBodHadItAlready("Double Kettlebell Front Squat"); // (FB) Dual Kettlebell Front Squat
        fitBodHadItAlready("One Leg Dumbbell Squat (AKA Dumbbell Bulgarian Split Squat)"); // (FB) Dumbbell Bulgarian Split Squat
        fitBodHadItAlready("Dumbbell Goblet Squat"); // (FB) Dumbbell Goblet Squat
        fitBodHadItAlready("Dumbbell Lunge"); // (FB) Dumbbell Lunge
        fitBodHadItAlready("Dumbbell Step Up"); // (FB) Dumbbell Step Up
        fitBodHadItAlready("Dumbbell Walking Lunge"); // (FB) Dumbbell Walking Lunge

        // hamstrings
        fitBodHadItAlready("Clean"); // (FB) Clean
        fitBodHadItAlready("Conventional Deadlift"); // (FB) Clean Deadlift ; (FB) Deadlift
        fitBodHadItAlready("Dumbbell Stiff Leg Deadlift"); // (FB) Dumbbell Romanian Deadlift
        fitBodHadItAlready("Hamstring Foam Rolling"); // (FB) Foam Roll Hamstrings

        // calves
        fitBodHadItAlready("Bodyweight Floor Calf Raise");
        fitBodHadItAlready("One-Leg Floor Calf Raise"); // Single Leg Standing Calf Raise
        fitBodHadItAlready("Seated Barbell Calf Raise"); // (FB) Barbell Seated Calf Raise
        fitBodHadItAlready("Posterior Calf Foam Rolling"); // (FB) Foam Roll Calves
    }

    private static void inserted(String exerciseName) {
        Folder.rename(exerciseName, "<!> "+exerciseName);
    }

    private static void fitBodHadItAlready(String exerciseName) {
        Folder.delete(exerciseName);
    }
}
