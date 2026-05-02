package tudor.exercises;

import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
import static tudor.enums.Level.Beginner;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Muscle.*;
import static tudor.exercises.Exercise.add;

public class Tudors {
    public static void init() {
        Exercise.currentFolder = Folder.all.get("Other Frontal Abs");
        add("(T) Table Abs", Abs, Strength, List.of(ExerciseBall, Table), Compound, Beginner, Lats, "");
    }
}
