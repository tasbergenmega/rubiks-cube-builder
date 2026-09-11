public class Main {
    public static void main(String[] args){
        CubeDirector director = new CubeDirector();
        CubeObjectBuilder objBuilder = new CubeObjectBuilder();
        director.makeSpeedcube(objBuilder);
        RubiksCube speedcube = objBuilder.getResult();
        System.out.println("Object representation" + speedcube);

        CubeSpecBuilder specBuilder = new CubeSpecBuilder();
        director.makeSpeedcube(specBuilder);
        String spec = specBuilder.getResult();
        System.out.println("\n Text representation : ");
        System.out.println(spec);

        System.out.println("--- Validation test --- ");
        try{
            CubeObjectBuilder bad = new CubeObjectBuilder();
            bad.setSize(99).setTension(3).setStickerType("stikers").setColorScheme("western");
            bad.getResult();
        }
        catch (IllegalStateException e){
            System.out.println("Caught expected error : " + e.getMessage());
        }
    }
}
