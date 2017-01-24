package pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jMarshall on 1/21/17.
 */
public class User {
    private Credentials credentials;
    private List<Workout> workouts;

    public User(String name, String userName, String email) {
        this.credentials = new Credentials(name, userName, email);
        workouts = new ArrayList<>();
    }

    public boolean addWorkout(Workout workout) {
        return this.workouts.add(workout);
    }

    private class Credentials {
        String name;
        String userName;
        String email;

        public Credentials(String name, String userName, String email) {
            this.name = name;
            this.userName = userName;
            this.email = email;
        }
    }



}
