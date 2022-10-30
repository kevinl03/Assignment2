package totalmapsite;

public class Room extends AbstractRoom{

    @Override
    public void enter() {
        System.out.printf("Entering" + this.roomName);
    }

    public void setRoomName(int count){
        roomName = "Room" + count;
    }

}
