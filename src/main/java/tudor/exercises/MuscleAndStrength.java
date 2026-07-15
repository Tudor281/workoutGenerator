package tudor.exercises;

import tudor.enums.*;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.*;
import static tudor.enums.Level.*;
import static tudor.enums.Mechanics.*;
import static tudor.enums.Muscle.*;
import static tudor.enums.Muscle.Abductors;
import static tudor.exercises.Exercise.add;
import static tudor.exercises.Exercise.domination;

public class MuscleAndStrength {
    public static void init() {
        List<Muscle> none = List.of();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Abductors
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Abductors");
        add("Cable Hip Abduction", Abductors, Strength, List.of(LowCable, CableAttachmentAnkleStrapsX1), Isolation, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/cable-hip-abduction.html");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Adductors
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Adductors");
        add("Deep Squat Prying", Adductors, Warmup, KettleBellsX1, Compound, Beginner, List.of(Glutes, Hamstrings, HipFlexors, Quads), "https://www.muscleandstrength.com/exercises/deep-squat-prying");
        add("Rocking Frog Stretch", Adductors, Warmup, Bodyweight, Compound, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/rocking-frog-stretch");
        add("Alternating Lateral Lunge with Overhead Reach", Adductors, Warmup, Bodyweight, Compound, Beginner, List.of(Calves, Hamstrings, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/alternating-lateral-lunge-with-overhead-reach");
        add("Lateral Kneeling Adductor Mobilization", Adductors, Warmup, Bodyweight, Compound, Beginner, Calves, "https://www.muscleandstrength.com/exercises/lateral-kneeling-adductor-mobilization");
        add("Cable Hip Adduction", Adductors, Strength, List.of(LowCable, CableAttachmentAnkleStrapsX1, Aerobic_Step), Isolation, Beginner, List.of(Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/cable-hip-adduction.html");
        add("Adductor Foam Rolling", Adductors, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/adductor-foam-rolling");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Abs
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Leg Raise");
        add("Lying Floor Leg Raise", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-floor-leg-raise.html");
        add("Decline Bench Alternating Leg Raise", FrontalAbs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-alternate-leg-raise.html");
        add("Decline Bench Leg Raise", FrontalAbs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-leg-raise.html");
        add("Decline Leg Raise With Hip Thrust", FrontalAbs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-leg-raise-with-hip-thrust.html");
        add("Hanging Leg Raise", FrontalAbs, Strength, List.of(FixedUpperBar), Isolation, Advanced, Forearms, "https://www.muscleandstrength.com/exercises/hanging-leg-raise.html");
        add("Lying Alternate Floor Leg Raise", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-alternate-floor-leg-raise.html");
        add("Roman Chair Leg Raise", FrontalAbs, Strength, RomanChair, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/horizontal-leg-raise.html");
        add("Lying Leg Raise (On Bench)", FrontalAbs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-bench-leg-raise.html");
        add("(T:Bed) Lying Leg Raise (On Bench)", FrontalAbs, Strength, Bed, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-bench-leg-raise.html");
        domination("Lying Leg Raise (On Bench)", "(T:Bed) Lying Leg Raise (On Bench)");
        add("Lying Leg Raise With Hip Thrust", FrontalAbs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-leg-raise-with-hip-thrust.html");
        add("(T:Bed) Lying Leg Raise With Hip Thrust", FrontalAbs, Strength, Bed, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-leg-raise-with-hip-thrust.html");
        domination("Lying Leg Raise With Hip Thrust", "(T:Bed) Lying Leg Raise With Hip Thrust");


        Exercise.currentFolder = Folder.all.get("Knee Raise");
        add("Decline Bench Alternating Knee Raise", FrontalAbs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-alternate-knee-raise.html");
        add("Decline Bench Cable Knee Raise", FrontalAbs, Strength, List.of(InclineBench, FlexiCable, CableAttachmentAnkleStrapsX2), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-cable-knee-raise.html");
        add("Decline Bench Knee Raise", FrontalAbs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-knee-raise.html");
        add("Hanging Knee Raise", FrontalAbs, Strength, FixedUpperBar, Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/hanging-knee-raise.html");
        add("Hanging Knee Raise With Twist", FrontalAbs, Strength, FixedUpperBar, Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/twisting-hanging-knee-raise.html");
        add("Lying Alternating Knee Raise", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-alternate-knee-raise.html");
        add("Lying Cable Knee Raise", FrontalAbs, Strength, List.of(Bench, FlexiCable, CableAttachmentAnkleStrapsX2), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-knee-raise.html");
        add("One-Leg Lying Cable Knee Raise", FrontalAbs, Strength, List.of(FlexiCable, Bench, CableAttachmentAnkleStrapsX1), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-lying-cable-knee-raise.html");
        add("Roman Chair Knee Raise", FrontalAbs, Strength, RomanChair, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/chair-knee-raise.html");
        add("Roman Chair Twisting Knee Raise", FrontalAbs, Strength, RomanChair, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/chair-twisting-knee-raise.html");
        add("Roman Chair Weighted Knee Raise", FrontalAbs, Strength, List.of(RomanChair, Dumbbell), Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/weighted-chair-knee-raise.html");
        add("Weighted Hanging Knee Raise", FrontalAbs, Strength, List.of(FixedUpperBar, Dumbbell), Compound, Advanced, Forearms, "https://www.muscleandstrength.com/exercises/weighted-hanging-knee-raise.html");

        Exercise.currentFolder = Folder.all.get("Sit Up");
        add("Sit Up", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/sit-up.html");
        add("Decline Bench Sit Up", FrontalAbs, Strength, DeclineBench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-situp.html");
        add("Decline Bench Sit Up With Twist", FrontalAbs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-decline-sit-up.html");
        add("Exercise Ball Weighted Sit up", FrontalAbs, Strength, List.of(ExerciseBall, Disk, FeetWeight), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-exercise-ball-sit-up.html");
        add("(T:Non-Weighted) Exercise Ball Non-Weighted Sit up", FrontalAbs, Strength, List.of(ExerciseBall, FeetWeight), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-exercise-ball-sit-up.html");
        add("Frog Sit Up", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/frog-sit-up");
        add("Twisting Decline Dumbbell Situps", FrontalAbs, Strength, List.of(DeclineBench, Dumbbell), Compound, Intermediate, LowerBack, "https://www.muscleandstrength.com/exercises/decline-dumbbell-situp.html");

        Exercise.currentFolder = Folder.all.get("Crunches");
        add("Weighted Crunch", FrontalAbs, Strength, Disk, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-crunch.html");
        add("Ab Crunch", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ab-crunch");
        add("Cable Crunch", FrontalAbs, Strength, List.of(TopCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-crunch.html");
        add("Decline Bench Cable Crunch", FrontalAbs, Strength, List.of(DeclineBench, LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-bench-cable-crunch.html");
        add("Exercise Ball Crunch", FrontalAbs, Strength, ExerciseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/swiss-ball-crunch.html");
        add("Floor Crunch (legs on bench)", FrontalAbs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-crunch-legs-on-bench.html");
        add("(T:Bed) Floor Crunch (legs on bench)", FrontalAbs, Strength, Bed, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-crunch-legs-on-bench.html");
        domination("Floor Crunch (legs on bench)", "(T:Bed) Floor Crunch (legs on bench)");
        add("Hands Overhead Ab Crunch", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hands-overhead-ab-crunch");
        add("Lying Cable Crunch", FrontalAbs, Strength, List.of(LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-crunch.html");
        add("Rotating Crunch (Legs On Bench)", FrontalAbs, Strength, Bench, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-bench-crunch.html");
        add("(T:Bed) Rotating Crunch (Legs On Bench)", FrontalAbs, Strength, Bed, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-bench-crunch.html");
        domination("Rotating Crunch (Legs On Bench)", "(T:Bed) Rotating Crunch (Legs On Bench)");
        add("Seated Cable Crunch", FrontalAbs, Strength, List.of(Bench, TopCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-crunch.html");
        add("Standing Cable Crunch", FrontalAbs, Strength, List.of(TopCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-cable-crunch.html");
        add("Twisting Cable Crunch", FrontalAbs, Strength, List.of(TopCable, CableAttachmentRope), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-cable-crunch.html");
        add("Twisting Floor Crunch", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-floor-crunch.html");
        add("Twisting Lying Cable Crunch", FrontalAbs, Strength, List.of(LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/twisting-lying-cable-crunch.html");

        Exercise.currentFolder = Folder.all.get("Dead Bugs");
        add("Dead Bug", FrontalAbs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/dead-bug");
        add("Dead Bug with Plates", FrontalAbs, Strength, Disk, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/dead-bug-with-plates");
        add("Exercise Ball Dead Bug", FrontalAbs, Strength, ExerciseBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-dead-bug");
        add("Kettlebell Dead Bug", FrontalAbs, Strength, KettleBellsX1, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/kettlebell-dead-bug");
        add("Lower Body Band Resistance Dead Bug", FrontalAbs, Strength, List.of(Bands, Pole), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/lower-body-band-resistance-dead-bug");
        add("Medicine Ball Dead Bug", FrontalAbs, Strength, MedicineBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/medicine-ball-dead-bug");
        add("Reverse Crunch to Dead Bug", FrontalAbs, Strength, KettleBellsX1, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-crunch-to-dead-bug");
        add("Straight Leg Dead Bug", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/straight-leg-dead-bug");
        add("Upper Body Band Resistance Dead Bug", FrontalAbs, Strength, List.of(Bands, Pole), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/upper-body-band-resisted-dead-bug");

        Exercise.currentFolder = Folder.all.get("Pallof Press");
        add("Glute Bridge Pallof Press", FrontalAbs, Strength, List.of(LowCable, CableAttachmentSingleArm), Compound, Beginner, List.of(Glutes), "https://www.muscleandstrength.com/exercises/glute-bridge-pallof-press");
        add("Half Kneeling Adductor Pallof Press", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/half-kneeling-adductor-pallof-press");
        add("Half Kneeling Pallof Press", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/half-kneeling-pallof-press");
        add("Lying Pallof Press", FrontalAbs, Strength, List.of(LowCable, CableAttachmentSingleArm), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-pallof-press");
        add("Pallof Press", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/pallof-press");
        add("Pallof Press with Rotation", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/pallof-press-with-rotation");
        add("Split Stance Pallof Press", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/split-stance-pallof-press");

        Exercise.currentFolder = Folder.all.get("Turkish");
        add("Bottoms Up Kettlebell Turkish Get Up", FrontalAbs, Strength, KettleBellsX1, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up");
        add("Bottoms Up Kettlebell Turkish Get Up to Hand", FrontalAbs, Strength, KettleBellsX1, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-hand");
        add("Bottoms Up Kettlebell Turkish Get Up to Knee", FrontalAbs, Strength, KettleBellsX1, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-knee");
        add("Turkish Get Up", FrontalAbs, Strength, KettleBellsX1, Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/turkish-get-up");
        add("Turkish Get Up to Hand", FrontalAbs, Strength, KettleBellsX1, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/turkish-get-up-to-hand");
        add("Turkish Get Up to Knee", FrontalAbs, Strength, KettleBellsX1, Compound, Intermediate, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/turkish-get-up-to-knee");

        Exercise.currentFolder = Folder.all.get("Twists");
        add("Decline Weighted Twist", FrontalAbs, Strength, List.of(DeclineBench, Disk), Isolation, Intermediate, List.of(LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/decline-weighted-twist.html");
        add("Russian Twist", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/russian-twist.html");
        add("Seated Barbell Twist", FrontalAbs, Strength, List.of(Bench, Barbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-twist.html");
        add("(T:Bed) Seated Barbell Twist", FrontalAbs, Strength, List.of(Bed, Barbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-twist.html");
        domination("Seated Barbell Twist", "(T:Bed) Seated Barbell Twist");
        add("Seated Barbell Twist (On Floor)", FrontalAbs, Strength, Barbell, Isolation, Beginner, Chest, "https://www.muscleandstrength.com/exercises/floor-barbell-twist.html");
        add("Standing Barbell Twist", FrontalAbs, Strength, Barbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-barbell-twist.html");
        add("Weighted Russian Twist", FrontalAbs, Strength, List.of(FeetWeight, Disk), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/weighted-side-touches.html");

        Exercise.currentFolder = Folder.all.get("Planks");
        add("Exercise Ball Plank", FrontalAbs, Strength, ExerciseBall, Compound, Intermediate, LowerBack, "https://www.muscleandstrength.com/exercises/swiss-ball-hover.html");
        add("Feet Elevated Plank", FrontalAbs, Strength, Bench, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/plank-with-feet-on-bench.html");
        add("(T:Bed) Feet Elevated Plank", FrontalAbs, Strength, Bed, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/plank-with-feet-on-bench.html");
        domination("Feet Elevated Plank", "(T:Bed) Feet Elevated Plank");
        add("Plank", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/hover.html");
        add("Plank to Hip Raise", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/plank-to-hip-raise");
        add("Shoulder Taps", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/shoulder-taps");

        Exercise.currentFolder = Folder.all.get("Rollouts");
        add("Barbell Abdominal Rollouts", FrontalAbs, Strength, Barbell, Compound, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/abdominal-barbell-rollouts.html");
        add("Medicine Ball Rollouts", FrontalAbs, Strength, MedicineBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/medicine-ball-rollouts");
        add("Abs Wheel", FrontalAbs, Strength, AbsWheel, Compound, Beginner, List.of(Lats, Chest), "https://www.youtube.com/shorts/ndc391RFNUM");

        Exercise.currentFolder = Folder.all.get("Wall Press");
        add("Wall Press 90/90 Extension", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/wall-press-90-90-extension");
        add("Wall Press Heel Tap", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/wall-press-heel-tap");
        add("Wall Press Straight Leg Extension", FrontalAbs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/wall-press-straight-leg-extension");

        Exercise.currentFolder = Folder.all.get("Bird Dog");
        add("Bird Dog with Band RNT", FrontalAbs, Strength, Bands, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/bird-dog-with-band-rnt");
        add("Contralateral Bird Dog", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/contralateral-bird-dog");
        add("Ipsilateral Bird Dog", FrontalAbs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/ipsilateral-bird-dog");

        Exercise.currentFolder = Folder.all.get("Other Frontal Abs");
        add("3 Month Position Kettlebell Pullover", FrontalAbs, Strength, KettleBellsX1, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/3-month-position-kettlebell-pullover");
        add("Abdominal Air Bike (AKA Bicycle)", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/abdominal-air-bike.html");
        add("Abdominal Pendulum", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/abdominal-pendulum.html");
        add("Abdominal Hip Thrust", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hip-thrusts.html");
        add("Alternate Straight Leg Lower", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-straight-leg-lowering");
        add("Alternating Reach And Catch", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-reach-and-catch.html");
        add("Banded Alphabet", FrontalAbs, Strength, List.of(Bands, Pole), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/band-alphabet");
        add("Barbell Climbs", FrontalAbs, Strength, Barbell, Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/barbell-climbs");
        add("Decline Bench Abdominal Reach", FrontalAbs, Strength, DeclineBench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-abdominal-reach.html");
        add("Dragon Flag", FrontalAbs, Strength, Bench, Compound, Advanced, none, "https://www.muscleandstrength.com/exercises/dragon-flag");
        add("Exercise Ball Hip Roll", FrontalAbs, Strength, ExerciseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-hip-roll.html");
        add("Exercise Ball Knee Tuck", FrontalAbs, Strength, ExerciseBall, Compound, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/exercise-ball-leg-tuck.html");
        add("Half Kneeling Push-Pull", FrontalAbs, Strength, DoubleCable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/half-kneeling-push-pull");
        add("Hollow Body Hold", FrontalAbs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/hollow-body-hold");
        add("Jackknife (On Bench)", FrontalAbs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bench-jack-knife.html");
        add("(T:Bed) Jackknife (On Bench)", FrontalAbs, Strength, Bed, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bench-jack-knife.html");
        domination("Jackknife (On Bench)", "(T:Bed) Jackknife (On Bench)");
        add("(T:GymMats) Jackknife (On Floor)", FrontalAbs, Strength, GymMats, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/bench-jack-knife.html");
        domination("Jackknife (On Bench)", "(T:GymMats) Jackknife (On Floor)");
        add("Kettlebell Windmill", FrontalAbs, Strength, KettleBellsX1, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/kettlebell-windmill");
        add("Kneeling Dumbbell Hold to Stand", FrontalAbs, Strength, Dumbbell, Compound, Intermediate, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/kneeling-dumbbell-hold-to-stand");
        add("Lower Abdominal Hip Roll", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lower-abdominal-hip-roll.html");
        add("Lying Alternate Heel Touches", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-heel-touches.html");
        add("Lying Floor Knee Tuck", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-floor-knee-raise.html");
        add("Lying Knee Tuck to Heel Raise", FrontalAbs, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/knee-tuck-to-heel-raise");
        add("Reach And Catch", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reach-and-catch.html");
        add("Rotating Mountain Climber", FrontalAbs, Strength, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/rotating-mountain-climber");
        add("Seated Knee Tucks", FrontalAbs, Strength, Bench, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-leg-tucks.html");
        add("(T:Bed) Seated Knee Tucks", FrontalAbs, Strength, Bed, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-leg-tucks.html");
        domination("Seated Knee Tucks", "(T:Bed) Seated Knee Tucks");
        add("Standing Push-Pull", FrontalAbs, Strength, DoubleCable, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-push-pull");
        add("Standing Stomach Vacuum", FrontalAbs, Strength, Bodyweight, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-stomach-vacuum");
        add("Stir the Pot on Exercise Ball", FrontalAbs, Strength, ExerciseBall, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/stir-the-pot-on-exercise-ball");
        add("Straight Leg Toe Touch (Floor Toe Reach)", FrontalAbs, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-reach.html");
        add("Tall Kneeling Push-Pull", FrontalAbs, Strength, DoubleCable, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/tall-kneeling-push-pull");
        add("Valslide Body Saw", FrontalAbs, SMR, ValSlide, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/valslide-body-saw");
        add("Weighted Straight Leg Toe Touch", FrontalAbs, Strength, Disk, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/weighted-straight-leg-toe-touch");
        add("Wide Stance Cable Anti-Rotation", FrontalAbs, Strength, List.of(FlexiCable, CableAttachmentRope), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/wide-stance-cable-anti-rotation");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Obliques
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Side Planks");
        add("Side Plank", Obliques, Strength, Bodyweight, Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/side-hover.html");
        add("Side Plank with Hip Dip", Obliques, Strength, Bodyweight, Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/side-plank-with-hip-dip");

        Exercise.currentFolder = Folder.all.get("Chops");
        add("Wood Chop", Obliques, Strength, List.of(TopCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/wood-chop.html");
        add("Half Kneeling Cable Chop", Obliques, Strength, List.of(TopCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/half-kneeling-cable-chop");
        add("Low Cable Wood Chop", Obliques, Strength,  List.of(LowCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/low-wood-chop.html");
        add("Split Stance Cable Chop", Obliques, Strength, List.of(TopCable, CableAttachmentRope), Compound, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/split-stance-cable-chop");
        add("Tall Kneeling Cable Chop", Obliques, Strength, List.of(TopCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/tall-kneeling-cable-chop");

        Exercise.currentFolder = Folder.all.get("Side Bends");
        add("Barbell Side Bends", FrontalAbs, Strength, List.of(Barbell, Bench), Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/barbell-side-bends.html");
        add("(T:Bed) Barbell Side Bends", FrontalAbs, Strength, List.of(Barbell, Bed), Isolation, Beginner, LowerBack, "https://www.muscleandstrength.com/exercises/barbell-side-bends.html");
        domination("Barbell Side Bends", "(T:Bed) Barbell Side Bends");
        add("Dumbbell Side Bends", FrontalAbs, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-side-bends.html");
        add("Alternating Seated Dumbbell Side Bends", Obliques, Strength, List.of(Bench,  Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-side-bends.html");

        Exercise.currentFolder = Folder.all.get("Cable Lifts");
        add("Half Kneeling Cable Lift", Obliques, Strength, List.of(LowCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/half-kneeling-cable-lift");
        add("Split Stance Cable Lift", Obliques, Strength, List.of(LowCable, CableAttachmentRope), Compound, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/split-stance-cable-lift");
        add("Tall Kneeling Cable Lift", Obliques, Strength, List.of(LowCable, CableAttachmentRope), Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/tall-kneeling-cable-lift");

        Exercise.currentFolder = Folder.all.get("Other Obliques");
        add("Landmine Rotation", Obliques, Strength, LandMine, Compound, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/landmine-rotation");
        add("Off Bench Oblique Hold", Obliques, Strength, BenchPress, Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/off-bench-oblique-hold");
        add("Side Crunch (AKA Oblique Crunch)", Obliques, Strength, Bodyweight, Isolation, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/side-crunch.html");
        add("Oblique Cable Crunch", Obliques, Strength, List.of(TopCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-oblique-cable-crunch.html"); // MS zice că e FrontAbs
        add("Side Crunch With Leg Lift", Obliques, Strength, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/side-crunch-with-leg-lift.html"); // MS zice că e FrontAbs

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Biceps
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Preacher Curls");
        add("Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/dumbbell-hammer-preacher-curl.html");
        add("Alternating Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-hammer-preacher-curl.html");
        add("Alternating Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-preacher-curl.html");
        add("Barbell Preacher Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/preacher-curl.html");
        add("Cable Preacher Curl", Biceps, Strength, List.of(PreacherStand, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/preacher-cable-curl.html");
        add("Cable Preacher Curl (Rope Extension)", Biceps, Strength, List.of(PreacherStand, LowCable, CableAttachmentRope), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/rope-cable-preacher-curl.html");
        add("Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/dumbbell-preacher-curl.html");
        add("Exercise Ball Preacher Curl", Biceps, Strength, List.of(ExerciseBall, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/swiss-ball-preacher-curl.html");
        add("EZ Bar Preacher Curl", Biceps, Strength, List.of(PreacherStand, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-preacher-curl.html");
        add("Hammer Bar Preacher Curl", Biceps, Strength, List.of(PreacherStand, HammerBar), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/hammer-bar-preacher-curl.html");
        add("One-Arm Dumbbell Hammer Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-hammer-preacher-curl.html");
        add("One-Arm Dumbbell Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-preacher-curl.html");
        add("Zottman Preacher Curl", Biceps, Strength, List.of(PreacherStand, Dumbbell), Isolation, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/zottman-preacher-curl.html");
        add("Spider Curl", Biceps, Strength, List.of(PreacherStand, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/spider-curl.html");

        Exercise.currentFolder = Folder.all.get("Seated Curls");
        add("Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-dumbbell-curl.html");
        add("Alternating Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-incline-dumbbell-curl.html");
        add("Alternating Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-incline-hammer-curl.html");
        add("Alternating Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-dumbbell-curl.html");
        add("Alternating Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-seated-hammer-curl.html");
        add("(T:Bed) Alternating Seated Hammer Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-seated-hammer-curl.html");
        domination("Alternating Seated Hammer Curl", "(T:Bed) Alternating Seated Hammer Curl");
        add("Concentration Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/concentration-cur.html");
        add("(T:Bed) Concentration Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/concentration-cur.html");
        domination("Concentration Curl", "(T:Bed) Concentration Curl");
        add("Incline Bench Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/incline-bench-dumbbell-curl.html");
        add("Incline Bench Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-bench-hammer-curl.html");
        add("Incline Cable Bicep Curl", Biceps, Strength, List.of(InclineBench, DoubleCable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-curl-on-incline-bench.html");
        add("Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/incline-hammer-curl.html");
        add("Lying Incline Bench Barbell Curl", Biceps, Strength, List.of(InclineBench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-barbell-curl-on-incline-bench.html");
        add("One-Arm Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-curl.html");
        add("(T:Bed) One-Arm Seated Dumbbell Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-curl.html");
        domination("One-Arm Seated Dumbbell Curl", "(T:Bed) One-Arm Seated Dumbbell Curl");
        add("One-Arm Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-seated-hammer-curl.html");
        add("(T:Bed) One-Arm Seated Hammer Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-seated-hammer-curl.html");
        domination("One-Arm Seated Hammer Curl", "(T:Bed) One-Arm Seated Hammer Curl");
        add("Barbell Concentration Curl", Biceps, Strength, ZBar, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-concentration-curl.html");
        add("Cable Concentration Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-concentration-curl.html");
        add("One-Arm Prone Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-prone-hammer-dumbbell-curl.html");
        add("One-Arm Prone Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-prone-dumbbell-curl.html");
        add("Prone Incline Dumbbell Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/prone-incline-dumbbell-curl.html");
        add("Prone Incline Hammer Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/prone-incline-hammer-curl.html");
        add("Seated Barbell Curl", Biceps, Strength, List.of(Bench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-curl.html");
        add("(T:Bed) Seated Barbell Curl", Biceps, Strength, List.of(Bed, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-curl.html");
        domination("Seated Barbell Curl", "(T:Bed) Seated Barbell Curl");
        add("Seated Cable Curl", Biceps, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-curl.html");
        add("Seated Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-curl.html");
        add("(T:Bed) Seated Dumbbell Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-curl.html");
        domination("Seated Dumbbell Curl", "(T:Bed) Seated Dumbbell Curl");
        add("Seated Dumbbell Reverse Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-dumbbell-reverse-curl");
        add("(T:Bed) Seated Dumbbell Reverse Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-dumbbell-reverse-curl");
        domination("Seated Dumbbell Reverse Curl", "(T:Bed) Seated Dumbbell Reverse Curl");
        add("Seated Hammer Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-hammer-curl.html");
        add("(T:Bed) Seated Hammer Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-hammer-curl.html");
        domination("Seated Hammer Curl", "(T:Bed) Seated Hammer Curl");
        add("Seated Zottman Curl", Biceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/seated-zottman-curl");

        Exercise.currentFolder = Folder.all.get("Standing Curls");
        add("Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-barbell-curl.html");
        add("Alternating Standing Dumbbell Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternating-standing-dumbbell-curl.html");
        add("Alternating Standing Dumbbell Twisting Curls", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/twisting-standing-dumbbell-curl.html");
        add("Alternating Standing Hammer Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternate-standing-hammer-curl.html");
        add("Barbell Drag Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-drag-curl.html");
        add("Cable Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-curl.html");
        add("Cable Curl (Rope Extension)", Biceps, Strength, List.of(LowCable, CableAttachmentRope), Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/rope-cable-curl.html");
        add("Cable Drag Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/cable-drag-curl.html");
        add("Close Grip Cable Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/close-grip-cable-curl.html");
        add("Close Grip EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/close-grip-ez-bar-curl.html");
        add("Close Grip Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/close-grip-standing-barbell-curl.html");
        add("Cross Body Hammer Curl (Pinwheel Curls)", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/hammer-curl-across-the-body.html");
        add("EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-curl.html");
        add("Hammer Bar Curl", Biceps, Strength, HammerBar, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/barbell-hammer-curl.html");
        add("One-Arm Cable Curl", Biceps, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-cable-curl.html");
        add("One-Arm Standing Dumbbell Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-standing-dumbbell-curl.html");
        add("One-Arm Standing Hammer Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/one-arm-standing-hammer-curl.html");
        add("Standing Dumbbell Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-dumbbell-curl.html");
        add("Standing Dumbbell Drag Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-dumbbell-drag-curl");
        add("Standing Hammer Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-hammer-curl.html");
        add("Standing High Pulley Cable Curl", Biceps, Strength, DoubleCable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-high-pulley-cable-curl.html");
        add("Wide Grip Cable Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-cable-curl.html");
        add("Wide Grip EZ Bar Curl", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-ez-bar-curl.html");
        add("Wide Grip Standing Barbell Curl", Biceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wide-grip-standing-barbell-curl.html");
        add("Zottman Curl", Biceps, Strength, Dumbbell, Isolation, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/zottman-curl.html");

        Exercise.currentFolder = Folder.all.get("Other Curls");
        add("Bicep Curl Sled Drag", Biceps, Conditioning, Sled, Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/bicep-curl-sled-drag");
        add("Exercise Ball Dumbbell Curl", Biceps, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/swiss-ball-dumbbell-curl.html");
        add("Lateral Pulldown Bicep Curl", Biceps, Strength, LatCable, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/cable-underhand-pull-down.html");
        add("Smith Machine Bicep Curl", Biceps, Strength, SmithMachine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-bicep-curl.html");
        add("Squatting Cable Curl", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/squatting-cable-curl.html");
        add("Two-Arm Low Pulley Cable Curl", Biceps, Strength, DoubleCable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-curl.html");

        Exercise.currentFolder = Folder.all.get("Lying Curls");
        add("Lying Cable Curl (On Floor)", Biceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-cable-curl-floor.html");
        add("Lying Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-dumbbell-curl.html");
        add("(T:Bed) Lying Dumbbell Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-dumbbell-curl.html");
        domination("Lying Dumbbell Curl", "(T:Bed) Lying Dumbbell Curl");
        add("Lying High Pulley Cable Curl", Biceps, Strength, List.of(Bench, TopCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-high-pulley-cable-curl.html");
        add("Lying High Pulley Close Grip Cable Curl", Biceps, Strength, List.of(Bench, TopCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-high-pulley-close-grip-cable-curl.html");
        add("Lying Wide Dumbbell Curl", Biceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-wide-dumbbell-curl.html");
        add("(T:Bed) Lying Wide Dumbbell Curl", Biceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-wide-dumbbell-curl.html");
        domination("Lying Wide Dumbbell Curl", "(T:Bed) Lying Wide Dumbbell Curl");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Calves
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Calves");
        add("(Posterior) Calves Tiger Tail", Calves, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/posterior-calf-tiger-tail");
        add("Alternating Single Leg Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/alternating-single-leg-jump-rope");
        add("Anterior Calf Foam Rolling", Calves, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-anterior-calf");
        add("Anterior Calf Lacrosse Ball", Calves, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/anterior-calf-lacrosse-ball");
        add("Anterior Calf Tiger Tail", Calves, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/anterior-calf-tiger-tail");
        add("Banded Tibialis Raise", Calves, Strength, List.of(Bands, KettleBellsX1), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/banded-tibialis-raise");
        add("(T:Pole) Banded Tibialis Raise", Calves, Strength, List.of(Bands, Pole), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/banded-tibialis-raise");
        domination("(T:Pole) Banded Tibialis Raise", "Banded Tibialis Raise");
        add("Bodyweight Floor Calf Raise", Calves, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-calf-raise.html");
        add("Bodyweight Standing Calf Raise", Calves, Strength, FootStand, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/bodyweight-standing-calf-raise.html");
        add("(T:Stairs) Bodyweight Standing Calf Raise", Calves, Strength, Stairs, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/bodyweight-standing-calf-raise.html");
        domination("Bodyweight Standing Calf Raise", "(T:Stairs) Bodyweight Standing Calf Raise");
        add("Cable Calf Raise", Calves, Strength, List.of(FootStand, LowCable, WaistStrap), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-calf-raise.html");
        add("Donkey Calf Raise", Calves, Strength, List.of(FootStand, InclineBench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/donkey-calf-raise.html");
        add("Double Jump Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/double-jump-jump-ropes");
        add("Exercise Ball On-The-Wall Calf Raise", Calves, Strength, List.of(Wall, ExerciseBall, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/exercise-ball-on-the-wall-calf-raise.html");
        add("Front to Back Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/front-to-back-jump-rope");
        add("Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/jump-rope");
        add("Knee Break Ankle Mobilization", Calves, Warmup, Disk, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/knee-break-ankle-mobilization");
        add("One-Leg Cable Calf Raise", Calves, Strength, List.of(LowCable, FootStand, WaistStrap), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-cable-calf-raise.html");
        add("One-Leg Donkey Calf Raise", Calves, Strength, List.of(FootStand, InclineBench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-donkey-calf-raise.html");
        add("One-Leg Floor Calf Raise", Calves, Strength, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-floor-calf-raise.html");
        add("One-Leg Seated Dumbbell Calf Raise", Calves, Strength, List.of(FootStand, Dumbbell, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-seated-dumbbell-calf-raise.html");
        add("(T:Bed) One-Leg Seated Dumbbell Calf Raise", Calves, Strength, List.of(FootStand, Dumbbell, Bed), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-seated-dumbbell-calf-raise.html");
        domination("One-Leg Seated Dumbbell Calf Raise", "(T:Bed) One-Leg Seated Dumbbell Calf Raise");
        add("One-Leg Smith Machine Calf Raise", Calves, Strength, List.of(SmithMachine, Disk), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-one-leg-calf-raise.html");
        add("One-Leg Smith Machine Seated Calf Raise", Calves, Strength, List.of(SmithMachine, FootStand, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-smith-machine-seated-calf-raise.html");
        add("One-Leg Smith Machine Toe Raise", Calves, Strength, List.of(SmithMachine, Disk), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-one-leg-toe-raise.html");
        add("One-Leg Standing Bodyweight Calf Raise", Calves, Strength, FootStand, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-standing-calf-raise.html");
        add("(T:Stairs) One-Leg Standing Bodyweight Calf Raise", Calves, Strength, Stairs, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-standing-calf-raise.html");
        domination("One-Leg Standing Bodyweight Calf Raise", "(T:Stairs) One-Leg Standing Bodyweight Calf Raise");
        add("Peroneal Foam Rolling", Calves, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-peroneals");
        add("Peroneal Tiger Tail", Calves, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/peroneal-tiger-tail");
        add("Posterior Calf Foam Rolling", Calves, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-posterior-calf");
        add("Posterior Calf Lacrosse Ball", Calves, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/posterior-calf-lacrosse-ball");
        add("Reverse Jump Rope", Calves, Conditioning, JumpRope, Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/reverse-jump-rope");
        add("Rocking Gastrocnemius Emphasis Ankle Mobilization", Calves, Warmup, List.of(Wall, FootStand), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rocking-gastroc-emphasis-ankle-mobilization");
        add("Rocking Soleus Emphasis Ankle Mobilization", Calves, Warmup, List.of(Wall, FootStand), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rocking-soleus-emphasis-ankle-mobilization");
        add("Rocking Standing Calf Raise", Calves, Strength, Barbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rocking-standing-calf-raise.html");
        add("Seated Barbell Calf Raise", Calves, Strength, List.of(FootStand, Barbell, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-calf-raise.html");
        add("(T:Bed) Seated Barbell Calf Raise", Calves, Strength, List.of(FootStand, Barbell, Bed), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-calf-raise.html");
        domination("Seated Barbell Calf Raise", "(T:Bed) Seated Barbell Calf Raise");
        add("(T:ZBar) Seated Barbell Calf Raise", Calves, Strength, List.of(FootStand, ZBar, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-calf-raise.html");
        add("(T:Bed:ZBar) Seated Barbell Calf Raise", Calves, Strength, List.of(FootStand, ZBar, Bed), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-calf-raise.html");
        domination("(T:ZBar) Seated Barbell Calf Raise", "(T:Bed:ZBar) Seated Barbell Calf Raise");
        add("Seated Dumbbell Calf Raise", Calves, Strength, List.of(FootStand, Dumbbell, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-calf-raise.html");
        add("(T:Bed) Seated Dumbbell Calf Raise", Calves, Strength, List.of(FootStand, Dumbbell, Bed), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-calf-raise.html");
        domination("Seated Dumbbell Calf Raise", "(T:Bed) Seated Dumbbell Calf Raise");
        add("Side to Side Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/side-to-side-jump-rope");
        add("Single Leg Circle Jump Rope", Calves, Conditioning, JumpRope, Compound, Intermediate, Forearms, "https://www.muscleandstrength.com/exercises/unilateral-circle-jump-rope");
        add("Single Leg Front to Back Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/unilateral-front-to-back-jump-rope");
        add("Single Leg Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/single-leg-jump-rope");
        add("Single Leg Side to Side Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/single-leg-side-to-side-jump-rope");
        add("Skipping Jump Rope", Calves, Conditioning, JumpRope, Compound, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/skipping-jump-rope");
        add("Smith Machine Calf Raise", Calves, Strength, List.of(FootStand, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-calf-raise.html");
        add("Smith Machine Calf Raise (Toes In)", Calves, Strength, List.of(FootStand, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-in-smith-machine-calf-raise.html");
        add("Smith Machine Calf Raise (Toes Out)", Calves, Strength, List.of(FootStand, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-out-smith-machine-calf-raise.html");
        add("Smith Machine Seated Calf Raise", Calves, Strength, List.of(FootStand, Bench, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-seated-calf-raise.html");
        add("Smith Machine Seated Toe Raise", Calves, Strength, List.of(FootStand, Bench, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-seated-toe-raise.html");
        add("Smith Machine Toe Raise", Calves, Strength, List.of(Disk, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-toe-raise.html");
        add("Standing Barbell Calf Raise", Calves, Strength, List.of(FootStand, Barbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-calf-raise.html");
        add("Standing Barbell Calf Raise (On Floor)", Calves, Strength, Barbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/floor-barbell-calf-raise.html");
        add("Standing One-Leg Calf Raise With Dumbbell", Calves, Strength, List.of(FootStand, Wall, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-one-leg-calf-raise-with-dumbbell.html");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Chest
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Exercise.currentFolder = Folder.all.get("Bench Presses");
        add("Dumbbell Bench Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-bench-press.html");
        add("Incline Bench Press", Chest, Strength, InclineBenchPress, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-bench-press.html");
        add("1 Board Bench Press", Chest, PowerLifting, List.of(BenchPress, Board, Partner), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/1-board-bench-press");
        add("2 Board Bench Press", Chest, PowerLifting, List.of(BenchPress, Board, Partner), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/2-board-bench-press");
        add("3 Board Bench Press", Chest, PowerLifting, List.of(BenchPress, Board, Partner), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/3-board-bench-press");
        add("Alternate Dumbbell Bench Press (high start)", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternate-dumbbell-bench-press-high-start.html");
        add("Alternating Dumbbell Bench Press (Low Start)", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternate-dumbbell-bench-press-low-start.html");
        add("Alternating Dumbbell Bench Press on Exercise Ball", Chest, Strength, List.of(ExerciseBall, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternating-dumbbell-bench-press-exercise-ball");
        add("Band Suspended Kettlebell Bench Press", Chest, Strength, List.of(BenchPress, Bands, KettleBellsX2), Compound, Advanced, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/band-suspended-kettlebell-bench-press");
        add("Barbell Bench Press", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/barbell-bench-press.html");
        add("Bench Press Against Chains", Chest, Strength, List.of(BenchPress, Chains), Compound, Advanced, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/bench-press-against-chains");
        add("Cable Chest Press", Chest, Strength, DoubleCable, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/cable-chest-press.html");
        add("Cable Inner Chest Press", Chest, Strength, DoubleCable, Compound, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/cable-inner-chest-press.html");
        add("Close Grip Dumbbell Press (AKA Crush Press)", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/close-grip-dumbbell-press.html");
        add("Decline Bench Press", Chest, Strength, DeclineBenchPress, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-bench-press.html");
        add("Decline Cable Chest Press", Chest, Strength, List.of(DeclineBench, DoubleCable), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-cable-chest-press");
        add("Decline Dumbbell Bench Press", Chest, Strength, List.of(DeclineBench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-dumbbell-bench-press.html");
        add("Decline Smith Machine Bench Press", Chest, Strength, List.of(DeclineBench, SmithMachine), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-smith-machine-bench-press.html");
        add("Dumbbell Bench Press Rotational Grip", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/rotational-grip-dumbbell-bench-press");
        add("Dumbbell Twist Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-twist-press");
        add("Exercise Ball Dumbbell Bench Press", Chest, Strength, List.of(ExerciseBall, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/swiss-ball-dumbbell-bench-press.html");
        add("Floor Press", Chest, Strength, Barbell, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/floor-bench-press.html");
        add("Guillotine Press", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/guillotine-press.html");
        add("Half Kneeling Medicine Ball Chest Pass", Chest, Plyometrics, List.of(MedicineBall, Wall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Glutes, Hamstrings, Triceps), "https://www.muscleandstrength.com/exercises/half-kneeling-medicine-ball-chest-pass");
        add("Incline Cable Chest Press", Chest, Strength, List.of(InclineBench, DoubleCable), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-cable-chest-press");
        add("Incline Dumbbell Bench Press", Chest, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-dumbbell-bench-press.html");
        add("Neutral Grip Decline Dumbbell Bench Press", Chest, Strength, List.of(DeclineBench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/palms-in-decline-dumbbell-bench-press.html");
        add("Neutral Grip Dumbbell Bench Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/palms-in-dumbbell-bench-press.html");
        add("Neutral Grip Incline Dumbbell Bench Press", Chest, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/palms-in-incline-dumbbell-bench-press.html");
        add("One Arm Bottoms Up Kettlebell Bench Press", Chest, Strength, List.of(Bench, KettleBellsX1), Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-bottoms-up-kettlebell-bench-press");
        add("One Arm Kettlebell Bench Press", Chest, Strength, List.of(Bench, KettleBellsX1), Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-kettlebell-bench-press");
        add("One-Arm Dumbbell Bench Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-bench-press.html");
        add("Paused Barbell Bench Press", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/paused-barbell-bench-press");
        add("Resistance Banded Dumbbell Bench Press", Chest, Strength, List.of(Bench, Dumbbell, Bands), Compound, Advanced, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/resistance-banded-dumbbell-bench-press");
        add("Reverse Grip Bench Press", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-grip-bench-press.html");
        add("Reverse Grip Dumbbell Bench Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-dumbbell-bench-press.html");
        add("Reverse Grip Dumbbell Squeeze Press", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-grip-dumbbell-squeeze-press");
        add("Reverse Grip Incline Bench Press", Chest, Strength, InclineBenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-bench-press.html");
        add("Smith Machine Bench Press", Chest, Strength, List.of(SmithMachine, Bench), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/smith-machine-bench-press.html");
        add("Smith Machine Incline Bench Press", Chest, Strength, List.of(InclineBenchPress, SmithMachine), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-smith-machine-bench-press.html");
        add("Smith Machine Wide Grip Bench Press", Chest, Strength, List.of(Bench, SmithMachine), Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/smith-machine-wide-grip-bench-press.html");
        add("Wide Grip Barbell Bench Press", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-bench-press.html");
        add("Wide Grip Decline Bench Press", Chest, Strength, List.of(DeclineBenchPress), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-decline-bench-press");
        add("Wide Grip Incline Bench Press", Chest, Strength, InclineBenchPress, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-incline-bench-press");
        add("Wide Reverse Grip Bench Press", Chest, Strength, BenchPress, Compound, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/wide-reverse-grip-bench-press.html");

        Exercise.currentFolder = Folder.all.get("Flys");
        add("Alternating Decline Dumbbell Fly", Chest, Strength, List.of(DeclineBench, Dumbbell), Isolation, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/alternate-decline-dumbbell-flys.html");
        add("Alternating Dumbbell Fly", Chest, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-flys.html");
        add("Alternating Incline Dumbbell Fly", Chest, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/alternate-incline-dumbbell-flys.html");
        add("Chain Fly", Chest, Strength, List.of(Bench, Chains), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/chain-fly");
        add("Decline Cable Flys", Chest, Strength, List.of(DeclineBench, DoubleCable), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-cable-flys.html");
        add("Decline Dumbbell Flys", Chest, Strength, List.of(DeclineBench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-dumbbell-flys.html");
        add("Decline Dumbbell Twist Fly", Chest, Strength, List.of(DeclineBench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-dumbbell-twist-fly");
        add("Dumbbell Flys", Chest, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-flys.html");
        add("Dumbbell Twist Fly", Chest, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-twist-fly");
        add("Exercise Ball Cable Fly", Chest, Strength, List.of(ExerciseBall, DoubleCable), Isolation, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/swiss-ball-cable-flys.html");
        add("Exercise Ball Dumbbell Fly", Chest, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, Shoulders, "https://www.muscleandstrength.com/exercises/swiss-ball-dumbbell-flys.html");
        add("Flat Bench Cable Flys", Chest, Strength, List.of(Bench, DoubleCable), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/flat-bench-cable-flys.html");
        add("Incline Cable Flys", Chest, Strength, List.of(InclineBench, DoubleCable), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-cable-flys.html");
        add("Incline Dumbbell Flys", Chest, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-dumbbell-flys.html");
        add("Incline Dumbbell Twist Fly", Chest, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-dumbbell-twist-fly");
        add("One Arm Dumbbell Fly", Chest, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-fly");
        add("Ring Fly", Chest, Strength, Rings, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/ring-fly");
        add("Standing Cable Fly", Chest, Strength, DoubleCable, Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/cable-crossovers-(mid-chest).html");
        add("Standing High to Low Cable Fly", Chest, Strength, DoubleCable, Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/cable-crossovers-bent-over.html");
        add("Standing Low to High Cable Fly", Chest, Strength, DoubleCable, Isolation, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/cable-lower-chest-raise.html");

        Exercise.currentFolder = Folder.all.get("Push Ups");
        add("1 Leg Push Up", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/1-leg-pushup.html");
        add("Alternating Medicine Ball Push Up", Chest, Strength, MedicineBall, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternating-medicine-ball-push-up");
        add("Alternating Reach Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternating-reach-push-up");
        add("Bird Dog Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/bird-dog-push-up");
        add("Bosu Ball Push Up", Chest, Strength, BosuBall, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/bosu-ball-push-up");
        add("Decline Push Up (Feet on Bench)", Chest, Strength, Bench, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-push-up");
        add("(T:Bed) Decline Push Up (Feet on Bench)", Chest, Strength, Bed, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/decline-push-up");
        domination("Decline Push Up (Feet on Bench)", "(T:Bed) Decline Push Up (Feet on Bench)");
        add("Eccentric Only Incline Push Up", Chest, Strength, Bench, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/eccentric-only-incline-push-up");
        add("(T:Bed) Eccentric Only Incline Push Up", Chest, Strength, Bed, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/eccentric-only-incline-push-up");
        domination("Eccentric Only Incline Push Up", "(T:Bed) Eccentric Only Incline Push Up");
        add("Eccentric Only Push Up", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/eccentric-only-push-up");
        add("Exercise Ball Push Up", Chest, Strength, ExerciseBall, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/swiss-ball-push-up.html");
        add("Feet on Wall Push Up", Chest, Strength, Wall, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/feet-on-wall-push-up");
        add("Fingertip Push Ups", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/fingertip-pushups");
        add("Incline Push Ups", Chest, Strength, Bench, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-push-ups.html");
        add("(T:Bed) Incline Push Ups", Chest, Strength, Bed, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-push-ups.html");
        domination("Incline Push Ups", "(T:Bed) Incline Push Ups");
        add("Kettlebell Push Up", Chest, Strength, KettleBellsX2, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/kettlebell-push-up");
        add("Knee Push-Up", Chest, Strength, Bodyweight, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/knee-pushups.html");
        add("Knuckle Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/knuckle-push-up");
        add("Lateral Hand Walk Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/lateral-hand-walk-push-up");
        add("One Arm Medicine Ball Push Up", Chest, Strength, MedicineBall, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-medicine-ball-push-up");
        add("Paused Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/paused-push-up");
        add("Plyometric Clapping Push Up", Chest, Strength, Bodyweight, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/plyometric-clapping-push-up");
        add("Plyometric Push Up", Chest, Strength, Bodyweight, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/plyometric-push-up");
        add("Push Up", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up.html");
        add("Push Up (Feet on Swiss Ball)", Chest, Strength, ExerciseBall, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/incline-swiss-ball-push-up.html");
        add("Push Up Jacks", Chest, Strength, Bodyweight, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up-jacks");
        add("Push Up Plus", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up-plus");
        add("Push Up to Side Plank", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up-to-side-plank");
        add("Push Up with Knee Drive", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up-with-knee-drive");
        add("Push Up with Mountain Climber", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/push-up-with-mountain-climber");
//        add("Push-Up (On Bench)", Chest, Strength, Bench, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/bench-pushups.html"); Duplicate of Incline Pushup
        add("Reverse Grip Incline Push Up", Chest, Strength, Bench, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-push-up");
        add("(T:Bed) Reverse Grip Incline Push Up", Chest, Strength, Bed, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-push-up");
        domination("Reverse Grip Incline Push Up", "(T:Bed) Reverse Grip Incline Push Up");
        add("Ring Push Up", Chest, Strength, Rings, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/ring-push-up");
        add("Shoulder Tap Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/shoulder-tap-push-up");
        add("Spiderman Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/spiderman-push-up");
        add("Stretch Push Up (On Risers)", Chest, Strength, Aerobic_Step, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/deep-push-ups.html");
        add("T-Push Up", Chest, Strength, Bodyweight, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/t-push-up");
        add("Valslide Push Up", Chest, Strength, ValSlide, Compound, Advanced, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/valslide-push-up");
        add("Wall Push Up", Chest, Strength, Wall, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wall-push-up");
        add("Wide Grip Incline Push Up", Chest, Strength, Bench, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-incline-push-up");
        add("(T:Bed) Wide Grip Incline Push Up", Chest, Strength, Bed, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-incline-push-up");
        domination("Wide Grip Incline Push Up", "(T:Bed) Wide Grip Incline Push Up");
        add("Wide Grip Push Ups", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/wide-grip-push-ups.html");
        add("Yoga Push Up", Chest, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/yoga-push-up");

        Exercise.currentFolder = Folder.all.get("Pullovers");
        add("Barbell Pullover", Chest, Strength, List.of(Bench, ShortBarbell), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/barbell-pullover.html");
        add("(T:Bed) Barbell Pullover", Chest, Strength, List.of(Bed, ShortBarbell), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/barbell-pullover.html");
        domination("Barbell Pullover", "(T:Bed) Barbell Pullover");
        add("Barbell Pullover And Press", Chest, Strength, List.of(Bench, ShortBarbell), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/barbell-pullover-and-press.html");
        add("(T:Bed) Barbell Pullover And Press", Chest, Strength, List.of(Bed, ShortBarbell), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/barbell-pullover-and-press.html");
        domination("Barbell Pullover And Press", "(T:Bed) Barbell Pullover And Press");
        add("Dumbbell Pullover", Chest, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Lats), "https://www.muscleandstrength.com/exercises/dumbbell-pullover.html");
        add("(T:Bed) Dumbbell Pullover", Chest, Strength, List.of(Bed, Dumbbell), Compound, Intermediate, List.of(Lats), "https://www.muscleandstrength.com/exercises/dumbbell-pullover.html");
        domination("Dumbbell Pullover", "(T:Bed) Dumbbell Pullover");
        add("Lying Cable Pullover", Chest, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/lying-cable-pullover.html");
        add("Lying Cable Pullover (Rope Extension)", Chest, Strength, List.of(Bench, LowCable, CableAttachmentRope), Compound, Intermediate, List.of(Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/lying-cable-pullover-rope-extension.html");

        Exercise.currentFolder = Folder.all.get("Other Chest");
        add("Chest Dip", Chest, Strength, DipStation, Compound, Intermediate, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/chest-dip.html");
        add("Cable Crossovers (Upper Chest)", Chest, Strength, DoubleCable, Isolation, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/cable-crossovers-(upper-chest).html");
        add("Cable Iron Cross", Chest, Strength, DoubleCable, Isolation, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/cable-crossovers.html");
        add("Cross Body Arm Swings", Chest, Warmup, Bodyweight, Compound, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/cross-body-arm-swings");
        add("Half Kneeling PVC Pec Mobilization", Chest, Warmup, PvcPipe, Compound, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/half-kneeling-pvc-pec-mobilization");
        add("Lying Medicine Ball Power Drop", Chest, Plyometrics, List.of(MedicineBall, Partner), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/lying-medicine-ball-power-drop");
        add("Muscle Up", Chest, Strength, FixedUpperBar, Compound, Advanced, List.of(FrontalAbs, Biceps, Lats, Shoulders, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/muscle-up");
        add("Pec Foam Rolling", Chest, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-pecs");
        add("Pec Lacrosse Ball", Chest, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/pec-lacrosse-ball");
        add("Pec Minor Dip", Chest, Strength, DipStation, Compound, Beginner, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/pec-minor-dip");
        add("Rack Pec Stretch", Chest, Warmup, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rack-pec-stretch");
        add("Self-Assisted Straight Bar Dip", Chest, Strength, Rack, Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/self-assisted-straight-bar-dip");
        add("Single Leg Medicine Ball Chest Pass Wall Tap", Chest, Plyometrics, List.of(MedicineBall, Wall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/single-leg-medicine-ball-chest-pass-wall-tap");
        add("Sled Press", Chest, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/sled-press");
        add("Standing Medicine Ball Chest Throw", Chest, Plyometrics, List.of(MedicineBall, Wall), Compound, Beginner, List.of(FrontalAbs, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/standing-medicine-ball-chest-throw");
        add("Standing PVC Pec Mobilization", Chest, Warmup, PvcPipe, Compound, Beginner, List.of(Shoulders), "https://www.muscleandstrength.com/exercises/standing-pvc-pec-mobilization");
        add("Straight Bar Dip", Chest, Strength, FixedUpperBar, Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/straight-bar-dip");
        add("Tall Kneeling Medicine Ball Chest Pass", Chest, Plyometrics, List.of(MedicineBall, Wall), Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/tall-kneeling-medicine-ball-chest-pass");
        add("Weighted Chest Dip", Chest, Strength, List.of(DipStation, WeightStrap), Compound, Intermediate, List.of(Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/weighted-chest-dip.html");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Forearms
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Reverse Curls");
        add("Reverse Grip Barbell Curl (EZ Bar)", Forearms, Strength, ZBar, Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/ez-bar-reverse-grip-barbell-curl.html");
        add("Alternating Dumbbell Reverse Grip Curl", Forearms, Strength, Dumbbell, Isolation, Beginner, List.of(Biceps), "https://www.muscleandstrength.com/exercises/standing-alternate-dumbbell-reverse-curl.html");
        add("One-Arm Dumbbell Reverse Grip Curl", Forearms, Strength, Dumbbell, Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/standing-one-arm-dumbbell-reverse-curl.html");
        add("Reverse Grip Barbell Curl", Forearms, Strength, ShortBarbell, Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-barbell-curl.html");
        add("Reverse Grip Cable Curl", Forearms, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-cable-curl.html");
        add("Reverse Grip Cable Preacher Curl", Forearms, Strength, List.of(PreacherStand, LowCable, CableAttachmentStraightBar), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-cable-preacher-curl.html");
        add("Reverse Grip Concentration Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-concentration-curl.html");
        add("(T:Bed) Reverse Grip Concentration Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-concentration-curl.html");
        domination("Reverse Grip Concentration Curl", "(T:Bed) Reverse Grip Concentration Curl");
        add("Reverse Grip Dumbbell Preacher Curl", Forearms, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/dumbbell-reverse-preacher-curl.html");
        add("Reverse Grip Preacher Curl", Forearms, Strength, List.of(PreacherStand, ShortBarbell), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-preacher-curl.html");
        add("Reverse Grip Preacher Curl (EZ Bar)", Forearms, Strength, List.of(PreacherStand, ZBar), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/ez-bar-reverse-grip-preacher-curl.html");
        add("Reverse One Arm Cable Curl", Forearms, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/reverse-one-arm-cable-curl.html");
        add("Standing Dumbbell Reverse Curl", Biceps, Strength, Dumbbell, Isolation, Beginner, Forearms, "https://www.muscleandstrength.com/exercises/standing-dumbbell-reverse-curl.html");
        add("Standing Reverse Grip Cable Curl", Forearms, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/standing-cable-reverse-curl.html");
        add("One-Arm Reverse Grip Dumbbell Preacher Curl", Forearms, Strength, List.of(PreacherStand, Dumbbell), Isolation, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/one-arm-reverse-dumbbell-preacher-curl.html");

        Exercise.currentFolder = Folder.all.get("Wrist Curls");
        add("Seated Barbell Wrist Curl", Forearms, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/barbell-wrist-curl.html");
        add("Barbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/barbell-wrist-curl-over-bench.html");
        add("Behind-The-Back Barbell Wrist Curl", Forearms, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-wrist-curl.html");
        add("Behind-The-Back Cable Wrist Curl", Forearms, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-cable-wrist-curl-(behind-back).html");
        add("Dumbbell Wrist Curl (Over Bench)", Forearms, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-wrist-curl-over-bench.html");
        add("Neutral Grip Dumbbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/neutral-dumbbell-wrist-curl-over-bench.html");
        add("One-Arm Dumbbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-wrist-curl-over-bench.html");
        add("One-Arm Neutral Grip Dumbbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-neutral-dumbbell-wrist-curl-over-bench.html");
        add("One-Arm Seated Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-wrist-curl.html");
        add("(T:Bed) One-Arm Seated Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-wrist-curl.html");
        domination("One-Arm Seated Dumbbell Wrist Curl", "(T:Bed) One-Arm Seated Dumbbell Wrist Curl");
        add("One-Arm Seated Neutral Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-neutral-dumbbell-wrist-curl.html");
        add("(T:Bed) One-Arm Seated Neutral Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-neutral-dumbbell-wrist-curl.html");
        domination("One-Arm Seated Neutral Grip Dumbbell Wrist Curl", "(T:Bed) One-Arm Seated Neutral Grip Dumbbell Wrist Curl");
        add("One-Arm Seated Reverse Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-reverse-dumbbell-wrist-curl.html");
        add("(T:Bed) One-Arm Seated Reverse Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-reverse-dumbbell-wrist-curl.html");
        domination("One-Arm Seated Reverse Grip Dumbbell Wrist Curl", "(T:Bed) One-Arm Seated Reverse Grip Dumbbell Wrist Curl");
        add("One Arm Reverse Dumbbell Wrist Curl Over Bench", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-reverse-dumbbell-wrist-curl-over-bench.html");
        add("(T:Bed) One Arm Reverse Dumbbell Wrist Curl Over Bench", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-reverse-dumbbell-wrist-curl-over-bench.html");
        domination("One Arm Reverse Dumbbell Wrist Curl Over Bench", "(T:Bed) One Arm Reverse Dumbbell Wrist Curl Over Bench");
        add("Reverse Grip Barbell Wrist Curl", Forearms, Strength, List.of(Bench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-barbell-wrist-curl.html");
        add("(T:Bed) Reverse Grip Barbell Wrist Curl", Forearms, Strength, List.of(Bed, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-barbell-wrist-curl.html");
        domination("Reverse Grip Barbell Wrist Curl", "(T:Bed) Reverse Grip Barbell Wrist Curl");
        add("Reverse Grip Barbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-barbell-wrist-curl-over-bench.html");
        add("Reverse Grip Dumbbell Wrist Curl (Over Bench)", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-dumbbell-wrist-curl-over-bench.html");
        add("Seated Cable Wrist Curl", Forearms, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-wrist-curl.html");
        add("Seated Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-wrist-curl.html");
        add("(T:Bed) Seated Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-wrist-curl.html");
        domination("Seated Dumbbell Wrist Curl", "(T:Bed) Seated Dumbbell Wrist Curl");
        add("Seated Neutral Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-neutral-dumbbell-wrist-curl.html");
        add("(T:Bed) Seated Neutral Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-neutral-dumbbell-wrist-curl.html");
        domination("Seated Neutral Grip Dumbbell Wrist Curl", "(T:Bed) Seated Neutral Grip Dumbbell Wrist Curl");
        add("Seated Reverse Grip Cable Wrist Curl", Forearms, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-seated-cable-wrist-curl.html");
        add("Seated Reverse Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-dumbbell-wrist-curl.html");
        add("(T:Bed) Seated Reverse Grip Dumbbell Wrist Curl", Forearms, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-dumbbell-wrist-curl.html");
        domination("Seated Reverse Grip Dumbbell Wrist Curl", "(T:Bed) Seated Reverse Grip Dumbbell Wrist Curl");
        add("Smith Machine Seated Wrist Curl", Forearms, Strength, List.of(SmithMachine, Bench), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-seated-wrist-curl.html");
        add("Standing Smith Machine Wrist Curl (behind back)", Forearms, Strength, SmithMachine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-smith-machine-wrist-curl-(behind-back).html");

        Exercise.currentFolder = Folder.all.get("Carries");
        add("Plate Pinch Carry", Forearms, Strength, Disk, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/plate-pinch-carry");
        add("Barbell Suitcase Carry", Forearms, Strength, Barbell, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-suitcase-carry");
        add("Dumbbell Farmers Carry", Forearms, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/farmers-walk");
        add("Dumbbell High Low Carry", Forearms, Strength, Dumbbell, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-high-low-carry");
        add("Dumbbell Overhead Carry", Forearms, Strength, Dumbbell, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-overhead-carry");
        add("Dumbbell Suitcase Carry", Forearms, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Hamstrings, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-suitcase-carry");
        add("Fat Gripz Dumbbell Farmers Carry", Forearms, Strength, List.of(FatGripz, Dumbbell), Compound, Beginner, List.of(FrontalAbs, Hamstrings, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/fat-gripz-dumbbell-farmers-carry");
        add("Kettlebell Goblet Carry", Forearms, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-goblet-carry");
        add("Kettlebell Racked Crossover Walk", Forearms, Strength, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-racked-crossover-walk");
        add("Kettlebell Single Arm Bottoms Up Carry", Forearms, Strength, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-single-arm-bottoms-up-carry");
        add("Kettlebell Single Arm Racked Carry", Forearms, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-single-arm-racked-carry");
        add("Overhead Barbell Carry", Forearms, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-barbell-carry");
        add("Trap Bar Farmers Carry", Forearms, Strength, TrapBar, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-farmers-carry");
        add("Trap Bar Overhead Carry", Forearms, Strength, TrapBar, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-overhead-carry");
        add("Zercher Carry", Forearms, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/zercher-carry");

        Exercise.currentFolder = Folder.all.get("Other Forearms");
        add("Forearm Extensors Lacrosse Ball", Forearms, SMR, List.of(Bench, LacrosseBall), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/forearm-extensors-lacrosse-ball");
        add("Forearm Flexors Lacrosse Ball", Forearms, SMR, List.of(Bench, LacrosseBall), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/forearm-flexors-lacrosse-balls");
        add("Forearm Tiger Tail", Forearms, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/forearm-tiger-tail");
        add("Weight Plate Pinches", Forearms, Strength, Disk, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/weight-plate-pinches.html");
        add("Wrist Rollers", Forearms, Strength, List.of(WristRoller, Disk), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/wrist-rollers.html");
        add("(T) Donut Squashes", Forearms, Strength, Donut, Isolation, Beginner, none, "N/A");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Glutes
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Good Mornings");
        add("Banded Good Morning", Glutes, Strength, Bands, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/banded-good-mornings");
        add("Good Mornings", Glutes, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/good-mornings.html");
        add("(T:Bodyweight) Bodyweight Good Mornings", Glutes, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/good-mornings.html");
        add("Good Mornings Off Pins", Glutes, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/good-morning-off-pins");
        add("Seated Good Mornings", Glutes, Strength, List.of(Rack, Bench), Compound, Intermediate, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/seated-good-mornings.html");
        add("Single Leg Good Morning", Glutes, Strength, Rack, Compound, Advanced, List.of(FrontalAbs, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-good-morning");

        Exercise.currentFolder = Folder.all.get("Hip Thrusts");
        add("Barbell Hip Thrust", Glutes, Strength, List.of(Aerobic_Step, Barbell, BarbellFoam), Isolation, Intermediate, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/barbell-hip-thrust");
        add("Banded Hip Thruster", Glutes, Strength, List.of(HipThruster, Bands), Isolation, Intermediate, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/banded-hip-thruster");
        add("Bodyweight Hip Thrust", Glutes, Strength, Bench, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-hip-thrust");
        add("(T:Couch) Bodyweight Hip Thrust", Glutes, Strength, Couch, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-hip-thrust");
        domination("Bodyweight Hip Thrust", "(T:Couch) Bodyweight Hip Thrust");
        add("Bodyweight Hip Thruster", Glutes, Strength, HipThruster, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-hip-thruster");
        add("Hip Thruster with Mini Band", Glutes, Strength, List.of(HipThruster, Bands), Isolation, Intermediate, List.of(FrontalAbs, Abductors, Hamstrings), "https://www.muscleandstrength.com/exercises/hip-thruster-with-mini-band");
        add("Single Leg Hip Thrust", Glutes, Strength, Bench, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-hip-thrust");
        add("(T:Couch) Single Leg Hip Thrust", Glutes, Strength, Couch, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-hip-thrust");
        domination("Single Leg Hip Thrust", "(T:Couch) Single Leg Hip Thrust");
        add("Single Leg Hip Thrust with Dumbbell", Glutes, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-hip-thrust-with-dumbbell");
        add("(T:Couch) Single Leg Hip Thrust with Dumbbell", Glutes, Strength, List.of(Couch, Dumbbell), Isolation, Intermediate, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-hip-thrust-with-dumbbell");
        domination("Single Leg Hip Thrust with Dumbbell", "(T:Couch) Single Leg Hip Thrust with Dumbbell");

        Exercise.currentFolder = Folder.all.get("Glute Bridges");
        add("Banded Glute Bridge", Glutes, Strength, BandsMini, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/banded-glute-bridge");
        add("Barbell Glute Bridge", Glutes, Strength, List.of(Barbell, BarbellFoam), Isolation, Intermediate, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/barbell-glute-bridge");
        add("Bodyweight Glute Bridge", Glutes, Strength, Bodyweight, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-glute-bridge");
        add("Knee to Chest Single Leg Glute Bridge", Glutes, Warmup, Bodyweight, Compound, Beginner, HipFlexors, "https://www.muscleandstrength.com/exercises/knee-to-chest-single-leg-glute-bridge");
        add("Marching Glute Bridge", Glutes, Strength, Bodyweight, Isolation, Intermediate, List.of(FrontalAbs, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/marching-glute-bridge");
        add("Single Leg Glute Bridge", Glutes, Strength, Bodyweight, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-glute-bridge");

        Exercise.currentFolder = Folder.all.get("Glute Rotations");
        add("Seated External Rotation", Glutes, Strength, List.of(Bench, BandsMini), Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/seated-external-rotation");
        add("(T:Bed) Seated External Rotation", Glutes, Strength, List.of(Bed, BandsMini), Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/seated-external-rotation");
        domination("Seated External Rotation", "(T:Bed) Seated External Rotation");
        add("Standing External Rotation", Glutes, Strength, BandsMini, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/standing-external-rotation");
        add("Supine Hip Internal Rotation", Glutes, Warmup, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/supine-hip-internal-rotation");

        Exercise.currentFolder = Folder.all.get("Clams");
        add("Side Lying Clam", Glutes, Warmup, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/side-lying-clam");
        add("Side Lying Clam with Band", Glutes, Warmup, Bands, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/side-lying-clam-with-band");

        Exercise.currentFolder = Folder.all.get("Other Glutes");
        add("90/90 Piriformis Stretch", Glutes, Warmup, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/90-90-piriformis-stretch");
        add("Banded Multi Directional Toe Touch", Glutes, Strength, BandsMini, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/banded-multi-directional-toe-touch");
        add("Curtsy Lunge (AKA Drop Lunge)", Glutes, Warmup, Bodyweight, Compound, Beginner, List.of(Abductors, Hamstrings, HipFlexors, Quads), "https://www.muscleandstrength.com/exercises/curtsy-lunge");
        add("Diagonal Band Walk", Glutes, Strength, BandsMini, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/diagonal-band-walk");
        add("Dynamic Pigeon", Glutes, Warmup, Bodyweight, Compound, Beginner, HipFlexors, "https://www.muscleandstrength.com/exercises/dynamic-pigeon");
        add("Figure 4 Glute Stretch", Glutes, Warmup, Bodyweight, Compound, Beginner, HipFlexors, "https://www.muscleandstrength.com/exercises/figure-4-glute-stretch");
        add("Glute Foam Rolling", Glutes, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-glutes");
        add("Glute Kick Back", Glutes, Strength, Bodyweight, Isolation, Beginner, Hamstrings, "https://www.muscleandstrength.com/exercises/glute-kick-back.html");
        add("Glute Lacrosse Ball", Glutes, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/glute-lacrosse-ball");
        add("Lateral Band Walk", Glutes, Strength, BandsMini, Isolation, Beginner, List.of(FrontalAbs, Hamstrings), "https://www.muscleandstrength.com/exercises/lateral-band-walk");
        add("Sled Pull Through", Glutes, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Hamstrings, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sled-pull-through");
        add("Wide Stance Smith Machine Squat", Glutes, Strength, SmithMachine, Compound, Intermediate, List.of(Calves, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/wide-smith-machine-squat.html");
        add("X-Band Walk", Glutes, Activation, Bands, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/x-band-walk");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Hamstrings
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Deadlifts");
        add("Stiff Leg Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/stiff-leg-deadlift-aka-romanian-deadlift.html");
        add("1 Kettlebell Single Leg Deadlift", Hamstrings, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kettlebell-single-leg-deadlift");
        add("1 Kettlebell Suitcase Deadlift", Hamstrings, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kettlebell-suitcase-deadlift");
        add("American Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/american-deadlift");
        add("Banded Conventional Deadlift", Hamstrings, Strength, List.of(Barbell, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-deadlift");
        add("Banded Sumo Deadlift", Hamstrings, Strength, List.of(Barbell, Bands), Compound, Advanced, List.of(Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-sumo-deadlift");
        add("Banded Trap Bar Deadlift", Hamstrings, Strength, List.of(TrapBar, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-trap-bar-deficit");
        add("Barbell Sumo Romanian Deadlift", Hamstrings, Strength, Barbell, Compound, Beginner, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-sumo-romanian-deadlift");
        add("Bodyweight Single Leg Deadlift", Hamstrings, Warmup, Bodyweight, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/bodyweight-single-leg-deadlift");
        add("Conventional Block Pull Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/conventional-block-pull-deadlift");
        add("Conventional Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, MiddleBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/deadlifts.html");
        add("Conventional Deadlift Against Chains", Hamstrings, Strength, List.of(Barbell, Chains), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/conventional-deadlift-against-chains");
        add("Deficit Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/deficit-deadlifts");
        add("Double Kettlebell Single Leg Deadlift", Hamstrings, Strength, KettleBellsX2, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/double-kettlebell-single-leg-deadlift");
        add("Double Kettlebell Suitcase Deadlift", Hamstrings, Strength, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/double-kettlebell-suitcase-deadlift");
        add("Dumbbell Stiff Leg Deadlift", Hamstrings, Strength, Dumbbell, Compound, Beginner, List.of(Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-stiff-leg-deadlift.html");
        add("Dumbbell Stiff Leg Deadlift (On Bench)", Hamstrings, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-stiff-leg-deadlift-on-bench.html");
        add("Fat Bar Deadlift", Hamstrings, Strength, FatBar, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/fat-bar-deadlift");
        add("Jefferson Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/jefferson-deadlift");
        add("Kettlebell Romanian Deadlift", Hamstrings, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-romanian-deadlift");
        add("Kettlebell Sumo Deadlift (1 KB)", Hamstrings, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/one-kettlebell-sumo-deadlift");
        add("Kickstand Kettle Bell 1 Leg Deadlift", Hamstrings, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kickstand-kettle-bell-one-leg-deadlift");
        add("Paused Sumo Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/paused-sumo-deadlift");
        add("Paused Trap Bar Deadlift", Hamstrings, Strength, TrapBar, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/paused-trap-bar-deadlift");
        add("Reeves Deadlift", Hamstrings, Strength, Barbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reeves-deadlift");
        add("Reverse Band Deadlift", Hamstrings, Strength, List.of(Barbell, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-band-deadlift");
        add("Reverse Band Sumo Deadlift", Hamstrings, Strength, List.of(Barbell, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-band-sumo-deadlift");
        add("Romanian Deadlift (AKA RDL)", Hamstrings, Strength, Barbell, Compound, Beginner, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/romanian-deadlift");
        add("Single Leg Barbell Romanian Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-barbell-romanian-deadlift");
        add("Single Leg One Dumbbell Deadlift", Hamstrings, Strength, Dumbbell, Compound, Advanced, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-one-dumbbell-deadlift");
        add("Single Leg Snatch Grip Romanian Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-snatch-grip-romanian-deadlift");
        add("Smith Machine Stiff Leg Deadlift", Hamstrings, Strength, SmithMachine, Compound, Intermediate, List.of(Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/smith-machine-stiff-leg-deadlift.html");
        add("Snatch Grip Block Pull Deadlift", Hamstrings, Strength, Barbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-block-pull-deadlift");
        add("Snatch Grip Deadlift", Hamstrings, Strength, Barbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-deadlift");
        add("Snatch Grip Deficit Deadlift", Hamstrings, Strength, List.of(Barbell, Disk), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-deficit-deadlift");
        add("Snatch Grip Romanian Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-romanian-deadlift");
        add("Stiff Leg Deadlift (On Bench)", Hamstrings, Strength, List.of(Bench, Barbell), Isolation, Advanced, List.of(Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/stiff-leg-deadlift-on-bench.html");
        add("Straight Leg Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/straight-leg-deadlift");
        add("Sumo Block Pull Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sumo-block-pull-deadlift");
        add("Sumo Deadlift", Hamstrings, Strength, Barbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sumo-deadlift");
        add("Sumo Deficit Deadlift", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sumo-deficit-deadlift");
        add("Trap Bar Deadlift", Hamstrings, Strength, TrapBar, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-deadlift");
        add("Trap Bar Deadlift Against Chains", Hamstrings, PowerLifting, List.of(TrapBar, Chains), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-deadlift-against-chains");
        add("Trap Bar Deficit Deadlift", Hamstrings, Strength, TrapBar, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-deficit-deadlifts");
        add("Trap Bar Romanian Deadlift", Hamstrings, Strength, TrapBar, Compound, Beginner, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/content/trap-bar-romanian-deadlift");
        add("Landmine RDL", Hamstrings, Strength, List.of(LandMine, VBar), Compound, Intermediate, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/landmine-romanian-deadlift");
        add("Single Leg Landmine Romanian Deadlift", Hamstrings, Strength, LandMine, Compound, Advanced, List.of(FrontalAbs, Forearms, Glutes, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-landmine-romanian-deadlift");

        Exercise.currentFolder = Folder.all.get("Hamstring Curls");
        add("2 to 1 Exercise Ball Hamstring Curl (SHELC)", Hamstrings, Strength, ExerciseBall, Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/2-to-1-exercise-ball-hamstring-curl");
        add("Band Assisted Nordic Hamstring Curl", Hamstrings, Strength, List.of(FeetWeight, Bands), Isolation, Intermediate, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/band-assisted-nordic-hamstring-curl");
        add("Dumbbell Hamstring Curl", Hamstrings, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/dumbbell-hamstring-curl.html");
        add("(T:Bed) Dumbbell Hamstring Curl", Hamstrings, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/dumbbell-hamstring-curl.html");
        domination("Dumbbell Hamstring Curl", "(T:Bed) Dumbbell Hamstring Curl");
        add("Exercise Ball Leg Curl (SHELC)", Hamstrings, Strength, ExerciseBall, Isolation, Beginner, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/exercise-ball-hamstring-curl");
        add("Lying Cable Leg Curl", Hamstrings, Strength, List.of(Bench, CableAttachmentAnkleStrapsX2, LowCable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-hamstring-curl.html");
        add("One-Leg Lying Cable Hamstring Curl", Hamstrings, Strength, List.of(Bench, CableAttachmentAnkleStrapsX1, LowCable), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-lying-cable-hamstring-curl.html");
        add("Partner Assisted Nordic Hamstring Curls", Hamstrings, Strength, Partner, Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/partner-assisted-nordic-hamstring-curl");
        add("Single Leg Exercise Ball Leg Curl", Hamstrings, Strength, ExerciseBall, Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/single-leg-exercise-ball-leg-curl");
        add("Single Leg Valslide Leg Curl", Hamstrings, Strength, ValSlide, Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/single-leg-valslide-leg-curl");
        add("Standing Cable Hamstring Curl", Hamstrings, Strength, List.of(LowCable, CableAttachmentAnkleStrapsX1), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-cable-hamstring-curl.html");
        add("Valslide Leg Curl", Hamstrings, Strength, ValSlide, Isolation, Beginner, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/valslide-leg-curl");

        Exercise.currentFolder = Folder.all.get("Kettlebell Swings");
        add("Double Kettlebell Swing", Hamstrings, Strength, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/double-kettlebell-swing");
        add("Kettlebell Swing", Hamstrings, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-swing");
        add("One Arm Kettlebell Swing", Hamstrings, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/one-arm-kettlebell-swing");

        Exercise.currentFolder = Folder.all.get("Ham Raises");
        add("Glute Ham Raise (GHR)", Hamstrings, Strength, LowerBackStand2, Isolation, Intermediate, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/glute-ham-raise");
        add("Plate Resisted Glute Ham Raise", Hamstrings, Strength, List.of(LowerBackStand2, Disk), Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/plate-resisted-glute-ham-raise");
        add("Banded Glute Ham Raise", Hamstrings, Strength, List.of(LowerBackStand2, Bands), Isolation, Advanced, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/banded-glute-ham-raise");

        Exercise.currentFolder = Folder.all.get("Other Hamstrings");
        add("Barbell Split Squat With Jump", Hamstrings, Strength, Barbell, Compound, Intermediate, List.of(Calves, Glutes, Quads), "https://www.muscleandstrength.com/exercises/barbell-split-jump.html");
        add("Hamstring Foam Rolling", Hamstrings, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-hamstrings");
        add("Hamstring Tiger Tail", Hamstrings, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hamstring-tiger-tail");
        add("Inchworm", Hamstrings, Warmup, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Calves, Shoulders), "https://www.muscleandstrength.com/exercises/inchworm");
        add("Trap Bar Rack Pull", Hamstrings, Strength, List.of(TrapBar, Rack), Compound, Beginner, List.of(FrontalAbs, Adductors, Forearms, Glutes, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/trap-bar-rack-pull");
        add("Razor Curl", Hamstrings, Strength, LowerBackStand2, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes), "https://www.muscleandstrength.com/exercises/razor-curl");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Hip Flexors
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Hip Flexors");
        add("Cradle Walk to Forward Lunge", HipFlexors, Warmup, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings, Quads), "https://www.muscleandstrength.com/exercises/cradle-walk-to-forward-lunge");
        add("Lying Psoas March", HipFlexors, Activation, Bands, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-psoas-march");
        add("Standing Hip Flexion w/ Bands", HipFlexors, Activation, Bands, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-hip-flexion-with-bands");
        add("Cradle Walk", HipFlexors, Warmup, Bodyweight, Compound, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/cradle-walk");
        add("Fire Hydrant Circles", HipFlexors, Warmup, Bodyweight, Compound, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/fire-hydrant-circles");
        add("Hip Flexor Foam Rolling", HipFlexors, SMR, FoamRoll, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-hip-flexor");
        add("Hip Flexor Lacrosse Ball", HipFlexors, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/hip-flexor-lacrosse-ball");
        add("Kneeling Posterior Hip Capsule Mobilization", HipFlexors, Warmup, Bodyweight, Compound, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/kneeling-posterior-hip-capsule-mobilization");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// IT Bands
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("IT Band");
        add("IT Band Foam Rolling", ItBand, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-it-band");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Lats
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Lat Pull Down");
        add("Lat Pull Down", Lats, Strength, LatCable, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/lat-pull-down.html");
        add("Straight Arm Lat Pull Down", Lats, Strength, List.of(TopCable, CableAttachmentStraightBar), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/straight-arm-lat-pull-down.html");
        add("Behind Neck Lat Pull Down", Lats, Strength, LatCable, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/behind-neck-lat-pull-down.html");
        add("Close Grip Lat Pull Down", Lats, Strength, LatCable, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/close-grip-pull-down.html");
        add("Lateral Pulldown (Rope Extension)", Lats, Strength, LatCable, Compound, Beginner, List.of(Biceps, MiddleBack, Shoulders), "https://www.muscleandstrength.com/exercises/rope-lat-pull-down.html");
        add("Overhand Close Grip Lateral Pulldown", Lats, Strength, LatCable, Compound, Beginner, List.of(Biceps, MiddleBack, Shoulders), "https://www.muscleandstrength.com/exercises/overhand-close-grip-lat-pull-down.html");
        add("Reverse Grip Lat Pull Down (Underhand)", Lats, Strength, LatCable, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-grip-lat-pull-down.html");
        add("Rope Straight Arm Pull Down", Lats, Strength, List.of(TopCable, CableAttachmentRope), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/rope-straight-arm-pull-down");
        add("Underhand Close Grip Lateral Pulldown", Lats, Strength, LatCable, Compound, Intermediate, List.of(Biceps, MiddleBack), "https://www.muscleandstrength.com/exercises/underhand-close-grip-lat-pull-down.html");
        add("V-Bar Pull Down", Lats, Strength, List.of(LatCable, VBar), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/v-bar-pull-down");
        add("Wide Grip Lat Pull Down", Lats, Strength, LatCable, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/wide-grip-pull-down");

        Exercise.currentFolder = Folder.all.get("Pull ups");
        add("Wide Grip Pull Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/wide-grip-pull-up.html");
        add("Archer Pull Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/archer-pull-up");
        add("Close Grip Pull Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/close-grip-pull-up.html");
        add("Double Pause Pull Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/double-pause-pull-up");
        add("Eccentric Only Pull Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/eccentric-only-pull-up");
        add("Grip Ball Pull Ups", Lats, Strength, GripBalls, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/grip-ball-pull-up");
        add("L-Sit Pull Up", Lats, Strength, FixedUpperBar, Compound, Advanced, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/l-sit-pull-up");
        add("Pull Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/pull-up");
        add("Pull Up with Leg Raise", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/pull-up-with-leg-raise");
        add("Resistance Band Assisted Pull Up (From Foot)", Lats, Strength, List.of(Bands, FixedUpperBar), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/band-assisted-pull-up-from-foot");
        add("Resistance Band Assisted Pull Up (From Knee)", Lats, Strength, List.of(FixedUpperBar, Bands), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/band-assisted-pull-up-from-knee");
        add("Rope Pull Up", Lats, Strength, List.of(FixedUpperBar, Rope), Compound, Intermediate, List.of(Biceps, MiddleBack), "https://www.muscleandstrength.com/exercises/rope-pull-up.html");
        add("Single Pause Pull Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/single-pause-pull-up");
        add("V-Bar Pull Up", Lats, Strength, List.of(FixedUpperBar, VBar), Compound, Beginner, List.of(Biceps, MiddleBack, Shoulders), "https://www.muscleandstrength.com/exercises/v-bar-pull-up.html");
        add("Weighted Pull Up", Lats, Strength, List.of(FixedUpperBar, WeightStrap), Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/weighted-pull-up");
        add("Weighted Pull Up Hang", Lats, Strength, List.of(FixedUpperBar, WeightStrap), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/weighted-pull-up-hang");

        Exercise.currentFolder = Folder.all.get("Chin ups");
        add("Around the Bar Chin Ups", Lats, Strength, FixedUpperBar, Isolation, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/around-the-bar-chin-up");
        add("Band Assisted Chin Up (From Foot)", Lats, Strength, List.of(FixedUpperBar, Bands), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/resistance-banded-chin-up-from-foot");
        add("Band Assisted Chin Up (From Knee)", Lats, Strength, List.of(FixedUpperBar, Bands), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/band-assisted-chin-up-from-knee");
        add("Band Resisted Chin Up", Lats, Strength, List.of(FixedUpperBar, Bands), Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/band-resisted-chin-up");
        add("Chin Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/chin-up.html");
        add("Chin Up With Leg Raise", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/chin-up-with-leg-raise");
        add("Close Grip Chin Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/close-grip-chin-up");
        add("Double Pause Chin Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/double-pause-chin-up");
        add("Eccentric Only Chin Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/eccentric-only-chin-up");
        add("Gironda Sternum Chin Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/gironda-sternum-chin-up");
        add("L-Sit Chin Up", Lats, Strength, FixedUpperBar, Compound, Advanced, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/l-sit-chin-up");
        add("Mixed Grip Chin Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/mixed-grip-chin-up");
        add("One Arm Chin Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/one-arm-chin-up");
        add("Single Pause Chin Up", Lats, Strength, FixedUpperBar, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/single-pause-chin-up");
        add("Triple Pause Chin Up", Lats, Strength, FixedUpperBar, Compound, Advanced, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/triple-pause-chin-up");
        add("Weighted Chin Up", Lats, Strength, List.of(FixedUpperBar, WeightStrap), Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/weighted-chin-up");
        add("Weighted Chin Up Hang", Lats, Strength, List.of(FixedUpperBar, WeightStrap), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/weighted-chin-up-hang");
        add("Wide Grip Chin Up", Lats, Strength, FixedUpperBar, Compound, Beginner, List.of(Biceps, MiddleBack, Shoulders), "https://www.muscleandstrength.com/exercises/wide-grip-chin-up.html");

        Exercise.currentFolder = Folder.all.get("Lat Rows");
        add("Shotgun Row", Lats, Strength, List.of(LowCable, CableAttachmentSingleArm), Compound, Beginner, List.of(FrontalAbs, Biceps, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/standing-one-arm-cable-row.html");
        add("Thibaudeau Kayak Row", Lats, Strength, List.of(TopCable, CableAttachmentStraightBar), Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/thibaudeau-kayak-row");

        Exercise.currentFolder = Folder.all.get("Rope Climbs");
        add("Arms Only Rope Climb", Lats, Strength, HangingRope, Compound, Advanced, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/arms-only-rope-climb");
        add("Rope Climb", Lats, Strength, HangingRope, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/rope-climb");

        Exercise.currentFolder = Folder.all.get("Other Lats");
        add("Lat Foam Rolling", Lats, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-lats");
        add("Overhead Medicine Ball Figure 8 Slam", Lats, Plyometrics, MedicineBall, Compound, Intermediate, List.of(FrontalAbs, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-medicine-ball-figure-8-slam");
        add("Rack Lat Stretch", Lats, Warmup, Rack, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rack-lat-stretch");
        add("Single Leg Overhead Medicine Ball Tap", Lats, Plyometrics, List.of(MedicineBall, Wall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/single-leg-overhead-medicine-ball-wall-tap");
        add("Skin the Cat", Lats, Strength, Rings, Compound, Intermediate, List.of(FrontalAbs, Biceps, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/skin-the-cat");
        add("Standing Overhead Medicine Ball Slam", Lats, Plyometrics, MedicineBall, Compound, Beginner, List.of(FrontalAbs, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/standing-overhead-medicine-ball-slam");
        add("Standing Overhead Medicine Ball Throw", Lats, Plyometrics, List.of(MedicineBall, Wall), Compound, Beginner, List.of(FrontalAbs, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/standing-overhead-medicine-ball-throw");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Lower Back
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Lower back deadlifts");
        add("Dumbbell Deadlift", LowerBack, Strength, Dumbbell, Compound, Beginner, List.of(Calves, Forearms, Glutes, Hamstrings, MiddleBack, Quads, Traps), "https://www.muscleandstrength.com/exercises/dumbbell-deadlift.html");
        add("Smith Machine Deadlift", LowerBack, Strength, SmithMachine, Compound, Intermediate, List.of(Calves, Forearms, Glutes, Hamstrings, Lats, MiddleBack, Quads, Traps), "https://www.muscleandstrength.com/exercises/smith-machine-deadlift.html");

        Exercise.currentFolder = Folder.all.get("Other lower back");
        add("Superman", LowerBack, Strength, Bodyweight, Isolation, Beginner, Glutes, "https://www.muscleandstrength.com/exercises/superman");
        add("90/90 Hip Crossover", LowerBack, Warmup, Bodyweight, Compound, Beginner, List.of(Glutes, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/90-90-hip-crossover");
        add("Rollover Into V-Sits", LowerBack, Warmup, Bodyweight, Compound, Beginner, List.of(Adductors, Hamstrings, UpperBack), "https://www.muscleandstrength.com/exercises/rollover-into-v-sits");

        Exercise.currentFolder = Folder.all.get("Hyperextensions");
        add("Reverse Hyperextension", LowerBack, Strength, LowerBackStand2, Isolation, Intermediate, List.of(Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/reverse-hyperextension");
        add("Hyperextension", LowerBack, Strength, LowerBackStand, Isolation, Beginner, List.of(Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/hyperextension.html");
        add("Weighted Hyperextension", LowerBack, Strength, LowerBackStand, Isolation, Intermediate, List.of(Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/weighted-hyperextension");

        Exercise.currentFolder = Folder.all.get("Back Extensions");
        add("GHD Back Extension", LowerBack, Strength, LowerBackStand2, Isolation, Intermediate, List.of(Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/ghd-back-extension");
        add("GHD Back Extension Iso Hold", LowerBack, Strength, LowerBackStand2, Compound, Intermediate, List.of(Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/ghd-back-extension-iso-hold");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Upper Back
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Rows");
        add("Bent Over Row", UpperBack, Strength, Barbell, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/bent-over-barbell-row.html");
        add("Machine T-Bar Row", UpperBack, Strength, TBar, Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/machine-t-bar-row.html");
        add("Banded Machine T-Bar Row", UpperBack, Strength,  TBar, Compound, Intermediate, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/banded-machine-t-bar-row");
        add("Reverse Grip Machine T-Bar Row", UpperBack, Strength, TBar, Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/reverse-grip-machine-t-bar-row.html");
        add("Seated Cable Row", UpperBack, Strength, List.of(RowCable, CableAttachmentParallel), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/seated-row.html");
        add("Bent Over Dumbbell Row", UpperBack, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/bent-over-dumbbell-row.html");
        add("Bent Over Kettlebell Row", UpperBack, Strength, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/bent-over-kettlebell-row");
        add("Cable Palm Rotational Row", UpperBack, Strength, List.of(LowCable, CableAttachmentSingleArm), Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/cable-palm-rotational-row.html");
        add("Chest Supported Dumbbell Row with Isohold", UpperBack, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/chest-supported-dumbbell-row-with-isohold");
        add("Deadstop Rack Row", UpperBack, Strength, Rack, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/deadstop-rack-row");
        add("Double Arm Sled Row", UpperBack, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/double-arm-sled-row");
        add("Feet Elevated Inverted Row", UpperBack, Strength, List.of(SmithMachine, Bench), Compound, Beginner, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/smith-machine-bodyweight-row.html");
        add("Incline Bench Barbell Row", UpperBack, Strength, List.of(InclineBench, Barbell), Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/incline-bench-barbell-row.html");
        add("Incline Bench Cable Row", UpperBack, Strength, List.of(InclineBench, LowCable, CableAttachmentStraightBar), Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/incline-bench-cable-row.html");
        add("Incline Bench Cable Row (Rope Extension)", UpperBack, Strength, List.of(InclineBench, LowCable, CableAttachmentRope), Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/incline-bench-cable-row-rope-extension.html");
        add("Incline Bench Two Arm Dumbbell Row", UpperBack, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/incline-bench-two-arm-dumbbell-row.html");
        add("Inverted Rope Row", UpperBack, Strength, HangingRope, Compound, Beginner, List.of(FrontalAbs, Biceps, Forearms, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/inverted-rope-row");
        add("Inverted Row", UpperBack, Strength, SmithMachine, Compound, Beginner, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/high-inverted-row.html");
        add("Meadows Row", UpperBack, Strength, LandMine, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/meadows-row");
        add("Neutral Grip Chest Supported Dumbbell Row", UpperBack, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/chest-supported-dumbbell-row");
        add("One Arm Dumbbell Row", UpperBack, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-row.html");
        add("One-Arm Bent-Over Row", UpperBack, Strength, LandMine, Compound, Intermediate, List.of(Biceps, Lats, LowerBack, Traps), "https://www.muscleandstrength.com/exercises/one-arm-bent-over-row.html");
        add("One-Arm Seated Cable Row", UpperBack, Strength, List.of(RowCable, CableAttachmentSingleArm), Compound, Beginner, List.of(Biceps, Lats, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-cable-row.html");
        add("Palm Rotational Row", UpperBack, Strength, Dumbbell, Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/palm-rotational-row.html");
        add("Palms In Bent-Over Dumbbell Row", UpperBack, Strength, Dumbbell, Compound, Beginner, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/palms-in-bent-over-dumbbell-row.html");
        add("Pendlay Row", UpperBack, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/pendlay-row");
        add("Renegade Row", UpperBack, Strength, Dumbbell, Compound, Intermediate, List.of(FrontalAbs, Biceps, Chest, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/renegade-row");
        add("Reverse Grip Bent Over Row", UpperBack, Strength, Barbell, Compound, Intermediate, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-bent-over-row.html");
        add("Reverse Grip Bent-Over Dumbbell Row", UpperBack, Strength, Dumbbell, Compound, Intermediate, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-bent-over-dumbbell-row.html");
        add("Reverse Grip Bent-Over Row (EZ Bar)", UpperBack, Strength, ZBar, Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/ez-bar-reverse-grip-bent-over-row.html");
        add("Reverse Grip Incline Bench Barbell Row", UpperBack, Strength, List.of(InclineBench, Barbell), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-bench-barbell-row.html");
        add("Reverse Grip Incline Bench Cable Row", UpperBack, Strength, List.of(InclineBench, LowCable, CableAttachmentStraightBar), Compound, Intermediate, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-bench-cable-row.html");
        add("Reverse Grip Incline Bench Two-Arm Dumbbell Row", UpperBack, Strength, List.of(InclineBench, Dumbbell), Compound, Intermediate, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-incline-bench-two-arm-dumbbell-row.html");
        add("Reverse Grip Smith Machine Bent-Over Row", UpperBack, Strength, SmithMachine, Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-smith-machine-bent-over-row.html");
        add("Reverse Lunge Sled Row", UpperBack, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Lats, Quads, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-lunge-sled-row");
        add("Ring Inverted Row with Chains", UpperBack, Strength, List.of(Rings, Chains), Compound, Intermediate, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/ring-inverted-row-with-chains");
        add("Rope Crossover Seated Row (Capete în sus)", UpperBack, Strength, List.of(RowCable, CableAttachmentRope), Compound, Intermediate, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/rope-crossover-seated-row.html");
        add("Seated High Cable Row", UpperBack, Strength, List.of(RowCable, CableAttachmentRope), Compound, Beginner, List.of(Biceps, Lats), "https://www.muscleandstrength.com/exercises/seated-high-cable-row.html");
        add("Seated Row (Rope Extension) (Capete în jos)", UpperBack, Strength, List.of(RowCable, CableAttachmentRope), Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/seated-row-using-rope.html");
        add("Smith Machine Bent-Over Row", UpperBack, Strength, SmithMachine, Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/smith-machine-bent-over-row.html");
        add("Smith Machine One-Arm Row", UpperBack, Strength, SmithMachine, Compound, Beginner, List.of(Biceps, Lats, Shoulders), "https://www.muscleandstrength.com/exercises/smith-machine-one-arm-row.html");
        add("T-Bar Row", UpperBack, Strength, List.of(LandMine, VBar), Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/bent-over-row.html");
        add("Trap Bar Row", UpperBack, Strength, TrapBar, Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack), "https://www.muscleandstrength.com/exercises/trap-bar-row");
        add("Tripod Dumbbell Row", UpperBack, Strength, List.of(Bench, Dumbbell), Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/tripod-dumbbell-row");
        add("(T:Bed) Tripod Dumbbell Row", UpperBack, Strength, List.of(Bed, Dumbbell), Compound, Beginner, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders), "https://www.muscleandstrength.com/exercises/tripod-dumbbell-row");
        domination("Tripod Dumbbell Row", "(T:Bed) Tripod Dumbbell Row");
        add("Weight Vest Weighted Inverted Row", UpperBack, Strength, List.of(Rings, WeightVest), Compound, Intermediate, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/weight-vest-weighted-inverted-row");
        add("Weighted Inverted Row", UpperBack, Strength, List.of(Rings, Disk), Compound, Intermediate, List.of(FrontalAbs, Biceps, Lats, LowerBack, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/weighted-inverted-row");

        Exercise.currentFolder = Folder.all.get("Other Upper Back");
        add("Batwing Reverse Sled Drag", UpperBack, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, Quads, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/batwing-reverse-sled-drag");
        add("Bench T-Spine Mobilization", UpperBack, Warmup, List.of(Bench, CableAttachmentStraightBar), Compound, Beginner, Lats, "https://www.muscleandstrength.com/exercises/bench-t-spine-mobilization");
        add("Field Goal Angel Foam Rolling", UpperBack, Warmup, FoamRoll, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/field-goal-angel-foam-rolling");
        add("High Pull Sled Drag", UpperBack, Conditioning, Sled, Compound, Beginner, List.of(Biceps, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/high-pull-sled-drag");
        add("Quadruped Extension Rotation", UpperBack, Warmup, Bodyweight, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/quadruped-extension-rotation");
        add("Rock Back Extension Rotation", UpperBack, Warmup, Bodyweight, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/rock-back-extension-rotation");
        add("Thoracic Extension on Foam Roller", UpperBack, Warmup, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/thoracic-extension-on-foam-roller");
        add("World's Greatest Stretch", UpperBack, Warmup, Bodyweight, Compound, Beginner, List.of(Chest, Glutes, Hamstrings, Quads, Shoulders), "https://www.muscleandstrength.com/exercises/worlds-greatest-stretch");
        add("Yoga Plex", UpperBack, Warmup, Aerobic_Step, Compound, Beginner, List.of(Chest, Glutes, Shoulders), "https://www.muscleandstrength.com/exercises/yoga-plex");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Neck
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Neck");
        add("Neck Tiger Tail", Neck, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/neck-tiger-tail");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Palmar Fascia
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Palmar Fascia");
        add("Palmar Fascia Lacrosse Ball", PalmarFascia, SMR, List.of(Bench, LacrosseBall), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/palmar-fascia-lacrosse-ball");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Plantar Fascia
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Plantar Fascia");
        add("Plantar Fascia Lacrosse Ball", PlantarFascia, SMR, LacrosseBall, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/plantar-fascia-lacrosse-ball");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Quads
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Squats");
        add("Barbell Back Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/squat.html");
        add("Anderson Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/anderson-squat");
        add("Back Squat Against Chains", Quads, Strength, List.of(Rack, Chains), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/back-squat-against-chains");
        add("Back Squat to Box Against Chains", Quads, Strength, List.of(Rack, Chains, Box), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/back-squat-to-box-against-chains");
        add("Band Resisted Back Squat", Quads, Strength, List.of(Rack, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/band-resisted-back-squat");
        add("Band Resisted Box Squat", Quads, PowerLifting, List.of(Rack, Bands, Box), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/band-resisted-box-squat");
        add("Barbell Box Squat", Quads, Strength, List.of(Bench, Rack), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/squat-to-bench.html");
        add("Barbell Bulgarian Split Squat", Quads, Strength, List.of(Bench, Rack), Compound, Advanced, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/one-leg-barbell-squat.html");
        add("Barbell Deep Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/deep-squat.html");
        add("Barbell Front Box Squat", Quads, Strength, List.of(Rack, Bench), Compound, Advanced, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/front-squat-to-bench.html");
        add("Barbell Hack Squat", Quads, Strength, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/barbell-hack-squat.html");
        add("Barbell Half Squat", Quads, Strength, Rack, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/half-squat.html");
        add("Barbell Jumping Squats", Quads, Strength, Barbell, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/barbell-jumping-squats.html");
        add("Barbell Lateral Split Squat", Quads, Strength, Barbell, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/barbell-side-split-squat.html");
        add("Barbell Narrow Stance Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(Calves, Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/narrow-squat.html");
        add("Barbell Quarter Squat", Quads, Strength, Rack, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/1-4-squat.html");
        add("Barbell Speed Squats", Quads, Strength, Rack, Compound, Advanced, List.of(Calves, Glutes, LowerBack), "https://www.muscleandstrength.com/exercises/speed-squats.html");
        add("Barbell Sumo Squat", Quads, Strength, List.of(Rack), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/sumo-squat.html");
        add("Barbell Wide Stance Squat", Quads, Strength, Rack, Compound, Intermediate, Glutes, "https://www.muscleandstrength.com/exercises/wide-squat.html");
        add("Belt Squat", Quads, Strength, List.of(Bench, WeightStrap), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/weighted-squat.html");
        add("Bodyweight Bulgarian Split Squat", Quads, Strength, List.of(Bench), Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/one-leg-bodyweight-squat.html");
        add("Bodyweight Pistol Squat", Quads, Strength, Bodyweight, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-pistol-squat");
        add("Bodyweight Squat Jump", Quads, Plyometrics, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-jump-squat.html");
        add("Bodyweight Wall Squat", Quads, Strength, Wall, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-wall-squat.html");
        add("Bottoms Up 1 Kettlebell Split Squat", Quads, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-1-kettlebell-split-squat");
        add("Box Squat", Quads, Strength, List.of(Rack, Box), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/box-squat-shown-with-bench.html");
        add("Contralateral Load Split Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/contralateral-load-split-squat");
        add("Counterbalanced Skater Squat", Quads, Strength, Dumbbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/counterbalanced-skater-squat");
        add("Counterbalanced Squat", Quads, Strength, Disk, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/counterbalanced-squat");
        add("Cycled Split Squat Jump", Quads, Plyometrics, Bodyweight, Compound, Intermediate, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/cycled-split-squat-jump");
        add("Deep Front Squat", Quads, Strength, Rack, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, UpperBack), "https://www.muscleandstrength.com/exercises/deep-front-squats");
        add("Double Kettlebell Front Squat", Quads, Strength, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/double-kettlebell-front-squat");
        add("Double Kettlebell Split Squat", Quads, Strength, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/double-kettlebell-split-squat");
        add("Dumbbell Box Squat", Quads, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-squat-to-bench.html");
        add("Dumbbell Goblet Box Squat", Quads, Strength, List.of(Box, Dumbbell), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-goblet-box-squat");
        add("Dumbbell Goblet Split Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-goblet-split-squat");
        add("Dumbbell Goblet Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-goblet-squat");
        add("Dumbbell Pistol Squat (On Bench)", Quads, Strength, List.of(SmithMachine, Bench, Dumbbell), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bench-one-leg-dumbbell-squat.html");
        add("Dumbbell Split Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-split-squat");
        add("Dumbbell Split Squat With Jump", Quads, Strength, Dumbbell, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-split-jump.html");
        add("Dumbbell Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/dumbbell-squat.html");
        add("Dumbbell Squat Jump", Quads, Strength, Dumbbell, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-jumping-squat.html");
        add("Dumbbell Wall Squat", Quads, Strength, List.of(Wall, Dumbbell), Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-wall-squat.html");
        add("Exercise Ball Dumbbell Wall Squat", Quads, Strength, List.of(Wall, Dumbbell, ExerciseBall), Compound, Advanced, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/weighted-swiss-ball-wall-squat.html");
        add("Exercise Ball Wall Squat", Quads, Strength, List.of(Wall, ExerciseBall), Compound, Beginner, List.of(FrontalAbs, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/swiss-ball-wall-squat.html");
        add("Frog Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/frog-squat.html");
        add("Front Foot Elevated Dumbbell Split Squat", Quads, Strength, List.of(Aerobic_Step, Dumbbell), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/front-foot-elevated-dumbbell-split-squat");
        add("Front Foot Elevated Smith Machine Split Squat", Quads, Strength, List.of(Aerobic_Step, SmithMachine), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/front-foot-elevated-smith-machine-split-squat");
        add("Front Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, UpperBack), "https://www.muscleandstrength.com/exercises/front-squat.html");
        add("High Bar Back Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings,  HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/high-bar-back-squat");
        add("Ipsilateral Load Split Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/ipsilateral-load-split-squat");
        add("Kettlebell Goblet Squat", Quads, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs,  Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/kettlebell-goblet-squat");
        add("Landmine Goblet Squat", Quads, Strength, LandMine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/landmine-goblet-squat");
        add("Low Bar Back Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/low-bar-back-squat");
        add("Narrow Stance Front Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, UpperBack), "https://www.muscleandstrength.com/exercises/narrow-stance-front-squat");
        add("Narrow Stance High Bar Back Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/narrow-stance-high-bar-squat");
        add("Narrow Stance Smith Machine Squat", Quads, Strength, SmithMachine, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/narrow-smith-machine-squat.html");
        add("Offset Single Kettlebell Front Squat", Quads, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/offset-single-kettlebell-front-squat");
        add("One Leg Dumbbell Squat (AKA Dumbbell Bulgarian Split Squat)", Quads, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/one-leg-dumbbell-squat-aka-bulgarian-squat.html");
        add("Plie Squat", Quads, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/pile-squat.html");
        add("Prisoner Squat", Quads, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/bodyweight-squat.html");
        add("Prisoner Squat Jump", Quads, Plyometrics, Bodyweight, Compound, Beginner, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/prisoner-jump-squat");
        add("Rack Pin Front Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, UpperBack), "https://www.muscleandstrength.com/exercises/rack-pin-front-squat");
        add("Reverse Band Back Squats", Quads, Strength, List.of(Rack, Bands), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/reverse-band-back-squat");
        add("Reverse Band Box Squat", Quads, Strength, List.of(Rack, Bands, Box), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, LowerBack), "https://www.muscleandstrength.com/exercises/reverse-band-box-squat");
        add("Safety Bar Squat", Quads, Strength, List.of(Rack, SafetyBar), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/safety-bar-squat");
        add("Single Leg Squat From Bench", Quads, Strength, List.of(Bench, Disk), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-squat-from-bench");
        add("(T:Aerobic_Step) Single Leg Squat From Risers", Quads, Strength, List.of(Aerobic_Step, Disk), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/single-leg-squat-from-bench");
        domination("Single Leg Squat From Bench", "(T:Aerobic_Step) Single Leg Squat From Risers");
        add("Single Leg Wall Squat", Quads, Strength, Wall, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/one-leg-bodyweight-wall-squat.html");
        add("Sissy Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(Calves,  Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/sissy-squat.html");
        add("Smith Machine Box Squat", Quads, Strength, List.of(Bench, SmithMachine), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/smith-machine-squat-to-bench.html");
        add("Smith Machine Front Squat", Quads, Strength, SmithMachine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/smith-machine-front-squat.html");
        add("Smith Machine One Leg Squat", Quads, Strength, List.of(Bench, SmithMachine), Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/smith-machine-one-leg-squat.html");
        add("Smith Machine Squat", Quads, Strength, SmithMachine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/smith-machine-squat.html");
        add("Smith Machine Squat (Feet Forward)", Quads, Strength, SmithMachine, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/feet-forward-smith-machine-squat.html");
        add("Smith Machine Zercher Squat", Quads, Strength, SmithMachine, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/smith-machine-zercher-squat.html");
        add("Split Squat", Quads, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/split-squat");
        add("Split Squat Jump", Quads, Plyometrics, Bodyweight, Compound, Intermediate, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/split-squat-jump");
        add("Split Squat with Banded Adduction", Quads, Strength, List.of(Bands, Pole), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/split-squat-with-banded-adduction");
        add("Split Squat with Iso-Hold", Quads, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves,  Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/split-squat-iso-hold");
        add("Squat to Stand", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings, UpperBack), "https://www.muscleandstrength.com/exercises/squat-to-stand");
        add("Squat to Stand w/ T-Spine Rotation", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Chest, Glutes, Hamstrings, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/squat-to-stand-w-t-spine-rotation");
        add("Weighted Sissy Squat", Quads, Strength, List.of(Rack, Disk), Compound, Advanced, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/weighted-sissy-squat.html");
        add("Wide Stance Front Squat", Quads, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors, UpperBack), "https://www.muscleandstrength.com/exercises/wide-stance-front-squat");
        add("Zerchers Squat", Quads, Strength, Rack, Compound, Advanced, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/zerchers-squat.html");

        Exercise.currentFolder = Folder.all.get("Lunges");
        add("Barbell Lateral Lunge", Quads, Strength, ShortBarbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-side-lunge.html");
        add("Barbell Lunge", Quads, Strength, ShortBarbell, Compound, Intermediate, List.of(Calves, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/barbell-lunge.html");
        add("Barbell Reverse Lunge", Quads, Strength, ShortBarbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-rear-lunge.html");
        add("Barbell Walking Lunge", Quads, Strength, ShortBarbell, Compound, Advanced, List.of(FrontalAbs, Adductors,  Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/walking-barbell-lunge.html");
        add("Bodyweight Lateral Lunge", Quads, Strength, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-side-lunge.html");
        add("Bodyweight Lunge", Quads, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs,  Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-lunge.html");
        add("Bodyweight Reverse Lunge", Quads, Strength, Bodyweight, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/rear-bodyweight-lunge.html");
        add("Bodyweight Walking Lunge", Quads, Strength, Bodyweight, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-walking-lunge.html");
        add("Contralateral Load Dumbbell Front Lunge", Quads, Strength, Dumbbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/contralateral-load-dumbbell-front-lunge");
        add("Decline Bench Barbell Lunge", Quads, Strength, List.of(DeclineBench, Barbell), Compound, Intermediate, List.of(Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/decline-bench-barbell-lunge.html");
        add("Decline Bench Bodyweight Lunge", Quads, Strength, DeclineBench, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/incline-bench-bodyweight-lunge.html");
        add("Decline Bench Dumbbell Lunge", Quads, Strength, List.of(DeclineBench, Dumbbell), Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/incline-bench-dumbbell-lunge.html");
        add("Dumbbell Lateral Lunge", Quads, Strength, Dumbbell, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-side-lunge.html");
        add("Dumbbell Lunge", Quads, Strength, Dumbbell, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-lunge.html");
        add("Dumbbell Rear Lunge", Quads, Strength, Dumbbell, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-rear-lunge.html");
        add("Dumbbell Walking Lunge", Quads, Strength, List.of(Dumbbell, WalkingSpace), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-walking-lunge.html");
        add("Ipsilateral Load Dumbbell Front Lunge", Quads, Strength, Dumbbell, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/ipsilateral-load-dumbbell-front-lunge");
        add("Ipsilateral Load Dumbbell Rear Lunge", Quads, Strength, Dumbbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/ipsilateral-load-dumbbell-reverse-lunge");
        add("Kettlebell Lateral Lunge", Quads, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-lateral-lunge");
        add("Kettlebell Reverse Lunge", Quads, Strength, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-reverse-lunge");
        add("Kettlebell Walking Lunge", Quads, Strength, KettleBellsX2, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-walking-lunge");
        add("Landmine Reverse Lunge", Quads, Strength, LandMine, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/landmine-reverse-lunge");
        add("Lateral Lunge to Drop Lunge", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Adductors, Calves, Glutes), "https://www.muscleandstrength.com/exercises/lateral-lunge-to-drop-lunge");
        add("Reverse Lunge Elbow to Instep with Rotation", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Chest, Glutes, HipFlexors, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-lunge-elbow-to-instep-with-rotation");
        add("Reverse Lunge Sled Walk", Quads, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/reverse-lunge-sled-walk");
        add("Reverse Lunge with Lateral Flexion", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings, HipFlexors, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-lunge-with-lateral-flexion");
        add("Reverse Lunge with Twist", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(Glutes, Hamstrings, HipFlexors, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-lunge-with-twist");
        add("Smith Machine Lunge", Quads, Strength, SmithMachine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/smith-machine-lunge.html");
        add("Valslide Lateral Lunge", Quads, Strength, ValSlide, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/valslide-lateral-lunge");
        add("Valslide Reverse Lunges", Quads, Strength, ValSlide, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/valslide-reverse-lunge");

        Exercise.currentFolder = Folder.all.get("Step ups");
        add("1 Dumbbell Step Up", Quads, Strength, List.of(Aerobic_Step, Dumbbell), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-dumbbell-step-up");
        add("1 Kettlebell Step Up", Quads, Strength, List.of(Aerobic_Step, KettleBellsX1), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kettlebell-step-up");
        add("Barbell Step Ups", Quads, Strength, List.of(Rack, Aerobic_Step), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-step-ups.html");
        add("Bodyweight Step Up", Quads, Strength, Aerobic_Step, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/bodyweight-step-up.html");
        add("Dumbbell Step Up", Quads, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/dumbbell-step-up.html");
        add("Front Barbell Step Up", Quads, Strength, List.of(Rack, Aerobic_Step), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/front-barbell-step-up");
        add("Kettlebell Step Up", Quads, Strength, List.of(KettleBellsX2, Aerobic_Step), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-step-up");
        add("Overhead Step Up", Quads, Strength, List.of(Aerobic_Step, Disk), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-step-up");

        Exercise.currentFolder = Folder.all.get("Olympic Squats");
        add("1 KB Kettlebell Clean", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-clean");
        add("1 KB Kettlebell Clean & Press", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs,  Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-clean-and-press");
        add("1 KB Kettlebell Jerk", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-jerk");
        add("1 KB Kettlebell Push Press", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-push-press");
        add("1 KB Kettlebell Snatch", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-snatch");
        add("1 KB Kettlebell Split Snatch", Quads, OlympicWeightlifting, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Adductors, Glutes, Hamstrings, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-split-snatch");
        add("2 KB Kettlebell Clean", Quads, OlympicWeightlifting, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-clean");
        add("2 KB Kettlebell Clean & Press", Quads, OlympicWeightlifting, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-clean-and-press");
        add("2 KB Kettlebell Jerk", Quads, OlympicWeightlifting, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-jerk");
        add("2 KB Kettlebell Snatch", Quads, OlympicWeightlifting, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-snatch");
        add("2 KB Kettlebell Split Snatch", Quads, OlympicWeightlifting, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-split-snatch");
        add("Barbell Thruster", Quads, OlympicWeightlifting, Rack, Compound, Advanced, List.of(FrontalAbs, Calves, Glutes, Hamstrings, LowerBack, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-thruster");
        add("Clean", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/clean");
        add("Clean & Jerk", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/clean-and-jerk");
        add("Hang Clean", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/hang-clean");
        add("Jerk Balance", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/jerk-balance");
        add("Muscle Clean", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/muscle-clean");
        add("Muscle Snatch", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/muscle-snatch");
        add("Overhead Banded Squat", Quads, OlympicWeightlifting, Bands, Compound,  Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-banded-squat");
        add("Overhead Squat", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-squat.html");
        add("Power Clean", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/power-clean");
        add("Power Clean from Blocks", Quads, OlympicWeightlifting, List.of(Boxx2, Barbell), Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/power-clean-from-blocks");
        add("Power Jerk", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/power-jerk");
        add("Power Snatch", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/power-snatch");
        add("Snatch", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch");
        add("Snatch Balance", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-balance");
        add("Split Clean", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/split-clean");
        add("Split Jerk", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/split-jerk");
        add("Split Snatch", Quads, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/split-snatch");

        Exercise.currentFolder = Folder.all.get("Other Quads");
        add("1 to 2 Box Jump", Quads, Plyometrics, Box, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/1-to-2-box-jump");
        add("2 to 1 Box Jump", Quads, Plyometrics, Box, Compound,  Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/2-to-1-box-jump");
        add("Anti-Rotation Forward Sled Walk", Quads, Conditioning, Sled, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/anti-rotation-forward-sled-walk");
        add("Backward Sled Push", Quads, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack, UpperBack), "https://www.muscleandstrength.com/exercises/backward-sled-push");
        add("Box Jump", Quads, Plyometrics, Box, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/box-jump");
        add("Depth Jump", Quads, Plyometrics, Box, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/depth-jump");
        add("Depth Jump to Box Jump", Quads, Plyometrics, Box, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/depth-jump-to-box-jump");
        add("Depth Jump to Broad Jump", Quads, Plyometrics, Box, Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/depth-jump-to-broad-jump");
        add("Depth Jump to Hurdle Hop", Quads, Plyometrics, List.of(Box, Hurdle), Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/depth-jump-to-hurdle-hop");
        add("Dumbbell Thruster", Quads, Strength, Dumbbell, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings, LowerBack, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-thruster");
        add("Half Kneeling Quad Stretch", Quads, Warmup, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/half-kneeling-quad-stretch");
        add("Kettlebell Thruster", Quads, Strength, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-thruster");
        add("Prone Quad Stretch", Quads, Stretching, Bodyweight, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/prone-quad-stretch");
        add("Quad Foam Rolling", Quads, SMR, FoamRoll, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/foam-rolling-quads");
        add("Quad Tiger Tail", Quads, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/quad-tiger-tail");
        add("Reverse Sled Drag", Quads, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-sled-drag");
        add("Seated Box Jump", Quads, Plyometrics, Box, Compound, Beginner, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/seated-box-jump");
        add("Seated Vertical Jump", Quads, Plyometrics, Box, Compound, Beginner, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/seated-vertical-jump");
        add("Single Leg Hop", Quads, Plyometrics, Bodyweight, Compound, Beginner, List.of(Adductors, Calves, Glutes, Hamstrings, HipFlexors), "https://www.muscleandstrength.com/exercises/single-leg-hop");
        add("Sled Push", Quads, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sled-push");
        add("Sled Sprint", Quads, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Lats, LowerBack, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/sled-sprint");
        add("Smith Machine Leg Press", Quads, Strength, SmithMachine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/smith-machine-leg-press");
        add("Tire Flip", Quads, Strongman, Tire, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Chest, Forearms, Glutes, Hamstrings, Lats, LowerBack, Shoulders, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/tire-flip");
        add("Walking Quad Stretch to Overhead Lunge", Quads, Warmup, Bodyweight, Compound, Beginner, List.of(HipFlexors, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/walking-quad-stretch-to-overhead-lunge");
        add("Wall Ball", Quads, Plyometrics, List.of(MedicineBall, Wall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Chest, Glutes, Hamstrings, LowerBack, Shoulders, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/wall-ball");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Shoulders
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Front Raises");
        add("Alternating Dumbbell Front Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-standing-dumbbell-front-raise.html");
        add("Barbell Front Raise", Shoulders, Strength, Barbell, Isolation, Beginner, List.of(FrontalAbs, Traps), "https://www.muscleandstrength.com/exercises/barbell-front-raise.html");
        add("Barbell Overhead Front Raise", Shoulders, Strength, Barbell, Isolation, Beginner, List.of(FrontalAbs, Traps), "https://www.muscleandstrength.com/exercises/high-barbell-front-raise.html");
        add("Cable Front Raise (Bilateral)", Shoulders, Strength, List.of(LowCable, CableAttachmentStraightBar), Compound, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/cable-front-raise.html");
        add("Lying Cable Front Raise", Shoulders, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-cable-front-raise.html");
        add("Lying Dumbbell Front Raise On Incline Bench", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/dumbbell-front-raise-on-incline-bench.html");
        add("One-Arm Cable Front Raise", Shoulders, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-cable-front-raise.html");
        add("One-Arm Dumbbell Front Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-standing-dumbbell-front-raise.html");
        add("One-Arm Incline Dumbbell Front Raise", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-front-raise-on-incline-bench.html");
        add("One-Arm Seated Dumbbell Front Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-front-raise.html");
        add("(T:Bed) One-Arm Seated Dumbbell Front Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-front-raise.html");
        domination("One-Arm Seated Dumbbell Front Raise", "(T:Bed) One-Arm Seated Dumbbell Front Raise");
        add("Overhead Front Raise (with Weight Plate)", Shoulders, Strength, Disk, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/high-weight-plate-front-raise.html");
        add("Seated Alternating Dumbbell Front Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-dumbbell-front-raise.html");
        add("(T:Bed) Seated Alternating Dumbbell Front Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-dumbbell-front-raise.html");
        domination("Seated Alternating Dumbbell Front Raise", "(T:Bed) Seated Alternating Dumbbell Front Raise");
        add("Seated Barbell Front Raise", Shoulders, Strength, List.of(Bench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-front-raise.html");
        add("(T:Bed) Seated Barbell Front Raise", Shoulders, Strength, List.of(Bed, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-barbell-front-raise.html");
        domination("Seated Barbell Front Raise", "(T:Bed) Seated Barbell Front Raise");
        add("Seated Barbell Overhead Front Raise", Shoulders, Strength, List.of(Bench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/seated-high-barbell-front-raise.html");
        add("(T:Bed) Seated Barbell Overhead Front Raise", Shoulders, Strength, List.of(Bed, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/seated-high-barbell-front-raise.html");
        domination("Seated Barbell Overhead Front Raise", "(T:Bed) Seated Barbell Overhead Front Raise");
        add("Seated Dumbbell Front Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-front-raise.html");
        add("(T:Bed) Seated Dumbbell Front Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-front-raise.html");
        domination("Seated Dumbbell Front Raise", "(T:Bed) Seated Dumbbell Front Raise");
        add("Standing Dumbbell Front Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-front-raise.html");
        add("Weight Plate Front Raise", Shoulders, Strength, Disk, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/weight-plate-front-raise.html");

        Exercise.currentFolder = Folder.all.get("Land Mine Presses");
        add("Band Resistance Single Arm Standing Landmine Press", Shoulders, Strength, List.of(LandMine, Bands), Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/band-resistance-single-arm-landmine-press");
        add("Shoulder To Shoulder Press", Shoulders, Strength, LandMine, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/shoulder-to-shoulder-press");
        add("Single Arm Landmine Press", Shoulders, Strength, LandMine, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/single-arm-landmine-press");
        add("Single Arm Landmine Push Press", Shoulders, Strength, LandMine, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/single-arm-landmine-push-press");
        add("Half Kneeling Landmine Press", Shoulders, Strength, LandMine, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/half-kneeling-landmine-press");

        Exercise.currentFolder = Folder.all.get("Battling Ropes");
        add("Alternating Big Waves Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/alternating-large-waves-battling-ropes");
        add("Alternating Small Waves Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/alternating-small-waves-battling-ropes");
        add("Alternating Waves with Kneeling Get Ups Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, Quads, Triceps), "https://www.muscleandstrength.com/exercises/alternating-waves-with-kneeling-get-ups-battle-ropes");
        add("Double Arm Circles Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Triceps), "https://www.muscleandstrength.com/exercises/double-arm-circles-battle-ropes");
        add("Double Wave Battling Rope", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/double-waves-battle-ropes");
        add("Half Kneeling Battling Rope", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Triceps), "https://www.muscleandstrength.com/exercises/half-kneeling-battle-ropes");
        add("Jumping Jacks Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, Quads, Triceps), "https://www.muscleandstrength.com/exercises/jumping-jacks-battle-ropes");
        add("Lateral Slam Battling Rope", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/lateral-slam-battle-rope");
        add("Lunge Jump with Alternating Waves Battling Ropes", Shoulders, Conditioning, BattlingRopes,  Compound, Advanced, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Quads, Triceps), "https://www.muscleandstrength.com/exercises/lunge-jump-with-alternating-waves-battle-ropes");
        add("Power Slam Battling Rope", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Traps), "https://www.muscleandstrength.com/exercises/power-slam-battle-rope");
        add("Reverse Lunge with Alternating Waves Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Forearms, Glutes, Hamstrings, Lats, Quads, Triceps), "https://www.muscleandstrength.com/exercises/reverse-lunge-with-alternating-waves-battle-ropes");
        add("Seated Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/seated-battle-ropes");
        add("Tall Kneeling Battling Ropes", Shoulders, Conditioning, BattlingRopes, Compound, Beginner, List.of(FrontalAbs, Forearms, Lats, Shoulders, Triceps), "https://www.muscleandstrength.com/exercises/tall-kneeling-battle-ropes");

        Exercise.currentFolder = Folder.all.get("Other Front Delts");
        add("Back to Wall Alternating Shoulder Flexion", Shoulders, Activation, Bodyweight, Compound, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/back-to-wall-alternating-shoulder-flexion");
        add("Back to Wall Shoulder Flexion", Shoulders, Activation, Bodyweight, Compound, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/back-to-wall-shoulder-flexion");
        add("Bus Drivers", Shoulders, Strength, Disk, Compound, Beginner, List.of(Biceps, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/bus-drivers");
        add("Landmine Thruster", Shoulders, Strength, LandMine, Compound, Intermediate, List.of(FrontalAbs, Calves, Hamstrings, LowerBack, Quads, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/landmine-thruster");

        Exercise.currentFolder = Folder.all.get("Lateral Raises");
        add("Dumbbell Lateral Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-lateral-raise.html");
        add("Alternating Dumbbell Lateral Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-lateral-raise.html");
        add("Banded Lateral Raise", Shoulders, Strength, Bands, Isolation, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-lateral-raise");
        add("Cable Lateral Raise", Shoulders, Strength, DoubleCable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-lateral-raise.html");
        add("Exercise Ball Lateral Raise", Shoulders, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-lateral-raise.html");
        add("Kettlebell Lateral Raise", Shoulders, Strength, KettleBellsX2, Isolation, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-lateral-raise");
        add("Landmine Lateral Raise", Shoulders, Strength, LandMine, Isolation, Intermediate, Traps, "https://www.muscleandstrength.com/exercises/landmine-lateral-raise");
        add("Lateral Raise Partials", Shoulders, Strength, Dumbbell, Isolation, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/lateral-raise-partials");
        add("One-Arm Dumbbell Lateral Raise", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-lateral-raise.html");
        add("One-Arm Seated Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-one-arm-dumbbell-lateral-raise.html");
        add("(T:Bed) One-Arm Seated Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-one-arm-dumbbell-lateral-raise.html");
        domination("One-Arm Seated Dumbbell Lateral Raise", "(T:Bed) One-Arm Seated Dumbbell Lateral Raise");
        add("Seated Alternating Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-alternate-dumbbell-lateral-raise.html");
        add("(T:Bed) Seated Alternating Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-alternate-dumbbell-lateral-raise.html");
        domination("Seated Alternating Dumbbell Lateral Raise", "(T:Bed) Seated Alternating Dumbbell Lateral Raise");
        add("Seated Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-lateral-raise.html");
        add("(T:Bed) Seated Dumbbell Lateral Raise", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-lateral-raise.html");
        domination("Seated Dumbbell Lateral Raise", "(T:Bed) Seated Dumbbell Lateral Raise");
        add("Single Arm Cable Lateral Raise (Crossbody)", Shoulders, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Intermediate, Traps, "https://www.muscleandstrength.com/exercises/one-arm-cable-lateral-raise.html");

        Exercise.currentFolder = Folder.all.get("Upright Rows");
        add("Banded Upright Row", Shoulders, Strength, Bands, Compound, Beginner, List.of(Biceps, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-upright-row");
        add("Cable Upright Row", Shoulders, Strength, List.of(LowCable, CableAttachmentStraightBar), Compound, Beginner, List.of(Biceps, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/cable-upright-row.html");
        add("Dumbbell Upright Row", Shoulders, Strength, Dumbbell, Compound, Beginner, List.of(Biceps, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-upright-row.html");
        add("Smith Machine Upright Row", Shoulders, Strength, SmithMachine, Compound, Beginner, Traps, "https://www.muscleandstrength.com/exercises/smith-machine-upright-row.html");

        Exercise.currentFolder = Folder.all.get("Rear Delt Flys");
        add("Bent Over Low Pulley Rear Delt Fly", Shoulders, Strength, DoubleCable, Isolation, Beginner, Traps, "https://www.muscleandstrength.com/exercises/bent-over-cable-rear-delt-fly");
        add("Alternating Incline Rear Delt Fly", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-dumbbell-reverse-fly-on-incline-bench.html");
        add("Alternating Lying Rear Delt Fly", Shoulders, Strength, List.of(Aerobic_Step, Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-lying-dumbbell-reverse-fly.html");
        add("Alternating Rear Delt Fly", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-bent-over-dumbbell-reverse-fly.html");
        add("Alternating Seated Bent Over Rear Delt Fly", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-bent-over-dumbbell-reverse-fly.html");
        add("(T:Bed) Alternating Seated Bent Over Rear Delt Fly", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-bent-over-dumbbell-reverse-fly.html");
        domination("Alternating Seated Bent Over Rear Delt Fly", "(T:Bed) Alternating Seated Bent Over Rear Delt Fly");
        add("Banded Bent Over Reverse Fly", Shoulders, Strength, Bands, Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/bent-over-banded-reverse-fly");
        add("Bent Over Dumbbell Reverse Fly", Shoulders, Strength, Dumbbell, Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/bent-over-dumbbell-reverse-fly.html");
        add("Bent Over Rear Delt Fly (Head on Bench)", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/bent-over-rear-delt-fly-head-on-bench");
        add("Incline Rear Delt Fly", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-reverse-fly-on-incline-bench.html");
        add("Lying Rear Delt Fly", Shoulders, Strength, List.of(Aerobic_Step, Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-dumbbell-reverse-fly.html");
        add("One Arm Dumbbell Rear Delt Fly On Incline Bench", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-reverse-fly-on-incline-bench.html");
        add("One-Arm Bent-Over Cable Reverse Fly", Shoulders, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-cable-reverse-fly.html");
        add("One-Arm Dumbbell Rear Delt Fly", Shoulders, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-bent-over-dumbbell-reverse-fly.html");
        add("One-Arm Lying Rear Delt Fly", Shoulders, Strength, List.of(Aerobic_Step, Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-lying-dumbbell-reverse-fly.html");
        add("One-Arm Seated Rear Delt Fly", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-bent-over-dumbbell-reverse-fly.html");
        add("(T:Bed) One-Arm Seated Rear Delt Fly", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-bent-over-dumbbell-reverse-fly.html");
        domination("One-Arm Seated Rear Delt Fly", "(T:Bed) One-Arm Seated Rear Delt Fly");
        add("Reverse Flys on Rings", Shoulders, Strength, Rings, Isolation, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-fly-on-rings");
        add("Seated Bent Over Dumbbell Reverse Fly", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-reverse-fly.html");
        add("(T:Bed) Seated Bent Over Dumbbell Reverse Fly", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/dumbbell-reverse-fly.html");
        domination("Seated Bent Over Dumbbell Reverse Fly", "(T:Bed) Seated Bent Over Dumbbell Reverse Fly");
        add("Side Lying Rear Delt Fly", Shoulders, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/side-lying-rear-delt-fly");
        add("(T:Bed) Side Lying Rear Delt Fly", Shoulders, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/side-lying-rear-delt-fly");
        domination("Side Lying Rear Delt Fly", "(T:Bed) Side Lying Rear Delt Fly");
        add("Standing Cable Reverse Fly", Shoulders, Strength, DoubleCable, Isolation, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/standing-cable-flys.html");

        Exercise.currentFolder = Folder.all.get("Face Pulls");
        add("Cable Face Pull", Shoulders, Strength, List.of(FlexiCable, CableAttachmentRope), Compound, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/cable-face-pull");
        add("Cable Face Pull with External Rotation", Shoulders, Strength, List.of(FlexiCable, CableAttachmentRope), Compound, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/cable-face-pull-with-external-rotation");
        add("Face Pulls on Rings", Shoulders, Strength, Rings, Compound, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/face-pull-on-rings");
        add("Half Kneeling Banded Face Pull", Shoulders, Strength, List.of(Pole, Bands), Isolation, Beginner, List.of(FrontalAbs, UpperBack), "https://www.muscleandstrength.com/exercises/half-kneeling-banded-face-pull");
        add("Standing Banded Face Pull", Shoulders, Strength, List.of(Pole, Bands), Isolation, Intermediate, List.of(FrontalAbs, UpperBack), "https://www.muscleandstrength.com/exercises/banded-face-pull");
        add("Standing Banded Face Pull to Chest", Shoulders, Strength, List.of(Pole, Bands), Isolation, Intermediate, List.of(FrontalAbs, UpperBack), "https://www.muscleandstrength.com/exercises/standing-banded-face-pull-to-chest");

        Exercise.currentFolder = Folder.all.get("Other Rear Delts");
        add("Anti-Gravity Press", Shoulders, Strength, List.of(InclineBench, ZBar), Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/anti-gravity-press");
        add("Band Pull Apart", Shoulders, Activation, Bands, Compound, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/band-pull-apart");
        add("Barbell Rear Delt Row To Neck", Shoulders, Strength, Barbell, Compound, Intermediate, Biceps, "https://www.muscleandstrength.com/exercises/rear-delt-barbell-row-to-neck.html");
        add("Kettlebell Angled Press", Shoulders, Strength, KettleBellsX1, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/kettlebell-angled-press");
        add("Lying Rear Delt Barbell Raise", Shoulders, Strength, List.of(Bench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-rear-delt-barbell-raise.html");
        add("Lying Shoulder Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/lying-shoulder-press");
        add("Lying Single Arm Trap Raise", Shoulders, Strength, MassageTable, Isolation, Beginner, Traps, "https://www.muscleandstrength.com/exercises/lying-single-arm-trap-raise");
        add("Serrano Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Advanced, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/serrano-press");

        Exercise.currentFolder = Folder.all.get("Shoulder Presses");
        add("Military Press (AKA Overhead Press)", Shoulders, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/military-press.html");
        add("(T:Barbell) Military Press (AKA Overhead Press)", Shoulders, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/military-press.html");
        domination("Military Press (AKA Overhead Press)", "(T:Barbell) Military Press (AKA Overhead Press)");
        add("Alternate Seated Dumbbell Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/alternate-seated-dumbbell-press.html");
        add("Alternating Standing Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/alternate-standing-dumbbell-press.html");
        add("Alternating Standing Kettlebell Press", Shoulders, Strength, KettleBellsX2, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/alternating-standing-kettlebell-press");
        add("Banded Standing Shoulder Press", Shoulders, Strength, Bands, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/banded-standing-shoulder-press");
        add("Exercise Ball Barbell Shoulder Press", Shoulders, Strength, List.of(ShortBarbell, ExerciseBall), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/swiss-ball-barbell-press.html");
        add("Exercise Ball Dumbbell Shoulder Press", Shoulders, Strength, List.of(ExerciseBall, Dumbbell), Compound, Intermediate, List.of(FrontalAbs, Triceps), "https://www.muscleandstrength.com/exercises/swiss-ball-dumbbell-press.html");
        add("Half Kneeling Bottoms Up Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/half-kneeling-bottoms-up-kettlebell-press");
        add("Half Kneeling Dumbbell Press", Shoulders, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/half-kneeling-dumbbell-press");
        add("Half Kneeling Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/half-kneeling-kettlebell-press");
        add("Military Press Behind Neck", Shoulders, Strength, Rack, Compound, Advanced, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/military-press-behind-neck.html");
        add("One Arm Kettlebell Z Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-kettlebell-z-press");
        add("One Arm Seated Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/one-arm-seated-kettlebell-press");
        add("One-Arm Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-standing-palms-in-dumbbell-press.html");
        add("One-Arm Seated Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-press.html");
        add("(T:Bed) One-Arm Seated Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-press.html");
        domination("One-Arm Seated Dumbbell Shoulder Press", "(T:Bed) One-Arm Seated Dumbbell Shoulder Press");
        add("One-Arm Seated Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-palms-in-dumbbell-press.html");
        add("(T:Bed) One-Arm Seated Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-palms-in-dumbbell-press.html");
        domination("One-Arm Seated Neutral Grip Dumbbell Shoulder Press", "(T:Bed) One-Arm Seated Neutral Grip Dumbbell Shoulder Press");
        add("One-Arm Standing Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-standing-dumbbell-press.html");
        add("Seated Alternating Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/alternate-seated-palms-in-dumbbell-press.html");
        add("(T:Bed) Seated Alternating Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/alternate-seated-palms-in-dumbbell-press.html");
        domination("Seated Alternating Neutral Grip Dumbbell Shoulder Press", "(T:Bed) Seated Alternating Neutral Grip Dumbbell Shoulder Press");
        add("Seated Barbell Shoulder Press", Shoulders, Strength, ShoulderBenchPress, Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-shoulder-press.html");
        add("Seated Behind the Neck Shoulder Press", Shoulders, Strength, ShoulderBenchPress, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-barbell-press-behind-neck.html");
        add("Seated Bradford Press (AKA Seated Rocky Press)", Shoulders, Strength, ShoulderBenchPress, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-alternating-front-back-barbell-press.html");
        add("Seated Dumbbell Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-dumbbell-press.html");
        add("Seated Kettlebell Press", Shoulders, Strength, List.of(InclineBench, KettleBellsX2), Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-kettlebell-press");
        add("Seated Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-palms-in-dumbbell-press.html");
        add("Shoulder Pin Press", Shoulders, Strength, Rack, Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/shoulder-pin-press");
        add("Smith Machine Behind the Neck Shoulder Press", Shoulders, Strength, List.of(Bench, SmithMachine), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/smith-machine-shoulder-press-behind-neck.html");
        add("Smith Machine Shoulder Press", Shoulders, Strength, List.of(Bench, SmithMachine), Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/smith-machine-shoulder-press.html");
        add("Standing Bradford Press (Rocky Press)", Shoulders, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/standing-alternating-front-back-barbell-press.html");
        add("(T:Barbell) Standing Bradford Press (Rocky Press)", Shoulders, Strength, Rack, Compound, Intermediate, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/standing-alternating-front-back-barbell-press.html");
        domination("Standing Bradford Press (Rocky Press)", "(T:Barbell) Standing Bradford Press (Rocky Press)");
        add("Standing Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound,  Beginner, Triceps, "https://www.muscleandstrength.com/exercises/standing-dumbbell-press.html");
        add("Standing Kettlebell Press", Shoulders, Strength, KettleBellsX2, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/standing-kettlebell-press");
        add("Standing Neutral Grip Alternating Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/alternate-one-arm-standing-palms-in-dumbbell-press.html");
        add("Standing Neutral Grip Dumbbell Shoulder Press", Shoulders, Strength, Dumbbell, Compound, Beginner, Triceps, "https://www.muscleandstrength.com/exercises/standing-palms-in-dumbbell-press.html");
        add("Standing One Arm Bottoms Up Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/standing-one-arm-bottoms-up-kettlebell-press");
        add("Standing One Arm Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/standing-one-arm-kettlebell-press");
        add("Tall Kneeling One Arm Bottoms Up Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/tall-kneeling-one-arm-bottoms-up-kettlebell-press");
        add("Tall Kneeling One Arm Kettlebell Press", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/tall-kneeling-one-arm-kettlebell-press");
        add("Trap Bar Shoulder Press", Shoulders, Strength, TrapBar, Compound, Beginner, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/trap-bar-overhead-press");
        add("Z Press", Shoulders, Strength, Rack, Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/z-press");

        Exercise.currentFolder = Folder.all.get("Arnold Presses");
        add("Alternating Standing Arnold Press", Shoulders, Strength, Dumbbell, Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/alternate-standing-arnold-press.html");
        add("One-Arm Seated Arnold Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-arnold-press.html");
        add("(T:Bed) One-Arm Seated Arnold Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-seated-arnold-press.html");
        domination("One-Arm Seated Arnold Press", "(T:Bed) One-Arm Seated Arnold Press");
        add("One-Arm Standing Arnold Press", Shoulders, Strength, Dumbbell, Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/one-arm-standing-arnold-press.html");
        add("Seated Alternating Arnold Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/alternate-seated-arnold-press.html");
        add("(T:Bed) Seated Alternating Arnold Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/alternate-seated-arnold-press.html");
        domination("Seated Alternating Arnold Press", "(T:Bed) Seated Alternating Arnold Press");
        add("Seated Arnold Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-arnold-press.html");
        add("Standing Arnold Press", Shoulders, Strength, Dumbbell, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/standing-arnold-press.html");

        Exercise.currentFolder = Folder.all.get("Dublin Presses");
        add("Dublin Press", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/dublin-press.html");
        add("(T:Bed) Dublin Press", Shoulders, Strength, List.of(Bed, Dumbbell), Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/dublin-press.html");
        domination("Dublin Press", "(T:Bed) Dublin Press");
        add("Standing Dublin Press", Shoulders, Strength, Dumbbell, Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/standing-dublin-press.html");

        Exercise.currentFolder = Folder.all.get("Push Presses");
        add("2 KB Kettlebell Push Press", Shoulders, OlympicWeightlifting, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Traps, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-push-press");
        add("Behind The Neck Push Press", Shoulders, Strength, Rack, Compound, Advanced, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/behind-the-neck-push-press");
        add("Push Press", Shoulders, Strength, Rack, Compound, Beginner, List.of(FrontalAbs, Traps, Triceps), "https://www.muscleandstrength.com/exercises/push-press");

        Exercise.currentFolder = Folder.all.get("Other Mixed Shoulders");
        add("3-D Band Pull Apart", Shoulders, Strength, Bands, Isolation, Intermediate, List.of(FrontalAbs, UpperBack), "https://www.muscleandstrength.com/exercises/3d-band-pull-apart");
        add("Arm Circles", Shoulders, Warmup, Bodyweight, Compound, Beginner, none, "https://www.muscleandstrength.com/exercises/arm-circles");
        add("Banded Y's", Shoulders, Strength, List.of(Pole, Bands), Isolation, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/banded-y");
        add("Barbell Clean and Press", Shoulders, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(Glutes, Hamstrings, LowerBack, Triceps), "https://www.muscleandstrength.com/exercises/clean-press.html");
        add("Dumbbell 6 Ways (Raise)", Shoulders, Strength, Dumbbell, Isolation, Intermediate, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-6-ways");
        add("Forearm Wall Slide", Shoulders, Warmup, Wall, Compound, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/forearm-wall-slide");
        add("Kettlebell Halo", Shoulders, Strength, KettleBellsX1, Compound, Beginner, List.of(Traps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-halo");
        add("Modified Handstand Push Up (Off Box)", Shoulders, Strength, Bench, Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/modified-handstand-push-up-off-box");
        add("(T:Bed) Modified Handstand Push Up (Off Box)", Shoulders, Strength, Bed, Compound, Intermediate, Triceps, "https://www.muscleandstrength.com/exercises/modified-handstand-push-up-off-box");
        domination("Modified Handstand Push Up (Off Box)", "(T:Bed) Modified Handstand Push Up (Off Box)");
        add("No Counter Movement Rotational Medicine Ball Throw", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/no-counter-movement-rotational-med-ball-throw");
        add("Seated Cuban Press", Shoulders, Strength, List.of(InclineBench, Dumbbell), Compound, Intermediate, List.of(Traps, Triceps), "https://www.muscleandstrength.com/exercises/seated-cuban-press");
        add("Spider Crawls", Shoulders, Strength, List.of(BandsMini, Wall), Isolation, Intermediate, List.of(FrontalAbs, UpperBack), "https://www.muscleandstrength.com/exercises/spider-crawls");

        Exercise.currentFolder = Folder.all.get("Internal Rotations");
        add("Banded Internal Rotation", Shoulders, Strength, List.of(Pole, Bands), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/banded-internal-rotation");
        add("Cable Internal Rotation", Shoulders, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/cable-internal-rotation");

        Exercise.currentFolder = Folder.all.get("External Rotations");
        add("Bench Supported Dumbbell External Rotation", Shoulders, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/bench-supported-dumbbell-external-rotation");
        add("Cable External Rotation", Shoulders, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/cable-external-rotation");
        add("Half Kneeling Banded External Rotation", Shoulders, Strength, List.of(Pole, Bands), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/half-kneeling-banded-external-rotation");
        add("Half Kneeling Cable External Rotation", Shoulders, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/half-kneeling-cable-external-rotation");
        add("Knee to Elbow Dumbbell External Rotation", Shoulders, Strength, Dumbbell, Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/knee-to-elbow-dumbbell-external-rotation");
        add("Single Arm Banded External Rotation", Shoulders, Strength, List.of(Pole, Bands), Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/single-arm-banded-external-rotation");
        add("Standing External Rotation (No Money Drill)", Shoulders, Strength, Bands, Isolation, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/standing-external-rotation-no-money");

        Exercise.currentFolder = Folder.all.get("Other Shoulders");
        add("Banded Shoulder Dislocates", Shoulders, Warmup, Bands, Compound, Beginner, Traps, "https://www.muscleandstrength.com/exercises/banded-shoulder-dislocates");
        add("Kettlebell Arm Bar", Shoulders, Warmup, KettleBellsX1, Compound, Intermediate, List.of(Chest, Glutes, HipFlexors, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/kettlebell-arm-bar");
        add("Pronated 90 Degree Band Pull Apart", Shoulders, Warmup, Bands, Compound, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/pronated-90-degree-band-pull-apart");
        add("Quadruped Push Up Plus", Shoulders, Activation, Bodyweight, Compound, Beginner, Chest, "https://www.muscleandstrength.com/exercises/quadruped-push-up-plus");
        add("Reverse Fly Sled Drag", Shoulders, Conditioning, Sled, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Lats, LowerBack, Quads, Traps, UpperBack), "https://www.muscleandstrength.com/exercises/reverse-fly-sled-drag");
        add("Rotational Med Ball Shot Put", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, LowerBack, Quads, UpperBack), "https://www.muscleandstrength.com/exercises/rotational-med-ball-shot-put");
        add("Rotational Medicine Ball Scoop Toss Facing Wall", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads), "https://www.muscleandstrength.com/exercises/rotational-med-ball-scoop-toss-facing-wall");
        add("Rotational Medicine Ball Shuffle Into Shot Put", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, LowerBack, Quads, UpperBack), "https://www.muscleandstrength.com/exercises/rotational-med-ball-shuffle-into-shot-put");
        add("Rotational Medicine Ball Step Behind Shot Put", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, LowerBack, Quads, UpperBack), "https://www.muscleandstrength.com/exercises/rotational-med-ball-step-behind-shot-put");
        add("Rotational Medicine Ball Throw", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/rotational-med-ball-throw");
        add("Scapular Wall Slide", Shoulders, Warmup, Bodyweight, Compound, Beginner, UpperBack, "https://www.muscleandstrength.com/exercises/scapular-wall-slide");
        add("Shuffle Into Rotational Medicine Ball Throw", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/shuffle-into-rotational-medicine-ball-throw");
        add("Split Stance Anti-Rotational Medicine Ball Scoop Toss", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Lats, UpperBack), "https://www.muscleandstrength.com/exercises/split-stance-anti-rotational-medicine-ball-scoop-toss");
        add("Step Behind Rotational Medicine Ball Throw", Shoulders, Plyometrics, List.of(Wall, MedicineBall), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, Quads, Triceps, UpperBack), "https://www.muscleandstrength.com/exercises/step-behind-rotational-medicine-ball-throw");
        add("Supinated 90 Degree Band Pull Apart", Shoulders, Warmup, Bands, Compound, Beginner, List.of(UpperBack), "https://www.muscleandstrength.com/exercises/supinated-90-degree-band-pull-apart");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Traps
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Shrugs");
        add("Barbell Shrug", Traps, Strength, Rack, Isolation, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/barbell-shrug.html");
        add("Dumbbell Shrug", Traps, Strength, Dumbbell, Isolation, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/dumbbell-shrugs.html");
        add("Behind-The-Back Barbell Shrug", Traps, Strength, Rack, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/behind-the-back-barbell-shrug.html");
        add("Cable Shrug", Traps, Strength, DoubleCable, Isolation, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/cable-shrug.html");
        add("Clean Shrug", Traps, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Quads, Shoulders), "https://www.muscleandstrength.com/exercises/clean-shrug");
        add("Gittleson Shrug", Traps, Strength, List.of(Bench, Dumbbell), Isolation, Advanced, List.of(Shoulders,  UpperBack), "https://www.muscleandstrength.com/exercises/gittleson-shrug");
        add("Inverted Shrug", Traps, Strength, Rack, Isolation, Intermediate, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/inverted-shrug");
        add("Lying Cable Shrug", Traps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-cable-shrug.html");
        add("Overhead Barbell Shrug", Traps, Strength, Rack, Isolation, Intermediate, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/overhead-barbell-shrug");
        add("Seated Cable Shrug", Traps, Strength, List.of(LowCable, VBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-cable-shrug.html");
        add("Seated Dumbbell Shrug", Traps, Strength, List.of(Bench,  Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-dumbbell-shrug.html");
        add("Smith Machine Shrug", Traps, Strength, SmithMachine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-shrug.html");
        add("Snatch Grip Barbell Shrug", Traps, Strength, Rack, Isolation, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-barbell-shrug");
        add("Snatch Shrug", Traps, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-shrug");
        add("T-Bar Machine Shrug", Traps, Strength, TBar, Isolation, Intermediate, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/t-bar-machine-shrug");
        add("Trap Bar Shrug", Traps, Strength, TrapBar, Isolation, Beginner, List.of(Shoulders, Traps), "https://www.muscleandstrength.com/exercises/trap-bar-shrug");

        Exercise.currentFolder = Folder.all.get("High Pulls");
        add("1 KB Kettlebell Sumo Deadlift High Pull", Traps, OlympicWeightlifting, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/1-kb-kettlebell-sumo-deadlift-high-pull");
        add("2 KB Kettlebell Sumo Deadlift High Pull", Traps, OlympicWeightlifting, KettleBellsX2, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/2-kb-kettlebell-sumo-deadlift-high-pull");
        add("High Pull", Traps, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Forearms, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/high-pull");
        add("Snatch Grip High Pull", Traps, OlympicWeightlifting, Barbell, Compound, Intermediate, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/snatch-grip-high-pull");
        add("Sumo High Pull", Traps, OlympicWeightlifting, Barbell, Compound, Beginner, List.of(FrontalAbs, Adductors, Biceps, Calves, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/sumo-high-pull");

        Exercise.currentFolder = Folder.all.get("Trap Upright Rows");
        add("Barbell Upright Row", Traps, Strength, ShortBarbell, Compound, Beginner, List.of(Biceps, Shoulders), "https://www.muscleandstrength.com/exercises/upright-row.html");
        add("Cable Row to Neck", Traps, Strength, List.of(LowCable, CableAttachmentRope), Compound, Beginner, List.of(Lats, Shoulders), "https://www.muscleandstrength.com/exercises/cable-row-to-neck.html");
        add("Lying Cable Upright Row", Traps, Strength, List.of(LowCable, CableAttachmentStraightBar), Compound, Intermediate, Biceps, "https://www.muscleandstrength.com/exercises/lying-cable-upright-row.html");
        add("One-Arm Dumbbell Upright Row", Traps, Strength, Dumbbell, Compound, Beginner, Biceps, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-upright-row.html");
        add("Wide Grip Upright Row", Traps, Strength, Rack, Compound, Intermediate, List.of(Lats, Shoulders), "https://www.muscleandstrength.com/exercises/wide-grip-upright-rows.html");

        Exercise.currentFolder = Folder.all.get("Other Traps");
        add("Trap Lacrosse Ball", Traps, SMR, LacrosseBall, Compound, Intermediate, none, "https://www.muscleandstrength.com/exercises/trap-lacrosse-ball");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Triceps
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Tricep Bench Presses");
        add("Close Grip Bench Press", Triceps, Strength, BenchPress, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/close-grip-bench-press.html");
        add("Close Grip Chest Press", Triceps, Strength, BenchPress, Compound, Beginner, Chest, "https://www.muscleandstrength.com/exercises/close-grip-chest-press.html");
        add("Close Grip EZ Bar Press", Triceps, Strength, List.of(Bench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/close-grip-ez-bar-press");
        add("Close Grip Pin Press", Triceps, Strength, List.of(Bench, Rack), Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/close-grip-pin-press");
        add("Decline Close Grip Bench Press", Triceps, Strength, DeclineBenchPress, Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/decline-close-grip-bench-press.html");
        add("Incline Close Grip Bench Press", Triceps, Strength, InclineBenchPress, Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/incline-close-grip-bench-press.html");
        add("Reverse Grip Close Grip Bench Press", Triceps, Strength, BenchPress, Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/reverse-grip-close-grip-bench-press.html");
        add("Smith Machine Close Grip Bench Press", Triceps, Strength, List.of(Bench, SmithMachine), Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/smith-machine-close-grip-bench-press.html");
        add("Smith Machine Reverse Close Grip Bench Press", Triceps, Strength, List.of(Bench, SmithMachine), Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/smith-machine-reverse-close-grip-bench-press.html");
        add("Twisting Dumbbell Bench Press", Triceps, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/twisting-dumbbell-bench-press.html");

        Exercise.currentFolder = Folder.all.get("Tricep Extensions");
        add("EZ Bar Skullcrusher", Triceps, Strength, List.of(Bench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-skullcrusher.html");
        add("(T:Bed) EZ Bar Skullcrusher", Triceps, Strength, List.of(Bed, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-skullcrusher.html");
        domination("EZ Bar Skullcrusher", "(T:Bed) EZ Bar Skullcrusher");
        add("45 Degree Lying Tricep Extension", Triceps, Strength, List.of(Bench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/back-of-the-head-lying-tricep-extension.html");
        add("(T:Bed) 45 Degree Lying Tricep Extension", Triceps, Strength, List.of(Bed, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/back-of-the-head-lying-tricep-extension.html");
        domination("45 Degree Lying Tricep Extension", "(T:Bed) 45 Degree Lying Tricep Extension");
        add("45 Degree Lying Tricep Extension (EZ Bar)", Triceps, Strength, List.of(Bench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/ez-bar-back-of-the-head-lying-tricep-extension.html");
        add("(T:Bed) 45 Degree Lying Tricep Extension (EZ Bar)", Triceps, Strength, List.of(Bed, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/ez-bar-back-of-the-head-lying-tricep-extension.html");
        domination("45 Degree Lying Tricep Extension (EZ Bar)", "(T:Bed) 45 Degree Lying Tricep Extension (EZ Bar)");
        add("Alternating Lying Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/alternate-lying-dumbbell-extension.html");
        add("(T:Bed) Alternating Lying Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/alternate-lying-dumbbell-extension.html");
        domination("Alternating Lying Dumbbell Extension", "(T:Bed) Alternating Lying Dumbbell Extension");
        add("Banded Skullcrusher", Triceps, Strength, List.of(Bench, Bands), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/banded-skullcrusher");
        add("(T:Bed) Banded Skullcrusher", Triceps, Strength, List.of(Bed, Bands), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/banded-skullcrusher");
        domination("Banded Skullcrusher", "(T:Bed) Banded Skullcrusher");
        add("Banded Tricep Extension", Triceps, Strength, List.of(FixedUpperBar, Bands), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/banded-tricep-extension");
        add("Cable Concentration Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-concentration-tricep-extension.html");
        add("Cable Tricep Extension With V-Bar", Triceps, Strength, List.of(TopCable, CableAttachmentBentBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-tricep-extension-with-v-bar.html");
        add("Decline Lying Dumbbell Extension", Triceps, Strength, List.of(DeclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-lying-dumbbell-extension.html");
        add("Decline Lying Tricep Extension (Skullcrusher)", Triceps, Strength, List.of(DeclineBench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/decline-lying-tricep-extension-skullcrusher.html");
        add("Exercise Ball One-Arm Dumbbell Extension", Triceps, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/exercise-ball-one-arm-dumbbell-extension.html");
        add("Exercise Ball Two-Arm Dumbbell Extension", Triceps, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/exercise-ball-two-arm-dumbbell-extension.html");
        add("EZ Bar Incline Skullcrusher", Triceps, Strength, List.of(InclineBench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/ez-bar-incline-skullcrusher.html");
        add("High Pulley Overhead Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/high-pulley-overhead-tricep-extension.html");
        add("High Pulley Overhead Tricep Extension (Rope Extension)", Triceps, Strength, List.of(TopCable, CableAttachmentRope), Isolation, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/overhead-tricep-extension.html");
        add("Incline Cable Tricep Extension", Triceps, Strength, List.of(InclineBench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/incline-cable-tricep-extension.html");
        add("Incline Cable Tricep Extension (Rope Extension)", Triceps, Strength, List.of(InclineBench, LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/incline-bench-rope-extension.html");
        add("Incline Dumbbell Tricep Extension", Triceps, Strength, List.of(InclineBench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/incline-two-arm-dumbbell-extension.html");
        add("Incline Skull Crusher", Triceps, Strength, List.of(InclineBench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/incline-skullcrusher.html");
        add("Lying Barbell Reverse Extension", Triceps, Strength, List.of(Bench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-barbell-reverse-extension.html");
        add("(T:Bed) Lying Barbell Reverse Extension", Triceps, Strength, List.of(Bed, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-barbell-reverse-extension.html");
        domination("Lying Barbell Reverse Extension", "(T:Bed) Lying Barbell Reverse Extension");
        add("Lying Barbell Tricep Extension (Skull Crusher)", Triceps, Strength, List.of(Bench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-tricep-extension.html");
        add("(T:Bed) Lying Barbell Tricep Extension (Skull Crusher)", Triceps, Strength, List.of(Bed, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-tricep-extension.html");
        domination("Lying Barbell Tricep Extension (Skull Crusher)", "(T:Bed) Lying Barbell Tricep Extension (Skull Crusher)");
        add("Lying Cable Tricep Extension", Triceps, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-cable-tricep-extension.html");
        add("Lying Cable Tricep Extension (Rope Extension)", Triceps, Strength, List.of(LowCable, CableAttachmentRope), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/lying-on-floor-tricep-extension-(rope-extension).html");
        add("Lying Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/lying-dumbbell-extension.html");
        add("(T:Bed) Lying Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/lying-dumbbell-extension.html");
        domination("Lying Dumbbell Extension", "(T:Bed) Lying Dumbbell Extension");
        add("Lying Dumbbell Extension (Single Dumbbell)", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/lying-single-dumbbell-extension.html");
        add("(T:Bed) Lying Dumbbell Extension (Single Dumbbell)", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/lying-single-dumbbell-extension.html");
        domination("Lying Dumbbell Extension (Single Dumbbell)", "(T:Bed) Lying Dumbbell Extension (Single Dumbbell)");
        add("Lying Pronated Dumbbell Tricep Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-pronated-dumbbell-tricep-extension");
        add("(T:Bed) Lying Pronated Dumbbell Tricep Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/lying-pronated-dumbbell-tricep-extension");
        domination("Lying Pronated Dumbbell Tricep Extension", "(T:Bed) Lying Pronated Dumbbell Tricep Extension");
        add("One-Arm Cable Overhead Tricep Extension", Triceps, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-standing-overhead-cable-tricep-extension.html");
        add("One-Arm Cable Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-cable-extension.html");
        add("One-Arm Lying Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-lying-dumbbell-extension.html");
        add("(T:Bed) One-Arm Lying Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-lying-dumbbell-extension.html");
        domination("One-Arm Lying Dumbbell Extension", "(T:Bed) One-Arm Lying Dumbbell Extension");
        add("One-Arm Lying Pronated Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-pronated-dumbbell-extension.html");
        add("(T:Bed) One-Arm Lying Pronated Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-pronated-dumbbell-extension.html");
        domination("One-Arm Lying Pronated Dumbbell Extension", "(T:Bed) One-Arm Lying Pronated Dumbbell Extension");
        add("One-Arm Seated Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-extension.html");
        add("(T:Bed) One-Arm Seated Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-extension.html");
        domination("One-Arm Seated Dumbbell Extension", "(T:Bed) One-Arm Seated Dumbbell Extension");
        add("One-Arm Seated Overhead Tricep Extension", Triceps, Strength, List.of(Bench, LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-overhead-tricep-extension.html");
        add("One-Arm Standing Dumbbell Extension", Triceps, Strength, Dumbbell, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/one-arm-dumbbell-extension.html");
        add("Overhead Banded Tricep Extension", Triceps, Strength, List.of(FixedUpperBar, Bands), Isolation, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/overhead-banded-tricep-extension");
        add("Reverse Grip Cable Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-tricep-extension.html");
        add("Reverse Grip One-Arm Overhead Cable Tricep Extension", Triceps, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-one-arm-standing-overhead-cable-tricep-extension.html");
        add("Reverse Grip Skull Crusher", Triceps, Strength, List.of(Bench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-grip-skullcrusher.html");
        add("(T:Bed) Reverse Grip Skull Crusher", Triceps, Strength, List.of(Bed, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-grip-skullcrusher.html");
        domination("Reverse Grip Skull Crusher", "(T:Bed) Reverse Grip Skull Crusher");
        add("Reverse One-Arm Cable Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-one-arm-tricep-pushdown.html");
        add("Rolling Dumbbell Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rolling-dumbbell-extension");
        add("(T:Bed) Rolling Dumbbell Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rolling-dumbbell-extension");
        domination("Rolling Dumbbell Extension", "(T:Bed) Rolling Dumbbell Extension");
        add("Rope Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/rope-tricep-extension.html");
        add("Seated Dumbbell Tricep Extension", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-dumbbell-extension.html");
        add("(T:Bed) Seated Dumbbell Tricep Extension", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-dumbbell-extension.html");
        domination("Seated Dumbbell Tricep Extension", "(T:Bed) Seated Dumbbell Tricep Extension");
        add("Seated Low Pulley Overhead Tricep Extension", Triceps, Strength, List.of(Bench, LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-low-pulley-overhead-tricep-extension.html");
        add("Seated Low Pulley Overhead Tricep Extension (Rope Extension)", Triceps, Strength, List.of(Bench, LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-low-pulley-overhead-tricep-extension-(rope-extension).html");
        add("Seated Reverse Grip One-Arm Overhead Tricep Extension", Triceps, Strength, List.of(Bench, LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-one-arm-seated-overhead-tricep-extension.html");
        add("Smith Machine Incline Tricep Extension", Triceps, Strength, List.of(InclineBench, SmithMachine), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/smith-machine-incline-tricep-extension.html");
        add("Standing Low Pulley Overhead Tricep Extension", Triceps, Strength, List.of(LowCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-low-pulley-overhead-tricep-extension.html");
        add("Standing Low Pulley Overhead Tricep Extension (Rope Extension)", Triceps, Strength, List.of(LowCable, CableAttachmentRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-low-pulley-overhead-tricep-extension-(rope-extension).html");
        add("Standing Overhead EZ Bar Tricep Extension", Triceps, Strength, ZBar, Isolation, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/standing-overhead-ez-bar-tricep-extension");
        add("Straight Bar Tricep Extension", Triceps, Strength, List.of(TopCable, CableAttachmentStraightBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/tricep-extension.html");
        add("Two Arm Standing Dumbbell Extension", Triceps, Strength, Dumbbell, Isolation, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/two-arm-standing-dumbbell-extension.html");
        add("Two-Arm Tricep Cable Extension", Triceps, Strength, DoubleCable, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-two-arm-tricep-cable-extension.html");

        Exercise.currentFolder = Folder.all.get("Tricep Dips");
        add("Weighted Tricep Dips", Triceps, Strength, List.of(DipStation, WeightStrap), Compound, Advanced, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/weighted-tricep-dips.html");
        add("Band Assisted Dip", Triceps, Strength, List.of(DipStation, Bands), Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/band-assisted-dip");
        add("Bench Dip", Triceps, Strength, Bench, Compound, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/tricep-bench-dip.html");
        add("Eccentric Only Dip", Triceps, Strength, DipStation, Compound, Beginner, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/eccentric-only-dip");
        add("Exercise Ball Dip", Triceps, Strength, ExerciseBall, Compound, Intermediate, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/exercise-ball-dip.html");
        add("Ring Dip", Triceps, Strength, Rings, Compound, Advanced, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/ring-dip");
        add("Single Bench Dip", Triceps, Strength, Bench, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/single-bench-dip.html");
        add("(T:Bed) Single Bench Dip", Triceps, Strength, Bed, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/single-bench-dip.html");
        domination("Single Bench Dip", "(T:Bed) Single Bench Dip");
        add("Three Bench Dip", Triceps, Strength, Bench, Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/three-bench-dip.html");
        add("Tricep Dip", Triceps, Strength, DipStation, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/tricep-dip.html");
        add("Weighted Bench Dip", Triceps, Strength, List.of(Bench, Disk), Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/weighted-bench-dips.html");
        add("Weighted Three Bench Dip", Triceps, Strength, List.of(Bench, Disk), Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/weighted-three-bench-dips.html");

        Exercise.currentFolder = Folder.all.get("Kickbacks");
        add("Alternating Bent-Over Dumbbell Kickback", Triceps, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-bent-over-dumbbell-kickback.html");
        add("Bent Over Dumbbell Tricep Kickback", Triceps, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/bent-over-dumbbell-kickback.html");
        add("Cable Tricep Kickback", Triceps, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/cable-tricep-kickback.html");
        add("Dumbbell Tricep Kickback", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/tricep-kickback.html");
        add("(T:Bed) Dumbbell Tricep Kickback", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/tricep-kickback.html");
        domination("Dumbbell Tricep Kickback", "(T:Bed) Dumbbell Tricep Kickback");
        add("Exercise Ball Dumbbell Kickbacks", Triceps, Strength, List.of(ExerciseBall, Dumbbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/exercise-ball-dumbbell-kickbacks.html");
        add("One Arm Bent Over Dumbbell Tricep Kickback", Triceps, Strength, Dumbbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-bent-over-dumbbell-kickback.html");
        add("One-Arm Seated Bent Over Dumbbell Kickback", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-bent-over-dumbbell-kickback.html");
        add("One-Arm Seated Dumbbell Kickback", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-arm-seated-dumbbell-kickback.html");
        add("Reverse Grip Cable Tricep Kickback", Triceps, Strength, List.of(LowCable, CableAttachmentSingleArm), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/reverse-grip-cable-tricep-kickback.html");
        add("Seated Alternating Bent Over Dumbbell Kickback", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/alternate-seated-bent-over-dumbbell-kickback.html");
        add("Seated Bent Over Tricep Dumbbell Kickback", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-bent-over-dumbbell-kickback.html");
        add("Two-Arm Cable Tricep Kickback", Triceps, Strength, List.of(LowCable, CableAttachmentLongRope), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/two-arm-cable-tricep-kickback.html");

        Exercise.currentFolder = Folder.all.get("French Press");
        add("Exercise Ball French Press", Triceps, Strength, List.of(ExerciseBall, ShortBarbell), Isolation, Intermediate, FrontalAbs, "https://www.muscleandstrength.com/exercises/swiss-ball-french-press.html");
        add("French Press", Triceps, Strength, ShortBarbell, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/french-press.html");
        add("Inline Bench French Press", Triceps, Strength, List.of(InclineBench, ShortBarbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/inline-bench-french-press.html");
        add("Reverse Grip French Press", Triceps, Strength, ShortBarbell, Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-grip-french-press.html");
        add("Reverse Grip Seated French Press", Triceps, Strength, List.of(Bench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-grip-seated-french-press.html");
        add("(T:Bed) Reverse Grip Seated French Press", Triceps, Strength, List.of(Bed, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/reverse-grip-seated-french-press.html");
        domination("Reverse Grip Seated French Press", "(T:Bed) Reverse Grip Seated French Press");
        add("Seated EZ Bar French Press", Triceps, Strength, List.of(InclineBench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/seated-ez-bar-french-press");
        add("Seated French Press", Triceps, Strength, List.of(Bench, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/overhead-barbell-extension.html");
        add("(T:Bed) Seated French Press", Triceps, Strength, List.of(Bed, ShortBarbell), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/overhead-barbell-extension.html");
        domination("Seated French Press", "(T:Bed) Seated French Press");

        Exercise.currentFolder = Folder.all.get("Floor Presses");
        add("Alternating Dumbbell Floor Press", Triceps, Strength, Dumbbell, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/alternate-dumbbell-floor-press");
        add("Dumbbell Floor Press", Triceps, Strength, Dumbbell, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/dumbbell-floor-press.html");
        add("Kettlebell Floor Press", Triceps, Strength, KettleBellsX2, Compound, Beginner, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/kettlebell-floor-press");
        add("One Arm Bottoms Up Kettlebell Floor Press", Triceps, Strength, KettleBellsX1, Compound, Intermediate, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/one-arm-bottoms-up-kettlebell-floor-press");
        add("One Arm Kettlebell Floor Press", Triceps, Strength, KettleBellsX1, Compound, Beginner, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/one-arm-kettlebell-floor-press");

        Exercise.currentFolder = Folder.all.get("Triceps Push ups");
        add("Close Grip Push Up", Triceps, Strength, Bodyweight, Compound, Beginner, Shoulders, "https://www.muscleandstrength.com/exercises/close-grip-push-up.html");
        add("Sphinx Push Up", Triceps, Strength, Bodyweight, Compound, Advanced, List.of(FrontalAbs, Chest, Shoulders), "https://www.muscleandstrength.com/exercises/sphinx-push-up");

        Exercise.currentFolder = Folder.all.get("Other Triceps");
        add("California Skullcrusher", Triceps, Strength, List.of(Bench, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/california-skullcrusher");
        add("(T:Bed) California Skullcrusher", Triceps, Strength, List.of(Bed, ZBar), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/california-skullcrusher");
        domination("California Skullcrusher", "(T:Bed) California Skullcrusher");
        add("Close Grip Press Behind-The-Neck", Triceps, Strength, List.of(Bench, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/close-grip-press-behind-neck.html");
        add("(T:Bed) Close Grip Press Behind-The-Neck", Triceps, Strength, List.of(Bed, ZBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/close-grip-press-behind-neck.html");
        domination("Close Grip Press Behind-The-Neck", "(T:Bed) Close Grip Press Behind-The-Neck");
        add("Dumbbell Tate Press", Triceps, Strength, List.of(Bench, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-tate-press");
        add("(T:Bed) Dumbbell Tate Press", Triceps, Strength, List.of(Bed, Dumbbell), Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/dumbbell-tate-press");
        domination("Dumbbell Tate Press", "(T:Bed) Dumbbell Tate Press");
        add("Kneeling Overhead Tricep Extension (Over Flat Bench)", Triceps, Strength, List.of(Bench, TopCable, CableAttachmentStraightBar), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/kneeling-overhead-tricep-extension-over-flat-bench.html");
        add("Overhead Tricep Extension Sled Drag", Triceps, Conditioning, Sled, Compound, Beginner, FrontalAbs, "https://www.muscleandstrength.com/exercises/overhead-tricep-extension-sled-drag");
//        add("Tate Press", Triceps, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Chest, Shoulders), "https://www.muscleandstrength.com/exercises/tate-press.html"); Duplicate of Dumbbell Tate Press
        add("Tricep Tiger Tail", Triceps, SMR, TigerTail, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/tricep-tiger-tail");
        add("Triceps Lacrosse Ball", Triceps, SMR, List.of(Bench, LacrosseBall), Isolation, Intermediate, none, "https://www.muscleandstrength.com/exercises/triceps-lacrosse-ball");
    }
}
