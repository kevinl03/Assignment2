import totalmapsite.AbstractRoom;
import java.util.*;

public class Maze {
    private Set<AbstractRoom> rooms;
    Maze() {
        //constructor instantiates variables now
         rooms = new HashSet<AbstractRoom>();
    }
    public void addRoom(AbstractRoom r){
        System.out.printf("Adding" +  r.getRoomName());
    }

}
