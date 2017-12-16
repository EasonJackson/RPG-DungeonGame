package Entity.Character;

/**
 * Created by easonjackson on 12/9/17.
 */
public class Avatar {
    private static final Avatar AVATAR_MALE = null;
    private static final Avatar AVATAR_FEMALE = null;

    private Avatar() {}

    public Avatar getAvatar(Gender gender) {
        if (gender.equals(Gender.MALE)) {
            return AVATAR_MALE;
        } else if (gender.equals((Gender.FEMALE))){
            return AVATAR_FEMALE;
        } else {
            return null;
        }
    }
}
