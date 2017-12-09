package Entity.Monsters;

/**
 * Created by easonjackson on 12/5/17.
 */
public abstract class AbstractMonster {

    MonsterProperty property;
    MonsterBehavior behavior;

    abstract void move();
    abstract void attack();
}
