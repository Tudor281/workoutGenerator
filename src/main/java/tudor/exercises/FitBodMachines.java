package tudor.exercises;

import tudor.enums.Muscle;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
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
    }
}
