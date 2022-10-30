package totalmapsite;

public abstract class AbstractDoor implements Mapsite {
    public void enter(){
        System.out.print("Entering door");
    }
    protected AbstractRoom roomA;
    protected AbstractRoom roomB;
}
