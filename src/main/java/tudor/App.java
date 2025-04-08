package tudor;

import tudor.environments.Environment;
import tudor.environments.HomeCurrent;
import tudor.environments.UnisportsDristor;
import tudor.schedules.Home;
import tudor.schedules.Primary4;
import tudor.schedules.Schedule;

public class App {
    public static void main(String[] args) {
        Environment environment = new HomeCurrent();

        Schedule schedule = new Home(environment);

        schedule.printExercises();
    }
}
