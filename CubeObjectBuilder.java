public class CubeObjectBuilder implements RubiksCubeBuilder{
    private int size ;
    private int tension ;
    private boolean lubricated ;
    private boolean magnetic;
    private String stickerType;
    private  String colorScheme;

    @Override
    public CubeObjectBuilder setSize(int size){
        this.size = size;
        return this;
    }
    @Override
    public CubeObjectBuilder setTension(int tension){
        this.tension = tension;
        return this;
    }
    @Override
    public CubeObjectBuilder setLubricated(boolean lubricated){
        this.lubricated = lubricated;
        return this;
    }
    @Override
    public CubeObjectBuilder setMagnetic(boolean magnetic){
        this.magnetic = magnetic;
        return this;
    }
    @Override
    public CubeObjectBuilder setStickerType(String stickerType){
        this.stickerType = stickerType;
        return this;
    }
    @Override
    public CubeObjectBuilder setColorScheme(String colorScheme){
        this.colorScheme = colorScheme;
        return this;
    }

    public RubiksCube getResult(){
        if ( size < 2 || size > 7){
            throw new IllegalStateException("Size must be betwenn 2 and 7");
        }
        if(tension < 1 || tension > 5){
            throw new IllegalStateException("Tension must be between 1 and 5 ");
        }
        if(stickerType == null || colorScheme == null){
            throw new IllegalStateException("Stiker type and color scheme are required");
        }
        return new RubiksCube(size , tension , lubricated ,magnetic , stickerType , colorScheme);
    }

}
