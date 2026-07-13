package tudor.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Folder {
    public String name;
    public List<Folder> folders = new ArrayList<>();
    public List<Exercise> exercises = new ArrayList<>();

    public static Map<String, Folder> all = new HashMap<>();

    public Folder(String name) {
        this.name = name;
        all.put(name, this);
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    private static Exercise findExerciseInAll(String name) {
        for (Folder folder : all.values()) {
            Exercise exercise = folder.findExercise(name);
            if (exercise != null) return exercise;
        }
        return null;
    }

    private Exercise findExercise(String name) {
        for (Exercise exercise : exercises) {
            if (exercise.name.equals(name)) return exercise;
        }
        for (Folder folder : folders) {
            Exercise exercise = folder.findExercise(name);
            if (exercise != null) return exercise;
        }
        return null;
    }

    public static void rename(String name, String newName) {
        Exercise exercise = findExerciseInAll(name);
        if (exercise == null) throw new RuntimeException("Exercise not found: "+name);
        exercise.name = newName;
    }

    public static void delete(String name) {
        for (Folder folder : all.values()) {
            folder.deleteExercise(name);
        }
    }

    private void deleteExercise(String name) {
        Exercise toBeDeleted = null;
        for (Exercise exercise : exercises){
            if (exercise.name.equals(name)) toBeDeleted = exercise;
        }
        if (toBeDeleted != null) {
            exercises.remove(toBeDeleted);
            Exercise.all.remove(toBeDeleted);
            return;
        }
        for (Folder folder : folders) {
            folder.deleteExercise(name);
        }
    }
}
