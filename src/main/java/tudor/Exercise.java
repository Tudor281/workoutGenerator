package tudor;

import tudor.enums.*;

import java.util.ArrayList;
import java.util.List;

import static tudor.enums.Equipment.*;
import static tudor.enums.ExerciseType.Strength;
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
        all.add(new Exercise("Cable Hip Abduction", List.of(Abductors), Strength, List.of(Cable), Isolation, Beginner, List.of(Glutes), "https://www.muscleandstrength.com/exercises/cable-hip-abduction.html"));
        all.add(new Exercise("Hip Abduction Machine", List.of(Abductors), Strength, List.of(Machine), Isolation, Beginner, List.of(Abs, Glutes, Hamstrings), "https://www.muscleandstrength.com/exercises/hip-abduction-machine.html"));

        all.add(new Exercise("Lying Floor Leg Raise", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/lying-floor-leg-raise.html"));
        all.add(new Exercise("Sit Up", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/sit-up.html"));
        all.add(new Exercise("Weighted Crunch", List.of(Abs), Strength, List.of(Disk), Isolation, Intermediate, List.of(), "https://www.muscleandstrength.com/exercises/weighted-crunch.html"));
        all.add(new Exercise("3 Month Position Kettlebell Pullover", List.of(Abs), Strength, List.of(KettleBells), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/3-month-position-kettlebell-pullover"));
        all.add(new Exercise("Ab Crunch", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/ab-crunch"));
        all.add(new Exercise("Abdominal Air Bike (AKA Bicycle)", List.of(Abs), Strength, List.of(Bodyweight), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/abdominal-air-bike.html"));
        all.add(new Exercise("Abdominal Pendulum", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/abdominal-pendulum.html"));
        all.add(new Exercise("Abdominal Hip Thrust", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/hip-thrusts.html"));
        all.add(new Exercise("Alternate Straight Leg Lower", List.of(Abs), Strength, List.of(Bodyweight), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/alternate-straight-leg-lowering"));
        all.add(new Exercise("Alternating Reach And Catch", List.of(Abs), Strength, List.of(Bodyweight), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/alternate-reach-and-catch.html"));
        all.add(new Exercise("Banded Alphabet", List.of(Abs), Strength, List.of(Bands), Compound, Intermediate, List.of(), "https://www.muscleandstrength.com/exercises/band-alphabet"));
        all.add(new Exercise("Barbell Abdominal Rollouts", List.of(Abs), Strength, List.of(Barbell), Compound, Intermediate, List.of(Shoulders), "https://www.muscleandstrength.com/exercises/abdominal-barbell-rollouts.html"));
        all.add(new Exercise("Barbell Climbs", List.of(Abs), Strength, List.of(Barbell), Compound, Advanced, List.of(), "https://www.muscleandstrength.com/exercises/barbell-climbs"));
        all.add(new Exercise("Barbell Side Bends", List.of(Abs), Strength, List.of(Barbell, Bench), Isolation, Beginner, List.of(LowerBack), "https://www.muscleandstrength.com/exercises/barbell-side-bends.html"));
        all.add(new Exercise("Bird Dog with Band RNT", List.of(Abs), Strength, List.of(Bands), Compound, Intermediate, List.of(), "https://www.muscleandstrength.com/exercises/bird-dog-with-band-rnt"));
        all.add(new Exercise("Bottoms Up Kettlebell Turkish Get Up", List.of(Abs), Strength, List.of(KettleBells), Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up"));
        all.add(new Exercise("Bottoms Up Kettlebell Turkish Get Up to Hand", List.of(Abs), Strength, List.of(KettleBells), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-hand"));
        all.add(new Exercise("Bottoms Up Kettlebell Turkish Get Up to Knee", List.of(Abs), Strength, List.of(KettleBells), Compound, Beginner, List.of(Adductors, Glutes, Hamstrings, Quads, Shoulders, UpperBack), "https://www.muscleandstrength.com/exercises/bottoms-up-kettlebell-turkish-get-up-to-knee"));
        all.add(new Exercise("Cable Crunch", List.of(Abs), Strength, List.of(Cable), Isolation, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/cable-crunch.html"));
        all.add(new Exercise("Contralateral Bird Dog", List.of(Abs), Strength, List.of(Bodyweight), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/contralateral-bird-dog"));
        all.add(new Exercise("Dead Bug", List.of(Abs), Strength, List.of(Bodyweight), Compound, Intermediate, List.of(), "https://www.muscleandstrength.com/exercises/dead-bug"));
        all.add(new Exercise("Dead Bug with Plates", List.of(Abs), Strength, List.of(Disk), Compound, Intermediate, List.of(), "https://www.muscleandstrength.com/exercises/dead-bug-with-plates"));
        all.add(new Exercise("Decline Bench Abdominal Reach", List.of(Abs), Strength, List.of(ReverseInclinedBench), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/decline-abdominal-reach.html"));
        all.add(new Exercise("Decline Bench Alternating Knee Raise", List.of(Abs), Strength, List.of(ReverseInclinedBench), Compound, Beginner, List.of(), "https://www.muscleandstrength.com/exercises/decline-bench-alternate-knee-raise.html"));
        

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
}
