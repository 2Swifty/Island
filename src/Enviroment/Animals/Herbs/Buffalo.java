package Enviroment.Animals.Herbs;

import Enviroment.Animal;
import Enviroment.Animals.Predators.Boa;
import Enviroment.Herb;

public class Buffalo extends Herb {
    public Buffalo(int x, int y, Gender gender) {
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
        return new Boa(getRandom().nextInt(99), getRandom().nextInt(1), getNewGender());
    }

    @Override
    public int getPosition() {
        return 12;
    }

    @Override
    public int getMaxSaturation() {
        return 100;
    }

    @Override
    public int getWeight() {
        return 700;
    }
}
