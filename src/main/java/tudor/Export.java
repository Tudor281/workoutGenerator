package tudor;

import tudor.enums.Equipment;
import tudor.enums.Muscle;
import tudor.environments.HomeCurrent;
import tudor.exercises.*;
import tudor.schedules.All;
import tudor.schedules.Schedule;

public class Export {
    public static void main(String[] args) {
        Exercise.buildStructure();
        MuscleAndStrength.init();
        FitBod.init();
        Tudors.init();

        FitBodDeduplicator.merge();

        HomeCurrent homeCurrent = new HomeCurrent();
        Schedule schedule = new All(homeCurrent); // for domination only, reusing logic

        System.out.println("Name\tLink\tFolder\tType\tHome\tDominated\t" +
                "Abs\tAbductors\tFrontal Abs\tAdductors\tBiceps\tCalves\tChest\tForearms\tGlutes\tHamstrings\tHipFlexors\tITBand\tLats\tLowerBack\tMiddleBack\tNeck\tObliques\tPalmarFascia\tPlantarFascia\tQuads\tTraps\tTriceps\tShoulders\tUpperBack\t" +
                "AbsWheel\tAerobic_Step\tBands\tBandsMini\tBarbell\tBarbellFoam\tBattlingRopes\tBed\tBench\tBenchPress\tBoard\tBodyweight\tBosuBall\tBox\tBoxx2\tTopCable\tLowCable\tFlexiCable\tLatCable\tAnkleStrapsX1\tAnkleStrapsX2\tBentBar\tLongRope\tRope\tSingleArm\tStraightBar\tParallel\tChains\tCouch\tCone\tDeclineBench\tDeclineBenchPress\tDipStation\tDisk\tDonut\tDoubleCable\tDumbbell\tExerciseBall\tFatBar\tFatGripz\tFarmersWalkHandleBars\tFeetWeight\tFixedUpperBar\tFoamRoll\tFootStand\tGripBalls\tGymMats\tHammerBar\tHandleBands\tHangingRope\tHipThruster\tHurdle\tInclineBench\tInclineBenchPress\tJumpRope\tKettleBellsX1\tKettleBellsX2\tLacrosseBall\tLandMine\tLowerBackStand\tLowerBackStand2\tMachine\tMassageTable\tMedicineBall\tParalletteBars\tPartner\tPole\tPreacherStand\tPvcPipe\tRack\tRope\tRowCable\tRings\tRomanChair\tSafetyBar\tShortBarbell\tShoulderBenchPress\tSled\tSledMini\tSmithMachine\tStairs\tTable\tTBar\tTigerTail\tTire\tTrapBar\tTRX\tValSlide\tVBar\tWalkingSpace\tWall\tWaistStrap\tWeightStrap\tWeightVest\tWristRoller\tZBar");
        for (Exercise exercise : Exercise.all) {
            System.out.print(exercise.name+"\t");
            System.out.print(exercise.url+"\t");
            System.out.print(getFolderPath(exercise)+"\t");
            System.out.print(exercise.type+"\t");
            System.out.print((homeCurrent.hasEquipment(exercise) ? "Y" : "")+"\t");
            System.out.print((schedule.isDominated(exercise) ? "Y" : "")+"\t");
            System.out.print(printMuscles(exercise));
            System.out.print(printEquipment(exercise));
            System.out.println();
        }
    }

