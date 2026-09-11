public class RubiksCube {
    private static final int Min_size = 2;
    private static final int Max_size = 7;
    private static final int Min_Tension = 1;
    private static final int Max_Tension = 5;

    private final int size;
    private final int tension;
    private final boolean lubricated;
    private final boolean magnetic;
    private final String stickerType;
    private final String colorScheme;

    RubiksCube(int size, int tension, boolean lubricated, boolean magnetic, String stickerType, String colorScheme) {
        this.size = size;
        this.tension = tension;
        this.lubricated = lubricated;
        this.magnetic = magnetic;
        this.stickerType = stickerType;
        this.colorScheme = colorScheme;
    }

    @Override
    public String toString(){
        return "RubiksCube [" +size + ",x" + size + ",tension=" + tension + ",lubed=" + lubricated +  ", magnetic=" + magnetic +", stikers=" + stickerType + ",scheme= " +  colorScheme + "]";
    }
}


