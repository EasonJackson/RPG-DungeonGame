package Entity.Character;

/**
 * Created by easonjackson on 12/4/17.
 */
public abstract class AbstractCharacter {

    CharacterProperty property;
    CharacterBehavior behavior;

    abstract void move();
}