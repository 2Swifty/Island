package World;

public class Starter {
    public static void main(String[] args) {
        Island island = new Island();// создаём остров
        World world = new World(island.createWorld(100,20)); // создаём мир
        Thread move = new Thread(world); // создаём нить и передаём в неё мир
        Thread statistics = new Thread(new Statistic(world)); // создаём нить для вывода статистики

        move.start();
        statistics.start();
    }
}
