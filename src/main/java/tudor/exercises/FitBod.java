package tudor.exercises;

import tudor.enums.Muscle;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
import static tudor.enums.Level.*;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Mechanics.Isolation;
import static tudor.enums.Muscle.*;
import static tudor.exercises.Exercise.add;

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
        add("(FB) Ab Crunch Machine", "Other Frontal Abs", Abs, Strength, Machine, Isolation, Intermediate, none, "https://fitbod.me/exercises/ab-crunch-machine");
        add("(FB) Ab Rollout", "Rollouts", Abs, Strength, AbsWheel, Compound, Intermediate, List.of(Shoulders, LowerBack), "https://fitbod.me/exercises/ab-rollout");
        add("(FB) Air Bike", "Other Quads", Quads, Strength, Machine, Compound, Beginner, List.of(Abs, UpperBack, Calves, Glutes, Hamstrings, LowerBack), "N/A");
        add("(FB) Air Squats", "Squats", Quads, Strength, Bodyweight, Compound, Beginner, List.of(Hamstrings, Glutes, Abductors), "https://fitbod.me/exercises/air-squats");
        add("(FB) Airplane", "Other Hamstrings", Hamstrings, Strength, Bodyweight, Compound, Intermediate, none, "https://fitbod.me/exercises/airplane");
        /////////// BOOOKMARK


        add("(FB) Alternating Heel Touch", "Other Obliques", Obliques, Strength, Bodyweight, Isolation, Beginner, none, "https://fitbod.me/exercises/alternating-heel-touch");
        add("(FB) Balance Trainer Bird Dog", "Bird Dog", Abs, Strength, BosuBall, Compound, Intermediate, List.of(LowerBack, Glutes), "https://fitbod.me/exercises/balance-trainer-bird-dog");
        add("(FB) Balance Trainer Braced Bicycle Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-bicycle-kicks");
        add("(FB) Balance Trainer Braced Frog Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-frog-kicks");
        add("(FB) Balance Trainer Cable Crunch With Side Bends", "Other Obliques", Obliques, Strength, List.of(BosuBall, DoubleCable), Compound, Beginner, none, "https://fitbod.me/exercises/balance-trainer-cable-crunch-with-side-bends");
    }
}
