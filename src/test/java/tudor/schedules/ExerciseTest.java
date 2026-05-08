package tudor.schedules;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tudor.enums.Equipment;
import tudor.environments.Environment;
import tudor.exercises.Exercise;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExerciseTest {
    @DisplayName("Domination")
    @Nested
    class domination {
        @Test
        void shouldWorkWithSimpleDomination() {
            Exercise exerciseA = new Exercise("A", null, null, List.of(Equipment.Bodyweight), null, null, null, null);
            Exercise exerciseB = new Exercise("B", null, null, List.of(Equipment.Dumbbell), null, null, null, null);
            exerciseA.dominator = exerciseB;

            Environment environment = mock(Environment.class);
            when(environment.hasEquipment(exerciseA)).thenReturn(true);
            when(environment.hasEquipment(exerciseB)).thenReturn(true);

            Schedule schedule = new TestSchedule(environment);

            assertTrue(schedule.isDoable(exerciseB));
            assertFalse(schedule.isDoable(exerciseA));
            assertTrue(schedule.isDominated(exerciseA));
        }

        @Test
        void shouldWorkWithChainedDomination() {
            Exercise exerciseA = new Exercise("A", null, null, List.of(Equipment.Bodyweight), null, null, null, null);
            Exercise exerciseB = new Exercise("B", null, null, List.of(Equipment.Dumbbell), null, null, null, null);
            exerciseA.dominator = exerciseB;
            Exercise exerciseC = new Exercise("C", null, null, List.of(Equipment.Barbell), null, null, null, null);
            exerciseB.dominator = exerciseC;

            Environment environment = mock(Environment.class);
            when(environment.hasEquipment(exerciseA)).thenReturn(true);
            when(environment.hasEquipment(exerciseB)).thenReturn(true);
            when(environment.hasEquipment(exerciseC)).thenReturn(true);

            Schedule schedule = new TestSchedule(environment);

            assertTrue(schedule.isDoable(exerciseC));
            assertFalse(schedule.isDoable(exerciseB));
            assertFalse(schedule.isDoable(exerciseA));
            assertTrue(schedule.isDominated(exerciseA));
            assertTrue(schedule.isDominated(exerciseB));
        }
    }
}