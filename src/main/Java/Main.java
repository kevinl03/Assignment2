public class Main {
    public static void main(String[] args) {
        //main method for factor kid
        MazeFactory factory = new MazeFactory();

        //only want one game, so this will need to be a Singleton
        MazeGame game = new MazeGame();
        game.createMaze(factory);
    }
}