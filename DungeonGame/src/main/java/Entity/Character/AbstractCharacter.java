package Entity.Character;

/**
 * Created by easonjackson on 12/4/17.
 */
public abstract class AbstractCharacter {

    CharacterProperty property;
    CharacterBehavior behavior;

    float offsetX;
    float offsetY;

    abstract void tick();
    abstract void move();
}
