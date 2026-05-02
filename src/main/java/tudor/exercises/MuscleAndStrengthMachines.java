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
import static tudor.enums.Muscle.UpperBack;
import static tudor.exercises.Exercise.add;

public class MuscleAndStrengthMachines {
    public static void init() {
        List<Muscle> none = List.of();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Calf Machine
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Calves");
        add("Standing Machine Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/standing-machine-calf-raise");
        add("Toes In Standing Machine Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-in-standing-machine-calf-raise");
        add("Toes Out Standing Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-out-standing-calf-raise");

        Exercise.currentFolder = Folder.all.get("Shrugs");
        add("Standing Calf Machine Shrug", Traps, Strength, Machine, Isolation, Beginner, List.of(Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/standing-calf-machine-shrug");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Hack Squat Machine
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Calves");
        add("Hack Squat Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hack-calf-raise.html");
        add("One-Leg Hack Squat Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/hack-one-leg-calf-raise.html");

        Exercise.currentFolder = Folder.all.get("Hack Squats Machine");
        add("Machine Hack Squat", Quads, Strength, Machine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/hack-squat.html");
        add("Narrow Stance Machine Hack Squat", Quads, Strength, Machine, Compound, Intermediate, List.of(Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/narrow-hack-squat.html");
        add("One-Leg Hack Squat", Quads, Strength, Machine, Compound, Intermediate, List.of(Calves, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/one-leg-hack-squat.html");
        add("Resistance Band Machine Hack Squat", Quads, Strength, List.of(Machine, Bands), Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/resistance-band-machine-hack-squat");
        add("Wide Hack Squat", Quads, Strength, Machine, Compound, Intermediate, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/wide-hack-squat.html");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Leg Extension Machine
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Leg Extensions");
        add("Leg Extension", Quads, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/leg-extension.html");
        add("Leg Extension (Toes In)", Quads, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-in-leg-extension.html");
        add("Leg Extension (Toes Out)", Quads, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-out-leg-extension.html");
        add("Single Leg Extension", Quads, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/single-leg-extension.html");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// Leg Press
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Exercise.currentFolder = Folder.all.get("Calves");
        add("45 Degree Calf Raise (Toes In)", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-in-45-degree-calf-raise.html");
        add("45 Degree Calf Raise (Toes Out)", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/toes-out-45-degree-calf-raise.html");
        add("45 Degree Toe Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/45-degree-toe-raise.html");
        add("One-Leg 45 Degree Calf Raise", Calves, Strength, Machine, Isolation, Beginner, none, "https://www.muscleandstrength.com/exercises/one-leg-45-degree-calf-raise.html");

        Exercise.currentFolder = Folder.all.get("Leg Press");
        add("Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/45-degree-leg-press.html");
        add("Narrow Stance 45 Degree Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/narrow-stance-45-degree-leg-press.html");
        add("One Leg 45 Degree Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(FrontalAbs, Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/one-leg-45-degree-leg-press.html");
        add("Wide Stance 45 Degree Leg Press", Quads, Strength, Machine, Compound, Beginner, List.of(Adductors, Calves, Glutes, Hamstrings, LowerBack), "https://www.muscleandstrength.com/exercises/wide-stance-45-degree-leg-press.html");
    }
}
