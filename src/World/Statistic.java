package World;

import Enviroment.Animal;

import java.util.List;


public class Statistic implements Runnable {
    private World world;

    public Statistic(World world) {
        this.world = world;
    }

    private static void accept(Animal animal) {
        int a = animal.getDie();
        int b = animal.getMove();
        int c = animal.getReproduce();
        System.out.println(" Умерло: " + a );
        System.out.println(" Перешло: " + b );
        System.out.println(" Родилось: " + c );
        System.out.println();
    }

    @Override
    public void run() {
        Cell[][] boxAnimal = world.getBox();
        for (int j = 0; j < boxAnimal.length; j++) { // с помощью цикла выводим на экран boxAnimal
            for (int k = 0; k < boxAnimal[j].length; k++) {
                List<Animal> animals = boxAnimal[j][k].getListFauna();
                animals.forEach(Statistic::accept);
            }
        }
    }
}
