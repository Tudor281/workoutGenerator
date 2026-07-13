package tudor.exercises;

import tudor.enums.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static tudor.enums.Muscle.*;

public class Exercise {
    public String name;
    public List<Muscle> mainMuscles;
    public List<Muscle> secondaryMuscles;
    public List<Equipment> equipment;
    Mechanics mechanics;
    public ExerciseType type;
    Level level;
    public String url;
    public Exercise dominator; // if dominator is available or dominator's dominator and so on, than this exercise is not available

    public void toExcel() {
        System.out.println(name + "\t" + url);
    }

    public static List<Exercise> all = new ArrayList<>();

    static Map<Muscle, Folder> muscleFolders = new HashMap<>();

    public static void buildStructure() {
        Folder legs = new Folder("Legs");
        Folder abductors = new Folder("Abductors");
        legs.folders.add(abductors);
        Exercise.muscleFolders.put(Abductors, abductors);

        Folder adductors = new Folder("Adductors");
        legs.folders.add(adductors);
        Exercise.muscleFolders.put(Adductors, adductors);

        Folder abs = new Folder("Abs");
        Exercise.muscleFolders.put(Abs, abs);

        Folder frontalAbs = new Folder("Frontal Abs");
        abs.folders.add(frontalAbs);
        Folder legRaise = new Folder("Leg Raise");
        frontalAbs.folders.add(legRaise);
        Folder kneeRaise = new Folder("Knee Raise");
        frontalAbs.folders.add(kneeRaise);
        Folder sitUp = new Folder("Sit Up");
        frontalAbs.folders.add(sitUp);
        Folder crunches = new Folder("Crunches");
        frontalAbs.folders.add(crunches);
        Folder deadBugs = new Folder("Dead Bugs");
        frontalAbs.folders.add(deadBugs);
        Folder pallofPress = new Folder("Pallof Press");
        frontalAbs.folders.add(pallofPress);
        Folder turkish = new Folder("Turkish");
        frontalAbs.folders.add(turkish);
        Folder twists = new Folder("Twists");
        frontalAbs.folders.add(twists);
        Folder planks = new Folder("Planks");
        frontalAbs.folders.add(planks);
        Folder rollouts = new Folder("Rollouts");
        frontalAbs.folders.add(rollouts);
        Folder wallPress = new Folder("Wall Press");
        frontalAbs.folders.add(wallPress);
        Folder birdDog = new Folder("Bird Dog");
        frontalAbs.folders.add(birdDog);
        Folder otherAbs = new Folder("Other Frontal Abs");
        frontalAbs.folders.add(otherAbs);

        Folder obliques = new Folder("Obliques");
        abs.folders.add(obliques);
        Folder sidePlanks = new Folder("Side Planks");
        obliques.folders.add(sidePlanks);
        Folder chops = new Folder("Chops");
        obliques.folders.add(chops);
        Folder sideBends = new Folder("Side Bends");
        obliques.folders.add(sideBends);
        Folder cableLifts = new Folder("Cable Lifts");
        obliques.folders.add(cableLifts);
        Folder otherObliques = new Folder("Other Obliques");
        obliques.folders.add(otherObliques);

        Folder biceps = new Folder("Biceps");
        Exercise.muscleFolders.put(Biceps, biceps);

        Folder preacherCurls = new Folder("Preacher Curls");
        biceps.folders.add(preacherCurls);
        Folder seatedCurls = new Folder("Seated Curls");
        biceps.folders.add(seatedCurls);
        Folder standingCurls = new Folder("Standing Curls");
        biceps.folders.add(standingCurls);
        Folder otherCurls = new Folder("Other Curls");
        biceps.folders.add(otherCurls);
        Folder lyingCurls = new Folder("Lying Curls");
        biceps.folders.add(lyingCurls);

        Folder calves = new Folder("Calves");
        Exercise.muscleFolders.put(Calves, calves);

        Folder chest = new Folder("Chest");
        Exercise.muscleFolders.put(Chest, chest);

        Folder benchPress = new Folder("Bench Presses");
        chest.folders.add(benchPress);
        Folder flys = new Folder("Flys");
        chest.folders.add(flys);
        Folder pushUps = new Folder("Push Ups");
        chest.folders.add(pushUps);
        Folder pullovers = new Folder("Pullovers");
        chest.folders.add(pullovers);
        Folder otherChest = new Folder("Other Chest");
        chest.folders.add(otherChest);

        Folder forearms = new Folder("Forearms");
        Exercise.muscleFolders.put(Forearms, forearms);
        Folder reverseCurls = new Folder("Reverse Curls");
        forearms.folders.add(reverseCurls);
        Folder wristCurls = new Folder("Wrist Curls");
        forearms.folders.add(wristCurls);
        Folder carries = new Folder("Carries");
        forearms.folders.add(carries);
        Folder otherForearms = new Folder("Other Forearms");
        forearms.folders.add(otherForearms);

        Folder glutes = new Folder("Glutes");
        legs.folders.add(glutes);
        Exercise.muscleFolders.put(Glutes, glutes);
        Folder goodMornings = new Folder("Good Mornings");
        glutes.folders.add(goodMornings);
        Folder hipThrusts = new Folder("Hip Thrusts");
        glutes.folders.add(hipThrusts);
        Folder gluteBridges = new Folder("Glute Bridges");
        glutes.folders.add(gluteBridges);
        Folder gluteRotations = new Folder("Glute Rotations");
        glutes.folders.add(gluteRotations);
        Folder clams = new Folder("Clams");
        glutes.folders.add(clams);
        Folder otherGlutes = new Folder("Other Glutes");
        glutes.folders.add(otherGlutes);

        Folder hamstrings = new Folder("Hamstrings");
        legs.folders.add(hamstrings);
        Exercise.muscleFolders.put(Hamstrings, hamstrings);
        Folder deadlifts = new Folder("Deadlifts");
        hamstrings.folders.add(deadlifts);
        Folder hamstringCurls = new Folder("Hamstring Curls");
        hamstrings.folders.add(hamstringCurls);
        Folder kettlebellSwings = new Folder("Kettlebell Swings");
        hamstrings.folders.add(kettlebellSwings);
        Folder hamRaises = new Folder("Ham Raises");
        hamstrings.folders.add(hamRaises);
        Folder otherHamstrings = new Folder("Other Hamstrings");
        hamstrings.folders.add(otherHamstrings);

        Folder hipFlexors = new Folder("Hip Flexors");
        legs.folders.add(hipFlexors);
        Exercise.muscleFolders.put(HipFlexors, hipFlexors);

        Folder itBands = new Folder("IT Band");
        Exercise.muscleFolders.put(ItBand, itBands);

        Folder back = new Folder("Back");
        Folder lats = new Folder("Lats");
        Exercise.muscleFolders.put(Lats, lats);
        back.folders.add(lats);
        Folder latPullDown = new Folder("Lat Pull Down");
        lats.folders.add(latPullDown);

        Folder bodyLifts = new Folder("Body Lifts");
        lats.folders.add(bodyLifts);
        Folder pullUps = new Folder("Pull ups");
        bodyLifts.folders.add(pullUps);
        Folder chinUps = new Folder("Chin ups");
        bodyLifts.folders.add(chinUps);
        Folder latRows = new Folder("Lat Rows");
        lats.folders.add(latRows);
        Folder ropeClimbs = new Folder("Rope Climbs");
        lats.folders.add(ropeClimbs);
        Folder otherLats = new Folder("Other Lats");
        lats.folders.add(otherLats);

        Folder lowerBack = new Folder("Lower Back");
        Exercise.muscleFolders.put(LowerBack, lowerBack);
        back.folders.add(lowerBack);
        Folder lowerBackDeadLifts = new Folder("Lower back deadlifts");
        lowerBack.folders.add(lowerBackDeadLifts);
        Folder otherLowerBack = new Folder("Other lower back");
        lowerBack.folders.add(otherLowerBack);
        Folder hyperExtensions = new Folder("Hyperextensions");
        lowerBack.folders.add(hyperExtensions);
        Folder backExtensions = new Folder("Back Extensions");
        lowerBack.folders.add(backExtensions);

        Folder upperBack = new Folder("Upper Back");
        Exercise.muscleFolders.put(UpperBack, upperBack);
        back.folders.add(upperBack);
        Folder rows = new Folder("Rows");
        upperBack.folders.add(rows);

        Folder otherUpperBack = new Folder("Other Upper Back");
        upperBack.folders.add(otherUpperBack);

        Folder neck = new Folder("Neck");
        Exercise.muscleFolders.put(Neck, neck);

        Folder palmarFascia = new Folder("Palmar Fascia");
        Exercise.muscleFolders.put(PalmarFascia, palmarFascia);

        Folder plantarFascia = new Folder("Plantar Fascia");
        Exercise.muscleFolders.put(PlantarFascia, plantarFascia);

        Folder quads = new Folder("Quads");
        legs.folders.add(quads);
        Exercise.muscleFolders.put(Quads, quads);
        Folder squats = new Folder("Squats");
        quads.folders.add(squats);
        Folder legPress = new Folder("Leg Press");
        quads.folders.add(legPress);
        Folder hackSquats = new Folder("Hack Squats Machine");
        quads.folders.add(hackSquats);
        Folder lunges = new Folder("Lunges");
        quads.folders.add(lunges);
        Folder stepUps = new Folder("Step ups");
        quads.folders.add(stepUps);
        Folder legExtension = new Folder("Leg Extensions");
        quads.folders.add(legExtension);
        Folder olympicSquats = new Folder("Olympic Squats");
        quads.folders.add(olympicSquats);
        Folder otherQuads = new Folder("Other Quads");
        quads.folders.add(otherQuads);

        Folder shoulders = new Folder("Shoulders");
        Exercise.muscleFolders.put(Shoulders, shoulders);
        Folder frontDelts = new Folder("Front Delts");
        shoulders.folders.add(frontDelts);
        Exercise.currentFolder = frontDelts;

        Folder frontRaises = new Folder("Front Raises");
        frontDelts.folders.add(frontRaises);
        Folder landminePress = new Folder("Land Mine Presses");
        frontDelts.folders.add(landminePress);
        Folder battlingRopes = new Folder("Battling Ropes");
        frontDelts.folders.add(battlingRopes);
        Folder otherFrontDelts = new Folder("Other Front Delts");
        frontDelts.folders.add(otherFrontDelts);
        Folder lateralDelts = new Folder("Lateral Delts");
        shoulders.folders.add(lateralDelts);
        Folder lateralRaises = new Folder("Lateral Raises");
        lateralDelts.folders.add(lateralRaises);
        Folder uprightRows = new Folder("Upright Rows");
        lateralDelts.folders.add(uprightRows);

        Folder rearDelts = new Folder("Rear Delts");
        shoulders.folders.add(rearDelts);
        Folder rearDeltFlys = new Folder("Rear Delt Flys");
        rearDelts.folders.add(rearDeltFlys);
        Folder facePulls = new Folder("Face Pulls");
        rearDelts.folders.add(facePulls);
        Folder otherRearDelts = new Folder("Other Rear Delts");
        rearDelts.folders.add(otherRearDelts);

        Folder mixedShoulders = new Folder("Mixed Shoulders");
        shoulders.folders.add(mixedShoulders);
        Folder shoulderPresses = new Folder("Shoulder Presses");
        mixedShoulders.folders.add(shoulderPresses);
        Folder arnoldPresses = new Folder("Arnold Presses");
        mixedShoulders.folders.add(arnoldPresses);
        Folder dublinPresses = new Folder("Dublin Presses");
        mixedShoulders.folders.add(dublinPresses);
        Folder pushPresses = new Folder("Push Presses");
        mixedShoulders.folders.add(pushPresses);
        Folder otherMixedShoulders = new Folder("Other Mixed Shoulders");
        mixedShoulders.folders.add(otherMixedShoulders);

        Folder internalRotations = new Folder("Internal Rotations");
        shoulders.folders.add(internalRotations);
        Folder externalRotations = new Folder("External Rotations");
        shoulders.folders.add(externalRotations);
        Folder otherShoulders = new Folder("Other Shoulders");
        shoulders.folders.add(otherShoulders);

        Folder traps = new Folder("Traps");
        Exercise.muscleFolders.put(Traps, traps);
        Folder shrugs = new Folder("Shrugs");
        traps.folders.add(shrugs);
        Folder highPulls = new Folder("High Pulls");
        traps.folders.add(highPulls);
        Folder trapUprightRows = new Folder("Trap Upright Rows");
        traps.folders.add(trapUprightRows);
        Folder otherTraps = new Folder("Other Traps");
        traps.folders.add(otherTraps);

        Folder triceps = new Folder("Triceps");
        Exercise.muscleFolders.put(Triceps, triceps);
        Folder tricepBenchPresses = new Folder("Tricep Bench Presses");
        triceps.folders.add(tricepBenchPresses);
        Folder tricepExtensions = new Folder("Tricep Extensions");
        triceps.folders.add(tricepExtensions);
        Folder tricepDips = new Folder("Tricep Dips");
        triceps.folders.add(tricepDips);
        Folder kickbacks = new Folder("Kickbacks");
        triceps.folders.add(kickbacks);
        Folder frenchPresses = new Folder("French Press");
        triceps.folders.add(frenchPresses);
        Folder floorPresses = new Folder("Floor Presses");
        triceps.folders.add(floorPresses);
        Folder tricepsPushUps = new Folder("Triceps Push ups");
        triceps.folders.add(tricepsPushUps);
        Folder otherTriceps = new Folder("Other Triceps");
        triceps.folders.add(otherTriceps);
    }

