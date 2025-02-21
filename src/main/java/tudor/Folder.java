package tudor;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    String name;
    List<Folder> folders = new ArrayList<>();
    List<Exercise> exercises = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }
}
