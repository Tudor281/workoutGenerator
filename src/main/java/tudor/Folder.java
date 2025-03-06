package tudor;

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

    void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }
}
