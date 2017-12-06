import Utility.DungeonGame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by easonjackson on 12/4/17.
 */
public class App {

    public static void main (String[] args) {
        DungeonGame game = new DungeonGame();
        //TODO Set game parameters
        game.start();
    }
}
