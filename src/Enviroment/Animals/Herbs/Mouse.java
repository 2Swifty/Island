package Enviroment.Animals.Herbs;

import Enviroment.Animal;
import Enviroment.Herb;

public class Mouse extends Herb {
    public Mouse(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    @Override
    public boolean getHerbivore() {
        return true;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public Animal newAnimal() {
        return new Mouse(getRandom().nextInt(99), getRandom().nextInt(1), getNewGender());
    }

    @Override
    public int getPosition() {
        return 8;
    }

    @Override
    public int getMaxSaturation() {
        return 1;
    }

    @Override
    public int getWeight() {
        return 1;
    }
}
