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
        fitBodHadItAlready("Arm Circles"); // (FB) Forward Arm Circle
        fitBodHadItAlready("Weight Plate Front Raise"); // (FB) Front Plate Raise
        fitBodHadItAlready("Standing One Arm Kettlebell Press"); // (FB) Kettlebell Overhead Press
        fitBodHadItAlready("1 KB Kettlebell Snatch"); // (FB) Kettlebell Snatch
        fitBodHadItAlready("Standing Banded Face Pull"); // (FB) Loop Band Face Pull
        fitBodHadItAlready("Single Arm Banded External Rotation"); // (FB) Loop Band Shoulder External Rotation
        fitBodHadItAlready("Banded Internal Rotation"); // (FB) Loop Band Shoulder Internal Rotation

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
        fitBodHadItAlready("Incline Cable Chest Press"); // (FB) Incline Cable Chest Press
        fitBodHadItAlready("Incline Push Ups"); // (FB) Incline Push Up
        fitBodHadItAlready("(T:Bed) Incline Push Ups"); // (FB:Bed) Incline Push Up

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
        fitBodHadItAlready("Lat Foam Rolling"); // (FB) Foam Roll Lats
        fitBodHadItAlready("Incline Bench Two Arm Dumbbell Row"); // (FB) Incline Dumbbell Row
        fitBodHadItAlready("Lat Pull Down"); // (FB) Lat Pulldown
        fitBodHadItAlready("Band Assisted Chin Up (From Foot)"); // (FB) Loop Band Chin Up
        fitBodHadItAlready("Resistance Band Assisted Pull Up (From Foot)"); // (FB) Loop Band Pull Up
        fitBodHadItAlready("Resistance Band Assisted Pull Up (From Foot)"); // (FB) Loop Band Wide Grip Pull Up

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
        fitBodHadItAlready("Alternating Standing Hammer Curl"); // (FB) Hammer Curls
        fitBodHadItAlready("Incline Bench Hammer Curl"); // (FB) Incline Hammer Curl

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
        fitBodHadItAlready("Incline Skull Crusher"); // (FB) Incline Barbell Skull Crusher

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
        fitBodHadItAlready("Exercise Ball Plank"); // (FB) Forward Stability Ball Plank
        fitBodHadItAlready("Hanging Knee Raise"); // (FB) Hanging Knee Raise
        fitBodHadItAlready("Hanging Leg Raise"); // (FB) Hanging Leg Raise
        fitBodHadItAlready("Hanging Knee Raise With Twist"); // (FB) Hanging Oblique Knee Raise
        fitBodHadItAlready("Landmine Rotation"); // (FB) Landmine Core Rotation
        fitBodHadItAlready("Lying Floor Leg Raise"); // (FB) Leg Raise

        // lower back
        inserted("Dumbbell Deadlift");
        fitBodHadItAlready("GHD Back Extension");
        fitBodHadItAlready("Hyperextension"); // (FB) Incline Back Extension

        // glutes
        fitBodHadItAlready("Banded Good Morning");
        fitBodHadItAlready("Barbell Glute Bridge");
        inserted("(T:Bodyweight) Bodyweight Good Mornings");
        inserted("Single Leg Hip Thrust with Dumbbell");
        fitBodHadItAlready("Glute Foam Rolling"); // (FB) Foam Roll Glutes
        fitBodHadItAlready("Bodyweight Glute Bridge"); // (FB) Hip Thrust

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
        fitBodHadItAlready("Quad Foam Rolling"); // (FB) Foam Roll Quadriceps
        fitBodHadItAlready("Front Squat"); // (FB) Front Squat
        fitBodHadItAlready("Hang Clean"); // (FB) Hang Clean
        fitBodHadItAlready("Kettlebell Goblet Squat"); // (FB) Kettlebell Goblet Squat
        fitBodHadItAlready("1 KB Kettlebell Jerk"); // (FB) Kettlebell Jerk
        fitBodHadItAlready("1 KB Kettlebell Clean"); // (FB) Kettlebell Power Clean
        fitBodHadItAlready("Kettlebell Reverse Lunge"); // (FB) Kettlebell Racked Reverse Lunge
        fitBodHadItAlready("Landmine Goblet Squat"); // (FB) Landmine Squat

        // hamstrings
        fitBodHadItAlready("Clean"); // (FB) Clean
        fitBodHadItAlready("Conventional Deadlift"); // (FB) Clean Deadlift ; (FB) Deadlift
        fitBodHadItAlready("Dumbbell Stiff Leg Deadlift"); // (FB) Dumbbell Romanian Deadlift
        fitBodHadItAlready("Hamstring Foam Rolling"); // (FB) Foam Roll Hamstrings
        fitBodHadItAlready("Glute Ham Raise (GHR)"); // (FB) Glute Ham Raise
        fitBodHadItAlready("Good Mornings"); // (FB) Good Morning
        fitBodHadItAlready("Inchworm"); // (FB) Inchworm
        fitBodHadItAlready("Double Kettlebell Suitcase Deadlift"); // (FB) Kettlebell Suitcase Deadlift
        fitBodHadItAlready("Kettlebell Swing"); // (FB) Kettlebell Swing
        fitBodHadItAlready("Banded Good Morning"); // (FB) Loop Band Good Morning

        // calves
        fitBodHadItAlready("Bodyweight Floor Calf Raise");
        fitBodHadItAlready("One-Leg Floor Calf Raise"); // Single Leg Standing Calf Raise
        fitBodHadItAlready("Seated Barbell Calf Raise"); // (FB) Barbell Seated Calf Raise
        fitBodHadItAlready("Posterior Calf Foam Rolling"); // (FB) Foam Roll Calves
        fitBodHadItAlready("Jump Rope"); // (FB) Jump Rope
        fitBodHadItAlready("Reverse Jump Rope"); // (FB) Jump Rope Reverse
    }

    private static void inserted(String exerciseName) {
        Folder.rename(exerciseName, "<!> "+exerciseName);
    }

    private static void fitBodHadItAlready(String exerciseName) {
        Folder.delete(exerciseName);
    }
}
