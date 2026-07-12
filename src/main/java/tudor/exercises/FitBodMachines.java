package tudor.exercises;

import tudor.enums.Muscle;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.*;
import static tudor.enums.Level.Beginner;
import static tudor.enums.Level.Intermediate;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Mechanics.Isolation;
import static tudor.enums.Muscle.*;
import static tudor.exercises.Exercise.add;

public class FitBodMachines {
    public static void init() {
        List<Muscle> none = List.of();

        add("(FB) Ab Crunch Machine", "Other Frontal Abs", Abs, Strength, Machine, Isolation, Intermediate, none, "https://fitbod.me/exercises/ab-crunch-machine");
        add("(FB) Air Bike", "Other Quads", Quads, Strength, Machine, Compound, Beginner, List.of(Abs, UpperBack, Calves, Glutes, Hamstrings, LowerBack), "N/A");
        add("(FB) Assisted Chin Up", "Chin ups", Lats, Strength, Machine, Compound, Beginner, List.of(Forearms, Biceps), "https://fitbod.me/exercises/assisted-chin-up");
        add("(FB) Assisted Dip", "Tricep Dips", Triceps, Strength, Machine, Compound, Beginner, List.of(Shoulders, Chest), "https://fitbod.me/exercises/assisted-dip");
        add("(FB) Assisted Neutral Grip Pull Up", "Pull ups", Lats, Strength, Machine, Compound, Beginner, Biceps, "https://fitbod.me/exercises/assisted-neutral-grip-pull-up");
        add("(FB) Pull Up", "Pull ups", Lats, Strength, Machine, Compound, Beginner, Biceps, "https://fitbod.me/exercises/assisted-pull-up");
        add("(FB) Assisted Wide Grip Pull Up", "Pull ups", Lats, Strength, Machine, Compound, Beginner, Shoulders, "https://fitbod.me/exercises/assisted-wide-grip-pull-up");
        add("(FB) Calf Press", "Calves", Calves, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/calf-press");
        add("(FB) Freemotion Shoulder Press", "Shoulder Presses", Shoulders, Strength, Machine, Compound, Beginner, Triceps, "https://fitbod.me/exercises/freemotion-shoulder-press");
        add("(FB) Glute Kickback Machine", "Other Glutes", Glutes, Strength, Machine, Compound, Beginner, Hamstrings, "https://fitbod.me/exercises/glute-kickback-machine");
        add("(FB) Good Morning", "Other Glutes", Glutes, Strength, Machine, Compound, Beginner, Hamstrings, "https://fitbod.me/exercises/glute-kickback-machine");
        add("(FB) Hack Squat", "Squats", Quads, Strength, Machine, Compound, Beginner, List.of(Hamstrings, Glutes, Calves), "https://fitbod.me/exercises/hack-squat");
        add("(FB) Hammerstrength Chest Press", "Bench Presses", Chest, Strength, Machine, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/hammerstrength-chest-press");
        add("(FB) Hammerstrength Decline Chest Press", "Bench Presses", Chest, Strength, Machine, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/hammerstrength-decline-chest-press");
        add("(FB) Hammerstrength High Row", "Rows", Lats, Strength, Machine, Compound, Beginner, List.of(Biceps, UpperBack), "https://fitbod.me/exercises/hammerstrength-high-row");
        add("(FB) Hammerstrength Incline Chest Press", "Bench Presses", Chest, Strength, Machine, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/hammerstrength-incline-chest-press");
        add("(FB) Hammerstrength Iso Row", "Rows", Lats, Strength, Machine, Compound, Beginner, Biceps, "https://fitbod.me/exercises/hammerstrength-iso-row");
        add("(FB) Hammerstrength Shrug", "Shrugs", Traps, Strength, Machine, Isolation, Beginner, Forearms, "https://fitbod.me/exercises/hammerstrength-shrug");
        add("(FB) Leg Extension", "Leg Extensions", Quads, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/leg-extension");
        add("(FB) Leg Press", "Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(Hamstrings, Glutes, Calves), "https://fitbod.me/exercises/leg-press");
        add("(FB) Lying Hamstrings Curl" , "Hamstring Curls", Hamstrings, Strength, Machine, Isolation, Beginner, List.of(LowerBack, Glutes), "https://fitbod.me/exercises/lying-hamstrings-curl");
        add("(FB) Machine Bench Press", "Bench Presses", Chest, Strength, Machine, Compound, Beginner, List.of(Triceps, Shoulders), "https://fitbod.me/exercises/machine-bench-press");
        add("(FB) Machine Bicep Curl", "Preacher Curls", Biceps, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/machine-bicep-curl");
        add("(FB) Machine Fly", "Flys", Chest, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/machine-fly");
        add("(FB) Machine Hip Abductor", "Abductors", Abductors, Strength, Machine, Isolation, Beginner, Glutes, "https://fitbod.me/exercises/machine-hip-abductor");
        add("(FB) Machine Hip Adductor", "Adductors", Adductors, Strength, Machine, Isolation, Beginner, List.of(Hamstrings, Glutes), "https://fitbod.me/exercises/machine-hip-adductor");
        add("(FB) Machine Lateral Raise", "Lateral Raises", Shoulders, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/machine-lateral-raise");
        add("(FB) Machine Leg Press", "Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(Hamstrings, Glutes, Calves), "https://fitbod.me/exercises/machine-leg-press");
        add("(FB) Machine Preacher Curl", "Preacher Curls", Biceps, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/machine-preacher-curl");
        add("(FB) Machine Rear Delt Fly", "Rear Delt Flys", Shoulders, Strength, Machine, Compound, Beginner, Traps, "N/A");
        add("(FB) Machine Row", "Rows", Lats, Strength, Machine, Compound, Beginner, Biceps, "https://fitbod.me/exercises/machine-row");
        add("(FB) Machine Shoulder Press", "Shoulder Presses", Shoulders, Strength, Machine, Compound, Beginner, Triceps, "https://fitbod.me/exercises/machine-shoulder-press");
        add("(FB) Machine Shoulder Shrug", "Shrugs", Traps, Strength, Machine, Isolation, Beginner, Forearms, "https://fitbod.me/exercises/machine-shoulder-shrug");
        add("(FB) Machine Squat", "Squats", Quads, Strength, Machine, Compound, Intermediate, List.of(Hamstrings, Glutes, Calves), "https://fitbod.me/exercises/machine-squat");
        add("(FB) Machine Tricep Dip", "Tricep Dips", Triceps, Strength, Machine, Compound, Beginner, none, "https://fitbod.me/exercises/machine-tricep-dip");
        add("(FB) Machine Tricep Extension", "Tricep Extensions", Triceps, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/machine-tricep-extension");
        add("(FB) Pendulum Squat", "Squats", Quads, Strength, Machine, Compound, Beginner, List.of(Glutes, Hamstrings), "N/A");
        add("(FB) Rowing", "Rows", Hamstrings, Endurance, Machine, Compound, Beginner, List.of(Lats, UpperBack, Biceps, Calves, Glutes, Quads, Shoulders, LowerBack), "N/A");
        add("(FB) Running - Treadmill", "Other Quads", Quads, Endurance, Machine, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "N/A");
        add("(FB) Running - Trueform", "Other Quads", Quads, Endurance, Machine, Compound, Intermediate, List.of(FrontalAbs, Calves, Glutes, Hamstrings), "N/A");
        add("(FB) Seated Back Extension", "Back Extensions", LowerBack, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/seated-back-extension");
        add("(FB) Seated Leg Curl", "Hamstring Curls", Hamstrings, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/seated-leg-curl");
        add("(FB) Seated Machine Calf Press", "Calves", Calves, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/seated-machine-calf-press");
        add("(FB) Single Leg Leg Extension", "Other Quads", Quads, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/single-leg-leg-extension");
        add("(FB) Skierg", "Other Lats", Lats, Endurance, Machine, Compound, Beginner, List.of(FrontalAbs, Biceps, Hamstrings, Quads, Triceps, LowerBack), "N/A");
        add("(FB) Skierg - Butterfly", "Other Lats", Lats, Endurance, Machine, Compound, Beginner, List.of(FrontalAbs, Biceps, Hamstrings, Quads, Triceps, LowerBack), "N/A");
        add("(FB) Stair Stepper", "Other Glutes", Glutes, Endurance, Machine, Compound, Beginner, List.of(FrontalAbs, Calves, Hamstrings, Quads), "N/A");
        add("(FB) Standing Leg Curl", "Hamstring Curls", Hamstrings, Strength, Machine, Isolation, Beginner, none, "https://fitbod.me/exercises/standing-leg-curl");
        add("(FB) Standing Machine Calf Press", "Calves", Calves, Strength, Machine, Compound, Beginner, none, "https://fitbod.me/exercises/standing-machine-calf-press");
    }
}
