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

public class FitBod {
    public static void init() {
        List<Muscle> none = List.of();

        add("(FB) Ab Crunch Machine", "Other Frontal Abs", Abs, Strength, Machine, Isolation, Intermediate, none, "https://fitbod.me/exercises/ab-crunch-machine");
        add("(FB) Ab Rollout", "Rollouts", Abs, Strength, AbsWheel, Compound, Intermediate, List.of(Shoulders, LowerBack), "https://fitbod.me/exercises/ab-rollout");
        add("(FB) Alternating Heel Touch", "Other Obliques", Obliques, Strength, Bodyweight, Isolation, Beginner, none, "https://fitbod.me/exercises/alternating-heel-touch");
        add("(FB) Balance Trainer Bird Dog", "Bird Dog", Abs, Strength, BosuBall, Compound, Intermediate, List.of(LowerBack, Glutes), "https://fitbod.me/exercises/balance-trainer-bird-dog");
        add("(FB) Balance Trainer Braced Bicycle Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-bicycle-kicks");
        add("(FB) Balance Trainer Braced Frog Kicks", "Other Frontal Abs", Abs, Strength, BosuBall, Compound, Intermediate, none, "https://fitbod.me/exercises/balance-trainer-braced-frog-kicks");
        add("(FB) Balance Trainer Cable Crunch With Side Bends", "Other Obliques", Obliques, Strength, List.of(BosuBall, DoubleCable), Compound, Beginner, none, "https://fitbod.me/exercises/balance-trainer-cable-crunch-with-side-bends");
    }
}
