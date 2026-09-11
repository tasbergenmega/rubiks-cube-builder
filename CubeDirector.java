public class CubeDirector {
    public void makeSpeedcube(RubiksCubeBuilder builder){
        builder.setSize(3).setTension(3).setLubricated(true).setMagnetic(true).setStickerType("stickerless").setColorScheme("Western");

    }
    public void makebudgetCube(RubiksCubeBuilder builder){
        builder.setSize(3).setTension(1).setLubricated(false).setMagnetic(false).setStickerType("stickerless").setColorScheme("Western");

    }
}
