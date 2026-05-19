package tudor.exercises;

import tudor.enums.Muscle;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.*;
import static tudor.enums.Level.*;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Mechanics.Isolation;
import static tudor.enums.Muscle.*;
import static tudor.exercises.Exercise.add;
import static tudor.exercises.Exercise.domination;

/*
Go to location > manage exercises: you'll find all exercises listed alphabetically
 */
public class FitBod {
    public static void init() {
        List<Muscle> none = List.of();

        add("(FB) 1-Step Box Jump", "Other Quads", Quads, Strength, Box, Compound, Beginner, List.of(Abs, Calves, Hamstrings, Glutes), "https://fitbod.me/exercises/1-step-box-jump");
        add("(FB) 1/2 Kneeling Shotgun Row", "Lat Rows", UpperBack, Strength, List.of(FlexiCable, CableAttachmentSingleArm), Compound, Beginner, List.of(Abs, Shoulders, Biceps), "https://fitbod.me/exercises/1-2-kneeling-shotgun-row");

        add("(FB) 2-Box Depth Jump", "Other Quads", Quads, Strength, Boxx2, Compound, Advanced, List.of(Abs, Calves, Hamstrings, Glutes), "https://fitbod.me/exercises/2-box-depth-jump");
        add("(FB) 21's", "Standing Curls", Biceps, Strength, ZBar, Isolation, Beginner, none, "https://fitbod.me/exercises/21-s");

        add("(FB) A-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Beginner, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/a-skips");
        add("(FB) AB-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Intermediate, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/ab-skips");
        add("(FB) AC-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Intermediate, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/ab-skips");
        add("(FB) AC-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Intermediate, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/ab-skips");
        add("(FB) ACB-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Advanced, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/ab-skips");
        add("(FB) Ab Rollout", "Rollouts", Abs, Strength, AbsWheel, Compound, Intermediate, List.of(Shoulders, LowerBack), "https://fitbod.me/exercises/ab-rollout");
        add("(FB) Air Squats", "Squats", Quads, Strength, Bodyweight, Compound, Beginner, List.of(Hamstrings, Glutes, Abductors), "https://fitbod.me/exercises/air-squats");
        add("(FB) Airplane", "Other Hamstrings", Hamstrings, Strength, Bodyweight, Compound, Intermediate, none, "https://fitbod.me/exercises/airplane");
        add("(FB) Alternating Dumbbell Bench Press", "Bench Presses", Chest, Strength, List.of(Dumbbell, Bench), Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/alternating-dumbbell-bench-press");
        add("(FB) Alternating Heel Touch", "Other Obliques", Obliques, Strength, Bodyweight, Isolation, Beginner, none, "https://fitbod.me/exercises/alternating-heel-touch");
        add("(FB) Alternating Lunge Jumps", "Lunges", Quads, Strength, Bodyweight, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/alternating-lunge-jumps");
        add("(FB) Alternating Medicine Ball Push Up", "Push Ups", Chest, Strength, MedicineBall, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/alternating-medicine-ball-push-up");
        add("(FB) Alternating Single Arm Kettlebell Swing", "Kettlebell Swings", Hamstrings, Strength, KettleBellsX1, Compound, Advanced, List.of(Forearms, Glutes, LowerBack), "https://fitbod.me/exercises/alternating-single-arm-kettlebell-swing");
        add("(FB) Alternating Superman", "Other lower back", LowerBack, Strength, GymMats, Compound, Beginner, List.of(Hamstrings, UpperBack, Glutes), "https://fitbod.me/exercises/alternating-superman");
        add("(FB) Ankle Circles", "Calves", Calves, Warmup, Bodyweight, Compound, Beginner, none, "https://fitbod.me/exercises/ankle-circles");
        add("(FB) Anterior Isometric Neck", "Neck", Neck, Warmup, Bodyweight, Compound, Beginner, none, "https://fitbod.me/exercises/anterior-isometric-neck");
        add("(FB) Archer Pull Up", "Pull ups", Lats, Strength, FixedUpperBar, Compound, Advanced, Biceps, "https://fitbod.me/exercises/archer-pull-up");
        add("(FB) Arnold Dumbbell Press", "Arnold Presses", Shoulders, Strength, List.of(Bench, Dumbbell), Compound, Intermediate, List.of(Triceps, Biceps), "https://fitbod.me/exercises/arnold-dumbbell-press");
        add("(FB) Around the Worlds", "Other Chest", Chest, Strength, List.of(Bench, Dumbbell), Compound, Beginner, none, "https://fitbod.me/exercises/around-the-worlds");
        add("(FB) Australian Chin Up", "Chin ups", UpperBack, Strength, Rack, Compound, Beginner, Biceps, "https://fitbod.me/exercises/australian-chin-up");
        add("(FB) Australian Crawl", "Chin ups", LowerBack, Strength, GymMats, Compound, Beginner, List.of(Glutes, Shoulders, UpperBack), "https://fitbod.me/exercises/australian-crawl");

        add("(FB) B-Skips", "Calves", Calves, Strength, Bodyweight, Compound, Beginner, List.of(Abs, Hamstrings, Quads, Glutes), "https://fitbod.me/exercises/b-skips");
        add("(FB) Back Extensions", "Back Extensions", LowerBack, Strength, LowerBackStand2, Compound, Beginner, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/back-extensions");
        add("(FB) Back Squat", "Squats", Quads, Strength, Rack, Compound, Intermediate, List.of(Hamstrings, Glutes, Abs, LowerBack, Calves), "https://fitbod.me/exercises/back-squat");
        add("(FB) Backward Arm Circle", "Other Mixed Shoulders", Shoulders, Warmup, Bodyweight, Compound, Beginner, none, "https://fitbod.me/exercises/backward-arm-circle");
        add("(FB) Balance Holds With Band Pull Aparts (Pregnancy)", "Other Upper Back", UpperBack, Pregnancy, Bands, Compound, Beginner, Shoulders, "N/A");
        add("(FB) Balance Trainer Alternating Lunge", "Lunges", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-alternating-lunge");
        add("(FB) Balance Trainer Alternating Lunge Jumps", "Lunges", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-alternating-lunge-jumps");
        add("(FB) Balance Trainer Balance Bar Hip Thrusters", "Hip Thrusts", Glutes, Strength, List.of(BosuBall, PvcPipe), Compound, Intermediate, List.of(Quads, Hamstrings, Calves), "https://fitbod.me/exercises/balance-trainer-balance-bar-hip-thrusters");
        add("(FB) Balance Trainer Bar Assisted Dome Squat", "Squats", Quads, Strength, List.of(BosuBall, PvcPipe), Compound, Beginner, List.of(Hamstrings, Shoulders, Glutes), "https://fitbod.me/exercises/balance-trainer-bar-assisted-dome-squat");
        add("(FB) Balance Trainer Bird Dog", "Bird Dog", Abs, Strength, BosuBall, Compound, Intermediate, List.of(LowerBack, Glutes), "https://fitbod.me/exercises/balance-trainer-bird-dog");
        add("(FB) Balance Trainer Braced Bicycle Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-bicycle-kicks");
        add("(FB) Balance Trainer Braced Frog Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-frog-kicks");
        add("(FB) Balance Trainer Burpee", "Other Quads", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, LowerBack, Abs), "https://fitbod.me/exercises/balance-trainer-burpee");
        add("(FB) Balance Trainer Burpee with Pushup", "Other Quads", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Chest, Triceps, LowerBack, Abs), "https://fitbod.me/exercises/balance-trainer-burpee-with-pushup");
        add("(FB) Balance Trainer Cable Crunch With Side Bends", "Other Obliques", Obliques, Strength, List.of(BosuBall, DoubleCable), Compound, Beginner, none, "https://fitbod.me/exercises/balance-trainer-cable-crunch-with-side-bends");
        add("(FB) Balance Trainer Crunch", "Crunches", Abs, Strength, BosuBall, Compound, Beginner, none, "https://fitbod.me/exercises/balance-trainer-crunch");
        add("(FB) Balance Trainer Curtsy Lunge", "Lunges", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-curtsy-lunge");
        add("(FB) Balance Trainer Dome Push Ups", "Push Ups", Chest, Strength, BosuBall, Compound, Intermediate, Triceps, "https://fitbod.me/exercises/balance-trainer-dome-push-ups");
        add("(FB) Balance Trainer Front-Back Cross Jumps", "Calves", Calves, Strength, BosuBall, Compound, Intermediate, Quads, "https://fitbod.me/exercises/balance-trainer-front-back-cross-jumps");
        add("(FB) Balance Trainer Goblet Squat", "Squats", Quads, Strength, List.of(BosuBall, KettleBellsX1), Compound, Advanced, List.of(Shoulders, Hamstrings, Glutes, LowerBack), "https://fitbod.me/exercises/balance-trainer-goblet-squat");
        add("(FB) Balance Trainer Hesitation Lunges", "Lunges", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-hesitation-lunges");
        add("(FB) Balance Trainer Incline Push Up", "Push Ups", Chest, Strength, List.of(BosuBall, Aerobic_Step), Compound, Beginner, Triceps, "https://fitbod.me/exercises/balance-trainer-incline-push-up");
        add("(FB) Balance Trainer Knee Up Squats", "Squats", Quads, Strength, BosuBall, Compound, Intermediate, List.of(Glutes, Abs, Hamstrings, Calves), "https://fitbod.me/exercises/balance-trainer-knee-up-squats");
        add("(FB) Balance Trainer Lateral Cross Over Jumps", "Calves", Calves, Strength, BosuBall, Compound, Beginner, Quads, "https://fitbod.me/exercises/balance-trainer-lateral-cross-over-jumps");
        add("(FB) Balance Trainer Lateral Dome Squats", "Squats", Quads, Strength, BosuBall, Compound, Beginner, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-lateral-dome-squats");
        add("(FB) Balance Trainer Lateral Floor Toe Taps", "Calves", Calves, Strength, BosuBall, Compound, Beginner, Quads, "https://fitbod.me/exercises/balance-trainer-lateral-floor-toe-taps");
        add("(FB) Balance Trainer Lateral Jumps", "Calves", Calves, Strength, BosuBall, Compound, Beginner, Quads, "https://fitbod.me/exercises/balance-trainer-lateral-jumps");
        add("(FB) Balance Trainer Leg Crossover Planks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-leg-crossover-planks");
        add("(FB) Balance Trainer Lying Toe Taps", "Other Glutes", Glutes, Strength, List.of(GymMats, BosuBall), Compound, Intermediate, List.of(Abs, Hamstrings), "https://fitbod.me/exercises/balance-trainer-lying-toe-taps");
        add("(FB) Balance Trainer Mountain Climber", "Other Quads", Quads, Strength, BosuBall, Compound, Beginner, List.of(Shoulders, Hamstrings, Chest), "https://fitbod.me/exercises/balance-trainer-mountain-climber");
        add("(FB) Balance Trainer Narrow Push Up", "Push Ups", Chest, Strength, BosuBall, Compound, Advanced, Triceps, "https://fitbod.me/exercises/balance-trainer-narrow-push-up");
        add("(FB) Balance Trainer Overhead Weighted Crunch", "Crunches", Abs, Strength, List.of(BosuBall, MedicineBall), Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-overhead-weighted-crunch");
        add("(FB) Balance Trainer Plank", "Planks", Abs, Strength, BosuBall, Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-plank");
        add("(FB) Balance Trainer Push Up", "Push Ups", Chest, Strength, BosuBall, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-push-up");
        add("(FB) Balance Trainer Rear Glute Raises", "Other Glutes", Glutes, Strength, BosuBall, Compound, Intermediate, List.of(Abs, Shoulders), "https://fitbod.me/exercises/balance-trainer-rear-glute-raises");
        add("(FB) Balance Trainer Rear Lunge Kicks", "Lunges", Quads, Strength, BosuBall, Compound, Beginner, List.of(Calves, Glutes, Hamstrings), "https://fitbod.me/exercises/balance-trainer-rear-lunge-kicks");
        add("(FB) Balance Trainer Reverse Hyperextension", "Other Glutes", Glutes, Strength, BosuBall, Compound, Beginner, LowerBack, "https://fitbod.me/exercises/balance-trainer-reverse-hyperextension");
        add("(FB) Balance Trainer Russian Twist", "Twists", Abs, Strength, List.of(BosuBall, Disk), Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-russian-twist");
        add("(FB) Balance Trainer Shoulder Tap Planks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-shoulder-tap-planks");
        add("(FB) Balance Trainer Side Star Plank", "Side Planks", Abs, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-side-star-plank");
        add("(FB) Balance Trainer Single Leg Crunches", "Crunches", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-single-leg-crunches");
        add("(FB) Balance Trainer Single Leg Glute Drop", "Other Glutes", Quads, Strength, List.of(BosuBall, PvcPipe), Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-single-leg-glute-drop");
        add("(FB) Balance Trainer Single Leg Hip Thrusters", "Hip Thrusts", Glutes, Strength, List.of(BosuBall, GymMats), Compound, Intermediate, List.of(Abs, Quads, Calves, Hamstrings), "https://fitbod.me/exercises/balance-trainer-single-leg-hip-thrusters");
        add("(FB) Balance Trainer Single Leg Kneeling Good Morning", "Good Mornings", Hamstrings, Strength, List.of(BosuBall, PvcPipe), Compound, Intermediate, List.of(Abs, LowerBack), "https://fitbod.me/exercises/balance-trainer-single-leg-kneeling-good-morning");
        add("(FB) Balance Trainer Single Leg Lifts", "Crunches", Abs, Strength, BosuBall, Compound, Intermediate, Quads, "https://fitbod.me/exercises/balance-trainer-single-leg-lifts");
        add("(FB) Balance Trainer Single Leg TRX Lunges", "Lunges", Quads, Strength, List.of(BosuBall, TRX), Compound, Advanced, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-single-leg-trx-lunges");
        add("(FB) Balance Trainer Slow Climbers", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-slow-climbers");
        add("(FB) Balance Trainer Speed Climbers", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-speed-climbers");
        add("(FB) Balance Trainer Spiderman Push Up", "Push Ups", Chest, Strength, BosuBall, Compound, Intermediate, List.of(Abs, Triceps), "https://fitbod.me/exercises/balance-trainer-spiderman-push-up");
        add("(FB) Balance Trainer Squat", "Squats", Quads, Strength, BosuBall, Compound, Beginner, List.of(Hamstrings, Glutes, Calves), "https://fitbod.me/exercises/balance-trainer-squat");
        add("(FB) Balance Trainer Stability Ball Knee Tucks", "Other Frontal Abs", Abs, Strength, List.of(BosuBall, ExerciseBall), Compound, Intermediate, Shoulders, "https://fitbod.me/exercises/balance-trainer-stability-ball-knee-tucks");
        add("(FB) Balance Trainer Stability Ball Overhead Squats", "Squats", Quads, Strength, List.of(BosuBall, ExerciseBall), Compound, Advanced, List.of(Glutes, Abs, Hamstrings, Shoulders), "https://fitbod.me/exercises/balance-trainer-stability-ball-overhead-squats");
        add("(FB) Balance Trainer Stability Ball Push Up", "Push Ups", Chest, Strength, List.of(BosuBall, ExerciseBall), Compound, Advanced, List.of(Shoulders, Triceps), "https://fitbod.me/exercises/balance-trainer-stability-ball-push-up");
        add("(FB) Balance Trainer Star Plank Knee to Elbow", "Side Planks", Abs, Strength, BosuBall, Compound, Advanced, Shoulders, "https://fitbod.me/exercises/balance-trainer-star-plank-knee-to-elbow");
        add("(FB) Balance Trainer Sumo Squat Jumps", "Squats", Quads, Strength, BosuBall, Compound, Beginner, Hamstrings, "https://fitbod.me/exercises/balance-trainer-sumo-squat-jumps");
        add("(FB) Balance Trainer TRX Front to Back Lunges", "Lunges", Quads, Strength, List.of(BosuBall, TRX), Compound, Intermediate, List.of(Hamstrings, Calves, Glutes), "https://fitbod.me/exercises/balance-trainer-trx-front-to-back-lunges");
        add("(FB) Balance Trainer TRX Pistol Squats", "Squats", Quads, Strength, List.of(BosuBall, TRX), Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-trx-pistol-squats");
        add("(FB) Balance Trainer TRX Squat Jumps", "Squats", Quads, Strength, List.of(BosuBall, TRX), Compound, Beginner, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/balance-trainer-trx-squat-jumps");
        add("(FB) Balance Trainer Toe Taps", "Calves", Calves, Strength, BosuBall, Compound, Beginner, Quads, "https://fitbod.me/exercises/balance-trainer-toe-taps");
        add("(FB) Balance Trainer Traveling Dome Planks", "Planks", Abs, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-traveling-dome-planks");
        add("(FB) Balance Trainer Up and Down Planks", "Planks", Abs, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-up-and-down-planks");
        add("(FB) Balance Trainer Walk Out Plank", "Planks", Abs, Strength, BosuBall, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/balance-trainer-walk-out-plank");
        add("(FB) Balance Trainer Wide Pushups", "Push Ups", Chest, Strength, BosuBall, Compound, Intermediate, Triceps, "https://fitbod.me/exercises/balance-trainer-wide-pushups");
        add("(FB) Balance Trainer Wood Choppers", "Chops", Abs, Strength, BosuBall, Compound, Beginner, List.of(LowerBack, Shoulders), "https://fitbod.me/exercises/balance-trainer-wood-choppers");
        add("(FB) Banded Curtsy Lunge", "Lunges", Quads, Strength, BandsMini, Compound, Intermediate, List.of(Abs, Adductors, Abductors, Hamstrings, Glutes), "https://fitbod.me/exercises/banded-curtsy-lunge");
        add("(FB) Banded Glute Bridge with Alternating Leg Raise", "Glute Bridges", Glutes, Strength, List.of(BandsMini, GymMats), Compound, Intermediate, List.of(Quads, Abs, Abductors), "https://fitbod.me/exercises/banded-glute-bridge-with-alternating-leg-raise");
        add("(FB) Banded Leg Drive", "Other Quads", Quads, Strength, List.of(Bands, Pole), Compound, Beginner, List.of(Calves, Abs, Adductors, Abductors), "https://fitbod.me/exercises/banded-leg-drive");
        add("(FB) Banded Y Fly", "Other Upper Back", UpperBack, Strength, List.of(Bands, Pole), Compound, Beginner, Shoulders, "https://fitbod.me/exercises/banded-y-fly");
        add("(FB) Bar Muscle Up", "Other Upper Back", Lats, Strength, FixedUpperBar, Compound, Advanced, List.of(Triceps, Traps, Shoulders, Forearms, Biceps, Abs), "https://fitbod.me/exercises/bar-muscle-up");
        add("(FB) Barbell Ab Rollout", "Rollouts", Abs, Strength, Barbell, Compound, Intermediate, List.of(Shoulders, LowerBack), "https://fitbod.me/exercises/barbell-ab-rollout");
        add("(FB) Barbell Back Squat with Deep Partial Squat", "Squats", Quads, Strength, Rack, Compound, Intermediate, List.of(Abs, LowerBack, Calves, Hamstrings, Glutes), "https://fitbod.me/exercises/barbell-back-squat-with-deep-partial-squat");
        add("(FB) Barbell Behind The Back Shrug", "Shrugs", Traps, Strength, Barbell, Isolation, Beginner, none, "https://fitbod.me/exercises/barbell-behind-the-back-shrug");
        add("(FB) Barbell Bench Press", "Bench Presses", Chest, Strength, BenchPress, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/barbell-bench-press");
        add("(FB) Barbell Bicep Drag Curl", "Standing Curls", Biceps, Strength, ShortBarbell, Compound, Beginner, none, "https://fitbod.me/exercises/barbell-bicep-drag-curl");
        add("(FB) Barbell Bulgarian Split Jump", "Squats", Quads, Strength, List.of(Barbell, Bench), Compound, Advanced, List.of(Abs, Calves, Hamstrings, Glutes), "https://fitbod.me/exercises/barbell-bulgarian-split-jump");
        add("(FB) Barbell Curl", "Standing Curls", Biceps, Strength, ShortBarbell, Compound, Beginner, Forearms, "https://fitbod.me/exercises/barbell-curl");
        add("(FB) Barbell Curtsy Lunge", "Lunges", Quads, Strength, ShortBarbell, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/barbell-curtsy-lunge");
        add("(T:Barbell)(FB) Barbell Curtsy Lunge", "Lunges", Quads, Strength, Barbell, Compound, Intermediate, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/barbell-curtsy-lunge");
        domination("(FB) Barbell Curtsy Lunge", "(T:Barbell)(FB) Barbell Curtsy Lunge");
        add("(FB) Barbell Decline Bench Press", "Bench Presses", Chest, Strength, DeclineBenchPress, Compound, Intermediate, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/barbell-decline-bench-press");
        add("(FB) Barbell Front Raise", "Front Raises", Shoulders, Strength, ShortBarbell, Compound, Intermediate, none, "https://fitbod.me/exercises/barbell-front-raise");
        add("(T:Barbell)(FB) Barbell Front Raise", "Front Raises", Shoulders, Strength, Barbell, Compound, Intermediate, none, "https://fitbod.me/exercises/barbell-front-raise");
        domination("(FB) Barbell Front Raise", "(T:Barbell)(FB) Barbell Front Raise");
        add("(FB) Barbell Glute Bridge", "Glute Bridges", Glutes, Strength, List.of(Barbell, BarbellFoam, GymMats), Compound, Intermediate, Hamstrings, "https://fitbod.me/exercises/barbell-glute-bridge-10af9c2c-1374-4259-b103-932cb7cab6b9");
        add("(T:ShortBarbell)(FB) Barbell Glute Bridge", "Glute Bridges", Glutes, Strength, List.of(ShortBarbell, GymMats), Compound, Intermediate, Hamstrings, "https://fitbod.me/exercises/barbell-glute-bridge-10af9c2c-1374-4259-b103-932cb7cab6b9");
        domination("(FB) Barbell Glute Bridge", "(T:ShortBarbell)(FB) Barbell Glute Bridge");
        add("(FB) Barbell High Pull", "Olympic Squats", Quads, OlympicWeightlifting, Barbell, Compound, Advanced, List.of(Traps, LowerBack, Hamstrings, Glutes, Forearms), "https://fitbod.me/exercises/barbell-high-pull");
        add("(FB) Barbell Hip Thrust", "Hip Thrusts", Glutes, Strength, List.of(Barbell, Bench), Compound, Intermediate, List.of(Hamstrings, Calves), "https://fitbod.me/exercises/barbell-hip-thrust");
        add("(T:ZBar)(FB) ZBar Hip Thrust", "Hip Thrusts", Glutes, Strength, List.of(ZBar, Bench), Compound, Intermediate, List.of(Hamstrings, Calves), "https://fitbod.me/exercises/barbell-hip-thrust");
        domination("(FB) Barbell Hip Thrust", "(T:ZBar)(FB) ZBar Hip Thrust");
        add("(FB) Barbell Incline Bench Press", "Bench Presses", Chest, Strength, InclineBenchPress, Compound, Intermediate,  List.of(Shoulders, Triceps), "https://fitbod.me/exercises/barbell-incline-bench-press");


        /////////// BOOOKMARK
    }
}