    private static String printEquipment(Exercise exercise) {
        return printEquipment(exercise, Equipment.AbsWheel) +
                printEquipment(exercise, Equipment.Aerobic_Step) +
                printEquipment(exercise, Equipment.Bands) +
                printEquipment(exercise, Equipment.BandsMini) +
                printEquipment(exercise, Equipment.Barbell) +
                printEquipment(exercise, Equipment.BarbellFoam) +
                printEquipment(exercise, Equipment.BattlingRopes) +
                printEquipment(exercise, Equipment.Bed) +
                printEquipment(exercise, Equipment.Bench) +
                printEquipment(exercise, Equipment.BenchPress) +
                printEquipment(exercise, Equipment.Board) +
                printEquipment(exercise, Equipment.Bodyweight) +
                printEquipment(exercise, Equipment.BosuBall) +
                printEquipment(exercise, Equipment.Box) +
                printEquipment(exercise, Equipment.Boxx2) +
                printEquipment(exercise, Equipment.TopCable) +
                printEquipment(exercise, Equipment.LowCable) +
                printEquipment(exercise, Equipment.FlexiCable) +
                printEquipment(exercise, Equipment.LatCable) +
                printEquipment(exercise, Equipment.CableAttachmentAnkleStrapsX1) +
                printEquipment(exercise, Equipment.CableAttachmentAnkleStrapsX2) +
                printEquipment(exercise, Equipment.CableAttachmentBentBar) +
                printEquipment(exercise, Equipment.CableAttachmentLongRope) +
                printEquipment(exercise, Equipment.CableAttachmentRope) +
                printEquipment(exercise, Equipment.CableAttachmentSingleArm) +
                printEquipment(exercise, Equipment.CableAttachmentStraightBar) +
                printEquipment(exercise, Equipment.CableAttachmentParallel) +
                printEquipment(exercise, Equipment.Chains) +
                printEquipment(exercise, Equipment.Couch) +
                printEquipment(exercise, Equipment.Cone) +
                printEquipment(exercise, Equipment.DeclineBench) +
                printEquipment(exercise, Equipment.DeclineBenchPress) +
                printEquipment(exercise, Equipment.DipStation) +
                printEquipment(exercise, Equipment.Disk) +
                printEquipment(exercise, Equipment.Donut) +
                printEquipment(exercise, Equipment.DoubleCable) +
                printEquipment(exercise, Equipment.Dumbbell) +
                printEquipment(exercise, Equipment.ExerciseBall) +
                printEquipment(exercise, Equipment.FatBar) +
                printEquipment(exercise, Equipment.FatGripz) +
                printEquipment(exercise, Equipment.FarmersWalkHandleBars) +
                printEquipment(exercise, Equipment.FeetWeight) +
                printEquipment(exercise, Equipment.FixedUpperBar) +
                printEquipment(exercise, Equipment.FoamRoll) +
                printEquipment(exercise, Equipment.FootStand) +
                printEquipment(exercise, Equipment.GripBalls) +
                printEquipment(exercise, Equipment.GymMats) +
                printEquipment(exercise, Equipment.HammerBar) +
                printEquipment(exercise, Equipment.HandleBands) +
                printEquipment(exercise, Equipment.HangingRope) +
                printEquipment(exercise, Equipment.HipThruster) +
                printEquipment(exercise, Equipment.Hurdle) +
                printEquipment(exercise, Equipment.InclineBench) +
                printEquipment(exercise, Equipment.InclineBenchPress) +
                printEquipment(exercise, Equipment.JumpRope) +
                printEquipment(exercise, Equipment.KettleBellsX1) +
                printEquipment(exercise, Equipment.KettleBellsX2) +
                printEquipment(exercise, Equipment.LacrosseBall) +
                printEquipment(exercise, Equipment.LandMine) +
                printEquipment(exercise, Equipment.LowerBackStand) +
                printEquipment(exercise, Equipment.LowerBackStand2) +
                printEquipment(exercise, Equipment.Machine) +
                printEquipment(exercise, Equipment.MassageTable) +
                printEquipment(exercise, Equipment.MedicineBall) +
                printEquipment(exercise, Equipment.ParalletteBars) +
                printEquipment(exercise, Equipment.Partner) +
                printEquipment(exercise, Equipment.Pole) +
                printEquipment(exercise, Equipment.PreacherStand) +
                printEquipment(exercise, Equipment.PvcPipe) +
                printEquipment(exercise, Equipment.Rack) +
                printEquipment(exercise, Equipment.Rope) +
                printEquipment(exercise, Equipment.RowCable) +
                printEquipment(exercise, Equipment.Rings) +
                printEquipment(exercise, Equipment.RomanChair) +
                printEquipment(exercise, Equipment.SafetyBar) +
                printEquipment(exercise, Equipment.ShortBarbell) +
                printEquipment(exercise, Equipment.ShoulderBenchPress) +
                printEquipment(exercise, Equipment.Sled) +
                printEquipment(exercise, Equipment.SledMini) +
                printEquipment(exercise, Equipment.SmithMachine) +
                printEquipment(exercise, Equipment.Stairs) +
                printEquipment(exercise, Equipment.Table) +
                printEquipment(exercise, Equipment.TBar) +
                printEquipment(exercise, Equipment.TigerTail) +
                printEquipment(exercise, Equipment.Tire) +
                printEquipment(exercise, Equipment.TrapBar) +
                printEquipment(exercise, Equipment.TRX) +
                printEquipment(exercise, Equipment.ValSlide) +
                printEquipment(exercise, Equipment.VBar) +
                printEquipment(exercise, Equipment.WalkingSpace) +
                printEquipment(exercise, Equipment.Wall) +
                printEquipment(exercise, Equipment.WaistStrap) +
                printEquipment(exercise, Equipment.WeightStrap) +
                printEquipment(exercise, Equipment.WeightVest) +
                printEquipment(exercise, Equipment.WristRoller) +
                printEquipment(exercise, Equipment.ZBar);
    }

