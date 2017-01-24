package pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jMarshall on 1/21/17.
 */
public class Game {
    private List<GameTeam> teams;
    private Rule rules;


    private class GameTeam extends ArrayList<User>{}
}
