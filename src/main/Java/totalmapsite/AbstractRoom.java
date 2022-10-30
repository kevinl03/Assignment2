package totalmapsite;


public abstract class AbstractRoom implements Mapsite {

    protected String roomName;

    //entering room will be the same regardless of the room type
    //but if we want entering rooms to be different then this should
    //be implemented in the child class
    public abstract void enter();
    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    int roomNr = 0;
    Mapsite northside = null;
    Mapsite southside = null;
    Mapsite eastside = null;
    Mapsite westside = null;

    public void setSide(Direction dir, Mapsite site) {
        switch (dir) {

            case NORTH:
                northside = site;
            case SOUTH:
                southside = site;
            case EAST:
                eastside = site;
            case WEST:
                westside = site;
            default:
                break;
        }
    }

    public Mapsite getSide(Direction dir) {
        switch (dir) {
            case NORTH:
                return northside;
            case SOUTH:
                return southside;
            case EAST:
                return eastside;
            case WEST:
                return westside;
            default:
                return null;
        }
    }
    //set room name depends on the class that implements, and the factory will be responsible
    //for the naming
    public abstract void setRoomName(int count);

    //will always return the same, so no need to implement in both child classes
    public String getRoomName() {
        return roomName;
    }
}
