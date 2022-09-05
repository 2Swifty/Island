package Enviroment.Animals.Herbs;

import Enviroment.Animal;
import Enviroment.Herb;

public class Catterpillar extends Herb {
    public Catterpillar(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    @Override
    public boolean getHerbivore() {
        return true;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public Animal newAnimal() {
        return new Catterpillar(getRandom().nextInt(99), getRandom().nextInt(1), getNewGender());
    }

    @Override
    public int getPosition() {
        return 14;
    }

    @Override
    public int getMaxSaturation() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 1;
    }
}
