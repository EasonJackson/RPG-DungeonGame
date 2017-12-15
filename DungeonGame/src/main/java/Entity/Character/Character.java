package Entity.Character;

import Game.DungeonGame;
import Utility.Handler;

/**
 * Created by easonjackson on 12/6/17.
 */
public class Character extends AbstractCharacter {
    public static final Handler GAME_HANDLER = DungeonGame.HANDLER;

    @Override
    void render() {

    }

    @Override
    void tick() {
        getInput();
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;

        if(GAME_HANDLER.getKeyManager().isUp())
            yMove = -speed;
        if(GAME_HANDLER.getKeyManager().isDown())
            yMove = speed;
        if(GAME_HANDLER.getKeyManager().isLeft())
            xMove = -speed;
        if(GAME_HANDLER.getKeyManager().isRight())
            xMove = speed;
    }
}
