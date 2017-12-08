import Game.DungeonGame;

/**
 * Created by easonjackson on 12/4/17.
 */
public class AppLauncher {

    public static void main (String[] args) {
        Thread t  = new Thread(new DungeonGame());
        t.start();
    }
}
