package Enviroment;

public abstract class Herb extends Animal {

    public Herb(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    @Override
    public abstract boolean getHerbivore();
}