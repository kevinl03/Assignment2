public class MazeGame {
    // Class MazeGame has a method createMaze() for creating a Maze
    private Maze singletonMaze;

    public Maze createMaze(MazeFactory factory) {
    // Should create a template Maze using factory methods
        System.out.printf("Using MazeFactory to create Regular Maze");
        factory.createMaze();
        factory.createDoors();
        factory.createRooms();
        factory.createWalls();
        return new Maze();


    }
    public Maze createMaze(EnchantedMazeFactory factory){
        System.out.printf("Using EnchantedMazeFactory to create Enchanted Maze");
        return new Maze();

    }
}