    public Exercise(String name, List<Muscle> mainMuscles, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Muscle> secondaryMuscles, String url) {
        this.name = name;
        this.mainMuscles = mainMuscles;
        this.type = type;
        this.equipment = equipment;
        this.mechanics = mechanics;
        this.level = level;
        this.secondaryMuscles = secondaryMuscles;
        this.url = url;
    }

    static Folder currentFolder;

    public static Exercise add(String name, Muscle mainMuscle, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Muscle> secondaryMuscles, String url) {
        Exercise exercise = new Exercise(name, List.of(mainMuscle), type, equipment, mechanics, level, secondaryMuscles, url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, String dir, Muscle mainMuscle, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, List<Muscle> secondaryMuscles, String url) {
        Exercise.currentFolder = Folder.all.get(dir);
        Exercise exercise = new Exercise(name, List.of(mainMuscle), type, equipment, mechanics, level, secondaryMuscles, url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, Muscle mainMuscle, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, Muscle secondaryMuscle, String url) {
        Exercise exercise = new Exercise(name, List.of(mainMuscle), type, equipment, mechanics, level, List.of(secondaryMuscle), url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, String dir, Muscle mainMuscle, ExerciseType type, List<Equipment> equipment, Mechanics mechanics, Level level, Muscle secondaryMuscle, String url) {
        Exercise.currentFolder = Folder.all.get(dir);
        Exercise exercise = new Exercise(name, List.of(mainMuscle), type, equipment, mechanics, level, List.of(secondaryMuscle), url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, Muscle mainMuscle, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, List<Muscle> secondaryMuscles, String url) {
        Exercise exercise = new Exercise(name, List.of(mainMuscle), exerciseType, List.of(equipment), mechanics, level, secondaryMuscles, url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, String dir, Muscle mainMuscle, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, List<Muscle> secondaryMuscles, String url) {
        Exercise.currentFolder = Folder.all.get(dir);
        Exercise exercise = new Exercise(name, List.of(mainMuscle), exerciseType, List.of(equipment), mechanics, level, secondaryMuscles, url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, Muscle mainMuscle, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, Muscle secondaryMuscle, String url) {
        Exercise exercise = new Exercise(name, List.of(mainMuscle), exerciseType, List.of(equipment), mechanics, level, List.of(secondaryMuscle), url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise add(String name, String dir, Muscle mainMuscle, ExerciseType exerciseType, Equipment equipment, Mechanics mechanics, Level level, Muscle secondaryMuscle, String url) {
        Exercise.currentFolder = Folder.all.get(dir);
        Exercise exercise = new Exercise(name, List.of(mainMuscle), exerciseType, List.of(equipment), mechanics, level, List.of(secondaryMuscle), url);
        all.add(exercise);
        currentFolder.addExercise(exercise);
        return exercise;
    }

    public static Exercise get(String name) {
        for (Exercise exercise : all) {
            if (exercise.name.equalsIgnoreCase(name)) return exercise;
        }
        throw new RuntimeException("Exercise not found ("+name+")");
    }

    public static void domination(String dominator, String dominated) {
        Exercise dominatorEx = get(dominator);
        Exercise dominatedEx = get(dominated);
        dominatedEx.dominator = dominatorEx;
    }
}
