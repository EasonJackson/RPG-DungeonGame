package Entity.Character;

/**
 * Created by easonjackson on 12/4/17.
 */
public abstract class AbstractCharacter {

    public static final float DEFAULT_SPEED = 1.0f;
    public static final int DEFAULT_CHARACTER_WIDTH = 60;
    public static final int DEFAULT_CHARACTER_HEIGHT = 60;

    CharacterProperty property;
    CharacterBehavior behavior;

    float speed;
    float xMove, yMove;

    float offsetX;
    float offsetY;

    abstract void tick();
    abstract void render();
    //abstract void move();
}
