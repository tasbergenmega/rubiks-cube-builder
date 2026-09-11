public class CubeSpecBuilder implements RubiksCubeBuilder{
    private final StringBuilder sb = new StringBuilder("== Rubiks Cube Spec == \n");

    @Override
    public CubeSpecBuilder setSize(int size){
        sb.append("size:").append(size).append("X").append(size).append("\n");
        return this;
    }
    @Override
    public CubeSpecBuilder setTension(int tension){
        sb.append("Tension:").append(tension).append("/5\n");
        return this;
    }
    @Override
    public CubeSpecBuilder setLubricated(boolean lubricated){
        sb.append("Lubricated:").append(lubricated ? "yes " : "no").append("\n");
        return this;
    }
    @Override
    public CubeSpecBuilder setMagnetic(boolean magnetic){
        sb.append("Magnetic:").append(magnetic ? "yes " : " no").append("\n");
        return this;
    }
    @Override
    public CubeSpecBuilder setStickerType ( String stickerType){
        sb.append("StickerType:").append(stickerType).append("\n");
        return this ;
    }
    @Override
    public CubeSpecBuilder setColorScheme ( String colorScheme){
        sb.append("ColorScheme :").append(colorScheme).append("\n");
        return this;
    }

    public String getResult(){
        return sb.toString();
    }



}
