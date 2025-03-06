package tudor;

import tudor.environments.Environment;
import tudor.environments.UnisportsDristor;
import tudor.schedules.Primary4;
import tudor.schedules.Schedule;

public class App {
    public static void main(String[] args) {
        Environment environment = new UnisportsDristor();

        Schedule schedule = new Primary4(environment);

        schedule.printExercises();
    }
}
