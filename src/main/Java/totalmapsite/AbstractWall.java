package totalmapsite;

public class AbstractWall implements Mapsite {
    public void enter(){
        System.out.print("Cannot enter, hit a Wall");
    }
}
