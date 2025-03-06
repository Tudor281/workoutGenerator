package tudor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Probabilities {
    //probabilities are dependent on environment

    Map<Folder, Integer> folders = new HashMap<>();
    Map<Exercise, Integer> exercises = new HashMap<>();
    Map<Exercise, List<Flag>> flags = new HashMap<>();
}
