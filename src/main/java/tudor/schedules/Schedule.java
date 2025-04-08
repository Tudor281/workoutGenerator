package tudor.schedules;

import tudor.Exercise;
import tudor.Flag;
import tudor.Folder;
import tudor.enums.ExerciseType;
import tudor.environments.Environment;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class Schedule {
    protected Environment environment;
    Random random = new Random();

    public Schedule(Environment environment) {
        this.environment = environment;
    }

    public abstract void printExercises();

    protected List<Exercise> findExercises(List<String> folderNames, List<String> bannedSubfolders) {
        List<Exercise> result = new LinkedList<>();
        for (String folderName : folderNames) {
            Folder folder = Folder.all.get(folderName);
            for (Folder subFolder : folder.folders) {
                if (bannedSubfolders.contains(subFolder.name)) continue;
                result.addAll(findExercises(List.of(subFolder.name), bannedSubfolders));
            }

            for (Exercise exercise : folder.exercises) {
                if (isDoable(exercise)) result.add(exercise);
            }
        }
        return result;
    }

    protected List<Exercise> findExercises(List<String> folderNames, List<String> bannedSubfolders, ExerciseType exerciseType) {
        List<Exercise> result = new LinkedList<>();
        for (String folderName : folderNames) {
            Folder folder = Folder.all.get(folderName);
            for (Folder subFolder : folder.folders) {
                if (bannedSubfolders.contains(subFolder.name)) continue;
                result.addAll(findExercises(List.of(subFolder.name), bannedSubfolders, exerciseType));
            }

            for (Exercise exercise : folder.exercises) {
                if (isDoable(exercise, exerciseType)) result.add(exercise);
            }
        }
        return result;
    }

    private boolean isDoable(Exercise exercise) {
        if (Flag.flaggedExercises.containsKey(exercise)) return false;
        return environment.hasEquipment(exercise);
    }

    private boolean isDoable(Exercise exercise, ExerciseType exerciseType) {
        if (exercise.type != exerciseType) return false;
        if (Flag.flaggedExercises.containsKey(exercise)) return false;
        return environment.hasEquipment(exercise);
    }

    protected void pick(String title, List<Exercise> exercises, int times) {
        System.out.println(title+": "+exercises.size());
        for (int i=0; i<times; i++) {
            exercises.remove(random.nextInt(exercises.size())).toExcel();
        }
    }
}
