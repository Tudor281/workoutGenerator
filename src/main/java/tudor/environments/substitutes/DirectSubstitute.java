package tudor.environments.substitutes;

import tudor.enums.Equipment;

public class DirectSubstitute extends Substitute {
    // no point in adding the substitute, we already know we have it because we built the environment;
    Equipment target;

    public DirectSubstitute(Equipment target) {
        this.target = target;
    }


    @Override
    public boolean canSubstitute(Equipment equipment) {
        return equipment == target;
    }
}
