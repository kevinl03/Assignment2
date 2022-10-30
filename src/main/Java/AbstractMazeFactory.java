import totalmapsite.Door;

public interface AbstractMazeFactory {
    //every mazefactory will need to keep track of how many rooms they have
    int RoomCnt = 0;
    public Door createWalls();
    public void createDoors();
    public void createRooms();
    public void createMaze();
}
