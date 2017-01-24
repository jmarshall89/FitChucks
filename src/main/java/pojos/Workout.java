package pojos;

import java.time.LocalDate;

/**
 * Created by jMarshall on 1/21/17.
 */
public class Workout {
    public LocalDate date;
    public WorkoutType type;
    //maybe details?


    public Workout(LocalDate date, WorkoutType type) {
        this.date = date;
        this.type = type;
    }
}
