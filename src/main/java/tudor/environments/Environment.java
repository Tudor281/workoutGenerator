package tudor.environments;

import tudor.Exercise;
import tudor.enums.Equipment;

import java.util.Collection;
import java.util.Set;

public abstract class Environment {
    public abstract boolean hasEquipment(Exercise exercise);
}
