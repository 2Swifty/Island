package Enviroment.Animals.Predators;

import Enviroment.Animal;
import Enviroment.Predator;

public class Bear extends Predator {


    public Bear(int x, int y, Gender gender) {
        super(x, y, gender);
    }


    @Override
    public boolean getHerbivore() {
        return false;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public Animal newAnimal() {
        return new Bear(getRandom().nextInt(99),getRandom().nextInt(1),getNewGender());
    }

    @Override
    public int getPosition() {
        return 3;
    }

    @Override
    public int getMaxSaturation() {
        return 80;
    }

    @Override
    public int getWeight() {
        return 500;
    }
}