    private static String printEquipment(Exercise exercise, Equipment equipment) {
        if (exercise.equipment.contains(equipment)) return "Y\t";
        return "\t";
    }

    private static String printMuscles(Exercise exercise) {
        return
                printMuscle(exercise, Muscle.Abs) +
                printMuscle(exercise, Muscle.Abductors) +
                printMuscle(exercise, Muscle.FrontalAbs) +
                printMuscle(exercise, Muscle.Adductors) +
                printMuscle(exercise, Muscle.Biceps) +
                printMuscle(exercise, Muscle.Calves) +
                printMuscle(exercise, Muscle.Chest) +
                printMuscle(exercise, Muscle.Forearms) +
                printMuscle(exercise, Muscle.Glutes) +
                printMuscle(exercise, Muscle.Hamstrings) +
                printMuscle(exercise, Muscle.HipFlexors) +
                printMuscle(exercise, Muscle.ItBand) +
                printMuscle(exercise, Muscle.Lats) +
                printMuscle(exercise, Muscle.LowerBack) +
                printMuscle(exercise, Muscle.MiddleBack) +
                printMuscle(exercise, Muscle.Neck) +
                printMuscle(exercise, Muscle.Obliques) +
                printMuscle(exercise, Muscle.PalmarFascia) +
                printMuscle(exercise, Muscle.PlantarFascia) +
                printMuscle(exercise, Muscle.Quads) +
                printMuscle(exercise, Muscle.Traps) +
                printMuscle(exercise, Muscle.Triceps) +
                printMuscle(exercise, Muscle.Shoulders) +
                printMuscle(exercise, Muscle.UpperBack);
    }

    private static String printMuscle(Exercise exercise, Muscle muscle) {
        if (exercise.mainMuscles.contains(muscle)) return "P\t";
        if (exercise.secondaryMuscles.contains(muscle)) return "S\t";
        return "\t";
    }

    private static String getFolderPath(Exercise exercise) {
        for (Folder folder : Folder.all.values()) {
            String path = getFolderPath(folder, exercise);
            if (path == null) continue;
            return folder.name+"/"+path;
        }
        throw new RuntimeException("Folder for "+exercise.name+" not found");
    }

    private static String getFolderPath(Folder folder, Exercise exercise) {
        for (Exercise candidate : folder.exercises) {
            if (candidate == exercise) {
                return "";
            }
        }

        for (Folder subFolder : folder.folders) {
            String path = getFolderPath(subFolder, exercise);
            if (path == null) continue;
            return subFolder.name + "/" + path;
        }

        return null;
    }
}
