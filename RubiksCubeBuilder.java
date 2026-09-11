public interface RubiksCubeBuilder {
    RubiksCubeBuilder setSize(int size);
    RubiksCubeBuilder setTension(int tension);
    RubiksCubeBuilder setLubricated(boolean lubricated);
    RubiksCubeBuilder setStickerType(String stickerType);
    RubiksCubeBuilder setMagnetic(boolean magnetic);
    RubiksCubeBuilder setColorScheme(String colorScheme);
}
