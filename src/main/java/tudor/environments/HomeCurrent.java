package tudor.environments;

import tudor.Exercise;
import tudor.Flag;
import tudor.Folder;
import tudor.enums.Equipment;
import tudor.environments.substitutes.DirectSubstitute;
import tudor.environments.substitutes.Substitute;

import java.util.*;

import static tudor.Flag.*;
import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
import static tudor.enums.Level.Beginner;
import static tudor.enums.Mechanics.Compound;
import static tudor.enums.Mechanics.Isolation;
import static tudor.enums.Muscle.*;

public class HomeCurrent extends Environment {
    Set<Equipment> availableEquipment = new HashSet<>();

    Map<Exercise, List<Substitute>> substitutes = new HashMap<>();
    List<Substitute> generalSubstitutes = new ArrayList<>();

    Map<Exercise, Flag> flaggedExercises = new HashMap<>();

    public HomeCurrent() {
//        availableEquipment.add(Bands);
        availableEquipment.add(Bodyweight);
//        availableEquipment.add(Dumbbell);
        availableEquipment.add(ExerciseBall);
        availableEquipment.add(GymMats);



        // declineBench -> declineBenchPress
        generalSubstitutes.add(new DirectSubstitute(DeclineBench));
        flaggedExercises.put(Exercise.get("Decline Bench Alternating Leg Raise"), NoRoom);
        flaggedExercises.put(Exercise.get("Decline Bench Leg Raise"), NoRoom);
        flaggedExercises.put(Exercise.get("Decline Leg Raise With Hip Thrust"), NoRoom);
        flaggedExercises.put(Exercise.get("Decline Bench Alternating Knee Raise"), NoRoom);
        flaggedExercises.put(Exercise.get("Decline Bench Knee Raise"), NoRoom);
        flaggedExercises.put(Exercise.get("Decline Bench Cable Crunch"), Impossible);
        flaggedExercises.put(Exercise.get("Decline Cable Chest Press"), Impossible);
        flaggedExercises.put(Exercise.get("Decline Smith Machine Bench Press"), Impossible);
        flaggedExercises.put(Exercise.get("Decline Cable Flys"), Impossible);
        flaggedExercises.put(Exercise.get("Decline Bench Barbell Lunge"), FootOnBench);
        flaggedExercises.put(Exercise.get("Decline Bench Bodyweight Lunge"), FootOnBench);
        flaggedExercises.put(Exercise.get("Decline Bench Dumbbell Lunge"), FootOnBench);
        flaggedExercises.put(Exercise.get("Single Leg Squat From Bench"), FootOnBench);

        // feet weight -> preacher stand (are loc de picioare)
        generalSubstitutes.add(new DirectSubstitute(FeetWeight));

        flaggedExercises.put(Exercise.get("Muscle Up"), NoRoom);
        flaggedExercises.put(Exercise.get("Straight Bar Dip"), NoRoom);

        generalSubstitutes.add(new DirectSubstitute(ShoulderBenchPress));

        Folder.all.get("Other Frontal Abs").exercises.add(new Exercise("Abdominal Crunch Machine", List.of(Abs), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1Vlwd9d9MRmvTkOmpxObPglNUe-8Rc-9s/view?usp=sharing"));
        Folder.all.get("Abductors").exercises.add(new Exercise("Outer Thigh (Abduction) Machine", List.of(Abductors), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1D3GcLqL9A8rBZI45seuddlZbngE-Gi1L/view?usp=sharing"));
        Folder.all.get("Adductors").exercises.add(new Exercise("Inne Thigh (Adduction) Machine", List.of(Adductors), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1D3GcLqL9A8rBZI45seuddlZbngE-Gi1L/view?usp=sharing"));
        Folder.all.get("Calves").exercises.add(new Exercise("Calve Machine 1", List.of(Calves), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1Nt-4WeQYOn_sClWVG2dUGtZtVEz9CkfQ/view?usp=sharing"));
        Folder.all.get("Calves").exercises.add(new Exercise("Calve Machine 2", List.of(Calves), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1FAcNzNSM7LqCGtvzURLt13NNxFMCsDya/view?usp=sharing"));
        Folder.all.get("Other Chest").exercises.add(new Exercise("Chest Press Machine Lower Grip", List.of(Chest), Strength, List.of(Machine), Compound, Beginner, List.of(Shoulders, Triceps), "https://drive.google.com/file/d/1XvVbp2Exf5T_W1zCtldUIgNVn2YCz3J8/view?usp=sharing"));
        Folder.all.get("Other Chest").exercises.add(new Exercise("Chest Press Machine Upper Grip", List.of(Chest), Strength, List.of(Machine), Compound, Beginner, List.of(Shoulders, Triceps), "https://drive.google.com/file/d/1XvVbp2Exf5T_W1zCtldUIgNVn2YCz3J8/view?usp=sharing"));
        Folder.all.get("Chin ups").exercises.add(new Exercise("Assisted Chin Ups Machine", List.of(Lats), Strength, List.of(Machine), Compound, Beginner, List.of(Biceps), "https://drive.google.com/file/d/1HEIOsrppkpbHv4hY-YxtwL5AN5ngCvNG/view?usp=sharing"));
        Folder.all.get("Pull ups").exercises.add(new Exercise("Assisted Pull Ups Machine", List.of(Lats), Strength, List.of(Machine), Compound, Beginner, List.of(Biceps), "https://drive.google.com/file/d/1HEIOsrppkpbHv4hY-YxtwL5AN5ngCvNG/view?usp=sharing"));
        Folder.all.get("Tricep Dips").exercises.add(new Exercise("Assisted Dips Machine", List.of(Triceps), Strength, List.of(Machine), Compound, Beginner, List.of(Chest), "https://drive.google.com/file/d/1HEIOsrppkpbHv4hY-YxtwL5AN5ngCvNG/view?usp=sharing"));
        Folder.all.get("Other Glutes").exercises.add(new Exercise("Gluteus Machine Radial", List.of(Glutes), Strength, List.of(Machine), Compound, Beginner, List.of(Hamstrings), "https://drive.google.com/file/d/1x6hW2jnu9Ded_NMeoopA3QV4--PzT1YA/view?usp=sharing"));
        Folder.all.get("Lat Pull Down").exercises.add(new Exercise("Lat Pull Down Machine", List.of(Lats), Strength, List.of(Machine), Compound, Beginner, List.of(Biceps), "https://drive.google.com/file/d/102voyJbcGkN7TSlWZDdKFs98-KdWq0rc/view?usp=sharing"));
        Folder.all.get("Lateral Raises").exercises.add(new Exercise("Lateral Raise Machine", List.of(Shoulders), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1Jqg17n223pSASCAmiCWn_N5L5BjZZ2HF/view?usp=sharing"));
        Folder.all.get("Hamstring Curls").exercises.add(new Exercise("Leg Curl Machine", List.of(Hamstrings), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1xpEl5h9E5H4zWB8iupELV5XBNW83HWtg/view?usp=sharing"));
        Folder.all.get("Hamstring Curls").exercises.add(new Exercise("Seated Leg Curl Machine", List.of(Hamstrings), Strength, List.of(Machine), Isolation, Beginner, List.of(), "https://drive.google.com/file/d/1HgDt-tHRlx2BrkJBGamfi2YYK2GHPDSg/view?usp=sharing"));
        Folder.all.get("Rows").exercises.add(new Exercise("Rowing Machine", List.of(UpperBack), Strength, List.of(Machine), Compound, Beginner, List.of(Biceps), "https://drive.google.com/file/d/1JzGIyj3wIwYcqLJLvLdco1aU1Iv1SJ4o/view?usp=sharing"));
        Folder.all.get("Shoulder Presses").exercises.add(new Exercise("Shoulder Press Machine Outer Grip", List.of(Shoulders), Strength, List.of(Machine), Compound, Beginner, List.of(Triceps), "https://drive.google.com/file/d/1gZ_N1bWyAtBzIC_x-2KWcHKCvhYFtDLz/view?usp=sharing"));
        Folder.all.get("Other Front Delts").exercises.add(new Exercise("Shoulder Press Machine Inner Grip", List.of(Shoulders), Strength, List.of(Machine), Compound, Beginner, List.of(Triceps), "https://drive.google.com/file/d/1gZ_N1bWyAtBzIC_x-2KWcHKCvhYFtDLz/view?usp=sharing"));
    }

    @Override
    public boolean hasEquipment(Exercise exercise) {
        if (flaggedExercises.containsKey(exercise)) return false;
        for (Equipment equipment : exercise.equipment) {
            if (!(availableEquipment.contains(equipment) || hasSubstitutes(exercise, equipment))) {
                return false;
            }
        }
        return true;
    }

    private boolean hasSubstitutes( Exercise exercise, Equipment equipment) {
        // do we have general substitute
        for (Substitute substitute : generalSubstitutes) {
            if (substitute.canSubstitute(equipment)) return true;
        }

        // do we have substitute equipment
        List<Substitute> mySubstitutes = substitutes.get(exercise);
        if (mySubstitutes == null) return false;

        for (Substitute substitute : mySubstitutes) {
            if (substitute.canSubstitute(equipment)) return true;
        }

        return false;
    }
}
