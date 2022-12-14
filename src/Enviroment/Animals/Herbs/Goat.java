package Enviroment.Animals.Herbs;

import Enviroment.Animal;
import Enviroment.Herb;

public class Goat extends Herb {
    public Goat(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    @Override
    public boolean getHerbivore() {
        return true;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public Animal newAnimal() {
        return new Goat(getRandom().nextInt(99), getRandom().nextInt(1), getNewGender());
    }

    @Override
    public int getPosition() {
        return 9;
    }

    @Override
    public int getMaxSaturation() {
        return 10;
    }

    @Override
    public int getWeight() {
        return 60;
    }
}
