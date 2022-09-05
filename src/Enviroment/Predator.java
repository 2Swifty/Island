package Enviroment;

public abstract class Predator extends Animal  {

    public Predator(int x, int y, Gender gender) {
        super(x, y, gender);
    }

    public abstract boolean getHerbivore();
}
