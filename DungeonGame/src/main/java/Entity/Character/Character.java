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
        move();
    }

    private void move() {
        offsetX = 0;
        offsetY = 0;

        if(GAME_HANDLER.getKeyManager().isUp())
            this.behavior.moveUp();
        if(GAME_HANDLER.getKeyManager().isDown())
            this.behavior.moveDown();
        if(GAME_HANDLER.getKeyManager().isLeft())
            this.behavior.moveLeft();
        if(GAME_HANDLER.getKeyManager().isRight())
            this.behavior.moveRight();
    }
}
