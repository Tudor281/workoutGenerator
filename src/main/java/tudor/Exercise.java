package tudor;

import tudor.enums.*;

import java.util.ArrayList;
import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.*;
import static tudor.enums.Group.*;
import static tudor.enums.Level.*;
import static tudor.enums.Mechanics.*;

public class Exercise {
    String name;
    List<Group> mainGroups;
    List<Group> secondaryGroups;
    List<Equipment> equipment;
    Mechanics mechanics;
    ExerciseType type;
    Level level;
    String url;

    static List<Exercise> all = new ArrayList<>();

    static {
        List<Group> none = List.of();

        add("Cable Hip Abduction", Abductors, Strength, List.of(Cable, AnkleStraps), Isolation, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/cable-hip-abduction.html");

        add("Lying Floor Leg Raise", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-floor-leg-raise.html");
        add("Sit Up", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/sit-up.html");
        add("Weighted Crunch", Abs, Strength, Disk, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-crunch.html");
        add("3 Month Position Kettlebell Pullover", Abs, Strength, KettleBells, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/3-month-position-kettlebell-pullover");
        add("Ab Crunch", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ab-crunch");
        add("Abdominal Air Bike (AKA Bicycle)", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/abdominal-air-bike.html");
        add("Abdominal Pendulum", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/abdominal-pendulum.html");
        add("Abdominal Hip Thrust", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hip-thrusts.html");
        add("Alternate Straight Leg Lower", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-straight-leg-lowering");
        add("Alternating Reach And Catch", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-reach-and-catch.html");
        add("Banded Alphabet", Abs, Strength, Bands, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/band-alphabet");
        add("Barbell Abdominal Rollouts", Abs, Strength, Barbell, Compound, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/abdominal-barbell-rollouts.html");
        add("Barbell Climbs", Abs, Strength, Barbell, Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/barbell-climbs");
        add("Barbell Side Bends", Abs, Strength, List.of(Barbell, Bench), Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/barbell-side-bends.html");
        add("Bird Dog with Band RNT", Abs, Strength, Bands, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/bird-dog-with-band-rnt");
        add("Bottoms Up Kettlebell Turkish Get Up", Abs, Strength, KettleBells, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up");
        add("Bottoms Up Kettlebell Turkish Get Up to Hand", Abs, Strength, KettleBells, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-hand");
        add("Bottoms Up Kettlebell Turkish Get Up to Knee", Abs, Strength, KettleBells, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-knee");
        add("Cable Crunch", Abs, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-crunch.html");
        add("Contralateral Bird Dog", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/contralateral-bird-dog");
        add("Dead Bug", Abs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/dead-bug");
        add("Dead Bug with Plates", Abs, Strength, Disk, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/dead-bug-with-plates");
        add("Decline Bench Abdominal Reach", Abs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-abdominal-reach.html");
        add("Decline Bench Alternating Knee Raise", Abs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-alternate-knee-raise.html");
        add("Decline Bench Alternating Leg Raise", Abs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-alternate-leg-raise.html");
        add("Decline Bench Cable Crunch", Abs, Strength, List.of(DeclineBench, Cable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-cable-crunch.html");
        add("Decline Bench Cable Knee Raise", Abs, Strength, List.of(InclineBench, Cable, AnkleStraps), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-cable-knee-raise.html");
        add("Decline Bench Knee Raise", Abs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-knee-raise.html");
        add("Decline Bench Leg Raise", Abs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-leg-raise.html");
        add("Decline Bench Sit Up", Abs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-situp.html");
        add("Decline Bench Sit Up With Twist", Abs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-decline-sit-up.html");
        add("Decline Leg Raise With Hip Thrust", Abs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-leg-raise-with-hip-thrust.html");
        add("Decline Weighted Twist", Abs, Strength, List.of(DeclineBench, Disk), Isolation, Intermediate, List.of(LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/decline-weighted-twist.html");
        add("Dragon Flag", Abs, Strength, Bench, Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/dragon-flag");
        add("Dumbbell Side Bends", Abs, Strength, Dumbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-side-bends.html");
        add("Exercise Ball Crunch", Abs, Strength, ExerciseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/swiss-ball-crunch.html");
        add("Exercise Ball Dead Bug", Abs, Strength, ExerciseBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-dead-bug");
        add("Exercise Ball Hip Roll", Abs, Strength, ExerciseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-hip-roll.html");
        add("Exercise Ball Knee Tuck", Abs, Strength, ExerciseBall, Compound, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/exercise-ball-leg-tuck.html");
        add("Exercise Ball Plank", Abs, Strength, ExerciseBall, Compound, Intermediate, LowerBack, "https://www.muscleandstrength.com/exercises/swiss-ball-hover.html");
        add("Exercise Ball Weighted Sit up", Abs, Strength, List.of(ExerciseBall, Disk), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-exercise-ball-sit-up.html");
        add("Feet Elevated Plank", Abs, Strength, Bench, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/plank-with-feet-on-bench.html");
        add("Floor Crunch (legs on bench)", Abs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-crunch-legs-on-bench.html");
        add("Frog Sit Up", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/frog-sit-up");
        add("Glute Bridge Pallof Press", Abs, Strength, Cable, Compound, Beginner, List.of(Glutes), "https://www.muscleandstrength.com/exercises/glute-bridge-pallof-press");
        add("Half Kneeling Adductor Pallof Press", Abs, Strength, Cable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/half-kneeling-adductor-pallof-press");
        add("Half Kneeling Pallof Press", Abs, Strength, Cable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/half-kneeling-pallof-press");
        add("Half Kneeling Push-Pull", Abs, Strength, DoubleCable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/half-kneeling-push-pull");
        add("Hands Overhead Ab Crunch", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hands-overhead-ab-crunch");
        add("Hanging Knee Raise", Abs, Strength, List.of(FixedUpperBar), Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/hanging-knee-raise.html");
        add("Hanging Knee Raise With Twist", Abs, Strength, List.of(FixedUpperBar), Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/twisting-hanging-knee-raise.html");
        add("Hanging Leg Raise", Abs, Strength, List.of(FixedUpperBar), Isolation, Advanced, Forearms, "https://www.muscleandstrength.com/exercises/hanging-leg-raise.html");
        add("Hollow Body Hold", Abs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/hollow-body-hold");
        add("Ipsilateral Bird Dog", Abs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/ipsilateral-bird-dog");
        add("Jackknife (On Bench)", Abs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bench-jack-knife.html");
        add("Kettlebell Dead Bug", Abs, Strength, KettleBells, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/kettlebell-dead-bug");
        add("Kettlebell Windmill", Abs, Strength, KettleBells, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/kettlebell-windmill");
        add("Kneeling Dumbbell Hold to Stand", Abs, Strength, Dumbell, Compound, Intermediate, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/kneeling-dumbbell-hold-to-stand");
        add("Lower Abdominal Hip Roll", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lower-abdominal-hip-roll.html");
        add("Lower Body Band Resistance Dead Bug", Abs, Strength, Bands, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/lower-body-band-resistance-dead-bug");
        add("Lying Alternate Floor Leg Raise", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-alternate-floor-leg-raise.html");
        add("Lying Alternate Heel Touches", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-heel-touches.html");
        add("Lying Alternating Knee Raise", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-alternate-knee-raise.html");
        add("Lying Cable Crunch", Abs, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-crunch.html");
        add("Lying Cable Knee Raise", Abs, Strength, List.of(Bench, Cable), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-knee-raise.html");
        add("Lying Floor Knee Tuck", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-floor-knee-raise.html");
        add("Lying Knee Tuck to Heel Raise", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/knee-tuck-to-heel-raise");
        add("Lying Leg Raise (On Bench)", Abs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-bench-leg-raise.html");
        add("Lying Leg Raise With Hip Thrust", Abs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-leg-raise-with-hip-thrust.html");
        add("Lying Pallof Press", Abs, Strength, Cable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-pallof-press");
        add("Medicine Ball Dead Bug", Abs, Strength, MedicineBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/medicine-ball-dead-bug");
        add("Medicine Ball Rollouts", Abs, Strength, MedicineBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/medicine-ball-rollouts");
        add("Oblique Cable Crunch", Abs, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-oblique-cable-crunch.html");
        add("One-Leg Lying Cable Knee Raise", Abs, Strength, List.of(Cable, Bench), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-lying-cable-knee-raise.html");
        add("Pallof Press", Abs, Strength, Cable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/pallof-press");
        add("Pallof Press with Rotation", Abs, Strength, Cable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/pallof-press-with-rotation");
        add("Plank", Abs, Strength, Bodyweight, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/hover.html");
        add("Plank to Hip Raise", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/plank-to-hip-raise");
        add("Reach And Catch", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reach-and-catch.html");
        add("Reverse Crunch to Dead Bug", Abs, Strength, KettleBells, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-crunch-to-dead-bug");
        add("Roman Chair Knee Raise", Abs, Strength, RomanChair, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/chair-knee-raise.html");
        add("Roman Chair Leg Raise", Abs, Strength, RomanChair, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/horizontal-leg-raise.html");
        add("Roman Chair Twisting Knee Raise", Abs, Strength, RomanChair, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/chair-twisting-knee-raise.html");
        add("Roman Chair Weighted Knee Raise", Abs, Strength, List.of(RomanChair, Dumbell), Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/weighted-chair-knee-raise.html");
        add("Rotating Crunch (Legs On Bench)", Abs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-bench-crunch.html");
        add("Rotating Mountain Climber", Abs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/rotating-mountain-climber");
        add("Russian Twist", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/russian-twist.html");
        add("Seated Barbell Twist", Abs, Strength, List.of(Bench, Barbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-twist.html");
        add("Seated Barbell Twist (On Floor)", Abs, Strength, Barbell, Isolation, Beginner, Chest, "https://www.muscleandstrength.com/exercises/floor-barbell-twist.html");
        add("Seated Cable Crunch", Abs, Strength, List.of(Bench, Cable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-crunch.html");
        add("Seated Knee Tucks", Abs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-leg-tucks.html");
        add("Shoulder Taps", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/shoulder-taps");
        add("Side Crunch With Leg Lift", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/side-crunch-with-leg-lift.html");
        add("Side Plank", Abs, Strength, Bodyweight, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/side-hover.html");
        add("Split Stance Pallof Press", Abs, Strength, Cable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/split-stance-pallof-press");
        add("Standing Barbell Twist", Abs, Strength, Barbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-barbell-twist.html");
        add("Standing Cable Crunch", Abs, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-cable-crunch.html");
        add("Standing Push-Pull", Abs, Strength, DoubleCable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-push-pull");
        add("Standing Stomach Vacuum", Abs, Strength, Bodyweight, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-stomach-vacuum");
        add("Stir the Pot on Exercise Ball", Abs, Strength, ExerciseBall, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/stir-the-pot-on-exercise-ball");
        add("Straight Leg Dead Bug", Abs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/straight-leg-dead-bug");
        add("Straight Leg Toe Touch (Floor Toe Reach)", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-reach.html");
        add("Tall Kneeling Push-Pull", Abs, Strength, DoubleCable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/tall-kneeling-push-pull");
        add("Turkish Get Up", Abs, Strength, KettleBells, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/turkish-get-up");
        add("Turkish Get Up to Hand", Abs, Strength, KettleBells, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/turkish-get-up-to-hand");
        add("Turkish Get Up to Knee", Abs, Strength, KettleBells, Compound, Intermediate, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/turkish-get-up-to-knee");
        add("Twisting Cable Crunch", Abs, Strength, Cable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-cable-crunch.html");
        add("Twisting Decline Dumbbell Situps", Abs, Strength, List.of(DeclineBench, Dumbell), Compound, Intermediate, LowerBack, "https://www.muscleandstrength.com/exercises/decline-dumbbell-situp.html");
        add("Twisting Floor Crunch", Abs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-floor-crunch.html");
        add("Twisting Lying Cable Crunch", Abs, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-lying-cable-crunch.html");
        add("Upper Body Band Resistance Dead Bug", Abs, Strength, Bands, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/upper-body-band-resisted-dead-bug");
        add("Valslide Body Saw", Abs, SMR, ValSlide, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/valslide-body-saw");
        add("Wall Press 90/90 Extension", Abs, Strength, Wall, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/wall-press-90-90-extension");
        add("Wall Press Heel Tap", Abs, Strength, Wall, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/wall-press-heel-tap");
        add("Wall Press Straight Leg Extension", Abs, Strength, Wall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/wall-press-straight-leg-extension");
        add("Weighted Hanging Knee Raise", Abs, Strength, List.of(FixedUpperBar, Dumbell), Compound, Advanced, Forearms, "https://www.muscleandstrength.com/exercises/weighted-hanging-knee-raise.html");
        add("Weighted Russian Twist", Abs, Strength, List.of(FeetWeight, Disk), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-side-touches.html");
        add("Weighted Straight Leg Toe Touch", Abs, Strength, Disk, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/weighted-straight-leg-toe-touch");
        add("Wide Stance Cable Anti-Rotation", Abs, Strength, Cable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/wide-stance-cable-anti-rotation");

        add("Deep Squat Prying", Adductors, Warmup, KettleBells, Compound, Beginner, List.of(Glutes, Hamstrings, HipFlexors, Quads), "https://www.muscleandstrength.com/exercises/deep-squat-prying");
        add("Rocking Frog Stretch", Adductors, Warmup, Bodyweight, Compound, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/rocking-frog-stretch");
        add("Alternating Lateral Lunge with Overhead Reach", Adductors, Warmup, Bodyweight, Compound, Beginner, List.of(Calves, Hamstrings, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/alternating-lateral-lunge-with-overhead-reach");
        add("Lateral Kneeling Adductor Mobilization", Adductors, Warmup, Bodyweight, Compound, Beginner, Calves, "https://www.muscleandstrength.com/exercises/lateral-kneeling-adductor-mobilization");
        add("Cable Hip Adduction", Adductors, Strength, List.of(Cable, AnkleStraps), Isolation, Beginner, List.of(Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/cable-hip-adduction.html");
        add("Adductor Foam Rolling", Adductors, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/adductor-foam-rolling");

        add("Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/dumbbell-hammer-preacher-curl.html");
        add("Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-dumbbell-curl.html");
        add("Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-barbell-curl.html");
        add("Alternating Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-hammer-preacher-curl.html");
        add("Alternating Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-preacher-curl.html");
        add("Alternating Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-incline-dumbbell-curl.html");
        add("Alternating Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-incline-hammer-curl.html");
        add("Alternating Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-dumbbell-curl.html");
        add("Alternating Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-seated-hammer-curl.html");
        add("Alternating Standing Dumbbell Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternating-standing-dumbbell-curl.html");
        add("Alternating Standing Dumbbell Twisting Curls", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/twisting-standing-dumbbell-curl.html");
        add("Alternating Standing Hammer Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-standing-hammer-curl.html");
        add("Barbell Concentration Curl", Biceps, Strength, ZBar, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-concentration-curl.html");
        add("Barbell Drag Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-drag-curl.html");
        add("Barbell Preacher Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/preacher-curl.html");
        add("Bicep Curl Sled Drag", Biceps, Conditioning, Sled, Compound, Beginner, Abs, "https://www.muscleandstrength.com/exercises/bicep-curl-sled-drag");
        add("Cable Concentration Curl", Biceps, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-concentration-curl.html");
        add("Cable Curl", Biceps, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-curl.html");
        add("Cable Curl (Rope Extension)", Biceps, Strength, Cable, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/rope-cable-curl.html");
        add("Cable Drag Curl", Biceps, Strength, Cable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/cable-drag-curl.html");
        add("Cable Preacher Curl", Biceps, Strength, List.of(PreacherStand, Cable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/preacher-cable-curl.html");
        add("Cable Preacher Curl (Rope Extension)", Biceps, Strength, List.of(PreacherStand, Cable), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/rope-cable-preacher-curl.html");
        add("Close Grip Cable Curl", Biceps, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/close-grip-cable-curl.html");
        add("Close Grip EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/close-grip-ez-bar-curl.html");
        add("Close Grip Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/close-grip-standing-barbell-curl.html");
        add("Concentration Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/concentration-cur.html");
        add("Cross Body Hammer Curl (Pinwheel Curls)", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/hammer-curl-across-the-body.html");
        add("Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/dumbbell-preacher-curl.html");
        add("Exercise Ball Dumbbell Curl", Biceps, Strength, List.of(ExerciseBall, Dumbell), Isolation, Intermediate, Abs, "https://www.muscleandstrength.com/exercises/swiss-ball-dumbbell-curl.html");
        add("Exercise Ball Preacher Curl", Biceps, Strength, List.of(ExerciseBall, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/swiss-ball-preacher-curl.html");
        add("EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-curl.html");
        add("EZ Bar Preacher Curl", Biceps, Strength, List.of(PreacherStand, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-preacher-curl.html");
        add("Hammer Bar Curl", Biceps, Strength, HammerBar, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-hammer-curl.html");
        add("Hammer Bar Preacher Curl", Biceps, Strength, List.of(PreacherStand, HammerBar), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/hammer-bar-preacher-curl.html");
        add("Incline Bench Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/incline-bench-dumbbell-curl.html");
        add("Incline Bench Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-bench-hammer-curl.html");
        add("Incline Cable Bicep Curl", Biceps, Strength, List.of(InclineBench, DoubleCable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-curl-on-incline-bench.html");
        add("Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-hammer-curl.html");
        add("Lateral Pulldown Bicep Curl", Biceps, Strength, LatCable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/cable-underhand-pull-down.html");
        add("Lying Cable Curl (On Floor)", Biceps, Strength, Cable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-cable-curl-floor.html");
        add("Lying Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-dumbbell-curl.html");
        add("Lying High Pulley Cable Curl", Biceps, Strength, List.of(Bench, Cable), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-high-pulley-cable-curl.html");
        add("Lying High Pulley Close Grip Cable Curl", Biceps, Strength, List.of(Bench, Cable), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-high-pulley-close-grip-cable-curl.html");
        add("Lying Incline Bench Barbell Curl", Biceps, Strength, List.of(InclineBench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-barbell-curl-on-incline-bench.html");
        add("Lying Wide Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-wide-dumbbell-curl.html");
        add("One-Arm Cable Curl", Biceps, Strength, Cable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-cable-curl.html");
        add("One-Arm Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-hammer-preacher-curl.html");
        add("One-Arm Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-preacher-curl.html");
        add("One-Arm Prone Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-prone-hammer-dumbbell-curl.html");
        add("One-Arm Prone Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-prone-dumbbell-curl.html");
        add("One-Arm Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-curl.html");
        add("One-Arm Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-seated-hammer-curl.html");
        add("One-Arm Standing Dumbbell Curl", Biceps, Strength, Dumbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-standing-dumbbell-curl.html");
        add("One-Arm Standing Hammer Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-standing-hammer-curl.html");
        add("Prone Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/prone-incline-dumbbell-curl.html");
        add("Prone Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/prone-incline-hammer-curl.html");
        add("Seated Barbell Curl", Biceps, Strength, List.of(Bench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-curl.html");
        add("Seated Cable Curl", Biceps, Strength, List.of(Bench, Cable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-curl.html");
        add("Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-curl.html");
        add("Seated Dumbbell Reverse Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-dumbbell-reverse-curl");
        add("Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-hammer-curl.html");
        add("Seated Zottman Curl", Biceps, Strength, List.of(InclineBench, Dumbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-zottman-curl");
        add("Smith Machine Bicep Curl", Biceps, Strength, SmithMachine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-bicep-curl.html");
        add("Spider Curl", Biceps, Strength, List.of(PreacherStand, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/spider-curl.html");
        add("Squatting Cable Curl", Biceps, Strength, Cable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/squatting-cable-curl.html");
        add("Standing Dumbbell Curl", Biceps, Strength, Dumbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-dumbbell-curl.html");
        add("Standing Dumbbell Drag Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-dumbbell-drag-curl");
        add("Standing Dumbbell Reverse Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-dumbbell-reverse-curl.html");
        add("Standing Hammer Curl", Biceps, Strength, Dumbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-hammer-curl.html");
        add("Standing High Pulley Cable Curl", Biceps, Strength, DoubleCable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-high-pulley-cable-curl.html");
        add("Two-Arm Low Pulley Cable Curl", Biceps, Strength, DoubleCable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-curl.html");
        add("Wide Grip Cable Curl", Biceps, Strength, Cable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-cable-curl.html");
        add("Wide Grip EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-ez-bar-curl.html");
        add("Wide Grip Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-standing-barbell-curl.html");
        add("Zottman Curl", Biceps, Strength, Dumbell, Isolation, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/zottman-curl.html");
        add("Zottman Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbell), Isolation, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/zottman-preacher-curl.html");
    }

    public Exercise(String name, List<Group> mainGroups, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Group> secondaryGroups, String url) {
        this.name = name;
        this.mainGroups = mainGroups;
        this.type = type;
        this.equipment = equipment;
        this.mechanics = mechanics;
        this.level = level;
        this.secondaryGroups = secondaryGroups;
        this.url = url;
    }

    public static void add(String name, List<Group> mainGroups, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Group> secondaryGroups, String url) {
        all.add(new Exercise(name, mainGroups, type, equipment, mechanics, level, secondaryGroups, url));
    }

    public static void add(String name, Group mainGroup, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Group> secondaryGroups, String url) {
        all.add(new Exercise(name, List.of(mainGroup), type, equipment, mechanics, level, secondaryGroups, url));
    }

    public static void add(String name, Group mainGroup, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, Group secondaryGroup, String url) {
        all.add(new Exercise(name, List.of(mainGroup), type, equipment, mechanics, level, List.of(secondaryGroup), url));
    }

    public static void add(String name, Group mainGroup, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, List<Group> secondaryGroups, String url) {
        all.add(new Exercise(name, List.of(mainGroup), exerciseType, List.of(equipment), mechanics, level, secondaryGroups, url));
    }

    public static void add(String name, Group mainGroup, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, Group secondaryGroup, String url) {
        all.add(new Exercise(name, List.of(mainGroup), exerciseType, List.of(equipment), mechanics, level, List.of(secondaryGroup), url));
    }
}
