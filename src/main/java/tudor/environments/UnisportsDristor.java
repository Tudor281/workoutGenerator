package tudor.environments;

import tudor.Exercise;
import tudor.Flag;
import tudor.enums.Equipment;
import tudor.environments.substitutes.DirectSubstitute;
import tudor.environments.substitutes.Substitute;

import java.util.*;

import static tudor.Flag.*;
import static tudor.enums.Equipment.*;

public class UnisportsDristor extends Environment {
    Set<Equipment> availableEquipment = new HashSet<>();

    Map<Exercise, List<Substitute>> substitutes = new HashMap<>();
    List<Substitute> generalSubstitutes = new ArrayList<>();

    Map<Exercise, Flag> flaggedExercises = new HashMap<>();

    public UnisportsDristor() {
        availableEquipment.add(Barbell);
        availableEquipment.add(Bench);
        availableEquipment.add(BenchPress);
        availableEquipment.add(Bodyweight);
        availableEquipment.add(Cable);
        availableEquipment.add(CableAttachmentAnkleStrapsX1);
        availableEquipment.add(CableAttachmentAnkleStrapsX2); // because it seems large enough for 2 feet, to be tested
        availableEquipment.add(CableAttachmentBentBar);
        availableEquipment.add(CableAttachmentRope);
        availableEquipment.add(CableAttachmentSingleArm);
        availableEquipment.add(CableAttachmentStraightBar);
        availableEquipment.add(DeclineBenchPress);
        availableEquipment.add(DipStation);
        availableEquipment.add(Disk);
        availableEquipment.add(DoubleCable);
        availableEquipment.add(Dumbbell);
        availableEquipment.add(FixedUpperBar);
        availableEquipment.add(GripBalls);
        availableEquipment.add(GymMats);
        availableEquipment.add(HammerBar);
        availableEquipment.add(InclineBench);
        availableEquipment.add(InclineBenchPress);
        availableEquipment.add(KettleBellsX1);
        availableEquipment.add(LandMine);
        availableEquipment.add(LatCable);
        availableEquipment.add(LegExtensionMachine);
        availableEquipment.add(LegPress);
        availableEquipment.add(LowerBackStand);
        availableEquipment.add(Pole);
        availableEquipment.add(PreacherStand);
        availableEquipment.add(PvcPipe);
        availableEquipment.add(Rack);
        availableEquipment.add(RowCable);
        availableEquipment.add(Risers);
        availableEquipment.add(ShortBarbell);
        availableEquipment.add(SmithMachine);
        availableEquipment.add(VBar);

        // barbell foam -> gym mat
        generalSubstitutes.add(new DirectSubstitute(BarbellFoam));

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
