package Enviroment.Animals.Predators;

import Enviroment.Predator;

public class Snake extends Predator {
    public Snake(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    @Override
    public boolean getHerbivore() {
        return false;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public Snake newAnimal() {
        return new Snake(getRandom().nextInt(99), getRandom().nextInt(19), getNewGender());
    }

    @Override
    public int getPosition() {
        return 3;
    }

    @Override
    public int getMaxSaturation() {
        return 3;
    }

    @Override
    public int getWeight() {
        return 15;
    }
}

